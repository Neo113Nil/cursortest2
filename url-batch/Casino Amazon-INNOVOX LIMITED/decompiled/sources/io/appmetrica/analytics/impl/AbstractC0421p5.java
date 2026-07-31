package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0421p5 implements InterfaceC0154ej {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f1426a;
    public final BaseRequestConfig.RequestConfigLoader b;
    public M5 c;

    public AbstractC0421p5(BaseRequestConfig.RequestConfigLoader<Object, M5> requestConfigLoader, C0209gm c0209gm, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.b = requestConfigLoader;
        C0401oa.k().v().a(this);
        a(new M5(c0209gm, C0401oa.k().v(), C0401oa.k().s(), argumentsMerger));
    }

    public final synchronized void a(M5 m5) {
        this.c = m5;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.c.componentArguments;
    }

    public final synchronized C0209gm c() {
        return this.c.f949a;
    }

    public final void d() {
        synchronized (this) {
            this.f1426a = null;
        }
    }

    public final synchronized void e() {
        this.f1426a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.c.componentArguments).compareWithOtherArguments(obj)) {
            a(new M5(c(), C0401oa.I.v(), C0401oa.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C0209gm c0209gm) {
        a(new M5(c0209gm, C0401oa.I.v(), C0401oa.I.s(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        if (this.f1426a == null) {
            this.f1426a = this.b.load(this.c);
        }
        return this.f1426a;
    }
}
