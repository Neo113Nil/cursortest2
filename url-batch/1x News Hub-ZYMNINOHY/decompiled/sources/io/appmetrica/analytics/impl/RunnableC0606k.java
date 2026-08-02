package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0606k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f7695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0658m f7696b;

    public RunnableC0606k(C0658m c0658m, Activity activity) {
        this.f7696b = c0658m;
        this.f7695a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7696b.a(this.f7695a);
    }
}
