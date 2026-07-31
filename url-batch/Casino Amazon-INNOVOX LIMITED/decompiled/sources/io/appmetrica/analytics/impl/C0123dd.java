package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0123dd {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1216a;
    public final InterfaceC0586vl b;
    public final String c;
    public final SystemTimeProvider d;

    public C0123dd(IHandlerExecutor iHandlerExecutor, AbstractC0678zd abstractC0678zd, String str, SystemTimeProvider systemTimeProvider) {
        this.f1216a = iHandlerExecutor;
        this.b = abstractC0678zd;
        this.c = str;
        this.d = systemTimeProvider;
    }

    public static final void a(C0123dd c0123dd, List list) {
        Rj rj = AbstractC0435pj.f1437a;
        C0174fd c0174fd = new C0174fd(c0123dd.b, c0123dd.c, c0123dd.d, list);
        rj.getClass();
        rj.a(new Fj(c0174fd));
    }

    public final void a(final ArrayList arrayList) {
        this.f1216a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.dd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0123dd.a(C0123dd.this, arrayList);
            }
        });
    }
}
