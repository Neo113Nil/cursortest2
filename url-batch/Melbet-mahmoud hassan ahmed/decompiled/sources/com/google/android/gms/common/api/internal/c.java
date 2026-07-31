package com.google.android.gms.common.api.internal;

import p3.j;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f2488a;

    /* synthetic */ c(BasePendingResult basePendingResult, b bVar) {
        this.f2488a = basePendingResult;
    }

    protected final void finalize() {
        j jVar;
        jVar = this.f2488a.f2481h;
        BasePendingResult.g(jVar);
        super.finalize();
    }
}
