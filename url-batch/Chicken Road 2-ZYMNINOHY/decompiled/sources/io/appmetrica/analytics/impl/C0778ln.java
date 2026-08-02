package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0778ln implements InterfaceC0775lk, InterfaceC1023v9 {

    /* renamed from: a, reason: collision with root package name */
    public final Ea f12310a;

    /* renamed from: b, reason: collision with root package name */
    public final Kl f12311b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f12312c = new AtomicBoolean(false);

    public C0778ln(Ea ea, Kl kl) {
        this.f12310a = ea;
        this.f12311b = kl;
        Objects.toString(ea.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f12312c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f12312c.get()) {
            return;
        }
        f();
        a();
    }

    public final Ea d() {
        return this.f12310a;
    }

    public final boolean e() {
        return this.f12312c.get();
    }

    public void f() {
        this.f12311b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0775lk
    public final void onCreate() {
        this.f12312c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0775lk
    public final void onDestroy() {
        if (this.f12312c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(NetworkTask networkTask) {
        C0817na.f12417I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
