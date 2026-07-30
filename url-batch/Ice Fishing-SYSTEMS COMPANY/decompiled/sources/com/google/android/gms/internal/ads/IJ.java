package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class IJ {
    static {
        int i = FI.zza;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() {
        C3843rJ c3843rJ = C3843rJ.f34007a;
        C3463kG c3463kG = C3463kG.f32285b;
        c3463kG.b(C3843rJ.f34007a);
        c3463kG.a(C3843rJ.f34008b);
        c3463kG.b(C3897sJ.f34226a);
        c3463kG.a(C3897sJ.f34227b);
        int i = AbstractC3466kJ.f32292f;
        if (!XC.e(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        C3733pG c3733pG = LJ.f26135a;
        C3517lG c3517lG = C3517lG.f32558b;
        c3517lG.c(LJ.f26135a);
        c3517lG.d(LJ.f26136b);
        c3517lG.a(LJ.f26137c);
        c3517lG.b(LJ.f26138d);
        c3517lG.a(LJ.f26139e);
        c3517lG.b(LJ.f26140f);
        C3409jG c3409jG = C3409jG.f32096b;
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", AbstractC3790qJ.f33676a);
        hashMap.put("ECDSA_P256_IEEE_P1363", AbstractC3790qJ.f33679d);
        PE pe = new PE(3);
        pe.f26884d = GE.f25124m;
        pe.f26883c = C3252gJ.f30976c;
        pe.f26882b = HE.f25335k;
        pe.f26885e = LE.f26123G;
        hashMap.put("ECDSA_P256_RAW", pe.k());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", AbstractC3790qJ.f33681f);
        hashMap.put("ECDSA_P384", AbstractC3790qJ.f33677b);
        hashMap.put("ECDSA_P384_IEEE_P1363", AbstractC3790qJ.f33680e);
        PE pe2 = new PE(3);
        pe2.f26884d = GE.f25126o;
        C3252gJ c3252gJ = C3252gJ.f30977d;
        pe2.f26883c = c3252gJ;
        HE he = HE.f25336l;
        pe2.f26882b = he;
        LE le = LE.f26120D;
        pe2.f26885e = le;
        hashMap.put("ECDSA_P384_SHA512", pe2.k());
        PE pe3 = new PE(3);
        pe3.f26884d = GE.f25125n;
        pe3.f26883c = c3252gJ;
        pe3.f26882b = he;
        pe3.f26885e = le;
        hashMap.put("ECDSA_P384_SHA384", pe3.k());
        hashMap.put("ECDSA_P521", AbstractC3790qJ.f33678c);
        hashMap.put("ECDSA_P521_IEEE_P1363", AbstractC3790qJ.f33682g);
        c3409jG.b(Collections.unmodifiableMap(hashMap));
        c3463kG.a(AbstractC3466kJ.f32287a);
        c3463kG.a(AbstractC3466kJ.f32288b);
        C3249gG c3249gG = C3249gG.f30974b;
        c3249gG.a(AbstractC3466kJ.f32291e, C3306hJ.class);
        UF uf = UF.f27953d;
        uf.c(AbstractC3466kJ.f32289c, i, true);
        uf.c(AbstractC3466kJ.f32290d, i, false);
        int i4 = AJ.f23850f;
        if (!XC.e(i4)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3517lG.c(RJ.f27331a);
        c3517lG.d(RJ.f27332b);
        c3517lG.a(RJ.f27333c);
        c3517lG.b(RJ.f27334d);
        c3517lG.a(RJ.f27335e);
        c3517lG.b(RJ.f27336f);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", AbstractC3790qJ.f33683h);
        BigInteger bigInteger = C4113wJ.f34969e;
        C3951tJ c3951tJ = new C3951tJ();
        c3951tJ.f34394c = C4005uJ.f34578b;
        c3951tJ.a(3072);
        BigInteger bigInteger2 = C4113wJ.f34969e;
        c3951tJ.f34393b = bigInteger2;
        C4059vJ c4059vJ = C4059vJ.f34751e;
        c3951tJ.f34395d = c4059vJ;
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", c3951tJ.b());
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", AbstractC3790qJ.i);
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", AbstractC3790qJ.f33684j);
        C3951tJ c3951tJ2 = new C3951tJ();
        c3951tJ2.f34394c = C4005uJ.f34580d;
        c3951tJ2.a(4096);
        c3951tJ2.f34393b = bigInteger2;
        c3951tJ2.f34395d = c4059vJ;
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", c3951tJ2.b());
        c3409jG.b(hashMap2);
        c3463kG.a(AJ.f23845a);
        c3463kG.a(AJ.f23846b);
        c3249gG.a(AJ.f23849e, C4113wJ.class);
        uf.c(AJ.f23847c, i4, true);
        uf.c(AJ.f23848d, i4, false);
        int i9 = HJ.f25349f;
        if (!XC.e(i9)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        c3517lG.c(UJ.f27956a);
        c3517lG.d(UJ.f27957b);
        c3517lG.a(UJ.f27958c);
        c3517lG.b(UJ.f27959d);
        c3517lG.a(UJ.f27960e);
        c3517lG.b(UJ.f27961f);
        HashMap hashMap3 = new HashMap();
        BigInteger bigInteger3 = EJ.f24693g;
        BJ bj = new BJ();
        CJ cj = CJ.f24160b;
        bj.f24022c = cj;
        bj.f24023d = cj;
        bj.b(32);
        bj.a(3072);
        BigInteger bigInteger4 = EJ.f24693g;
        bj.f24021b = bigInteger4;
        DJ dj = DJ.f24412b;
        bj.f24025f = dj;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", bj.c());
        BJ bj2 = new BJ();
        bj2.f24022c = cj;
        bj2.f24023d = cj;
        bj2.b(32);
        bj2.a(3072);
        bj2.f24021b = bigInteger4;
        DJ dj2 = DJ.f24415e;
        bj2.f24025f = dj2;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", bj2.c());
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", AbstractC3790qJ.f33685k);
        BJ bj3 = new BJ();
        CJ cj2 = CJ.f24162d;
        bj3.f24022c = cj2;
        bj3.f24023d = cj2;
        bj3.b(64);
        bj3.a(4096);
        bj3.f24021b = bigInteger4;
        bj3.f24025f = dj;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", bj3.c());
        BJ bj4 = new BJ();
        bj4.f24022c = cj2;
        bj4.f24023d = cj2;
        bj4.b(64);
        bj4.a(4096);
        bj4.f24021b = bigInteger4;
        bj4.f24025f = dj2;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", bj4.c());
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", AbstractC3790qJ.f33686l);
        c3409jG.b(Collections.unmodifiableMap(hashMap3));
        c3463kG.a(HJ.f25344a);
        c3463kG.a(HJ.f25345b);
        c3249gG.a(HJ.f25348e, EJ.class);
        uf.c(HJ.f25346c, i9, true);
        uf.c(HJ.f25347d, i9, false);
        if (JF.a()) {
            return;
        }
        C4002uG c4002uG = AbstractC3682oJ.f33124a;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c3517lG.c(NJ.f26511a);
        c3517lG.d(NJ.f26512b);
        c3517lG.a(NJ.f26513c);
        c3517lG.b(NJ.f26514d);
        c3517lG.a(NJ.f26515e);
        c3517lG.b(NJ.f26516f);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("ED25519", new C3574mJ(C3520lJ.f32560b));
        C3520lJ c3520lJ = C3520lJ.f32563e;
        hashMap4.put("ED25519_RAW", new C3574mJ(c3520lJ));
        hashMap4.put("ED25519WithRawOutput", new C3574mJ(c3520lJ));
        c3409jG.b(Collections.unmodifiableMap(hashMap4));
        c3249gG.a(AbstractC3682oJ.f33129f, C3574mJ.class);
        C3357iG.f31327b.a(AbstractC3682oJ.f33128e, C3574mJ.class);
        c3463kG.a(AbstractC3682oJ.f33124a);
        c3463kG.a(AbstractC3682oJ.f33125b);
        uf.a(AbstractC3682oJ.f33126c, true);
        uf.a(AbstractC3682oJ.f33127d, false);
    }
}
