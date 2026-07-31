package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes3.dex */
public final class K implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f37856b;

    public K(M m4, Context context) {
        this.f37856b = m4;
        this.f37855a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f37856b.f37934a.a(this.f37855a);
    }
}
