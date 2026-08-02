package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0660m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7849b;

    public RunnableC0660m1(C0815s1 c0815s1, String str) {
        this.f7849b = c0815s1;
        this.f7848a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f7849b).reportEvent(this.f7848a);
    }
}
