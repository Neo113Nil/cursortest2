package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzj {
    static {
        hzy hzyVar = hzy.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        hys hysVar = hys.a;
        hysVar.a(hzk.a);
        hysVar.b(hzk.b);
        hysVar.a(hzd.a);
        int i = hzf.c;
        if (!hnu.ax(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        bry bryVar = hzn.a;
        hyt hytVar = hyt.a;
        hytVar.a(hzn.a);
        hytVar.b(hzn.b);
        hytVar.c(hzn.c);
        hytVar.d(hzn.d);
        hysVar.b(hzf.d);
        hysVar.b(hzf.e);
        hyr hyrVar = hyr.a;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", hzl.a);
        ids idsVar = new ids((byte[]) null);
        idsVar.b(32);
        idsVar.c(16);
        hzh hzhVar = hzh.d;
        idsVar.a = hzhVar;
        hzg hzgVar = hzg.c;
        idsVar.d = hzgVar;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", idsVar.a());
        ids idsVar2 = new ids((byte[]) null);
        idsVar2.b(32);
        idsVar2.c(32);
        hzh hzhVar2 = hzh.a;
        idsVar2.a = hzhVar2;
        idsVar2.d = hzgVar;
        hashMap.put("HMAC_SHA256_256BITTAG", idsVar2.a());
        ids idsVar3 = new ids((byte[]) null);
        idsVar3.b(32);
        idsVar3.c(32);
        idsVar3.a = hzhVar;
        idsVar3.d = hzgVar;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", idsVar3.a());
        ids idsVar4 = new ids((byte[]) null);
        idsVar4.b(64);
        idsVar4.c(16);
        idsVar4.a = hzhVar2;
        hzg hzgVar2 = hzg.e;
        idsVar4.d = hzgVar2;
        hashMap.put("HMAC_SHA512_128BITTAG", idsVar4.a());
        ids idsVar5 = new ids((byte[]) null);
        idsVar5.b(64);
        idsVar5.c(16);
        idsVar5.a = hzhVar;
        idsVar5.d = hzgVar2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", idsVar5.a());
        ids idsVar6 = new ids((byte[]) null);
        idsVar6.b(64);
        idsVar6.c(32);
        idsVar6.a = hzhVar2;
        idsVar6.d = hzgVar2;
        hashMap.put("HMAC_SHA512_256BITTAG", idsVar6.a());
        ids idsVar7 = new ids((byte[]) null);
        idsVar7.b(64);
        idsVar7.c(32);
        idsVar7.a = hzhVar;
        idsVar7.d = hzgVar2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", idsVar7.a());
        hashMap.put("HMAC_SHA512_512BITTAG", hzl.b);
        ids idsVar8 = new ids((byte[]) null);
        idsVar8.b(64);
        idsVar8.c(64);
        idsVar8.a = hzhVar;
        idsVar8.d = hzgVar2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", idsVar8.a());
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap));
        hyo hyoVar = hyo.a;
        hyoVar.a(hzf.b, hzi.class);
        hyq.a.a(hzf.a, hzi.class);
        hyl hylVar = hyl.a;
        hylVar.b(hzf.f, i);
        if (hyh.a()) {
            return;
        }
        hyk hykVar = hyz.a;
        if (!hnu.ax(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        hytVar.a(hzm.a);
        hytVar.b(hzm.b);
        hytVar.c(hzm.c);
        hytVar.d(hzm.d);
        hyoVar.a(hyz.a, hzb.class);
        hysVar.b(hyz.b);
        hysVar.b(hyz.c);
        HashMap hashMap2 = new HashMap();
        hzb hzbVar = hzl.c;
        hashMap2.put("AES_CMAC", hzbVar);
        hashMap2.put("AES256_CMAC", hzbVar);
        iyh iyhVar = new iyh(null);
        iyhVar.b();
        iyhVar.c();
        iyhVar.a = hza.d;
        hashMap2.put("AES256_CMAC_RAW", iyhVar.a());
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap2));
        hylVar.a(hyz.d);
    }
}
