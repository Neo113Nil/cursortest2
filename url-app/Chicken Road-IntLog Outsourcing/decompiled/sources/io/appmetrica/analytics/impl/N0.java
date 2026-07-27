package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7166b;

    public N0(C0966s1 c0966s1, String str) {
        this.f7166b = c0966s1;
        this.f7165a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f7166b).c(this.f7165a);
    }
}
