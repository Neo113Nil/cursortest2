package com.anythink.core.common.s.a;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final int f16490c = 2048;

    /* renamed from: d, reason: collision with root package name */
    private static final String f16491d = "Invalid String";

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16492a;

    /* renamed from: b, reason: collision with root package name */
    public int f16493b;

    /* renamed from: e, reason: collision with root package name */
    private char[] f16494e;

    public f(int i) {
        this(new byte[i], 0);
    }

    private int e() {
        byte[] bArr = this.f16492a;
        int i = this.f16493b;
        int i4 = i + 1;
        this.f16493b = i4;
        byte b9 = bArr[i];
        if ((b9 >> 7) == 0) {
            return b9;
        }
        int i9 = i + 2;
        this.f16493b = i9;
        int i10 = (bArr[i4] << 7) | (b9 & Byte.MAX_VALUE);
        if ((i10 >> 14) == 0) {
            return i10;
        }
        int i11 = i + 3;
        this.f16493b = i11;
        int i12 = (i10 & 16383) | (bArr[i9] << 14);
        if ((i12 >> 21) == 0) {
            return i12;
        }
        int i13 = i + 4;
        this.f16493b = i13;
        int i14 = (i12 & 2097151) | (bArr[i11] << 21);
        if ((i14 >> 28) == 0) {
            return i14;
        }
        this.f16493b = i + 5;
        return (bArr[i13] << 28) | (i14 & 268435455);
    }

    private static int f(int i) {
        if ((i >> 7) == 0) {
            return 1;
        }
        if ((i >> 14) == 0) {
            return 2;
        }
        if ((i >> 21) == 0) {
            return 3;
        }
        return (i >> 28) == 0 ? 4 : 5;
    }

    private byte[] g(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f16492a, this.f16493b, bArr, 0, i);
        this.f16493b += i;
        return bArr;
    }

    private char[] h(int i) {
        char[] cArr = this.f16494e;
        if (cArr == null) {
            char[] cArr2 = i <= 256 ? new char[256] : new char[f16490c];
            this.f16494e = cArr2;
            return cArr2;
        }
        if (cArr.length >= i) {
            return cArr;
        }
        char[] cArr3 = new char[f16490c];
        this.f16494e = cArr3;
        return cArr3;
    }

    public final byte a() {
        byte[] bArr = this.f16492a;
        int i = this.f16493b;
        this.f16493b = i + 1;
        return bArr[i];
    }

    public final short b() {
        byte[] bArr = this.f16492a;
        int i = this.f16493b;
        int i4 = i + 1;
        this.f16493b = i4;
        int i9 = bArr[i] & 255;
        this.f16493b = i + 2;
        return (short) ((bArr[i4] << 8) | i9);
    }

    public final int c() {
        byte[] bArr = this.f16492a;
        int i = this.f16493b;
        int i4 = i + 1;
        this.f16493b = i4;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f16493b = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i9;
        int i12 = i + 3;
        this.f16493b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f16493b = i + 4;
        return (bArr[i12] << 24) | i13;
    }

    public final long d() {
        long c4 = c(this.f16493b);
        this.f16493b += 8;
        return c4;
    }

    public f(byte[] bArr) {
        this(bArr, 0);
    }

    private int c(int i, int i4) {
        while ((i4 & (-128)) != 0) {
            this.f16492a[i] = (byte) ((i4 & com.anythink.expressad.video.module.a.a.f21886R) | 128);
            i4 >>>= 7;
            i++;
        }
        int i9 = i + 1;
        this.f16492a[i] = (byte) i4;
        return i9;
    }

    public final void a(byte b9) {
        byte[] bArr = this.f16492a;
        int i = this.f16493b;
        this.f16493b = i + 1;
        bArr[i] = b9;
    }

    public final void b(int i) {
        byte[] bArr = this.f16492a;
        int i4 = this.f16493b;
        int i9 = i4 + 1;
        this.f16493b = i9;
        bArr[i4] = (byte) i;
        int i10 = i4 + 2;
        this.f16493b = i10;
        bArr[i9] = (byte) (i >> 8);
        int i11 = i4 + 3;
        this.f16493b = i11;
        bArr[i10] = (byte) (i >> 16);
        this.f16493b = i4 + 4;
        bArr[i11] = (byte) (i >> 24);
    }

    public f(byte[] bArr, int i) {
        this.f16494e = null;
        this.f16492a = bArr;
        this.f16493b = i;
    }

    private double d(com.anythink.core.common.s.a.a.a aVar) {
        return Double.longBitsToDouble(b(aVar));
    }

    public final void a(short s3) {
        byte[] bArr = this.f16492a;
        int i = this.f16493b;
        int i4 = i + 1;
        this.f16493b = i4;
        bArr[i] = (byte) s3;
        this.f16493b = i + 2;
        bArr[i4] = (byte) (s3 >> 8);
    }

    public final long c(int i) {
        byte[] bArr = this.f16492a;
        int i4 = i + 6;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i4] & 255) << 48) | (bArr[i + 7] << 56);
    }

    public final String d(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        String str = i > f16490c ? new String(this.f16492a, this.f16493b, i, StandardCharsets.UTF_8) : a(this.f16492a, this.f16493b, i);
        this.f16493b += i;
        return str;
    }

    private float c(com.anythink.core.common.s.a.a.a aVar) {
        return Float.intBitsToFloat(a(aVar));
    }

    public final int a(int i) {
        byte[] bArr = this.f16492a;
        int i4 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i4 | ((bArr[i + 2] & 255) << 16);
    }

    private void c(String str) {
        byte[] bArr = this.f16492a;
        int i = this.f16493b;
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i9 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                bArr[i] = (byte) charAt;
                i++;
            } else if (charAt < f16490c) {
                int i10 = i + 1;
                bArr[i] = (byte) ((charAt >>> 6) | 192);
                i += 2;
                bArr[i10] = (byte) ((charAt & '?') | 128);
            } else if (charAt >= 55296 && charAt <= 57343) {
                i4 += 2;
                int charAt2 = ((charAt << '\n') + str.charAt(i9)) - 56613888;
                bArr[i] = (byte) ((charAt2 >>> 18) | 240);
                bArr[i + 1] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i11 = i + 3;
                bArr[i + 2] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i += 4;
                bArr[i11] = (byte) ((charAt2 & 63) | 128);
            } else {
                bArr[i] = (byte) ((charAt >>> '\f') | 224);
                int i12 = i + 2;
                bArr[i + 1] = (byte) (((charAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i12] = (byte) ((charAt & '?') | 128);
            }
            i4 = i9;
        }
        this.f16493b = i;
    }

    private void e(int i) {
        int i4 = this.f16493b;
        while ((i & (-128)) != 0) {
            this.f16492a[i4] = (byte) ((i & com.anythink.expressad.video.module.a.a.f21886R) | 128);
            i >>>= 7;
            i4++;
        }
        this.f16492a[i4] = (byte) i;
        this.f16493b = i4 + 1;
    }

    public final int a(com.anythink.core.common.s.a.a.a aVar) {
        return aVar != null ? aVar.d() : c();
    }

    public final long b(com.anythink.core.common.s.a.a.a aVar) {
        return aVar != null ? aVar.f() : d();
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int i9 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                i4++;
            } else if (charAt < f16490c) {
                i4 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i4 += 3;
            } else {
                i += 2;
                i4 += 4;
            }
            i = i9;
        }
        return i4;
    }

    public final void a(int i, int i4) {
        byte[] bArr = this.f16492a;
        bArr[i] = (byte) i4;
        bArr[i + 1] = (byte) (i4 >> 8);
        bArr[i + 2] = (byte) (i4 >> 16);
        bArr[i + 3] = (byte) (i4 >> 24);
    }

    public final long b(int i, int i4) {
        long j9 = 0;
        if (i4 <= 0) {
            return 0L;
        }
        int i9 = i4 >> 3;
        int i10 = i4 & 7;
        int i11 = 0;
        int i12 = i;
        for (int i13 = 0; i13 < i9; i13++) {
            j9 ^= c(i12);
            i12 += 8;
        }
        while (i11 < (i10 << 3)) {
            j9 ^= (this.f16492a[i12] & 255) << i11;
            i11 += 8;
            i12++;
        }
        int i14 = (i & 7) << 3;
        return (j9 >>> (64 - i14)) | (j9 << i14);
    }

    private byte[] b(com.anythink.core.common.s.a.a.a aVar, int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f16492a, this.f16493b, bArr, 0, i);
        this.f16493b += i;
        return aVar != null ? aVar.b() : bArr;
    }

    public final void a(int i, long j9) {
        byte[] bArr = this.f16492a;
        bArr[i] = (byte) j9;
        bArr[i + 1] = (byte) (j9 >> 8);
        bArr[i + 2] = (byte) (j9 >> 16);
        bArr[i + 3] = (byte) (j9 >> 24);
        bArr[i + 4] = (byte) (j9 >> 32);
        bArr[i + 5] = (byte) (j9 >> 40);
        bArr[i + 6] = (byte) (j9 >> 48);
        bArr[i + 7] = (byte) (j9 >> 56);
    }

    public final void a(long j9) {
        a(this.f16493b, j9);
        this.f16493b += 8;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f16492a, this.f16493b, length);
            this.f16493b += length;
        }
    }

    public final String a(com.anythink.core.common.s.a.a.a aVar, int i) {
        String str;
        if (aVar != null && i > 0) {
            byte[] bArr = this.f16492a;
            int i4 = this.f16493b;
            Arrays.copyOfRange(bArr, i4, i4 + i);
            byte[] b9 = aVar.b();
            if (b9 == null) {
                str = null;
            } else {
                str = b9.length > f16490c ? new String(b9, StandardCharsets.UTF_8) : a(b9, 0, b9.length);
            }
            this.f16493b += i;
            return str;
        }
        return d(i);
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.f16492a;
        int i = this.f16493b;
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i9 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                bArr[i] = (byte) charAt;
                i++;
            } else if (charAt < f16490c) {
                int i10 = i + 1;
                bArr[i] = (byte) ((charAt >>> 6) | 192);
                i += 2;
                bArr[i10] = (byte) ((charAt & '?') | 128);
            } else if (charAt >= 55296 && charAt <= 57343) {
                i4 += 2;
                int charAt2 = ((charAt << '\n') + str.charAt(i9)) - 56613888;
                bArr[i] = (byte) ((charAt2 >>> 18) | 240);
                bArr[i + 1] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i11 = i + 3;
                bArr[i + 2] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i += 4;
                bArr[i11] = (byte) ((charAt2 & 63) | 128);
            } else {
                bArr[i] = (byte) ((charAt >>> '\f') | 224);
                int i12 = i + 2;
                bArr[i + 1] = (byte) (((charAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i12] = (byte) ((charAt & '?') | 128);
            }
            i4 = i9;
        }
        this.f16493b = i;
    }

    public final synchronized String a(byte[] bArr, int i, int i4) {
        char[] cArr;
        int i9;
        int i10;
        try {
            cArr = this.f16494e;
            if (cArr == null) {
                if (i4 <= 256) {
                    cArr = new char[256];
                } else {
                    cArr = new char[f16490c];
                }
                this.f16494e = cArr;
            } else if (cArr.length < i4) {
                cArr = new char[f16490c];
                this.f16494e = cArr;
            }
            int i11 = i4 + i;
            i9 = 0;
            while (i < i11) {
                int i12 = i + 1;
                byte b9 = bArr[i];
                if (b9 > 0) {
                    cArr[i9] = (char) b9;
                    i9++;
                    i = i12;
                } else {
                    if (b9 < -32) {
                        i += 2;
                        byte b10 = bArr[i12];
                        if (b9 >= -62 && b10 <= -65) {
                            i10 = i9 + 1;
                            cArr[i9] = (char) ((b10 & c.f16476c) | ((b9 & 31) << 6));
                        } else {
                            throw new IllegalArgumentException(f16491d);
                        }
                    } else if (b9 < -16) {
                        int i13 = i + 2;
                        byte b11 = bArr[i12];
                        i += 3;
                        byte b12 = bArr[i13];
                        if ((b9 != -32 || b11 >= -96) && ((b9 != -19 || b11 < -96) && b11 <= -65 && b12 <= -65)) {
                            i10 = i9 + 1;
                            cArr[i9] = (char) (((b11 & c.f16476c) << 6) | ((b9 & 15) << 12) | (b12 & c.f16476c));
                        } else {
                            throw new IllegalArgumentException(f16491d);
                        }
                    } else {
                        byte b13 = bArr[i12];
                        int i14 = i + 3;
                        byte b14 = bArr[i + 2];
                        i += 4;
                        byte b15 = bArr[i14];
                        if (b13 <= -65) {
                            if ((((b13 + 112) + (b9 << 28)) >> 30) == 0 && b14 <= -65 && b15 <= -65) {
                                int i15 = ((b13 & c.f16476c) << 12) | ((b9 & 7) << 18) | ((b14 & c.f16476c) << 6) | (b15 & c.f16476c);
                                int i16 = i9 + 1;
                                cArr[i9] = (char) ((i15 >>> 10) + 55232);
                                i9 += 2;
                                cArr[i16] = (char) ((i15 & 1023) + 56320);
                            }
                        }
                        throw new IllegalArgumentException(f16491d);
                    }
                    i9 = i10;
                }
            }
            if (i <= i11) {
            } else {
                throw new IllegalArgumentException(f16491d);
            }
        } finally {
        }
        return new String(cArr, 0, i9);
    }
}
