package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Il extends J5 {
    public Il(C2499am c2499am, C2633fm c2633fm, Zl zl) {
        super(c2499am, c2633fm, zl);
    }

    @Override // io.appmetrica.analytics.impl.J5
    public final synchronized void a(@NonNull Zl zl) {
        a(new C2670h6(c(), Ia.f37730F.u(), Ia.f37730F.r(), ((Zl) b()).mergeFrom(zl)));
        e();
    }
}
