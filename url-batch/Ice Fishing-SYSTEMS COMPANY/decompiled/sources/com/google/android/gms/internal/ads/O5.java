package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class O5 implements InterfaceC3140eH, InterfaceC3273gn {

    /* renamed from: n, reason: collision with root package name */
    public int f26648n;

    /* renamed from: u, reason: collision with root package name */
    public Object f26649u;

    /* renamed from: v, reason: collision with root package name */
    public Object f26650v;

    /* renamed from: w, reason: collision with root package name */
    public Object f26651w;

    public O5(J5 j52, int i, D5 d52) {
        this.f26649u = j52;
        this.f26648n = i;
        this.f26650v = d52;
    }

    public static final void i(long j9) {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        if (j9 % (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new M5();
        }
    }

    public void a(long j9) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        i(j9);
        long j18 = j9 / (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16) ^ (j17 % 899334107));
        if (j18 < 0 || j18 > ((J5) this.f26649u).f25735a.length) {
            throw new N5();
        }
        this.f26648n = (int) j18;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3273gn, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        EQ eq = (EQ) obj;
        eq.q(0, ((NP) this.f26649u).f26543a, (C3958tQ) this.f26650v, (C4228yQ) this.f26651w, this.f26648n);
    }

    public long c() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j9 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        return this.f26648n * (((((((~j9) & j10) | j11) + ((j9 & j12) | j13)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public void d() {
        HandlerThread handlerThread;
        synchronized (this.f26649u) {
            try {
                PA.T(this.f26648n > 0);
                int i = this.f26648n - 1;
                this.f26648n = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f26651w) != null) {
                    handlerThread.quit();
                    this.f26651w = null;
                    this.f26650v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long e() {
        try {
            D5 d52 = (D5) this.f26650v;
            J5 j52 = (J5) this.f26649u;
            this.f26648n = this.f26648n + 1;
            return d52.f(j52, r2);
        } catch (IndexOutOfBoundsException e6) {
            throw new N5(e6);
        }
    }

    public int f() {
        try {
            D5 d52 = (D5) this.f26650v;
            J5 j52 = (J5) this.f26649u;
            int i = this.f26648n;
            this.f26648n = i + 1;
            int f6 = d52.f(j52, i) & 255;
            D5 d53 = (D5) this.f26650v;
            J5 j53 = (J5) this.f26649u;
            int i4 = this.f26648n;
            this.f26648n = i4 + 1;
            int f9 = f6 | ((d53.f(j53, i4) & 255) << 8);
            D5 d54 = (D5) this.f26650v;
            J5 j54 = (J5) this.f26649u;
            int i9 = this.f26648n;
            this.f26648n = i9 + 1;
            int f10 = f9 | ((d54.f(j54, i9) & 255) << 16);
            D5 d55 = (D5) this.f26650v;
            J5 j55 = (J5) this.f26649u;
            int i10 = this.f26648n;
            this.f26648n = i10 + 1;
            return f10 | (d55.f(j55, i10) << 24);
        } catch (IndexOutOfBoundsException e6) {
            throw new N5(e6);
        }
    }

    public long g() {
        int i = 0;
        long j9 = 0;
        while (i < 64) {
            try {
                D5 d52 = (D5) this.f26650v;
                J5 j52 = (J5) this.f26649u;
                int i4 = this.f26648n;
                this.f26648n = i4 + 1;
                byte f6 = d52.f(j52, i4);
                j9 |= (f6 & Byte.MAX_VALUE) << i;
                if (i == 63) {
                    if (f6 > 1) {
                        throw new L5();
                    }
                    i = 63;
                }
                if ((f6 & com.anythink.core.common.s.a.c.f16474a) == 0) {
                    return (-(j9 & 1)) ^ (j9 >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e6) {
                throw new N5(e6);
            }
        }
        throw new L5();
    }

    public J5 h(long j9) {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i4 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g9 = com.anythink.basead.b.c.i.g((i4 & (~i)) | i9, (i & i10) | i11, i12, i13);
        i(c() + j9);
        int i15 = this.f26648n;
        long j10 = i15;
        J5 j52 = (J5) this.f26649u;
        long j11 = (j9 >> ((i14 % 774318984) ^ g9)) + j10;
        if (j11 > j52.f25735a.length || j11 < j10) {
            throw new N5();
        }
        try {
            int i16 = (int) j11;
            J5 g10 = ((D5) this.f26650v).g(j52, i15, i16);
            this.f26648n = i16;
            return g10;
        } catch (IndexOutOfBoundsException e6) {
            throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3140eH
    public byte[] n(int i, byte[] bArr) {
        if (i > this.f26648n) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        C3467kK c3467kK = (C3467kK) this.f26649u;
        ((Mac) c3467kK.get()).update(bArr);
        return Arrays.copyOf(((Mac) c3467kK.get()).doFinal(), i);
    }

    public O5(J5 j52, int i, D5 d52, T2 t22) {
        this(j52, i, d52);
        this.f26651w = t22;
    }

    public /* synthetic */ O5(NP np, C3958tQ c3958tQ, C4228yQ c4228yQ, int i) {
        this.f26649u = np;
        this.f26650v = c3958tQ;
        this.f26651w = c4228yQ;
        this.f26648n = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public O5(String str, SecretKeySpec secretKeySpec) {
        char c4;
        int i;
        C3467kK c3467kK = new C3467kK(this);
        this.f26649u = c3467kK;
        if (XC.e(2)) {
            this.f26650v = str;
            this.f26651w = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                if (c4 == 0) {
                    i = 20;
                } else if (c4 == 1) {
                    i = 28;
                } else if (c4 == 2) {
                    i = 32;
                } else if (c4 == 3) {
                    i = 48;
                } else {
                    if (c4 != 4) {
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                    }
                    i = 64;
                }
                this.f26648n = i;
                c3467kK.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
