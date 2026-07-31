package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0289k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f1330a;
    public final /* synthetic */ C0340m b;

    public RunnableC0289k(C0340m c0340m, Activity activity) {
        this.b = c0340m;
        this.f1330a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.f1330a);
    }
}
