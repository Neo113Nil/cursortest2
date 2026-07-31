package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class Bl implements L2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f780a;

    public Bl(Context context) {
        this.f780a = context;
    }

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.impl.InterfaceC0338lm
    public final void a(C0209gm c0209gm) {
    }

    public final Context b() {
        return this.f780a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
