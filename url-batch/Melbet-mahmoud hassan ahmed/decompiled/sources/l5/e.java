package l5;

import m5.s;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final m5.a<String> f18644a;

    public e(a5.a aVar) {
        this.f18644a = new m5.a<>(aVar, "flutter/lifecycle", s.f19265b);
    }

    public void a() {
        z4.b.e("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f18644a.c("AppLifecycleState.detached");
    }

    public void b() {
        z4.b.e("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f18644a.c("AppLifecycleState.inactive");
    }

    public void c() {
        z4.b.e("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f18644a.c("AppLifecycleState.paused");
    }

    public void d() {
        z4.b.e("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f18644a.c("AppLifecycleState.resumed");
    }
}
