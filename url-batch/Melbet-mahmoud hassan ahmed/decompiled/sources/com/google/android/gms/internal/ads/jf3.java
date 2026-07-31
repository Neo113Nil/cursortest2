package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class jf3 extends jd3<tl3, ql3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kf3 f7115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jf3(kf3 kf3Var, Class cls) {
        super(cls);
        this.f7115b = kf3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ tl3 a(uo3 uo3Var) {
        return tl3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ ql3 c(tl3 tl3Var) {
        pl3 G = ql3.G();
        G.r(tl3Var);
        G.s(0);
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ void e(tl3 tl3Var) {
        tl3 tl3Var2 = tl3Var;
        if (tl3Var2.J().isEmpty() || !tl3Var2.K()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
