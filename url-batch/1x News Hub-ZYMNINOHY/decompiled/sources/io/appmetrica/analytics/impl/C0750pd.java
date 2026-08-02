package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750pd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0879ud f8079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f8080b;

    public C0750pd(C0879ud c0879ud, ModuleEvent moduleEvent) {
        this.f8079a = c0879ud;
        this.f8080b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0879ud.a(this.f8079a).reportEvent(this.f8080b);
    }
}
