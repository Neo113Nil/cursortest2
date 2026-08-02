package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f10969b;

    public T0(C0963t1 c0963t1, String str) {
        this.f10969b = c0963t1;
        this.f10968a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1118z0 c1118z0 = this.f10969b.f12756a;
        String str = this.f10968a;
        c1118z0.getClass();
        C1092y0.c().setUserProfileID(str);
    }
}
