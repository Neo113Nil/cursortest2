package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0734on implements InterfaceC0757pk, C9 {

    /* renamed from: a, reason: collision with root package name */
    public final La f8034a;

    /* renamed from: b, reason: collision with root package name */
    public final Ol f8035b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f8036c = new AtomicBoolean(false);

    public C0734on(La la, Ol ol) {
        this.f8034a = la;
        this.f8035b = ol;
        Objects.toString(la.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f8036c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f8036c.get()) {
            return;
        }
        f();
        a();
    }

    public final La d() {
        return this.f8034a;
    }

    public final boolean e() {
        return this.f8036c.get();
    }

    public void f() {
        this.f8035b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0757pk
    public final void onCreate() {
        this.f8036c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0757pk
    public final void onDestroy() {
        if (this.f8036c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(NetworkTask networkTask) {
        C0876ua.f8420H.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
