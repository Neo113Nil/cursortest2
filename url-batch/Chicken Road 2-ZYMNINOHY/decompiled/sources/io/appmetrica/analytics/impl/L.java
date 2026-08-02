package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class L implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f10550b;

    public L(N n, Context context) {
        this.f10550b = n;
        this.f10549a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f10550b.f10680a.a(this.f10549a);
    }
}
