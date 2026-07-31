package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes3.dex */
public final class L implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ti f37908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f37909c;

    public L(M m4, Context context, Ti ti) {
        this.f37909c = m4;
        this.f37907a = context;
        this.f37908b = ti;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f37909c.f37934a.a(this.f37907a, this.f37908b);
    }
}
