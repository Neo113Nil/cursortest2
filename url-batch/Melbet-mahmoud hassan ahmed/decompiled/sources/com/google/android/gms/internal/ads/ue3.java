package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ue3 extends jd3<mi3, ji3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ve3 f12767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ue3(ve3 ve3Var, Class cls) {
        super(cls);
        this.f12767b = ve3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ mi3 a(uo3 uo3Var) {
        return mi3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ ji3 c(mi3 mi3Var) {
        hi3 G = ji3.G();
        G.r(uo3.J(un3.a(mi3Var.F())));
        G.s(0);
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<mi3>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", ve3.k(16, 1));
        hashMap.put("AES128_GCM_RAW", ve3.k(16, 3));
        hashMap.put("AES256_GCM", ve3.k(32, 1));
        hashMap.put("AES256_GCM_RAW", ve3.k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ void e(mi3 mi3Var) {
        wn3.a(mi3Var.F());
    }
}
