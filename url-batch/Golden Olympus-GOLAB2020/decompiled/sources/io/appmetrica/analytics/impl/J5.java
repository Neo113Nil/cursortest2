package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes3.dex */
public abstract class J5 implements InterfaceC2916qj {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f37803a;

    /* renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f37804b;

    /* renamed from: c, reason: collision with root package name */
    public C2670h6 f37805c;

    public J5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, C2670h6> requestConfigLoader, @NonNull C2633fm c2633fm, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f37804b = requestConfigLoader;
        Ia.j().u().a(this);
        a(new C2670h6(c2633fm, Ia.j().u(), Ia.j().r(), argumentsMerger));
    }

    public final synchronized void a(@NonNull C2670h6 c2670h6) {
        this.f37805c = c2670h6;
    }

    @NonNull
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f37805c.componentArguments;
    }

    @NonNull
    public final synchronized C2633fm c() {
        return this.f37805c.f39126a;
    }

    public final void d() {
        synchronized (this) {
            this.f37803a = null;
        }
    }

    public final synchronized void e() {
        this.f37803a = null;
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.f37805c.componentArguments).compareWithOtherArguments(obj)) {
            a(new C2670h6(c(), Ia.f37730F.u(), Ia.f37730F.r(), (ArgumentsMerger) ((ArgumentsMerger) this.f37805c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(@NonNull C2633fm c2633fm) {
        a(new C2670h6(c2633fm, Ia.f37730F.u(), Ia.f37730F.r(), b()));
        e();
    }

    @NonNull
    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f37803a == null) {
                this.f37803a = this.f37804b.load(this.f37805c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37803a;
    }
}
