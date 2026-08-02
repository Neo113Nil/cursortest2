package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0557i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f7493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7494b;

    public RunnableC0557i1(C0815s1 c0815s1, AnrListener anrListener) {
        this.f7494b = c0815s1;
        this.f7493a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f7494b).a(this.f7493a);
    }
}
