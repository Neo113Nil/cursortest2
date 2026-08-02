package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes.dex */
public final class Vh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f11146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11147b;

    public Vh(C0644gi c0644gi, ModuleEvent moduleEvent) {
        this.f11147b = c0644gi;
        this.f11146a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11147b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportEvent(this.f11146a);
    }
}
