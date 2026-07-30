package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.aH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2922aH {

    /* renamed from: a, reason: collision with root package name */
    public static final C4237yi f29192a;

    /* renamed from: b, reason: collision with root package name */
    public static final C4237yi f29193b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3733pG f29194c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3625nG f29195d;

    /* renamed from: e, reason: collision with root package name */
    public static final XF f29196e;

    /* renamed from: f, reason: collision with root package name */
    public static final VF f29197f;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        EI ei = EI.RAW;
        QG qg = QG.f27135e;
        hashMap.put(ei, qg);
        hashMap2.put(qg, ei);
        EI ei2 = EI.TINK;
        QG qg2 = QG.f27132b;
        hashMap.put(ei2, qg2);
        hashMap2.put(qg2, ei2);
        EI ei3 = EI.LEGACY;
        QG qg3 = QG.f27134d;
        hashMap.put(ei3, qg3);
        hashMap2.put(qg3, ei3);
        EI ei4 = EI.CRUNCHY;
        QG qg4 = QG.f27133c;
        hashMap.put(ei4, qg4);
        hashMap2.put(qg4, ei4);
        f29192a = new C4237yi(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        EnumC3032cI enumC3032cI = EnumC3032cI.SHA1;
        PG pg = PG.f26893b;
        hashMap3.put(enumC3032cI, pg);
        hashMap4.put(pg, enumC3032cI);
        EnumC3032cI enumC3032cI2 = EnumC3032cI.SHA224;
        PG pg2 = PG.f26894c;
        hashMap3.put(enumC3032cI2, pg2);
        hashMap4.put(pg2, enumC3032cI2);
        EnumC3032cI enumC3032cI3 = EnumC3032cI.SHA256;
        PG pg3 = PG.f26895d;
        hashMap3.put(enumC3032cI3, pg3);
        hashMap4.put(pg3, enumC3032cI3);
        EnumC3032cI enumC3032cI4 = EnumC3032cI.SHA384;
        PG pg4 = PG.f26896e;
        hashMap3.put(enumC3032cI4, pg4);
        hashMap4.put(pg4, enumC3032cI4);
        EnumC3032cI enumC3032cI5 = EnumC3032cI.SHA512;
        PG pg5 = PG.f26897f;
        hashMap3.put(enumC3032cI5, pg5);
        hashMap4.put(pg5, enumC3032cI5);
        f29193b = new C4237yi(Collections.unmodifiableMap(hashMap3), Collections.unmodifiableMap(hashMap4));
        f29194c = new C3733pG(RG.class, DF.f24397Q);
        f29195d = new C3625nG(a9, DF.f24394N);
        f29196e = new XF(NG.class, DF.f24395O);
        f29197f = new VF(a9, DF.f24396P);
    }
}
