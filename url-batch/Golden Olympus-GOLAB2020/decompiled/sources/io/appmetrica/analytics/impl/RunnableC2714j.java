package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2714j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f39245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2766l f39246b;

    public RunnableC2714j(C2766l c2766l, Activity activity) {
        this.f39246b = c2766l;
        this.f39245a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39246b.a(this.f39245a);
    }
}
