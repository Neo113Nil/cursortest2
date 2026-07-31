package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2738jn implements InterfaceC2968sk, Q9 {

    /* renamed from: a, reason: collision with root package name */
    public final Za f39320a;

    /* renamed from: b, reason: collision with root package name */
    public final Kl f39321b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f39322c = new AtomicBoolean(false);

    public C2738jn(@NotNull Za za, @NotNull Kl kl) {
        this.f39320a = za;
        this.f39321b = kl;
        Objects.toString(za.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f39322c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f39322c.get()) {
            return;
        }
        f();
        a();
    }

    @NotNull
    public final Za d() {
        return this.f39320a;
    }

    public final boolean e() {
        return this.f39322c.get();
    }

    public void f() {
        this.f39321b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2968sk
    public final void onCreate() {
        this.f39322c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2968sk
    public final void onDestroy() {
        if (this.f39322c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(@NotNull NetworkTask networkTask) {
        Ia.f37730F.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
