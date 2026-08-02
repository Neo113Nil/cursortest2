package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0897v5 implements InterfaceC0574ij {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f8490a;

    /* renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f8491b;

    /* renamed from: c, reason: collision with root package name */
    public S5 f8492c;

    public AbstractC0897v5(BaseRequestConfig.RequestConfigLoader<Object, S5> requestConfigLoader, C0603jm c0603jm, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f8491b = requestConfigLoader;
        C0876ua.k().v().a(this);
        a(new S5(c0603jm, C0876ua.k().v(), C0876ua.k().s(), argumentsMerger));
    }

    public final synchronized void a(S5 s5) {
        this.f8492c = s5;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f8492c.componentArguments;
    }

    public final synchronized C0603jm c() {
        return this.f8492c.f6596a;
    }

    public final void d() {
        synchronized (this) {
            this.f8490a = null;
        }
    }

    public final synchronized void e() {
        this.f8490a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.f8492c.componentArguments).compareWithOtherArguments(obj)) {
            a(new S5(c(), C0876ua.f8420H.v(), C0876ua.f8420H.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f8492c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C0603jm c0603jm) {
        a(new S5(c0603jm, C0876ua.f8420H.v(), C0876ua.f8420H.s(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f8490a == null) {
                this.f8490a = this.f8491b.load(this.f8492c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8490a;
    }
}
