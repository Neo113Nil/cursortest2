package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0277jd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0404od f1322a;
    public final /* synthetic */ ModuleEvent b;

    public C0277jd(C0404od c0404od, ModuleEvent moduleEvent) {
        this.f1322a = c0404od;
        this.b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0404od.a(this.f1322a).reportEvent(this.b);
    }
}
