package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0601f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11820c;

    public RunnableC0601f1(C0963t1 c0963t1, String str, String str2) {
        this.f11820c = c0963t1;
        this.f11818a = str;
        this.f11819b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1118z0 c1118z0 = this.f11820c.f12756a;
        String str = this.f11818a;
        String str2 = this.f11819b;
        c1118z0.getClass();
        C1092y0.c().putAppEnvironmentValue(str, str2);
    }
}
