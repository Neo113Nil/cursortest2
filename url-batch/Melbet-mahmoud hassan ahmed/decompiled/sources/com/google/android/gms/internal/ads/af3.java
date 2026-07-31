package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class af3 extends jd3<ej3, bj3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf3 f2748b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af3(bf3 bf3Var, Class cls) {
        super(cls);
        this.f2748b = bf3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ ej3 a(uo3 uo3Var) {
        return ej3.H(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ bj3 c(ej3 ej3Var) {
        aj3 G = bj3.G();
        G.s(0);
        G.r(uo3.J(un3.a(32)));
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<ej3>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new id3(ej3.G(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new id3(ej3.G(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ void e(ej3 ej3Var) {
    }
}
