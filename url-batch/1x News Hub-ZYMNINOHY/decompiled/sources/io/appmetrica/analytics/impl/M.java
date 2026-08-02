package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class M implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Li f6309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f6310c;

    public M(N n3, Context context, Li li) {
        this.f6310c = n3;
        this.f6308a = context;
        this.f6309b = li;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f6310c.f6354a.a(this.f6308a, this.f6309b);
    }
}
