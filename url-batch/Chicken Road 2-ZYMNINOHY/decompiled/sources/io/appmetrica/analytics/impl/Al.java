package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class Al implements K2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10060a;

    public Al(Context context) {
        this.f10060a = context;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.InterfaceC0751km
    public final void a(C0622fm c0622fm) {
    }

    public final Context b() {
        return this.f10060a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
