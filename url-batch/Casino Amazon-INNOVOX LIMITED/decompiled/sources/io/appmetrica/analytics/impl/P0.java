package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f994a;
    public final /* synthetic */ C0541u1 b;

    public P0(C0541u1 c0541u1, String str) {
        this.b = c0541u1;
        this.f994a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).c(this.f994a);
    }
}
