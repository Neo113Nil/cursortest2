package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3143zd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f40375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f40376b;

    public C3143zd(Dd dd, ModuleEvent moduleEvent) {
        this.f40375a = dd;
        this.f40376b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Dd.a(this.f40375a).reportEvent(this.f40376b);
    }
}
