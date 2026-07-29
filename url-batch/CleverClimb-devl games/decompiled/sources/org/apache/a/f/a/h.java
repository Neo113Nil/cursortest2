package org.apache.a.f.a;

import com.google.android.gms.common.util.CrashUtils;
import com.tapjoy.TapjoyConstants;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/* compiled from: NTLMEngineImpl.java */
/* loaded from: classes2.dex */
final class h implements org.apache.a.f.a.f {

    /* renamed from: a, reason: collision with root package name */
    private static final SecureRandom f9720a;

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f9721c;

    /* renamed from: b, reason: collision with root package name */
    private String f9722b = "ASCII";

    static int a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    static int a(int i, int i2, int i3) {
        return ((i ^ (-1)) & i3) | (i2 & i);
    }

    static int b(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    static int c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    h() {
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
            secureRandom = null;
        }
        f9720a = secureRandom;
        byte[] a2 = org.apache.a.k.c.a("NTLMSSP", "ASCII");
        f9721c = new byte[a2.length + 1];
        System.arraycopy(a2, 0, f9721c, 0, a2.length);
        f9721c[a2.length] = 0;
    }

    String b(String str, String str2) throws g {
        return new d(str2, str).b();
    }

    String a(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws g {
        return new f(str4, str3, str, str2, bArr, i, str5, bArr2).b();
    }

    private static String c(String str) {
        int indexOf = str.indexOf(".");
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str) {
        return c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str) {
        return c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(byte[] bArr, int i) throws g {
        if (bArr.length < i + 4) {
            throw new g("NTLM authentication - buffer too small for DWORD");
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static int d(byte[] bArr, int i) throws g {
        if (bArr.length < i + 2) {
            throw new g("NTLM authentication - buffer too small for WORD");
        }
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] e(byte[] bArr, int i) throws g {
        int d2 = d(bArr, i);
        int c2 = c(bArr, i + 4);
        if (bArr.length < c2 + d2) {
            throw new g("NTLM authentication - buffer too small for data item");
        }
        byte[] bArr2 = new byte[d2];
        System.arraycopy(bArr, c2, bArr2, 0, d2);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] d() throws g {
        if (f9720a == null) {
            throw new g("Random generator not available");
        }
        byte[] bArr = new byte[8];
        synchronized (f9720a) {
            f9720a.nextBytes(bArr);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] e() throws g {
        if (f9720a == null) {
            throw new g("Random generator not available");
        }
        byte[] bArr = new byte[24];
        synchronized (f9720a) {
            f9720a.nextBytes(bArr);
        }
        Arrays.fill(bArr, 8, 24, (byte) 0);
        return bArr;
    }

    static byte[] a(String str, byte[] bArr) throws g {
        return a(f(str), bArr);
    }

    static byte[] b(String str, byte[] bArr) throws g {
        return a(g(str), bArr);
    }

    static byte[] a(String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3) throws g {
        return a(a(str, str2, str3), bArr, b(bArr2, bArr3));
    }

    static byte[] a(String str, String str2, String str3, byte[] bArr, byte[] bArr2) throws g {
        return a(a(str, str2, str3), bArr, bArr2);
    }

    static byte[] a(String str, byte[] bArr, byte[] bArr2) throws g {
        try {
            byte[] g = g(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            messageDigest.update(bArr2);
            byte[] digest = messageDigest.digest();
            byte[] bArr3 = new byte[8];
            System.arraycopy(digest, 0, bArr3, 0, 8);
            return a(g, bArr3);
        } catch (Exception e2) {
            if (e2 instanceof g) {
                throw ((g) e2);
            }
            throw new g(e2.getMessage(), e2);
        }
    }

    private static byte[] f(String str) throws g {
        try {
            byte[] bytes = str.toUpperCase().getBytes("US-ASCII");
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key f2 = f(bArr, 0);
            Key f3 = f(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes("US-ASCII");
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, f2);
            byte[] doFinal = cipher.doFinal(bytes2);
            cipher.init(1, f3);
            byte[] doFinal2 = cipher.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            System.arraycopy(doFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e2) {
            throw new g(e2.getMessage(), e2);
        }
    }

    private static byte[] g(String str) throws g {
        try {
            byte[] bytes = str.getBytes("UnicodeLittleUnmarked");
            b bVar = new b();
            bVar.a(bytes);
            return bVar.a();
        } catch (UnsupportedEncodingException e2) {
            throw new g("Unicode not supported: " + e2.getMessage(), e2);
        }
    }

    private static byte[] a(String str, String str2, String str3) throws g {
        try {
            a aVar = new a(g(str3));
            aVar.a(str2.toUpperCase().getBytes("UnicodeLittleUnmarked"));
            aVar.a(str.getBytes("UnicodeLittleUnmarked"));
            return aVar.a();
        } catch (UnsupportedEncodingException e2) {
            throw new g("Unicode not supported! " + e2.getMessage(), e2);
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) throws g {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key f2 = f(bArr3, 0);
            Key f3 = f(bArr3, 7);
            Key f4 = f(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, f2);
            byte[] doFinal = cipher.doFinal(bArr2);
            cipher.init(1, f3);
            byte[] doFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, f4);
            byte[] doFinal3 = cipher.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(doFinal, 0, bArr4, 0, 8);
            System.arraycopy(doFinal2, 0, bArr4, 8, 8);
            System.arraycopy(doFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e2) {
            throw new g(e2.getMessage(), e2);
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws g {
        a aVar = new a(bArr);
        aVar.a(bArr2);
        aVar.a(bArr3);
        byte[] a2 = aVar.a();
        byte[] bArr4 = new byte[a2.length + bArr3.length];
        System.arraycopy(a2, 0, bArr4, 0, a2.length);
        System.arraycopy(bArr3, 0, bArr4, a2.length, bArr3.length);
        return bArr4;
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = {1, 1, 0, 0};
        byte[] bArr4 = {0, 0, 0, 0};
        byte[] bArr5 = {0, 0, 0, 0};
        byte[] bArr6 = new byte[8];
        long currentTimeMillis = (System.currentTimeMillis() + 11644473600000L) * TapjoyConstants.TIMER_INCREMENT;
        for (int i = 0; i < 8; i++) {
            bArr6[i] = (byte) currentTimeMillis;
            currentTimeMillis >>>= 8;
        }
        byte[] bArr7 = new byte[bArr3.length + bArr4.length + bArr6.length + 8 + bArr5.length + bArr2.length];
        System.arraycopy(bArr3, 0, bArr7, 0, bArr3.length);
        int length = bArr3.length + 0;
        System.arraycopy(bArr4, 0, bArr7, length, bArr4.length);
        int length2 = length + bArr4.length;
        System.arraycopy(bArr6, 0, bArr7, length2, bArr6.length);
        int length3 = length2 + bArr6.length;
        System.arraycopy(bArr, 0, bArr7, length3, 8);
        int i2 = length3 + 8;
        System.arraycopy(bArr5, 0, bArr7, i2, bArr5.length);
        System.arraycopy(bArr2, 0, bArr7, i2 + bArr5.length, bArr2.length);
        return bArr7;
    }

    private static Key f(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte[] bArr3 = {bArr2[0], (byte) ((bArr2[0] << 7) | ((bArr2[1] & 255) >>> 1)), (byte) ((bArr2[1] << 6) | ((bArr2[2] & 255) >>> 2)), (byte) ((bArr2[2] << 5) | ((bArr2[3] & 255) >>> 3)), (byte) ((bArr2[3] << 4) | ((bArr2[4] & 255) >>> 4)), (byte) ((bArr2[4] << 3) | ((bArr2[5] & 255) >>> 5)), (byte) ((bArr2[5] << 2) | ((bArr2[6] & 255) >>> 6)), (byte) (bArr2[6] << 1)};
        a(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    private static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            if ((((b2 >>> 1) ^ ((((((b2 >>> 7) ^ (b2 >>> 6)) ^ (b2 >>> 5)) ^ (b2 >>> 4)) ^ (b2 >>> 3)) ^ (b2 >>> 2))) & 1) == 0) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & (-2));
            }
        }
    }

    /* compiled from: NTLMEngineImpl.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f9730a;

        /* renamed from: b, reason: collision with root package name */
        private int f9731b;

        c() {
            this.f9730a = null;
            this.f9731b = 0;
        }

        c(String str, int i) throws g {
            this.f9730a = null;
            this.f9731b = 0;
            this.f9730a = Base64.decodeBase64(org.apache.a.k.c.a(str, "ASCII"));
            if (this.f9730a.length >= h.f9721c.length) {
                for (int i2 = 0; i2 < h.f9721c.length; i2++) {
                    if (this.f9730a[i2] != h.f9721c[i2]) {
                        throw new g("NTLM message expected - instead got unrecognized bytes");
                    }
                }
                int a2 = a(h.f9721c.length);
                if (a2 != i) {
                    throw new g("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(a2));
                }
                this.f9731b = this.f9730a.length;
                return;
            }
            throw new g("NTLM message decoding error - packet too short");
        }

        protected int a() {
            return this.f9731b;
        }

        protected void a(byte[] bArr, int i) throws g {
            if (this.f9730a.length < bArr.length + i) {
                throw new g("NTLM: Message too short");
            }
            System.arraycopy(this.f9730a, i, bArr, 0, bArr.length);
        }

        protected int a(int i) throws g {
            return h.c(this.f9730a, i);
        }

        protected byte[] b(int i) throws g {
            return h.e(this.f9730a, i);
        }

        protected void a(int i, int i2) {
            this.f9730a = new byte[i];
            this.f9731b = 0;
            a(h.f9721c);
            d(i2);
        }

        protected void a(byte b2) {
            this.f9730a[this.f9731b] = b2;
            this.f9731b++;
        }

        protected void a(byte[] bArr) {
            for (byte b2 : bArr) {
                this.f9730a[this.f9731b] = b2;
                this.f9731b++;
            }
        }

        protected void c(int i) {
            a((byte) (i & 255));
            a((byte) ((i >> 8) & 255));
        }

        protected void d(int i) {
            a((byte) (i & 255));
            a((byte) ((i >> 8) & 255));
            a((byte) ((i >> 16) & 255));
            a((byte) ((i >> 24) & 255));
        }

        String b() {
            byte[] bArr;
            if (this.f9730a.length > this.f9731b) {
                bArr = new byte[this.f9731b];
                for (int i = 0; i < this.f9731b; i++) {
                    bArr[i] = this.f9730a[i];
                }
            } else {
                bArr = this.f9730a;
            }
            return org.apache.a.k.c.a(Base64.encodeBase64(bArr));
        }
    }

    /* compiled from: NTLMEngineImpl.java */
    static class d extends c {

        /* renamed from: a, reason: collision with root package name */
        protected byte[] f9732a;

        /* renamed from: b, reason: collision with root package name */
        protected byte[] f9733b;

        d(String str, String str2) throws g {
            try {
                String d2 = h.d(str2);
                String e = h.e(str);
                this.f9732a = d2.getBytes("UnicodeLittleUnmarked");
                this.f9733b = e.toUpperCase().getBytes("UnicodeLittleUnmarked");
            } catch (UnsupportedEncodingException e2) {
                throw new g("Unicode unsupported: " + e2.getMessage(), e2);
            }
        }

        @Override // org.apache.a.f.a.h.c
        String b() {
            a(this.f9732a.length + 32 + this.f9733b.length, 1);
            d(537395765);
            c(this.f9733b.length);
            c(this.f9733b.length);
            d(this.f9732a.length + 32);
            c(this.f9732a.length);
            c(this.f9732a.length);
            d(32);
            a(this.f9732a);
            a(this.f9733b);
            return super.b();
        }
    }

    /* compiled from: NTLMEngineImpl.java */
    static class e extends c {

        /* renamed from: a, reason: collision with root package name */
        protected byte[] f9734a;

        /* renamed from: b, reason: collision with root package name */
        protected String f9735b;

        /* renamed from: c, reason: collision with root package name */
        protected byte[] f9736c;

        /* renamed from: d, reason: collision with root package name */
        protected int f9737d;

        e(String str) throws g {
            super(str, 2);
            this.f9734a = new byte[8];
            a(this.f9734a, 24);
            this.f9737d = a(20);
            if ((this.f9737d & 1) == 0) {
                throw new g("NTLM type 2 message has flags that make no sense: " + Integer.toString(this.f9737d));
            }
            this.f9735b = null;
            if (a() >= 20) {
                byte[] b2 = b(12);
                if (b2.length != 0) {
                    try {
                        this.f9735b = new String(b2, "UnicodeLittleUnmarked");
                    } catch (UnsupportedEncodingException e) {
                        throw new g(e.getMessage(), e);
                    }
                }
            }
            this.f9736c = null;
            if (a() >= 48) {
                byte[] b3 = b(40);
                if (b3.length != 0) {
                    this.f9736c = b3;
                }
            }
        }

        byte[] c() {
            return this.f9734a;
        }

        String d() {
            return this.f9735b;
        }

        byte[] e() {
            return this.f9736c;
        }

        int f() {
            return this.f9737d;
        }
    }

    /* compiled from: NTLMEngineImpl.java */
    static class f extends c {

        /* renamed from: a, reason: collision with root package name */
        protected int f9738a;

        /* renamed from: b, reason: collision with root package name */
        protected byte[] f9739b;

        /* renamed from: c, reason: collision with root package name */
        protected byte[] f9740c;

        /* renamed from: d, reason: collision with root package name */
        protected byte[] f9741d;
        protected byte[] e;
        protected byte[] f;

        f(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws g {
            this.f9738a = i;
            String d2 = h.d(str2);
            String e = h.e(str);
            try {
                if (bArr2 != null && str5 != null) {
                    byte[] d3 = h.d();
                    this.f = h.a(str5, str3, str4, bArr, d3, bArr2);
                    this.e = h.a(str5, str3, str4, bArr, d3);
                } else if ((i & 524288) != 0) {
                    byte[] e2 = h.e();
                    this.f = h.a(str4, bArr, e2);
                    this.e = e2;
                } else {
                    this.f = h.b(str4, bArr);
                    this.e = h.a(str4, bArr);
                }
            } catch (g unused) {
                this.f = new byte[0];
                this.e = h.a(str4, bArr);
            }
            try {
                this.f9739b = e.toUpperCase().getBytes("UnicodeLittleUnmarked");
                this.f9740c = d2.getBytes("UnicodeLittleUnmarked");
                this.f9741d = str3.getBytes("UnicodeLittleUnmarked");
            } catch (UnsupportedEncodingException e3) {
                throw new g("Unicode not supported: " + e3.getMessage(), e3);
            }
        }

        @Override // org.apache.a.f.a.h.c
        String b() {
            int length = this.f.length;
            int length2 = this.e.length;
            int length3 = this.f9739b.length;
            int length4 = this.f9740c.length;
            int length5 = this.f9741d.length;
            int i = length2 + 64;
            int i2 = i + length;
            int i3 = i2 + length3;
            int i4 = i3 + length5;
            int i5 = i4 + length4 + 0;
            a(i5, 3);
            c(length2);
            c(length2);
            d(64);
            c(length);
            c(length);
            d(i);
            c(length3);
            c(length3);
            d(i2);
            c(length5);
            c(length5);
            d(i3);
            c(length4);
            c(length4);
            d(i4);
            d(0);
            d(i5);
            d((this.f9738a & 524288) | 536871429 | (this.f9738a & 16) | (this.f9738a & 32) | (this.f9738a & CrashUtils.ErrorDialogData.SUPPRESSED) | (this.f9738a & 32768));
            a(this.e);
            a(this.f);
            a(this.f9739b);
            a(this.f9741d);
            a(this.f9740c);
            return super.b();
        }
    }

    static void a(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* compiled from: NTLMEngineImpl.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        protected int f9726a = 1732584193;

        /* renamed from: b, reason: collision with root package name */
        protected int f9727b = -271733879;

        /* renamed from: c, reason: collision with root package name */
        protected int f9728c = -1732584194;

        /* renamed from: d, reason: collision with root package name */
        protected int f9729d = 271733878;
        protected long e = 0;
        protected byte[] f = new byte[64];

        b() {
        }

        void a(byte[] bArr) {
            int i = (int) (this.e & 63);
            int i2 = 0;
            while ((bArr.length - i2) + i >= this.f.length) {
                int length = this.f.length - i;
                System.arraycopy(bArr, i2, this.f, i, length);
                this.e += length;
                i2 += length;
                b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length2 = bArr.length - i2;
                System.arraycopy(bArr, i2, this.f, i, length2);
                this.e += length2;
            }
        }

        byte[] a() {
            int i = (int) (this.e & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[i2 + 8];
            bArr[0] = Byte.MIN_VALUE;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((this.e * 8) >>> (i3 * 8));
            }
            a(bArr);
            byte[] bArr2 = new byte[16];
            h.a(bArr2, this.f9726a, 0);
            h.a(bArr2, this.f9727b, 4);
            h.a(bArr2, this.f9728c, 8);
            h.a(bArr2, this.f9729d, 12);
            return bArr2;
        }

        protected void b() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                int i2 = i * 4;
                iArr[i] = (this.f[i2] & 255) + ((this.f[i2 + 1] & 255) << 8) + ((this.f[i2 + 2] & 255) << 16) + ((this.f[i2 + 3] & 255) << 24);
            }
            int i3 = this.f9726a;
            int i4 = this.f9727b;
            int i5 = this.f9728c;
            int i6 = this.f9729d;
            a(iArr);
            b(iArr);
            c(iArr);
            this.f9726a += i3;
            this.f9727b += i4;
            this.f9728c += i5;
            this.f9729d += i6;
        }

        protected void a(int[] iArr) {
            this.f9726a = h.a(this.f9726a + h.a(this.f9727b, this.f9728c, this.f9729d) + iArr[0], 3);
            this.f9729d = h.a(this.f9729d + h.a(this.f9726a, this.f9727b, this.f9728c) + iArr[1], 7);
            this.f9728c = h.a(this.f9728c + h.a(this.f9729d, this.f9726a, this.f9727b) + iArr[2], 11);
            this.f9727b = h.a(this.f9727b + h.a(this.f9728c, this.f9729d, this.f9726a) + iArr[3], 19);
            this.f9726a = h.a(this.f9726a + h.a(this.f9727b, this.f9728c, this.f9729d) + iArr[4], 3);
            this.f9729d = h.a(this.f9729d + h.a(this.f9726a, this.f9727b, this.f9728c) + iArr[5], 7);
            this.f9728c = h.a(this.f9728c + h.a(this.f9729d, this.f9726a, this.f9727b) + iArr[6], 11);
            this.f9727b = h.a(this.f9727b + h.a(this.f9728c, this.f9729d, this.f9726a) + iArr[7], 19);
            this.f9726a = h.a(this.f9726a + h.a(this.f9727b, this.f9728c, this.f9729d) + iArr[8], 3);
            this.f9729d = h.a(this.f9729d + h.a(this.f9726a, this.f9727b, this.f9728c) + iArr[9], 7);
            this.f9728c = h.a(this.f9728c + h.a(this.f9729d, this.f9726a, this.f9727b) + iArr[10], 11);
            this.f9727b = h.a(this.f9727b + h.a(this.f9728c, this.f9729d, this.f9726a) + iArr[11], 19);
            this.f9726a = h.a(this.f9726a + h.a(this.f9727b, this.f9728c, this.f9729d) + iArr[12], 3);
            this.f9729d = h.a(this.f9729d + h.a(this.f9726a, this.f9727b, this.f9728c) + iArr[13], 7);
            this.f9728c = h.a(this.f9728c + h.a(this.f9729d, this.f9726a, this.f9727b) + iArr[14], 11);
            this.f9727b = h.a(this.f9727b + h.a(this.f9728c, this.f9729d, this.f9726a) + iArr[15], 19);
        }

        protected void b(int[] iArr) {
            this.f9726a = h.a(this.f9726a + h.b(this.f9727b, this.f9728c, this.f9729d) + iArr[0] + 1518500249, 3);
            this.f9729d = h.a(this.f9729d + h.b(this.f9726a, this.f9727b, this.f9728c) + iArr[4] + 1518500249, 5);
            this.f9728c = h.a(this.f9728c + h.b(this.f9729d, this.f9726a, this.f9727b) + iArr[8] + 1518500249, 9);
            this.f9727b = h.a(this.f9727b + h.b(this.f9728c, this.f9729d, this.f9726a) + iArr[12] + 1518500249, 13);
            this.f9726a = h.a(this.f9726a + h.b(this.f9727b, this.f9728c, this.f9729d) + iArr[1] + 1518500249, 3);
            this.f9729d = h.a(this.f9729d + h.b(this.f9726a, this.f9727b, this.f9728c) + iArr[5] + 1518500249, 5);
            this.f9728c = h.a(this.f9728c + h.b(this.f9729d, this.f9726a, this.f9727b) + iArr[9] + 1518500249, 9);
            this.f9727b = h.a(this.f9727b + h.b(this.f9728c, this.f9729d, this.f9726a) + iArr[13] + 1518500249, 13);
            this.f9726a = h.a(this.f9726a + h.b(this.f9727b, this.f9728c, this.f9729d) + iArr[2] + 1518500249, 3);
            this.f9729d = h.a(this.f9729d + h.b(this.f9726a, this.f9727b, this.f9728c) + iArr[6] + 1518500249, 5);
            this.f9728c = h.a(this.f9728c + h.b(this.f9729d, this.f9726a, this.f9727b) + iArr[10] + 1518500249, 9);
            this.f9727b = h.a(this.f9727b + h.b(this.f9728c, this.f9729d, this.f9726a) + iArr[14] + 1518500249, 13);
            this.f9726a = h.a(this.f9726a + h.b(this.f9727b, this.f9728c, this.f9729d) + iArr[3] + 1518500249, 3);
            this.f9729d = h.a(this.f9729d + h.b(this.f9726a, this.f9727b, this.f9728c) + iArr[7] + 1518500249, 5);
            this.f9728c = h.a(this.f9728c + h.b(this.f9729d, this.f9726a, this.f9727b) + iArr[11] + 1518500249, 9);
            this.f9727b = h.a(this.f9727b + h.b(this.f9728c, this.f9729d, this.f9726a) + iArr[15] + 1518500249, 13);
        }

        protected void c(int[] iArr) {
            this.f9726a = h.a(this.f9726a + h.c(this.f9727b, this.f9728c, this.f9729d) + iArr[0] + 1859775393, 3);
            this.f9729d = h.a(this.f9729d + h.c(this.f9726a, this.f9727b, this.f9728c) + iArr[8] + 1859775393, 9);
            this.f9728c = h.a(this.f9728c + h.c(this.f9729d, this.f9726a, this.f9727b) + iArr[4] + 1859775393, 11);
            this.f9727b = h.a(this.f9727b + h.c(this.f9728c, this.f9729d, this.f9726a) + iArr[12] + 1859775393, 15);
            this.f9726a = h.a(this.f9726a + h.c(this.f9727b, this.f9728c, this.f9729d) + iArr[2] + 1859775393, 3);
            this.f9729d = h.a(this.f9729d + h.c(this.f9726a, this.f9727b, this.f9728c) + iArr[10] + 1859775393, 9);
            this.f9728c = h.a(this.f9728c + h.c(this.f9729d, this.f9726a, this.f9727b) + iArr[6] + 1859775393, 11);
            this.f9727b = h.a(this.f9727b + h.c(this.f9728c, this.f9729d, this.f9726a) + iArr[14] + 1859775393, 15);
            this.f9726a = h.a(this.f9726a + h.c(this.f9727b, this.f9728c, this.f9729d) + iArr[1] + 1859775393, 3);
            this.f9729d = h.a(this.f9729d + h.c(this.f9726a, this.f9727b, this.f9728c) + iArr[9] + 1859775393, 9);
            this.f9728c = h.a(this.f9728c + h.c(this.f9729d, this.f9726a, this.f9727b) + iArr[5] + 1859775393, 11);
            this.f9727b = h.a(this.f9727b + h.c(this.f9728c, this.f9729d, this.f9726a) + iArr[13] + 1859775393, 15);
            this.f9726a = h.a(this.f9726a + h.c(this.f9727b, this.f9728c, this.f9729d) + iArr[3] + 1859775393, 3);
            this.f9729d = h.a(this.f9729d + h.c(this.f9726a, this.f9727b, this.f9728c) + iArr[11] + 1859775393, 9);
            this.f9728c = h.a(this.f9728c + h.c(this.f9729d, this.f9726a, this.f9727b) + iArr[7] + 1859775393, 11);
            this.f9727b = h.a(this.f9727b + h.c(this.f9728c, this.f9729d, this.f9726a) + iArr[15] + 1859775393, 15);
        }
    }

    /* compiled from: NTLMEngineImpl.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        protected byte[] f9723a;

        /* renamed from: b, reason: collision with root package name */
        protected byte[] f9724b;

        /* renamed from: c, reason: collision with root package name */
        protected MessageDigest f9725c;

        a(byte[] bArr) throws g {
            try {
                this.f9725c = MessageDigest.getInstance("MD5");
                this.f9723a = new byte[64];
                this.f9724b = new byte[64];
                int length = bArr.length;
                if (length > 64) {
                    this.f9725c.update(bArr);
                    bArr = this.f9725c.digest();
                    length = bArr.length;
                }
                int i = 0;
                while (i < length) {
                    this.f9723a[i] = (byte) (54 ^ bArr[i]);
                    this.f9724b[i] = (byte) (92 ^ bArr[i]);
                    i++;
                }
                while (i < 64) {
                    this.f9723a[i] = 54;
                    this.f9724b[i] = 92;
                    i++;
                }
                this.f9725c.reset();
                this.f9725c.update(this.f9723a);
            } catch (Exception e) {
                throw new g("Error getting md5 message digest implementation: " + e.getMessage(), e);
            }
        }

        byte[] a() {
            byte[] digest = this.f9725c.digest();
            this.f9725c.update(this.f9724b);
            return this.f9725c.digest(digest);
        }

        void a(byte[] bArr) {
            this.f9725c.update(bArr);
        }
    }

    @Override // org.apache.a.f.a.f
    public String a(String str, String str2) throws g {
        return b(str2, str);
    }

    @Override // org.apache.a.f.a.f
    public String a(String str, String str2, String str3, String str4, String str5) throws g {
        e eVar = new e(str5);
        return a(str, str2, str4, str3, eVar.c(), eVar.f(), eVar.d(), eVar.e());
    }
}
