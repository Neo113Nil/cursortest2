package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0838o5 implements InterfaceC0568dj {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f12497a;

    /* renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f12498b;

    /* renamed from: c, reason: collision with root package name */
    public L5 f12499c;

    public AbstractC0838o5(BaseRequestConfig.RequestConfigLoader<Object, L5> requestConfigLoader, C0622fm c0622fm, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f12498b = requestConfigLoader;
        C0817na.k().v().a(this);
        a(new L5(c0622fm, C0817na.k().v(), C0817na.k().s(), argumentsMerger));
    }

    public final synchronized void a(L5 l5) {
        this.f12499c = l5;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f12499c.componentArguments;
    }

    public final synchronized C0622fm c() {
        return this.f12499c.f10564a;
    }

    public final void d() {
        synchronized (this) {
            this.f12497a = null;
        }
    }

    public final synchronized void e() {
        this.f12497a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.f12499c.componentArguments).compareWithOtherArguments(obj)) {
            a(new L5(c(), C0817na.f12417I.v(), C0817na.f12417I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f12499c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C0622fm c0622fm) {
        a(new L5(c0622fm, C0817na.f12417I.v(), C0817na.f12417I.s(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f12497a == null) {
                this.f12497a = this.f12498b.load(this.f12499c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12497a;
    }
}
