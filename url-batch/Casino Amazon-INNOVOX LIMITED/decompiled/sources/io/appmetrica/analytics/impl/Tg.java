package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes3.dex */
public final class Tg implements InterfaceC0141e6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1060a;
    public final C0062b4 b;
    public final IHandlerExecutor c = C0401oa.k().w().d();

    public Tg(Context context, C0062b4 c0062b4) {
        this.f1060a = context;
        this.b = c0062b4;
    }

    public final void a(Q5 q5, Bundle bundle) {
        if (q5.m()) {
            return;
        }
        this.c.execute(new RunnableC0358mh(this.f1060a, q5, bundle, this.b));
    }

    public final void a(Q3 q3, Q5 q5, C0445q4 c0445q4) {
        this.b.a(q3, c0445q4).a(q5, c0445q4);
        this.b.a(q3.b, q3.c, q3.d);
    }
}
