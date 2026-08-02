package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661m2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0697nc f7850a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f7851b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7852c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7853d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f7854e = new B0.n(20, this);

    public C0661m2(C0697nc c0697nc, IHandlerExecutor iHandlerExecutor, long j3) {
        this.f7850a = c0697nc;
        this.f7851b = iHandlerExecutor;
        this.f7852c = j3;
    }

    public static final void a(C0661m2 c0661m2) {
        C0723oc c0723oc = c0661m2.f7850a.f7946a;
        Bi bi = c0723oc.f6489h;
        bi.f5826c.a(c0723oc.f6484b.f6427a);
    }
}
