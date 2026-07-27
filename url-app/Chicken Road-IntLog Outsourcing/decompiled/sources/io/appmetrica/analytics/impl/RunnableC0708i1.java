package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0708i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f8375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8376b;

    public RunnableC0708i1(C0966s1 c0966s1, AnrListener anrListener) {
        this.f8376b = c0966s1;
        this.f8375a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f8376b).a(this.f8375a);
    }
}
