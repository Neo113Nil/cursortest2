package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class M implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gi f10615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f10616c;

    public M(N n, Context context, Gi gi) {
        this.f10616c = n;
        this.f10614a = context;
        this.f10615b = gi;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f10616c.f10680a.a(this.f10614a, this.f10615b);
    }
}
