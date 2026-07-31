package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0317l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f1350a;
    public final /* synthetic */ C0541u1 b;

    public RunnableC0317l1(C0541u1 c0541u1, ExternalAttribution externalAttribution) {
        this.b = c0541u1;
        this.f1350a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).a(this.f1350a);
    }
}
