package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class Xg implements InterfaceC0764k6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7702a;

    /* renamed from: b, reason: collision with root package name */
    public final C0711i4 f7703b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f7704c = C1027ua.k().x().e();

    public Xg(Context context, C0711i4 c0711i4) {
        this.f7702a = context;
        this.f7703b = c0711i4;
    }

    public final void a(W5 w5, Bundle bundle) {
        if (w5.m()) {
            return;
        }
        this.f7704c.execute(new RunnableC0931qh(this.f7702a, w5, bundle, this.f7703b));
    }

    public final void a(X3 x32, W5 w5, C1073w4 c1073w4) {
        this.f7703b.a(x32, c1073w4).a(w5, c1073w4);
        this.f7703b.a(x32.f7693b, x32.f7694c, x32.f7695d);
    }
}
