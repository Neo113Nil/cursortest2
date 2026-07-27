package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0733j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f8473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8474b;

    public RunnableC0733j1(C0966s1 c0966s1, ExternalAttribution externalAttribution) {
        this.f8474b = c0966s1;
        this.f8473a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f8474b).a(this.f8473a);
    }
}
