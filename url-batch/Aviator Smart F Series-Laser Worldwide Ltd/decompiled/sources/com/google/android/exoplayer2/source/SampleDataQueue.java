package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private AllocationNode firstAllocationNode;
    private AllocationNode readAllocationNode;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private AllocationNode writeAllocationNode;

    private static final class AllocationNode implements Allocator.AllocationNode {

        @Nullable
        public Allocation allocation;
        public long endPosition;

        @Nullable
        public AllocationNode next;
        public long startPosition;

        public AllocationNode(long j8, int i8) {
            reset(j8, i8);
        }

        public AllocationNode clear() {
            this.allocation = null;
            AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public Allocation getAllocation() {
            return (Allocation) Assertions.checkNotNull(this.allocation);
        }

        public void initialize(Allocation allocation, AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        @Nullable
        public Allocator.AllocationNode next() {
            AllocationNode allocationNode = this.next;
            if (allocationNode == null || allocationNode.allocation == null) {
                return null;
            }
            return allocationNode;
        }

        public void reset(long j8, int i8) {
            Assertions.checkState(this.allocation == null);
            this.startPosition = j8;
            this.endPosition = j8 + i8;
        }

        public int translateOffset(long j8) {
            return ((int) (j8 - this.startPosition)) + this.allocation.offset;
        }
    }

    public SampleDataQueue(Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.scratch = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    private void clearAllocationNodes(AllocationNode allocationNode) {
        if (allocationNode.allocation == null) {
            return;
        }
        this.allocator.release(allocationNode);
        allocationNode.clear();
    }

    private static AllocationNode getNodeContainingPosition(AllocationNode allocationNode, long j8) {
        while (j8 >= allocationNode.endPosition) {
            allocationNode = allocationNode.next;
        }
        return allocationNode;
    }

    private void postAppend(int i8) {
        long j8 = this.totalBytesWritten + i8;
        this.totalBytesWritten = j8;
        AllocationNode allocationNode = this.writeAllocationNode;
        if (j8 == allocationNode.endPosition) {
            this.writeAllocationNode = allocationNode.next;
        }
    }

    private int preAppend(int i8) {
        AllocationNode allocationNode = this.writeAllocationNode;
        if (allocationNode.allocation == null) {
            allocationNode.initialize(this.allocator.allocate(), new AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return Math.min(i8, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j8, ByteBuffer byteBuffer, int i8) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j8);
        while (i8 > 0) {
            int min = Math.min(i8, (int) (nodeContainingPosition.endPosition - j8));
            byteBuffer.put(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j8), min);
            i8 -= min;
            j8 += min;
            if (j8 == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static AllocationNode readEncryptionData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        int i8;
        long j8 = sampleExtrasHolder.offset;
        parsableByteArray.reset(1);
        AllocationNode readData = readData(allocationNode, j8, parsableByteArray.getData(), 1);
        long j9 = j8 + 1;
        byte b8 = parsableByteArray.getData()[0];
        boolean z7 = (b8 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        int i9 = b8 & Byte.MAX_VALUE;
        CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        byte[] bArr = cryptoInfo.iv;
        if (bArr == null) {
            cryptoInfo.iv = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        AllocationNode readData2 = readData(readData, j9, cryptoInfo.iv, i9);
        long j10 = j9 + i9;
        if (z7) {
            parsableByteArray.reset(2);
            readData2 = readData(readData2, j10, parsableByteArray.getData(), 2);
            j10 += 2;
            i8 = parsableByteArray.readUnsignedShort();
        } else {
            i8 = 1;
        }
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < i8) {
            iArr = new int[i8];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i8) {
            iArr3 = new int[i8];
        }
        int[] iArr4 = iArr3;
        if (z7) {
            int i10 = i8 * 6;
            parsableByteArray.reset(i10);
            readData2 = readData(readData2, j10, parsableByteArray.getData(), i10);
            j10 += i10;
            parsableByteArray.setPosition(0);
            for (int i11 = 0; i11 < i8; i11++) {
                iArr2[i11] = parsableByteArray.readUnsignedShort();
                iArr4[i11] = parsableByteArray.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sampleExtrasHolder.size - ((int) (j10 - sampleExtrasHolder.offset));
        }
        TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) Util.castNonNull(sampleExtrasHolder.cryptoData);
        cryptoInfo.set(i8, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j11 = sampleExtrasHolder.offset;
        int i12 = (int) (j10 - j11);
        sampleExtrasHolder.offset = j11 + i12;
        sampleExtrasHolder.size -= i12;
        return readData2;
    }

    private static AllocationNode readSampleData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.isEncrypted()) {
            allocationNode = readEncryptionData(allocationNode, decoderInputBuffer, sampleExtrasHolder, parsableByteArray);
        }
        if (!decoderInputBuffer.hasSupplementalData()) {
            decoderInputBuffer.ensureSpaceForWrite(sampleExtrasHolder.size);
            return readData(allocationNode, sampleExtrasHolder.offset, decoderInputBuffer.data, sampleExtrasHolder.size);
        }
        parsableByteArray.reset(4);
        AllocationNode readData = readData(allocationNode, sampleExtrasHolder.offset, parsableByteArray.getData(), 4);
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        sampleExtrasHolder.offset += 4;
        sampleExtrasHolder.size -= 4;
        decoderInputBuffer.ensureSpaceForWrite(readUnsignedIntToInt);
        AllocationNode readData2 = readData(readData, sampleExtrasHolder.offset, decoderInputBuffer.data, readUnsignedIntToInt);
        sampleExtrasHolder.offset += readUnsignedIntToInt;
        int i8 = sampleExtrasHolder.size - readUnsignedIntToInt;
        sampleExtrasHolder.size = i8;
        decoderInputBuffer.resetSupplementalData(i8);
        return readData(readData2, sampleExtrasHolder.offset, decoderInputBuffer.supplementalData, sampleExtrasHolder.size);
    }

    public void discardDownstreamTo(long j8) {
        AllocationNode allocationNode;
        if (j8 == -1) {
            return;
        }
        while (true) {
            allocationNode = this.firstAllocationNode;
            if (j8 < allocationNode.endPosition) {
                break;
            }
            this.allocator.release(allocationNode.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < allocationNode.startPosition) {
            this.readAllocationNode = allocationNode;
        }
    }

    public void discardUpstreamSampleBytes(long j8) {
        Assertions.checkArgument(j8 <= this.totalBytesWritten);
        this.totalBytesWritten = j8;
        if (j8 != 0) {
            AllocationNode allocationNode = this.firstAllocationNode;
            if (j8 != allocationNode.startPosition) {
                while (this.totalBytesWritten > allocationNode.endPosition) {
                    allocationNode = allocationNode.next;
                }
                AllocationNode allocationNode2 = (AllocationNode) Assertions.checkNotNull(allocationNode.next);
                clearAllocationNodes(allocationNode2);
                AllocationNode allocationNode3 = new AllocationNode(allocationNode.endPosition, this.allocationLength);
                allocationNode.next = allocationNode3;
                if (this.totalBytesWritten == allocationNode.endPosition) {
                    allocationNode = allocationNode3;
                }
                this.writeAllocationNode = allocationNode;
                if (this.readAllocationNode == allocationNode2) {
                    this.readAllocationNode = allocationNode3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode4 = new AllocationNode(this.totalBytesWritten, this.allocationLength);
        this.firstAllocationNode = allocationNode4;
        this.readAllocationNode = allocationNode4;
        this.writeAllocationNode = allocationNode4;
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public void peekToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void readToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        this.readAllocationNode = readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void reset() {
        clearAllocationNodes(this.firstAllocationNode);
        this.firstAllocationNode.reset(0L, this.allocationLength);
        AllocationNode allocationNode = this.firstAllocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    public void rewind() {
        this.readAllocationNode = this.firstAllocationNode;
    }

    public int sampleData(DataReader dataReader, int i8, boolean z7) {
        int preAppend = preAppend(i8);
        AllocationNode allocationNode = this.writeAllocationNode;
        int read = dataReader.read(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), preAppend);
        if (read != -1) {
            postAppend(read);
            return read;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j8, byte[] bArr, int i8) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j8);
        int i9 = i8;
        while (i9 > 0) {
            int min = Math.min(i9, (int) (nodeContainingPosition.endPosition - j8));
            System.arraycopy(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j8), bArr, i8 - i9, min);
            i9 -= min;
            j8 += min;
            if (j8 == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    public void sampleData(ParsableByteArray parsableByteArray, int i8) {
        while (i8 > 0) {
            int preAppend = preAppend(i8);
            AllocationNode allocationNode = this.writeAllocationNode;
            parsableByteArray.readBytes(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), preAppend);
            i8 -= preAppend;
            postAppend(preAppend);
        }
    }
}
