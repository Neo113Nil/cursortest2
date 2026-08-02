package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f10682b;

    public N0(C0963t1 c0963t1, String str) {
        this.f10682b = c0963t1;
        this.f10681a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10682b.d().f12128b.a(this.f10681a, false);
    }
}
