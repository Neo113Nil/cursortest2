package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* compiled from: ZipUtils.java */
/* renamed from: com.pgl.ssdk.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1132l {
    public static C1131k<ByteBuffer, Long> a(InterfaceC1133m interfaceC1133m) throws IOException {
        C1130j c1130j = (C1130j) interfaceC1133m;
        if (c1130j.a() < 22) {
            return null;
        }
        C1131k<ByteBuffer, Long> a = a(c1130j, 0);
        return a != null ? a : a(c1130j, 65535);
    }

    public static long b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L;
    }

    public static int d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return byteBuffer.getShort(byteBuffer.position() + 10) & UShort.MAX_VALUE;
    }

    private static C1131k<ByteBuffer, Long> a(InterfaceC1133m interfaceC1133m, int i) throws IOException {
        int i2;
        if (i >= 0 && i <= 65535) {
            C1130j c1130j = (C1130j) interfaceC1133m;
            long a = c1130j.a();
            if (a < 22) {
                return null;
            }
            int min = ((int) Math.min(i, a - 22)) + 22;
            long j = a - min;
            ByteBuffer a2 = c1130j.a(j, min);
            a2.order(ByteOrder.LITTLE_ENDIAN);
            a(a2);
            int capacity = a2.capacity();
            if (capacity >= 22) {
                int i3 = capacity - 22;
                int min2 = Math.min(i3, 65535);
                for (int i4 = 0; i4 <= min2; i4++) {
                    i2 = i3 - i4;
                    if (a2.getInt(i2) == 101010256 && (a2.getShort(i2 + 20) & UShort.MAX_VALUE) == i4) {
                        break;
                    }
                }
            }
            i2 = -1;
            if (i2 == -1) {
                return null;
            }
            a2.position(i2);
            ByteBuffer slice = a2.slice();
            slice.order(ByteOrder.LITTLE_ENDIAN);
            return new C1131k<>(slice, Long.valueOf(j + i2));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i)));
    }

    static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
