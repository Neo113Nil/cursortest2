package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0136e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1227a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C0541u1 c;

    public RunnableC0136e1(C0541u1 c0541u1, String str, String str2) {
        this.c = c0541u1;
        this.f1227a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.c).b(this.f1227a, this.b);
    }
}
