package com.pgl.ssdk;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipFile;

/* compiled from: ApkUtils.java */
/* renamed from: com.pgl.ssdk.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1123c {

    /* compiled from: ApkUtils.java */
    /* renamed from: com.pgl.ssdk.c$a */
    public static class a extends C1135o {
        public a(long j, long j2, int i, long j3, ByteBuffer byteBuffer) {
            super(j, j2, i, j3, byteBuffer);
        }
    }

    public static void a(Runnable runnable) {
        Q c = M.a().c();
        if (c != null) {
            c.post(runnable);
        }
    }

    public static a a(InterfaceC1133m interfaceC1133m) throws IOException, C1134n {
        C1131k<ByteBuffer, Long> a2 = AbstractC1132l.a(interfaceC1133m);
        if (a2 != null) {
            ByteBuffer a3 = a2.a();
            long longValue = a2.b().longValue();
            a3.order(ByteOrder.LITTLE_ENDIAN);
            long b = AbstractC1132l.b(a3);
            if (b <= longValue) {
                long c = AbstractC1132l.c(a3);
                long j = b + c;
                if (j <= longValue) {
                    C1135o c1135o = new C1135o(b, c, AbstractC1132l.d(a3), longValue, a3);
                    return new a(c1135o.a(), c1135o.c(), c1135o.b(), c1135o.e(), c1135o.d());
                }
                throw new C1134n("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j + ", EoCD start: " + longValue);
            }
            throw new C1134n("ZIP Central Directory start offset out of range: " + b + ". ZIP End of Central Directory offset: " + longValue);
        }
        throw new C1134n("ZIP End of Central Directory record not found");
    }

    public static C1124d a(InterfaceC1133m interfaceC1133m, C1135o c1135o) throws IOException, C1122b {
        long a2 = c1135o.a();
        long c = c1135o.c() + a2;
        long e = c1135o.e();
        if (c != e) {
            throw new C1122b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + c + ", EoCD start: " + e);
        }
        if (a2 >= 32) {
            C1130j c1130j = (C1130j) interfaceC1133m;
            ByteBuffer a3 = c1130j.a(a2 - 24, 24);
            a3.order(ByteOrder.LITTLE_ENDIAN);
            if (a3.getLong(8) == 2334950737559900225L && a3.getLong(16) == 3617552046287187010L) {
                long j = a3.getLong(0);
                if (j < a3.capacity() || j > 2147483639) {
                    throw new C1122b("APK Signing Block size out of range: ".concat(String.valueOf(j)));
                }
                long j2 = (int) (8 + j);
                long j3 = a2 - j2;
                if (j3 >= 0) {
                    ByteBuffer a4 = c1130j.a(j3, 8);
                    a4.order(ByteOrder.LITTLE_ENDIAN);
                    long j4 = a4.getLong(0);
                    if (j4 == j) {
                        return new C1124d(j3, c1130j.a(j3, j2));
                    }
                    throw new C1122b("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j);
                }
                throw new C1122b("APK Signing Block offset out of range: ".concat(String.valueOf(j3)));
            }
            throw new C1122b("No APK Signing Block before ZIP Central Directory");
        }
        throw new C1122b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(a2)));
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }
}
