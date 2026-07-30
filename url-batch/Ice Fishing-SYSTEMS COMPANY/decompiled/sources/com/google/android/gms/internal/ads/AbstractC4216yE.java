package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4216yE {
    static {
        int i = FI.zza;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() {
        BE be = BE.f24009a;
        C3463kG c3463kG = C3463kG.f32285b;
        c3463kG.b(BE.f24009a);
        c3463kG.a(BE.f24010b);
        SG.a();
        int i = FE.f24935e;
        if (!XC.e(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C3733pG c3733pG = AbstractC3678oF.f33120a;
        C3517lG c3517lG = C3517lG.f32558b;
        c3517lG.c(AbstractC3678oF.f33120a);
        c3517lG.d(AbstractC3678oF.f33121b);
        c3517lG.a(AbstractC3678oF.f33122c);
        c3517lG.b(AbstractC3678oF.f33123d);
        c3463kG.a(FE.f24931a);
        C3409jG c3409jG = C3409jG.f32096b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", AbstractC3248gF.f30969e);
        Q8 q82 = new Q8(6);
        q82.b(16);
        q82.g(32);
        q82.l(16);
        q82.k(16);
        GE ge = GE.f25117e;
        q82.f27123x = ge;
        HE he = HE.f25330e;
        q82.f27124y = he;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", q82.n());
        hashMap.put("AES256_CTR_HMAC_SHA256", AbstractC3248gF.f30970f);
        Q8 q83 = new Q8(6);
        q83.b(32);
        q83.g(32);
        q83.l(32);
        q83.k(16);
        q83.f27123x = ge;
        q83.f27124y = he;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", q83.n());
        c3409jG.b(Collections.unmodifiableMap(hashMap));
        C3357iG c3357iG = C3357iG.f31327b;
        c3357iG.a(FE.f24933c, IE.class);
        C3249gG c3249gG = C3249gG.f30974b;
        c3249gG.a(FE.f24934d, IE.class);
        UF uf = UF.f27953d;
        uf.c(FE.f24932b, i, true);
        int i4 = OE.f26672e;
        if (!XC.e(i4)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3517lG.c(AbstractC3839rF.f34001a);
        c3517lG.d(AbstractC3839rF.f34002b);
        c3517lG.a(AbstractC3839rF.f34003c);
        c3517lG.b(AbstractC3839rF.f34004d);
        c3463kG.a(OE.f26668a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", AbstractC3248gF.f30965a);
        PE pe = new PE(0);
        pe.c();
        pe.a(16);
        pe.f();
        C3731pE c3731pE = C3731pE.f33353A;
        pe.f26885e = c3731pE;
        hashMap2.put("AES128_GCM_RAW", pe.i());
        hashMap2.put("AES256_GCM", AbstractC3248gF.f30966b);
        PE pe2 = new PE(0);
        pe2.c();
        pe2.a(32);
        pe2.f();
        pe2.f26885e = c3731pE;
        hashMap2.put("AES256_GCM_RAW", pe2.i());
        c3409jG.b(Collections.unmodifiableMap(hashMap2));
        c3357iG.a(OE.f26670c, QE.class);
        c3249gG.a(OE.f26671d, QE.class);
        uf.c(OE.f26669b, i4, true);
        if (JF.a()) {
            return;
        }
        C4002uG c4002uG = KE.f25943a;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        c3517lG.c(AbstractC3732pF.f33370a);
        c3517lG.d(AbstractC3732pF.f33371b);
        c3517lG.a(AbstractC3732pF.f33372c);
        c3517lG.b(AbstractC3732pF.f33373d);
        c3463kG.a(KE.f25943a);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", AbstractC3248gF.f30967c);
        C2518Df c2518Df = new C2518Df(29);
        c2518Df.r(16);
        c2518Df.j(16);
        c2518Df.u();
        LE le = LE.f26126x;
        c2518Df.f24456x = le;
        hashMap3.put("AES128_EAX_RAW", c2518Df.z());
        hashMap3.put("AES256_EAX", AbstractC3248gF.f30968d);
        C2518Df c2518Df2 = new C2518Df(29);
        c2518Df2.r(16);
        c2518Df2.j(32);
        c2518Df2.u();
        c2518Df2.f24456x = le;
        hashMap3.put("AES256_EAX_RAW", c2518Df2.z());
        c3409jG.b(Collections.unmodifiableMap(hashMap3));
        c3249gG.a(KE.f25945c, ME.class);
        uf.a(KE.f25944b, true);
        C4002uG c4002uG2 = SE.f27513a;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c3517lG.c(AbstractC3947tF.f34384a);
        c3517lG.d(AbstractC3947tF.f34385b);
        c3517lG.a(AbstractC3947tF.f34386c);
        c3517lG.b(AbstractC3947tF.f34387d);
        HashMap hashMap4 = new HashMap();
        GE ge2 = GE.f25121j;
        GE ge3 = GE.f25120h;
        hashMap4.put("AES128_GCM_SIV", new TE(16, ge3));
        hashMap4.put("AES128_GCM_SIV_RAW", new TE(16, ge2));
        hashMap4.put("AES256_GCM_SIV", new TE(32, ge3));
        hashMap4.put("AES256_GCM_SIV_RAW", new TE(32, ge2));
        c3409jG.b(Collections.unmodifiableMap(hashMap4));
        c3357iG.a(EE.f24676c, TE.class);
        c3249gG.a(DE.f24369e, TE.class);
        c3463kG.a(SE.f27513a);
        uf.a(SE.f27514b, true);
        C4002uG c4002uG3 = VE.f28226a;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        c3517lG.c(AbstractC4055vF.f34744a);
        c3517lG.d(AbstractC4055vF.f34745b);
        c3517lG.a(AbstractC4055vF.f34746c);
        c3517lG.b(AbstractC4055vF.f34747d);
        c3463kG.a(VE.f28226a);
        c3249gG.a(DE.f24370f, WE.class);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new WE(HE.f25331f));
        hashMap5.put("CHACHA20_POLY1305_RAW", new WE(HE.f25333h));
        c3409jG.b(Collections.unmodifiableMap(hashMap5));
        uf.a(VE.f28227b, true);
        C4002uG c4002uG4 = XE.f28621a;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        c3517lG.c(AbstractC3029cF.f29657a);
        c3517lG.d(AbstractC3029cF.f29658b);
        c3517lG.a(AbstractC3029cF.f29659c);
        c3517lG.b(AbstractC3029cF.f29660d);
        c3463kG.a(XE.f28621a);
        c3249gG.a(XE.f28623c, C2920aF.class);
        uf.a(XE.f28622b, true);
        C2921aG c2921aG = YE.f28813a;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        c3517lG.c(AbstractC3193fF.f30637a);
        c3517lG.d(AbstractC3193fF.f30638b);
        c3517lG.a(AbstractC3193fF.f30639c);
        c3517lG.b(AbstractC3193fF.f30640d);
        c3249gG.a(YE.f28814b, C3138eF.class);
        c3463kG.a(YE.f28815c);
        uf.a(YE.f28813a, true);
        C4002uG c4002uG5 = AbstractC3516lF.f32554a;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        c3517lG.c(GF.f25129a);
        c3517lG.d(GF.f25130b);
        c3517lG.a(GF.f25131c);
        c3517lG.b(GF.f25132d);
        c3463kG.a(AbstractC3516lF.f32554a);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new C3570mF(LE.f26117A));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new C3570mF(LE.f26119C));
        c3409jG.b(Collections.unmodifiableMap(hashMap6));
        c3249gG.a(AbstractC3516lF.f32557d, C3570mF.class);
        c3357iG.a(AbstractC3516lF.f32556c, C3570mF.class);
        uf.a(AbstractC3516lF.f32555b, true);
        C4002uG c4002uG6 = AbstractC3356iF.f31326a;
        c3517lG.c(EF.f24680a);
        c3517lG.d(EF.f24681b);
        c3517lG.a(EF.f24682c);
        c3517lG.b(EF.f24683d);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", AbstractC3248gF.f30971g);
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", AbstractC3248gF.f30972h);
        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", AbstractC3248gF.i);
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", AbstractC3248gF.f30973j);
        c3409jG.b(Collections.unmodifiableMap(hashMap7));
        c3463kG.a(AbstractC3356iF.f31326a);
        c3249gG.a(DE.i, C3408jF.class);
    }
}
