package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0137e2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0225hc f1228a;
    public final ICommonExecutor b;
    public final long c;
    public boolean d = true;
    public final Runnable e = new Runnable() { // from class: io.appmetrica.analytics.impl.e2$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            C0137e2.a(C0137e2.this);
        }
    };

    public C0137e2(C0225hc c0225hc, IHandlerExecutor iHandlerExecutor, long j) {
        this.f1228a = c0225hc;
        this.b = iHandlerExecutor;
        this.c = j;
    }

    public static final void a(C0137e2 c0137e2) {
        C0251ic c0251ic = c0137e2.f1228a.f1288a;
        C0633xi c0633xi = c0251ic.h;
        c0633xi.c.a(c0251ic.b.f884a);
    }
}
