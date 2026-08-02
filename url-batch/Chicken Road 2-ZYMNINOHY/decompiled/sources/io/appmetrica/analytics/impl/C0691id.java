package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691id extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0820nd f12040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f12041b;

    public C0691id(C0820nd c0820nd, ModuleEvent moduleEvent) {
        this.f12040a = c0820nd;
        this.f12041b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0820nd.a(this.f12040a).reportEvent(this.f12041b);
    }
}
