package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j8, long j9) {
        this.dataReader = dataReader;
        this.position = j8;
        this.streamLength = j9;
    }

    private void commitBytesRead(int i8) {
        if (i8 != -1) {
            this.position += i8;
        }
    }

    private void ensureSpaceForPeek(int i8) {
        int i9 = this.peekBufferPosition + i8;
        byte[] bArr = this.peekBuffer;
        if (i9 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i9, i9 + 524288));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i8, int i9) {
        int i10 = this.peekBufferLength;
        if (i10 == 0) {
            return 0;
        }
        int min = Math.min(i10, i9);
        System.arraycopy(this.peekBuffer, 0, bArr, i8, min);
        updatePeekBuffer(min);
        return min;
    }

    private int readFromUpstream(byte[] bArr, int i8, int i9, int i10, boolean z7) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.dataReader.read(bArr, i8 + i10, i9 - i10);
        if (read != -1) {
            return i10 + read;
        }
        if (i10 == 0 && z7) {
            return -1;
        }
        throw new EOFException();
    }

    private int skipFromPeekBuffer(int i8) {
        int min = Math.min(this.peekBufferLength, i8);
        updatePeekBuffer(min);
        return min;
    }

    private void updatePeekBuffer(int i8) {
        int i9 = this.peekBufferLength - i8;
        this.peekBufferLength = i9;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i9 < bArr.length - 524288 ? new byte[65536 + i9] : bArr;
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        this.peekBuffer = bArr2;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i8, boolean z7) {
        ensureSpaceForPeek(i8);
        int i9 = this.peekBufferLength - this.peekBufferPosition;
        while (i9 < i8) {
            i9 = readFromUpstream(this.peekBuffer, this.peekBufferPosition, i8, i9, z7);
            if (i9 == -1) {
                return false;
            }
            this.peekBufferLength = this.peekBufferPosition + i9;
        }
        this.peekBufferPosition += i8;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + this.peekBufferPosition;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] bArr, int i8, int i9) {
        int min;
        ensureSpaceForPeek(i9);
        int i10 = this.peekBufferLength;
        int i11 = this.peekBufferPosition;
        int i12 = i10 - i11;
        if (i12 == 0) {
            min = readFromUpstream(this.peekBuffer, i11, i9, 0, true);
            if (min == -1) {
                return -1;
            }
            this.peekBufferLength += min;
        } else {
            min = Math.min(i9, i12);
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition, bArr, i8, min);
        this.peekBufferPosition += min;
        return min;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i8, int i9, boolean z7) {
        if (!advancePeekPosition(i9, z7)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i9, bArr, i8, i9);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i8, int i9) {
        int readFromPeekBuffer = readFromPeekBuffer(bArr, i8, i9);
        if (readFromPeekBuffer == 0) {
            readFromPeekBuffer = readFromUpstream(bArr, i8, i9, 0, true);
        }
        commitBytesRead(readFromPeekBuffer);
        return readFromPeekBuffer;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i8, int i9, boolean z7) {
        int readFromPeekBuffer = readFromPeekBuffer(bArr, i8, i9);
        while (readFromPeekBuffer < i9 && readFromPeekBuffer != -1) {
            readFromPeekBuffer = readFromUpstream(bArr, i8, i9, readFromPeekBuffer, z7);
        }
        commitBytesRead(readFromPeekBuffer);
        return readFromPeekBuffer != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j8, E e8) {
        Assertions.checkArgument(j8 >= 0);
        this.position = j8;
        throw e8;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int i8) {
        int skipFromPeekBuffer = skipFromPeekBuffer(i8);
        if (skipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            skipFromPeekBuffer = readFromUpstream(bArr, 0, Math.min(i8, bArr.length), 0, true);
        }
        commitBytesRead(skipFromPeekBuffer);
        return skipFromPeekBuffer;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i8, boolean z7) {
        int skipFromPeekBuffer = skipFromPeekBuffer(i8);
        while (skipFromPeekBuffer < i8 && skipFromPeekBuffer != -1) {
            skipFromPeekBuffer = readFromUpstream(this.scratchSpace, -skipFromPeekBuffer, Math.min(i8, this.scratchSpace.length + skipFromPeekBuffer), skipFromPeekBuffer, z7);
        }
        commitBytesRead(skipFromPeekBuffer);
        return skipFromPeekBuffer != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i8) {
        advancePeekPosition(i8, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i8, int i9) {
        peekFully(bArr, i8, i9, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i8, int i9) {
        readFully(bArr, i8, i9, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i8) {
        skipFully(i8, false);
    }
}
