package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class MJ implements InterfaceC4108wE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f26319g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f26320h = {0};
    public static final C4237yi i;

    /* renamed from: j, reason: collision with root package name */
    public static final C4237yi f26321j;

    /* renamed from: k, reason: collision with root package name */
    public static final C4237yi f26322k;

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f26323a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26324b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3089dK f26325c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26326d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f26327e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f26328f;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        EnumC3413jK enumC3413jK = EnumC3413jK.f32102n;
        GE ge = GE.f25124m;
        hashMap.put(enumC3413jK, ge);
        hashMap2.put(ge, enumC3413jK);
        EnumC3413jK enumC3413jK2 = EnumC3413jK.f32103u;
        GE ge2 = GE.f25125n;
        hashMap.put(enumC3413jK2, ge2);
        hashMap2.put(ge2, enumC3413jK2);
        EnumC3413jK enumC3413jK3 = EnumC3413jK.f32104v;
        GE ge3 = GE.f25126o;
        hashMap.put(enumC3413jK3, ge3);
        hashMap2.put(ge3, enumC3413jK3);
        i = new C4237yi(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        EnumC3089dK enumC3089dK = EnumC3089dK.f29996n;
        HE he = HE.f25335k;
        hashMap3.put(enumC3089dK, he);
        hashMap4.put(he, enumC3089dK);
        EnumC3089dK enumC3089dK2 = EnumC3089dK.f29997u;
        HE he2 = HE.f25336l;
        hashMap3.put(enumC3089dK2, he2);
        hashMap4.put(he2, enumC3089dK2);
        f26321j = new C4237yi(Collections.unmodifiableMap(hashMap3), Collections.unmodifiableMap(hashMap4));
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        EnumC3034cK enumC3034cK = EnumC3034cK.f29674n;
        C3252gJ c3252gJ = C3252gJ.f30976c;
        hashMap5.put(enumC3034cK, c3252gJ);
        hashMap6.put(c3252gJ, enumC3034cK);
        EnumC3034cK enumC3034cK2 = EnumC3034cK.f29675u;
        C3252gJ c3252gJ2 = C3252gJ.f30977d;
        hashMap5.put(enumC3034cK2, c3252gJ2);
        hashMap6.put(c3252gJ2, enumC3034cK2);
        EnumC3034cK enumC3034cK3 = EnumC3034cK.f29676v;
        C3252gJ c3252gJ3 = C3252gJ.f30978e;
        hashMap5.put(enumC3034cK3, c3252gJ3);
        hashMap6.put(c3252gJ3, enumC3034cK3);
        f26322k = new C4237yi(Collections.unmodifiableMap(hashMap5), Collections.unmodifiableMap(hashMap6));
    }

    public MJ(ECPublicKey eCPublicKey, EnumC3413jK enumC3413jK, EnumC3089dK enumC3089dK, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!XC.e(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        AbstractC3137eE.f(enumC3413jK);
        this.f26324b = enumC3413jK.toString().concat("withECDSA");
        this.f26323a = eCPublicKey;
        this.f26325c = enumC3089dK;
        this.f26326d = bArr;
        this.f26327e = bArr2;
        this.f26328f = provider;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4108wE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f26326d;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!IG.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(byte[] bArr, byte[] bArr2) {
        int i4;
        byte[] bArr3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        byte b9;
        int i14;
        byte b10;
        Signature signature;
        byte[] bArr4;
        int i15;
        EnumC3089dK enumC3089dK = EnumC3089dK.f29996n;
        EnumC3089dK enumC3089dK2 = this.f26325c;
        ECPublicKey eCPublicKey = this.f26323a;
        if (enumC3089dK2 == enumC3089dK) {
            EllipticCurve curve = eCPublicKey.getParams().getCurve();
            int length = bArr.length;
            int bitLength = (PF.c(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != bitLength + bitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            int length2 = bArr.length;
            if ((length2 & 1) != 0 || length2 == 0 || length2 > 132) {
                throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
            }
            int i16 = length2 >> 1;
            byte[] j9 = AbstractC3406jD.j(Arrays.copyOf(bArr, i16));
            byte[] j10 = AbstractC3406jD.j(Arrays.copyOfRange(bArr, i16, length2));
            int length3 = j9.length;
            int length4 = j10.length;
            int i17 = length3 + 4 + length4;
            if (i17 >= 128) {
                bArr3 = new byte[i17 + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) i17;
                i15 = 3;
            } else {
                bArr3 = new byte[i17 + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) i17;
                i15 = 2;
            }
            int i18 = i15 + 1;
            bArr3[i15] = 2;
            int i19 = i15 + 2;
            i4 = 1;
            bArr3[i18] = (byte) length3;
            System.arraycopy(j9, 0, bArr3, i19, length3);
            int i20 = i19 + length3;
            bArr3[i20] = 2;
            bArr3[i20 + 1] = (byte) length4;
            System.arraycopy(j10, 0, bArr3, i20 + 2, length4);
        } else {
            i4 = 1;
            bArr3 = bArr;
        }
        int length5 = bArr3.length;
        if (length5 >= 8 && bArr3[0] == 48) {
            int i21 = bArr3[i4] & 255;
            if (i21 == 129) {
                i21 = bArr3[2] & 255;
                if (i21 >= 128) {
                    i9 = 2;
                    if (i21 == (length5 - 1) - i9 && bArr3[i9 + 1] == 2 && (i13 = (i12 = (i11 = i9 + 3) + (i10 = bArr3[i9 + 2] & 255)) + 1) < length5 && i10 != 0) {
                        b9 = bArr3[i11];
                        if ((b9 & 255) < 128 && ((i10 <= i4 || b9 != 0 || (bArr3[i9 + 4] & 255) >= 128) && bArr3[i12] == 2)) {
                            i14 = bArr3[i13] & 255;
                            if (i12 + 2 + i14 == length5 && i14 != 0) {
                                b10 = bArr3[i9 + 5 + i10];
                                if ((b10 & 255) < 128 && (i14 <= 1 || b10 != 0 || (bArr3[i9 + 6 + i10] & 255) >= 128)) {
                                    String str = this.f26324b;
                                    Provider provider = this.f26328f;
                                    signature = provider == null ? Signature.getInstance(str, provider) : (Signature) C3253gK.f30983d.f30987a.d(str);
                                    signature.initVerify(eCPublicKey);
                                    signature.update(bArr2);
                                    bArr4 = this.f26327e;
                                    if (bArr4.length > 0) {
                                        signature.update(bArr4);
                                    }
                                    try {
                                        if (signature.verify(bArr3)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i21 != 128 && i21 <= 129) {
                i9 = i4;
                if (i21 == (length5 - 1) - i9) {
                    b9 = bArr3[i11];
                    if ((b9 & 255) < 128) {
                        i14 = bArr3[i13] & 255;
                        if (i12 + 2 + i14 == length5) {
                            b10 = bArr3[i9 + 5 + i10];
                            if ((b10 & 255) < 128) {
                                String str2 = this.f26324b;
                                Provider provider2 = this.f26328f;
                                if (provider2 == null) {
                                }
                                signature.initVerify(eCPublicKey);
                                signature.update(bArr2);
                                bArr4 = this.f26327e;
                                if (bArr4.length > 0) {
                                }
                                if (signature.verify(bArr3)) {
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
