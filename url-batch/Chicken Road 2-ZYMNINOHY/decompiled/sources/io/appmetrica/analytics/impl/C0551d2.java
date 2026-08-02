package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551d2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0638gc f11643a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f11644b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11645c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11646d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f11647e = new R1.n(27, this);

    public C0551d2(C0638gc c0638gc, IHandlerExecutor iHandlerExecutor, long j4) {
        this.f11643a = c0638gc;
        this.f11644b = iHandlerExecutor;
        this.f11645c = j4;
    }

    public static final void a(C0551d2 c0551d2) {
        C0664hc c0664hc = c0551d2.f11643a.f11928a;
        C1058wi c1058wi = c0664hc.f10396h;
        c1058wi.f12946c.a(c0664hc.f10390b.f10355a);
    }
}
