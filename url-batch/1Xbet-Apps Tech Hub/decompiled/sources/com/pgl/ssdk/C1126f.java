package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: ApkSigningBlockUtilsLite.java */
/* renamed from: com.pgl.ssdk.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1126f {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static C1127g a(InterfaceC1133m interfaceC1133m, C1135o c1135o, int i) throws IOException, C1128h {
        try {
            C1124d a = AbstractC1123c.a(interfaceC1133m, c1135o);
            long b = a.b();
            C1130j c1130j = (C1130j) a.a();
            ByteBuffer a2 = c1130j.a(0L, (int) c1130j.a());
            a2.order(ByteOrder.LITTLE_ENDIAN);
            if (a2.order() != ByteOrder.LITTLE_ENDIAN) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = a2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = a2.capacity();
            if (capacity > a2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = a2.limit();
            int position = a2.position();
            int i2 = 0;
            try {
                a2.position(0);
                a2.limit(capacity);
                a2.position(8);
                ByteBuffer slice = a2.slice();
                slice.order(a2.order());
                while (slice.hasRemaining()) {
                    i2++;
                    if (slice.remaining() < 8) {
                        throw new C1128h("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i2)));
                    }
                    long j = slice.getLong();
                    if (j < 4 || j > 2147483647L) {
                        throw new C1128h("APK Signing Block entry #" + i2 + " size out of range: " + j);
                    }
                    int i3 = (int) j;
                    int position2 = slice.position() + i3;
                    if (i3 > slice.remaining()) {
                        throw new C1128h("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == i) {
                        return new C1127g(a(slice, i3 - 4), b, c1135o.a(), c1135o.e(), c1135o.d());
                    }
                    slice.position(position2);
                }
                throw new C1128h("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i)));
            } finally {
                a2.position(0);
                a2.limit(limit);
                a2.position(position);
            }
        } catch (C1122b e) {
            throw new C1128h(e.getMessage(), e);
        }
    }

    public static byte[] b(ByteBuffer byteBuffer) throws C1121a {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C1121a("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new C1121a("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 >= position && i2 <= limit) {
                byteBuffer.limit(i2);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i2);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws C1121a {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return a(byteBuffer, i);
                }
                throw new C1121a("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new C1121a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }
}
