package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0704j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f12088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12089b;

    public RunnableC0704j1(C0963t1 c0963t1, AnrListener anrListener) {
        this.f12089b = c0963t1;
        this.f12088a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12089b).a(this.f12088a);
    }
}
