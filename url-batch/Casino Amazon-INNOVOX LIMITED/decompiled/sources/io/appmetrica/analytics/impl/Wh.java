package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes3.dex */
public final class Wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f1107a;
    public final /* synthetic */ C0231hi b;

    public Wh(C0231hi c0231hi, ModuleEvent moduleEvent) {
        this.b = c0231hi;
        this.f1107a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportEvent(this.f1107a);
    }
}
