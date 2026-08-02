package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class Sg implements InterfaceC0555d6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10946a;

    /* renamed from: b, reason: collision with root package name */
    public final C0475a4 f10947b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f10948c = C0817na.k().w().d();

    public Sg(Context context, C0475a4 c0475a4) {
        this.f10946a = context;
        this.f10947b = c0475a4;
    }

    public final void a(P5 p5, Bundle bundle) {
        if (p5.m()) {
            return;
        }
        this.f10948c.execute(new RunnableC0772lh(this.f10946a, p5, bundle, this.f10947b));
    }

    public final void a(P3 p32, P5 p5, C0863p4 c0863p4) {
        this.f10947b.a(p32, c0863p4).a(p5, c0863p4);
        this.f10947b.a(p32.f10790b, p32.f10791c, p32.f10792d);
    }
}
