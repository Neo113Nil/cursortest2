package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.OutputStream;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class LiteralByteString extends ByteString {
    public final byte[] bytes;
    public int hash = 0;

    public final class LiteralByteIterator implements ByteString.ByteIterator {
        public final int limit;
        public int position = 0;

        public LiteralByteIterator() {
            this.limit = LiteralByteString.this.bytes.length;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.position < this.limit;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            try {
                byte[] bArr = LiteralByteString.this.bytes;
                int i = this.position;
                this.position = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m(e.getMessage());
                return (byte) 0;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public LiteralByteString(byte[] bArr) {
        this.bytes = bArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof LiteralByteString) {
            return equalsRange((LiteralByteString) obj, 0, size());
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
        return false;
    }

    public final boolean equalsRange(LiteralByteString literalByteString, int i, int i2) {
        byte[] bArr = literalByteString.bytes;
        int length = bArr.length;
        byte[] bArr2 = this.bytes;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = bArr.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(length3, ", ", sb2));
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int getTreeDepth() {
        return 0;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isBalanced() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isValidUtf8() {
        byte[] bArr = this.bytes;
        return Utf8.partialIsValidUtf8(bArr, 0, bArr.length) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new LiteralByteIterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        CodedInputStream codedInputStream = new CodedInputStream(this);
        try {
            codedInputStream.pushLimit(this.bytes.length);
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.bytes[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (r6[r7] > (-65)) goto L59;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        int i6 = i3 + i2;
        byte[] bArr = this.bytes;
        if (i != 0) {
            if (i2 >= i6) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i7 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i7 >= i6) {
                        return Utf8.incompleteStateFor(b2, b4);
                    }
                    i2 = i7;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i6) {
                        return Utf8.incompleteStateFor(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i8 >= i6) {
                        if (b2 > -12 || b5 > -65 || b6 > -65) {
                            return -1;
                        }
                        return ((b5 << 8) ^ b2) ^ (b6 << 16);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                }
            }
            return -1;
        }
        return Utf8.partialIsValidUtf8(bArr, i2, i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int peekCachedHashCode() {
        return this.hash;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.bytes.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String toString(String str) {
        byte[] bArr = this.bytes;
        return new String(bArr, 0, bArr.length, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.bytes, i, i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new LiteralByteIterator();
    }
}
