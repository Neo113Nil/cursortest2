package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0291k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f1332a;
    public final /* synthetic */ C0541u1 b;

    public RunnableC0291k1(C0541u1 c0541u1, AnrListener anrListener) {
        this.b = c0541u1;
        this.f1332a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).a(this.f1332a);
    }
}
