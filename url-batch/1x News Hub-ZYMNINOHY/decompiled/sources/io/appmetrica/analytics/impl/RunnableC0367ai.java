package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0367ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f7032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f7033b;

    public RunnableC0367ai(C0651li c0651li, ModuleEvent moduleEvent) {
        this.f7033b = c0651li;
        this.f7032a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7033b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportEvent(this.f7032a);
    }
}
