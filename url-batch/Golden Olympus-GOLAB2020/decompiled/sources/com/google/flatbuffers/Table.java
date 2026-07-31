package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class Table {
    protected ByteBuffer bb;
    protected int bb_pos;
    Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    protected static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if (str.charAt(i4) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i4))) {
                return false;
            }
        }
        return true;
    }

    protected static int compareStrings(int i4, int i5, ByteBuffer byteBuffer) {
        int i6 = i4 + byteBuffer.getInt(i4);
        int i7 = i5 + byteBuffer.getInt(i5);
        int i8 = byteBuffer.getInt(i6);
        int i9 = byteBuffer.getInt(i7);
        int i10 = i6 + 4;
        int i11 = i7 + 4;
        int min = Math.min(i8, i9);
        for (int i12 = 0; i12 < min; i12++) {
            int i13 = i12 + i10;
            int i14 = i12 + i11;
            if (byteBuffer.get(i13) != byteBuffer.get(i14)) {
                return byteBuffer.get(i13) - byteBuffer.get(i14);
            }
        }
        return i8 - i9;
    }

    protected int __indirect(int i4) {
        return i4 + this.bb.getInt(i4);
    }

    protected int __offset(int i4) {
        if (i4 < this.vtable_size) {
            return this.bb.getShort(this.vtable_start + i4);
        }
        return 0;
    }

    protected void __reset(int i4, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer == null) {
            this.bb_pos = 0;
            this.vtable_start = 0;
            this.vtable_size = 0;
        } else {
            this.bb_pos = i4;
            int i5 = i4 - byteBuffer.getInt(i4);
            this.vtable_start = i5;
            this.vtable_size = this.bb.getShort(i5);
        }
    }

    protected String __string(int i4) {
        return __string(i4, this.bb, this.utf8);
    }

    protected Table __union(Table table, int i4) {
        return __union(table, i4, this.bb);
    }

    protected int __vector(int i4) {
        int i5 = i4 + this.bb_pos;
        return i5 + this.bb.getInt(i5) + 4;
    }

    protected ByteBuffer __vector_as_bytebuffer(int i4, int i5) {
        int __offset = __offset(i4);
        if (__offset == 0) {
            return null;
        }
        ByteBuffer order = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int __vector = __vector(__offset);
        order.position(__vector);
        order.limit(__vector + (__vector_len(__offset) * i5));
        return order;
    }

    protected ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i4, int i5) {
        int __offset = __offset(i4);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(__offset) * i5) + __vector);
        byteBuffer.position(__vector);
        return byteBuffer;
    }

    protected int __vector_len(int i4) {
        int i5 = i4 + this.bb_pos;
        return this.bb.getInt(i5 + this.bb.getInt(i5));
    }

    public ByteBuffer getByteBuffer() {
        return this.bb;
    }

    protected int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    protected void sortTables(int[] iArr, final ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        Arrays.sort(numArr, new Comparator<Integer>() { // from class: com.google.flatbuffers.Table.1
            @Override // java.util.Comparator
            public int compare(Integer num, Integer num2) {
                return Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
    }

    protected static int __indirect(int i4, ByteBuffer byteBuffer) {
        return i4 + byteBuffer.getInt(i4);
    }

    protected static int __offset(int i4, int i5, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i5;
        return byteBuffer.getShort((i4 + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    protected static String __string(int i4, ByteBuffer byteBuffer, Utf8 utf8) {
        int i5 = i4 + byteBuffer.getInt(i4);
        return utf8.decodeUtf8(byteBuffer, i5 + 4, byteBuffer.getInt(i5));
    }

    protected static Table __union(Table table, int i4, ByteBuffer byteBuffer) {
        table.__reset(__indirect(i4, byteBuffer), byteBuffer);
        return table;
    }

    protected static int compareStrings(int i4, byte[] bArr, ByteBuffer byteBuffer) {
        int i5 = i4 + byteBuffer.getInt(i4);
        int i6 = byteBuffer.getInt(i5);
        int length = bArr.length;
        int i7 = i5 + 4;
        int min = Math.min(i6, length);
        for (int i8 = 0; i8 < min; i8++) {
            int i9 = i8 + i7;
            if (byteBuffer.get(i9) != bArr[i8]) {
                return byteBuffer.get(i9) - bArr[i8];
            }
        }
        return i6 - length;
    }

    public void __reset() {
        __reset(0, null);
    }
}
