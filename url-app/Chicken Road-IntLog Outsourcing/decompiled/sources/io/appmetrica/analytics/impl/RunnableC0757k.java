package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0757k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f8595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0809m f8596b;

    public RunnableC0757k(C0809m c0809m, Activity activity) {
        this.f8596b = c0809m;
        this.f8595a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8596b.a(this.f8595a);
    }
}
