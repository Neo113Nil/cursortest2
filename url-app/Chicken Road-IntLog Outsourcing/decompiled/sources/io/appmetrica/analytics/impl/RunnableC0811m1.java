package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0811m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8758b;

    public RunnableC0811m1(C0966s1 c0966s1, String str) {
        this.f8758b = c0966s1;
        this.f8757a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f8758b).reportEvent(this.f8757a);
    }
}
