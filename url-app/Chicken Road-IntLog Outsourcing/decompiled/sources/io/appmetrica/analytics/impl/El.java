package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class El implements S2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6756a;

    public El(Context context) {
        this.f6756a = context;
    }

    @Override // io.appmetrica.analytics.impl.S2, io.appmetrica.analytics.impl.InterfaceC0884om
    public final void a(C0754jm c0754jm) {
    }

    public final Context b() {
        return this.f6756a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
