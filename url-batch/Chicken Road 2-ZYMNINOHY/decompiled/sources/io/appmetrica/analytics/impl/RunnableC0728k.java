package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0728k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f12179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0780m f12180b;

    public RunnableC0728k(C0780m c0780m, Activity activity) {
        this.f12180b = c0780m;
        this.f12179a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12180b.a(this.f12179a);
    }
}
