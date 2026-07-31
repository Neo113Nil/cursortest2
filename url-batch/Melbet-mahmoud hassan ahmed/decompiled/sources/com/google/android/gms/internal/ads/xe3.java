package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class xe3 extends jd3<si3, pi3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ye3 f14183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    xe3(ye3 ye3Var, Class cls) {
        super(cls);
        this.f14183b = ye3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ si3 a(uo3 uo3Var) {
        return si3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ pi3 c(si3 si3Var) {
        oi3 G = pi3.G();
        G.r(uo3.J(un3.a(si3Var.F())));
        G.s(0);
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<si3>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", ye3.l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", ye3.l(16, 3));
        hashMap.put("AES256_GCM_SIV", ye3.l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", ye3.l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ void e(si3 si3Var) {
        wn3.a(si3Var.F());
    }
}
