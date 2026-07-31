package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class u9 {

    /* renamed from: a, reason: collision with root package name */
    static boolean f12698a = false;

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f12699b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12700c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f12701d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final CountDownLatch f12702e = new CountDownLatch(1);

    static String a(a9 a9Var, String str) {
        byte[] g7;
        o9 o7;
        byte[] d7 = a9Var.d();
        if (((Boolean) sw.c().b(m10.X1)).booleanValue()) {
            Vector<byte[]> b7 = b(d7, 255);
            if (b7 == null || b7.size() == 0) {
                g7 = g(f(4096).d(), str, true);
                return q9.a(g7, true);
            }
            n9 F = o9.F();
            int size = b7.size();
            for (int i7 = 0; i7 < size; i7++) {
                F.r(uo3.J(g(b7.get(i7), str, false)));
            }
            F.s(uo3.J(e(d7)));
            o7 = F.o();
        } else {
            if (hc.f6177a == null) {
                throw new GeneralSecurityException();
            }
            byte[] a7 = hc.f6177a.a(d7, str != null ? str.getBytes() : new byte[0]);
            n9 F2 = o9.F();
            F2.r(uo3.J(a7));
            F2.t(3);
            o7 = F2.o();
        }
        g7 = o7.d();
        return q9.a(g7, true);
    }

    static Vector<byte[]> b(byte[] bArr, int i7) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i8 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = i9 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i10 > 255) {
                    length2 = i10 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i10, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void d() {
        synchronized (f12701d) {
            if (!f12698a) {
                f12698a = true;
                new Thread(new t9(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.u9.f12699b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] e(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (f12700c) {
            d();
            MessageDigest messageDigest2 = null;
            try {
                if (f12702e.await(2L, TimeUnit.SECONDS) && (messageDigest = f12699b) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            throw new NoSuchAlgorithmException("Cannot compute hash");
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    static a9 f(int i7) {
        j8 f02 = a9.f0();
        f02.r0(4096L);
        return f02.o();
    }

    private static byte[] g(byte[] bArr, String str, boolean z6) {
        ByteBuffer put;
        int i7 = true != z6 ? 255 : 239;
        if (bArr.length > i7) {
            bArr = f(4096).d();
        }
        int length = bArr.length;
        if (length < i7) {
            byte[] bArr2 = new byte[i7 - length];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i7 + 1).put((byte) length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i7 + 1).put((byte) length).put(bArr);
        }
        byte[] array = put.array();
        if (z6) {
            array = ByteBuffer.allocate(256).put(e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        v9[] v9VarArr = new va().G2;
        int length2 = v9VarArr.length;
        for (int i8 = 0; i8 < 12; i8++) {
            v9VarArr[i8].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zn3(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
