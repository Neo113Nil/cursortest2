package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class mf3 extends jd3<em3, bm3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ nf3 f8517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    mf3(nf3 nf3Var, Class cls) {
        super(cls);
        this.f8517b = nf3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ em3 a(uo3 uo3Var) {
        return em3.H(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ bm3 c(em3 em3Var) {
        am3 G = bm3.G();
        G.s(0);
        G.r(uo3.J(un3.a(32)));
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<em3>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new id3(em3.G(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new id3(em3.G(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ void e(em3 em3Var) {
    }
}
