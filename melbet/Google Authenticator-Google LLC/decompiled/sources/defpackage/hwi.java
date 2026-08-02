package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwi {
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
        hysVar.a(hwj.a);
        hysVar.b(hwj.b);
        hzj.a();
        int i = hwl.c;
        if (!hnu.ax(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        hyt hytVar = hyt.a;
        hytVar.a(hya.a);
        hytVar.b(hya.b);
        hytVar.c(hya.c);
        hytVar.d(hya.d);
        hysVar.b(hwl.d);
        hyr hyrVar = hyr.a;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", hxr.e);
        hwm hwmVar = new hwm();
        hwmVar.b(16);
        hwmVar.c();
        hwmVar.e(16);
        hwmVar.d();
        hwn hwnVar = hwn.c;
        hwmVar.e = hwnVar;
        hwo hwoVar = hwo.b;
        hwmVar.f = hwoVar;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", hwmVar.a());
        hashMap.put("AES256_CTR_HMAC_SHA256", hxr.f);
        hwm hwmVar2 = new hwm();
        hwmVar2.b(32);
        hwmVar2.c();
        hwmVar2.e(32);
        hwmVar2.d();
        hwmVar2.e = hwnVar;
        hwmVar2.f = hwoVar;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", hwmVar2.a());
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap));
        hyq hyqVar = hyq.a;
        hyqVar.a(hwl.a, hwp.class);
        hyo hyoVar = hyo.a;
        hyoVar.a(hwl.b, hwp.class);
        hyl hylVar = hyl.a;
        hylVar.b(hwl.e, i);
        int i2 = hwx.c;
        if (!hnu.ax(i2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        hytVar.a(hyc.a);
        hytVar.b(hyc.b);
        hytVar.c(hyc.c);
        hytVar.d(hyc.d);
        hysVar.b(hwx.d);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", hxr.a);
        ids idsVar = new ids((char[]) null);
        idsVar.e();
        idsVar.f(16);
        idsVar.g();
        hwy hwyVar = hwy.b;
        idsVar.a = hwyVar;
        hashMap2.put("AES128_GCM_RAW", idsVar.d());
        hashMap2.put("AES256_GCM", hxr.b);
        ids idsVar2 = new ids((char[]) null);
        idsVar2.e();
        idsVar2.f(32);
        idsVar2.g();
        idsVar2.a = hwyVar;
        hashMap2.put("AES256_GCM_RAW", idsVar2.d());
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap2));
        hyqVar.a(hwx.a, hwz.class);
        hyoVar.a(hwx.b, hwz.class);
        hylVar.b(hwx.e, i2);
        if (hyh.a()) {
            return;
        }
        hyk hykVar = hws.a;
        if (!hnu.ax(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        hytVar.a(hyb.a);
        hytVar.b(hyb.b);
        hytVar.c(hyb.c);
        hytVar.d(hyb.d);
        hysVar.b(hws.b);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", hxr.c);
        ids idsVar3 = new ids((byte[]) null, (byte[]) null);
        idsVar3.i();
        idsVar3.j(16);
        idsVar3.k();
        hwt hwtVar = hwt.b;
        idsVar3.a = hwtVar;
        hashMap3.put("AES128_EAX_RAW", idsVar3.h());
        hashMap3.put("AES256_EAX", hxr.d);
        ids idsVar4 = new ids((byte[]) null, (byte[]) null);
        idsVar4.i();
        idsVar4.j(32);
        idsVar4.k();
        idsVar4.a = hwtVar;
        hashMap3.put("AES256_EAX_RAW", idsVar4.h());
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap3));
        hyoVar.a(hws.a, hwu.class);
        hylVar.a(hws.c);
        hyk hykVar2 = hxb.a;
        if (!hnu.ax(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        hytVar.a(hyd.a);
        hytVar.b(hyd.b);
        hytVar.c(hyd.c);
        hytVar.d(hyd.d);
        HashMap hashMap4 = new HashMap();
        kdw kdwVar = new kdw((byte[]) null);
        kdwVar.e(16);
        hxc hxcVar = hxc.a;
        kdwVar.a = hxcVar;
        hashMap4.put("AES128_GCM_SIV", kdwVar.d());
        kdw kdwVar2 = new kdw((byte[]) null);
        kdwVar2.e(16);
        hxc hxcVar2 = hxc.b;
        kdwVar2.a = hxcVar2;
        hashMap4.put("AES128_GCM_SIV_RAW", kdwVar2.d());
        kdw kdwVar3 = new kdw((byte[]) null);
        kdwVar3.e(32);
        kdwVar3.a = hxcVar;
        hashMap4.put("AES256_GCM_SIV", kdwVar3.d());
        kdw kdwVar4 = new kdw((byte[]) null);
        kdwVar4.e(32);
        kdwVar4.a = hxcVar2;
        hashMap4.put("AES256_GCM_SIV_RAW", kdwVar4.d());
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap4));
        hyqVar.a(hxb.b, hxd.class);
        hyoVar.a(hxb.a, hxd.class);
        hysVar.b(hxb.c);
        hylVar.a(hxb.d);
        hyk hykVar3 = hxf.a;
        if (!hnu.ax(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        hytVar.a(hye.a);
        hytVar.b(hye.b);
        hytVar.c(hye.c);
        hytVar.d(hye.d);
        hysVar.b(hxf.b);
        hyoVar.a(hxf.a, hxh.class);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new hxh(hxg.a));
        hashMap5.put("CHACHA20_POLY1305_RAW", new hxh(hxg.b));
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap5));
        hylVar.a(hxf.c);
        hyk hykVar4 = hxi.a;
        if (!hnu.ax(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        hytVar.a(hxm.a);
        hytVar.b(hxm.b);
        hytVar.c(hxm.c);
        hytVar.d(hxm.d);
        hysVar.b(hxi.b);
        hyoVar.a(hxi.a, hxl.class);
        hylVar.a(hxi.c);
        hyk hykVar5 = hxj.a;
        if (!hnu.ax(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        hytVar.a(hxp.a);
        hytVar.b(hxp.b);
        hytVar.c(hxp.c);
        hytVar.d(hxp.d);
        hyoVar.a(hxj.a, hxo.class);
        hysVar.b(hxj.b);
        hylVar.a(hxj.c);
        hyp hypVar = hxx.a;
        if (!hnu.ax(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        hytVar.a(hyg.a);
        hytVar.b(hyg.b);
        hytVar.c(hyg.c);
        hytVar.d(hyg.d);
        hysVar.b(hxx.c);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new hxz(hxy.a));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new hxz(hxy.b));
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap6));
        hyoVar.a(hxx.b, hxz.class);
        hyqVar.a(hxx.a, hxz.class);
        hylVar.a(hxx.d);
        hytVar.a(hyf.a);
        hytVar.b(hyf.b);
        hytVar.c(hyf.c);
        hytVar.d(hyf.d);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", hxr.g);
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", hxr.h);
        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", hxr.i);
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", hxr.j);
        hyrVar.a(DesugarCollections.unmodifiableMap(hashMap7));
        hysVar.b(hxt.b);
        hyoVar.a(hxt.a, hxv.class);
    }
}
