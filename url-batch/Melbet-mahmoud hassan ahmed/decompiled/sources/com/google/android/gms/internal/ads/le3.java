package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class le3 extends jd3<nh3, kh3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ me3 f7947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    le3(me3 me3Var, Class cls) {
        super(cls);
        this.f7947b = me3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ nh3 a(uo3 uo3Var) {
        return nh3.H(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ kh3 c(nh3 nh3Var) {
        nh3 nh3Var2 = nh3Var;
        new pe3();
        qh3 g7 = oe3.g(nh3Var2.I());
        gk3 c7 = new sg3().a().c(nh3Var2.J());
        jh3 G = kh3.G();
        G.r(g7);
        G.s(c7);
        G.t(0);
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<nh3>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", me3.k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", me3.k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", me3.k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", me3.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ void e(nh3 nh3Var) {
        nh3 nh3Var2 = nh3Var;
        ((oe3) new pe3().a()).e(nh3Var2.I());
        new sg3().a().e(nh3Var2.J());
        wn3.a(nh3Var2.I().F());
    }
}
