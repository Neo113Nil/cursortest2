package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2639g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f39024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39025b;

    public RunnableC2639g1(C2872p1 c2872p1, ExternalAttribution externalAttribution) {
        this.f39025b = c2872p1;
        this.f39024a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f39025b).a(this.f39024a);
    }
}
