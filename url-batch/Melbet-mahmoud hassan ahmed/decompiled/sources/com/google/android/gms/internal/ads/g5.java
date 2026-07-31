package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class g5 {
    public static long a(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 16);
    }

    public static long b(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 12);
    }

    static Pair<ByteBuffer, Long> c(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> f7 = f(randomAccessFile, 0);
        return f7 != null ? f7 : f(randomAccessFile, 65535);
    }

    public static void d(ByteBuffer byteBuffer, long j7) {
        g(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j7 >= 0 && j7 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j7);
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("uint32 value of out range: ");
        sb.append(j7);
        throw new IllegalArgumentException(sb.toString());
    }

    private static long e(ByteBuffer byteBuffer, int i7) {
        return byteBuffer.getInt(i7) & 4294967295L;
    }

    private static Pair<ByteBuffer, Long> f(RandomAccessFile randomAccessFile, int i7) {
        int i8;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i7, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        g(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i9 = capacity2 - 22;
            int min = Math.min(i9, 65535);
            for (int i10 = 0; i10 < min; i10++) {
                i8 = i9 - i10;
                if (allocate.getInt(i8) == 101010256 && ((char) allocate.getShort(i8 + 20)) == i10) {
                    break;
                }
            }
        }
        i8 = -1;
        if (i8 == -1) {
            return null;
        }
        allocate.position(i8);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i8));
    }

    private static void g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
