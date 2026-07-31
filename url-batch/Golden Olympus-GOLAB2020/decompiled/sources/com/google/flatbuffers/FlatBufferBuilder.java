package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class FlatBufferBuilder {
    ByteBuffer bb;
    ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i4);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // com.google.flatbuffers.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i4) {
            return ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i4, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i4 = i4 <= 0 ? 1 : i4;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.bb = byteBuffer;
            byteBuffer.clear();
            this.bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.bb = byteBufferFactory.newByteBuffer(i4);
        }
        this.utf8 = utf8;
        this.space = this.bb.capacity();
    }

    static ByteBuffer growByteBuffer(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i4 = capacity == 0 ? 1 : capacity << 1;
        byteBuffer.position(0);
        ByteBuffer newByteBuffer = byteBufferFactory.newByteBuffer(i4);
        newByteBuffer.position(newByteBuffer.clear().capacity() - capacity);
        newByteBuffer.put(byteBuffer);
        return newByteBuffer;
    }

    public void addBoolean(boolean z4) {
        prep(1, 0);
        putBoolean(z4);
    }

    public void addByte(byte b4) {
        prep(1, 0);
        putByte(b4);
    }

    public void addInt(int i4) {
        prep(4, 0);
        putInt(i4);
    }

    public void addLong(long j4) {
        prep(8, 0);
        putLong(j4);
    }

    public void addOffset(int i4) {
        prep(4, 0);
        putInt((offset() - i4) + 4);
    }

    public void addShort(short s4) {
        prep(2, 0);
        putShort(s4);
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - length;
        this.space = i4;
        byteBuffer.position(i4);
        this.bb.put(bArr);
        return endVector();
    }

    public int createString(CharSequence charSequence) {
        int encodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, encodedLength, 1);
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - encodedLength;
        this.space = i4;
        byteBuffer.position(i4);
        this.utf8.encodeUtf8(charSequence, this.bb);
        return endVector();
    }

    public int endTable() {
        int i4;
        if (this.vtable == null || !this.nested) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int offset = offset();
        int i5 = this.vtable_in_use - 1;
        while (i5 >= 0 && this.vtable[i5] == 0) {
            i5--;
        }
        for (int i6 = i5; i6 >= 0; i6--) {
            int i7 = this.vtable[i6];
            addShort((short) (i7 != 0 ? offset - i7 : 0));
        }
        addShort((short) (offset - this.object_start));
        addShort((short) ((i5 + 3) * 2));
        int i8 = 0;
        loop2: while (true) {
            if (i8 >= this.num_vtables) {
                i4 = 0;
                break;
            }
            int capacity = this.bb.capacity() - this.vtables[i8];
            int i9 = this.space;
            short s4 = this.bb.getShort(capacity);
            if (s4 == this.bb.getShort(i9)) {
                for (int i10 = 2; i10 < s4; i10 += 2) {
                    if (this.bb.getShort(capacity + i10) != this.bb.getShort(i9 + i10)) {
                        break;
                    }
                }
                i4 = this.vtables[i8];
                break loop2;
            }
            i8++;
        }
        if (i4 != 0) {
            int capacity2 = this.bb.capacity() - offset;
            this.space = capacity2;
            this.bb.putInt(capacity2, i4 - offset);
        } else {
            int i11 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i11 == iArr.length) {
                this.vtables = Arrays.copyOf(iArr, i11 * 2);
            }
            int[] iArr2 = this.vtables;
            int i12 = this.num_vtables;
            this.num_vtables = i12 + 1;
            iArr2[i12] = offset();
            ByteBuffer byteBuffer = this.bb;
            byteBuffer.putInt(byteBuffer.capacity() - offset, offset() - offset);
        }
        this.nested = false;
        return offset;
    }

    public int endVector() {
        if (!this.nested) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.nested = false;
        putInt(this.vector_num_elems);
        return offset();
    }

    protected void finish(int i4, boolean z4) {
        prep(this.minalign, (z4 ? 4 : 0) + 4);
        addOffset(i4);
        if (z4) {
            addInt(this.bb.capacity() - this.space);
        }
        this.bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i4) {
        finish(i4, true);
    }

    public void finished() {
        if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public void notNested() {
        if (this.nested) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.bb.capacity() - this.space;
    }

    public void pad(int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer = this.bb;
            int i6 = this.space - 1;
            this.space = i6;
            byteBuffer.put(i6, (byte) 0);
        }
    }

    public void prep(int i4, int i5) {
        if (i4 > this.minalign) {
            this.minalign = i4;
        }
        int i6 = ((~((this.bb.capacity() - this.space) + i5)) + 1) & (i4 - 1);
        while (this.space < i6 + i4 + i5) {
            int capacity = this.bb.capacity();
            ByteBuffer byteBuffer = this.bb;
            ByteBuffer growByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.bb = growByteBuffer;
            if (byteBuffer != growByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.bb.capacity() - capacity;
        }
        pad(i6);
    }

    public void putBoolean(boolean z4) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 1;
        this.space = i4;
        byteBuffer.put(i4, z4 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b4) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 1;
        this.space = i4;
        byteBuffer.put(i4, b4);
    }

    public void putInt(int i4) {
        ByteBuffer byteBuffer = this.bb;
        int i5 = this.space - 4;
        this.space = i5;
        byteBuffer.putInt(i5, i4);
    }

    public void putLong(long j4) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 8;
        this.space = i4;
        byteBuffer.putLong(i4, j4);
    }

    public void putShort(short s4) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 2;
        this.space = i4;
        byteBuffer.putShort(i4, s4);
    }

    public byte[] sizedByteArray(int i4, int i5) {
        finished();
        byte[] bArr = new byte[i5];
        this.bb.position(i4);
        this.bb.get(bArr);
        return bArr;
    }

    public void slot(int i4) {
        this.vtable[i4] = offset();
    }

    public void startTable(int i4) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i4) {
            this.vtable = new int[i4];
        }
        this.vtable_in_use = i4;
        Arrays.fill(this.vtable, 0, i4, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i4, int i5, int i6) {
        notNested();
        this.vector_num_elems = i5;
        int i7 = i4 * i5;
        prep(4, i7);
        prep(i6, i7);
        this.nested = true;
    }

    public void addBoolean(int i4, boolean z4, boolean z5) {
        if (this.force_defaults || z4 != z5) {
            addBoolean(z4);
            slot(i4);
        }
    }

    public void addByte(int i4, byte b4, int i5) {
        if (this.force_defaults || b4 != i5) {
            addByte(b4);
            slot(i4);
        }
    }

    public void addInt(int i4, int i5, int i6) {
        if (this.force_defaults || i5 != i6) {
            addInt(i5);
            slot(i4);
        }
    }

    public void addLong(int i4, long j4, long j5) {
        if (this.force_defaults || j4 != j5) {
            addLong(j4);
            slot(i4);
        }
    }

    public void addOffset(int i4, int i5, int i6) {
        if (this.force_defaults || i5 != i6) {
            addOffset(i5);
            slot(i4);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.bb.capacity() - this.space);
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i4 = this.space - remaining;
        this.space = i4;
        byteBuffer2.position(i4);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i4) {
        finish(i4, false);
    }

    public FlatBufferBuilder(int i4) {
        this(i4, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }
}
