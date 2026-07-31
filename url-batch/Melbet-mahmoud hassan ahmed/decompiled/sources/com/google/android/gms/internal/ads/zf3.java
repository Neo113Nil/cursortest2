package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zf3 extends jd3<nj3, tj3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag3 f15107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zf3(ag3 ag3Var, Class cls) {
        super(cls);
        this.f15107b = ag3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ nj3 a(uo3 uo3Var) {
        return nj3.H(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ tj3 c(nj3 nj3Var) {
        nj3 nj3Var2 = nj3Var;
        KeyPair b7 = an3.b(an3.e(kg3.c(nj3Var2.I().J().K())));
        ECPublicKey eCPublicKey = (ECPublicKey) b7.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) b7.getPrivate();
        ECPoint w6 = eCPublicKey.getW();
        vj3 H = wj3.H();
        H.s(0);
        H.r(nj3Var2.I());
        H.t(uo3.J(w6.getAffineX().toByteArray()));
        H.u(uo3.J(w6.getAffineY().toByteArray()));
        wj3 o7 = H.o();
        sj3 G = tj3.G();
        G.t(0);
        G.s(o7);
        G.r(uo3.J(eCPrivateKey.getS().toByteArray()));
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<nj3>> d() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        gd3 a7 = hd3.a("AES128_GCM");
        bArr = ag3.f2761d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", ag3.l(4, 5, 3, a7, bArr, 1));
        gd3 a8 = hd3.a("AES128_GCM");
        bArr2 = ag3.f2761d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", ag3.l(4, 5, 3, a8, bArr2, 3));
        gd3 a9 = hd3.a("AES128_GCM");
        bArr3 = ag3.f2761d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", ag3.l(4, 5, 4, a9, bArr3, 1));
        gd3 a10 = hd3.a("AES128_GCM");
        bArr4 = ag3.f2761d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", ag3.l(4, 5, 4, a10, bArr4, 3));
        gd3 a11 = hd3.a("AES128_GCM");
        bArr5 = ag3.f2761d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", ag3.l(4, 5, 4, a11, bArr5, 3));
        gd3 a12 = hd3.a("AES128_CTR_HMAC_SHA256");
        bArr6 = ag3.f2761d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ag3.l(4, 5, 3, a12, bArr6, 1));
        gd3 a13 = hd3.a("AES128_CTR_HMAC_SHA256");
        bArr7 = ag3.f2761d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", ag3.l(4, 5, 3, a13, bArr7, 3));
        gd3 a14 = hd3.a("AES128_CTR_HMAC_SHA256");
        bArr8 = ag3.f2761d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ag3.l(4, 5, 4, a14, bArr8, 1));
        gd3 a15 = hd3.a("AES128_CTR_HMAC_SHA256");
        bArr9 = ag3.f2761d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", ag3.l(4, 5, 4, a15, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ void e(nj3 nj3Var) {
        kg3.a(nj3Var.I());
    }
}
