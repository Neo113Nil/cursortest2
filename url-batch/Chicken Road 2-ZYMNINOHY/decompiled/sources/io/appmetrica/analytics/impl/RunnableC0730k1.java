package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0730k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f12182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12183b;

    public RunnableC0730k1(C0963t1 c0963t1, ExternalAttribution externalAttribution) {
        this.f12183b = c0963t1;
        this.f12182a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12183b).a(this.f12182a);
    }
}
