package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.internal.mlkit_vision_text_common.zzae;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString.LiteralByteIterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class RopeByteString extends ByteString {
    public static final int[] minLengthByDepth;
    public int hash = 0;
    public final ByteString left;
    public final int leftLength;
    public final ByteString right;
    public final int totalLength;
    public final int treeDepth;

    public final class RopeByteIterator implements ByteString.ByteIterator {
        public LiteralByteString.LiteralByteIterator bytes;
        public int bytesRemaining;
        public final zzae pieces;

        public RopeByteIterator(RopeByteString ropeByteString) {
            zzae zzaeVar = new zzae(ropeByteString);
            this.pieces = zzaeVar;
            this.bytes = zzaeVar.next().new LiteralByteIterator();
            this.bytesRemaining = ropeByteString.totalLength;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.bytesRemaining > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            if (!this.bytes.hasNext()) {
                this.bytes = this.pieces.next().new LiteralByteIterator();
            }
            this.bytesRemaining--;
            return this.bytes.nextByte();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        minLengthByDepth = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = minLengthByDepth;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = byteString2.size() + size;
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.left;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            byteString.copyToInternal(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.right;
        if (i >= i5) {
            byteString2.copyToInternal(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.copyToInternal(bArr, i, i2, i6);
        byteString2.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
    }

    public final boolean equals(Object obj) {
        int peekCachedHashCode;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.totalLength;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.hash == 0 || (peekCachedHashCode = byteString.peekCachedHashCode()) == 0 || this.hash == peekCachedHashCode) {
                    zzae zzaeVar = new zzae(this);
                    LiteralByteString next = zzaeVar.next();
                    zzae zzaeVar2 = new zzae(byteString);
                    LiteralByteString next2 = zzaeVar2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = next.bytes.length - i2;
                        int length2 = next2.bytes.length - i3;
                        int min = Math.min(length, length2);
                        if (!(i2 == 0 ? next.equalsRange(next2, i3, min) : next2.equalsRange(next, i2, min))) {
                            break;
                        }
                        i4 += min;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            Path$$ExternalSyntheticBUOutline0.m();
                            return false;
                        }
                        if (min == length) {
                            next = zzaeVar.next();
                            i2 = 0;
                        } else {
                            i2 += min;
                        }
                        if (min == length2) {
                            next2 = zzaeVar2.next();
                            i3 = 0;
                        } else {
                            i3 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int getTreeDepth() {
        return this.treeDepth;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int i2 = this.totalLength;
            i = partialHash(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new RopeByteIterator(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new RopeInputStream());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.left;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return byteString.partialHash(i, i2, i3);
        }
        ByteString byteString2 = this.right;
        if (i2 >= i5) {
            return byteString2.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialHash(byteString.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.left;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return byteString.partialIsValidUtf8(i, i2, i3);
        }
        ByteString byteString2 = this.right;
        if (i2 >= i5) {
            return byteString2.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int peekCachedHashCode() {
        return this.hash;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        return this.totalLength;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String toString(String str) {
        return new String(toByteArray(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        ByteString byteString = this.left;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            byteString.writeToInternal(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.right;
        if (i >= i4) {
            byteString2.writeToInternal(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        byteString.writeToInternal(outputStream, i, i5);
        byteString2.writeToInternal(outputStream, 0, i2 - i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new RopeByteIterator(this);
    }

    /* loaded from: classes4.dex */
    public final class RopeInputStream extends InputStream {
        public LiteralByteString currentPiece;
        public int currentPieceIndex;
        public int currentPieceOffsetInRope;
        public int currentPieceSize;
        public int mark;
        public zzae pieceIterator;

        public RopeInputStream() {
            zzae zzaeVar = new zzae(RopeByteString.this);
            this.pieceIterator = zzaeVar;
            LiteralByteString next = zzaeVar.next();
            this.currentPiece = next;
            this.currentPieceSize = next.bytes.length;
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        public final void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i = this.currentPieceIndex;
                int i2 = this.currentPieceSize;
                if (i == i2) {
                    this.currentPieceOffsetInRope += i2;
                    this.currentPieceIndex = 0;
                    if (!this.pieceIterator.hasNext()) {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    } else {
                        LiteralByteString next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.bytes.length;
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            return RopeByteString.this.totalLength - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            advanceIfCurrentPieceFullyRead();
            LiteralByteString literalByteString = this.currentPiece;
            if (literalByteString == null) {
                return -1;
            }
            int i = this.currentPieceIndex;
            this.currentPieceIndex = i + 1;
            return literalByteString.bytes[i] & 255;
        }

        public final int readSkipInternal(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece != null) {
                    int min = Math.min(this.currentPieceSize - this.currentPieceIndex, i3);
                    if (bArr != null) {
                        this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, min);
                        i += min;
                    }
                    this.currentPieceIndex += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            zzae zzaeVar = new zzae(RopeByteString.this);
            this.pieceIterator = zzaeVar;
            LiteralByteString next = zzaeVar.next();
            this.currentPiece = next;
            this.currentPieceSize = next.bytes.length;
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
            readSkipInternal(null, 0, this.mark);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (j < 0) {
                JWK$$ExternalSyntheticBUOutline0.m2173m();
                return 0L;
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return readSkipInternal(bArr, i, i2);
            }
            JWK$$ExternalSyntheticBUOutline0.m2173m();
            return 0;
        }
    }
}
