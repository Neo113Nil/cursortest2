package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0582j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f7584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7585b;

    public RunnableC0582j1(C0815s1 c0815s1, ExternalAttribution externalAttribution) {
        this.f7585b = c0815s1;
        this.f7584a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f7585b).a(this.f7584a);
    }
}
