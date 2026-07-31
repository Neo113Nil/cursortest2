package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class og3 extends jd3<dh3, ah3> {
    og3(pg3 pg3Var, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ dh3 a(uo3 uo3Var) {
        return dh3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ ah3 c(dh3 dh3Var) {
        dh3 dh3Var2 = dh3Var;
        zg3 G = ah3.G();
        G.t(0);
        G.r(uo3.J(un3.a(dh3Var2.F())));
        G.s(dh3Var2.J());
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<dh3>> d() {
        HashMap hashMap = new HashMap();
        ch3 G = dh3.G();
        G.r(32);
        fh3 G2 = gh3.G();
        G2.r(16);
        G.s(G2.o());
        hashMap.put("AES_CMAC", new id3(G.o(), 1));
        ch3 G3 = dh3.G();
        G3.r(32);
        fh3 G4 = gh3.G();
        G4.r(16);
        G3.s(G4.o());
        hashMap.put("AES256_CMAC", new id3(G3.o(), 1));
        ch3 G5 = dh3.G();
        G5.r(32);
        fh3 G6 = gh3.G();
        G6.r(16);
        G5.s(G6.o());
        hashMap.put("AES256_CMAC_RAW", new id3(G5.o(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ void e(dh3 dh3Var) {
        dh3 dh3Var2 = dh3Var;
        pg3.m(dh3Var2.J());
        pg3.n(dh3Var2.F());
    }
}
