package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class Xg implements InterfaceC0613k6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6865a;

    /* renamed from: b, reason: collision with root package name */
    public final C0560i4 f6866b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f6867c = C0876ua.k().x().e();

    public Xg(Context context, C0560i4 c0560i4) {
        this.f6865a = context;
        this.f6866b = c0560i4;
    }

    public final void a(W5 w5, Bundle bundle) {
        if (w5.m()) {
            return;
        }
        this.f6867c.execute(new RunnableC0780qh(this.f6865a, w5, bundle, this.f6866b));
    }

    public final void a(X3 x3, W5 w5, C0922w4 c0922w4) {
        this.f6866b.a(x3, c0922w4).a(w5, c0922w4);
        this.f6866b.a(x3.f6856b, x3.f6857c, x3.f6858d);
    }
}
