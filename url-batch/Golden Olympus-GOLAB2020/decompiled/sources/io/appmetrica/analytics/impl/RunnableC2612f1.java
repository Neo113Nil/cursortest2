package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2612f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f38949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38950b;

    public RunnableC2612f1(C2872p1 c2872p1, AnrListener anrListener) {
        this.f38950b = c2872p1;
        this.f38949a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f38950b).a(this.f38949a);
    }
}
