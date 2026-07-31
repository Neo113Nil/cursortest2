package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes3.dex */
public final class M implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f943a;
    public final /* synthetic */ Hi b;
    public final /* synthetic */ N c;

    public M(N n, Context context, Hi hi) {
        this.c = n;
        this.f943a = context;
        this.b = hi;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.c.f960a.a(this.f943a, this.b);
    }
}
