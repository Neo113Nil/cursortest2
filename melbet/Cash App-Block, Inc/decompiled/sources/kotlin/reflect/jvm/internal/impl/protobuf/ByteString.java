package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import net.idrnd.misnap.iad.Payload;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static ByteString balancedConcat(Iterator it, int i) {
        if (i == 1) {
            return (ByteString) it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        ?? r0;
        if (iterable instanceof Collection) {
            r0 = (Collection) iterable;
        } else {
            r0 = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                r0.add(it.next());
            }
        }
        return r0.isEmpty() ? EMPTY : balancedConcat(r0.iterator(), r0.size());
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("UTF-8 not supported?", (Throwable) e);
            return null;
        }
    }

    public static Output newOutput() {
        return new Output();
    }

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = RopeByteString.minLengthByDepth;
        RopeByteString ropeByteString = this instanceof RopeByteString ? (RopeByteString) this : null;
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size3 = byteString.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = byteString.size();
            byte[] bArr = new byte[size4 + size5];
            copyTo(bArr, 0, 0, size4);
            byteString.copyTo(bArr, 0, size4, size5);
            return new LiteralByteString(bArr);
        }
        if (ropeByteString != null) {
            ByteString byteString2 = ropeByteString.right;
            if (byteString.size() + byteString2.size() < 128) {
                int size6 = byteString2.size();
                int size7 = byteString.size();
                byte[] bArr2 = new byte[size6 + size7];
                byteString2.copyTo(bArr2, 0, 0, size6);
                byteString.copyTo(bArr2, 0, size6, size7);
                return new RopeByteString(ropeByteString.left, new LiteralByteString(bArr2));
            }
        }
        if (ropeByteString != null) {
            ByteString byteString3 = ropeByteString.right;
            ByteString byteString4 = ropeByteString.left;
            if (byteString4.getTreeDepth() > byteString3.getTreeDepth() && ropeByteString.treeDepth > byteString.getTreeDepth()) {
                return new RopeByteString(byteString4, new RopeByteString(byteString3, byteString));
            }
        }
        if (size3 >= RopeByteString.minLengthByDepth[Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1]) {
            return new RopeByteString(this, byteString);
        }
        Payload payload = new Payload(14);
        payload.doBalance(this);
        payload.doBalance(byteString);
        Stack stack = (Stack) payload.a;
        ByteString byteString5 = (ByteString) stack.pop();
        while (!stack.isEmpty()) {
            byteString5 = new RopeByteString((ByteString) stack.pop(), byteString5);
        }
        return byteString5;
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            f$$ExternalSyntheticLambda0.m(30, i, "Source offset < 0: ");
            return;
        }
        if (i2 < 0) {
            f$$ExternalSyntheticLambda0.m(30, i2, "Target offset < 0: ");
            return;
        }
        if (i3 < 0) {
            f$$ExternalSyntheticLambda0.m(23, i3, "Length < 0: ");
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            f$$ExternalSyntheticLambda0.m(34, i4, "Source end offset < 0: ");
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            f$$ExternalSyntheticLambda0.m(34, i5, "Target end offset < 0: ");
        } else if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public abstract int getTreeDepth();

    public abstract boolean isBalanced();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str);

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("UTF-8 not supported?", (Throwable) e);
            return null;
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2);

    public static final class Output extends OutputStream {
        public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        public int bufferPos;
        public int flushedBuffersTotalBytes;
        public final int initialCapacity = 128;
        public final ArrayList flushedBuffers = new ArrayList();
        public byte[] buffer = new byte[128];

        public final void flushFullBuffer(int i) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, length >>> 1))];
            this.bufferPos = 0;
        }

        public final void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            int length = bArr.length;
            ArrayList arrayList = this.flushedBuffers;
            if (i >= length) {
                arrayList.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                arrayList.add(new LiteralByteString(bArr2));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i3 = this.bufferPos;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.bufferPos += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    flushFullBuffer(i4);
                    System.arraycopy(bArr, i + length2, this.buffer, 0, i4);
                    this.bufferPos = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i2 = this.bufferPos;
                this.bufferPos = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new LiteralByteString(bArr2);
    }
}
