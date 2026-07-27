package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* loaded from: classes.dex */
public final class Yf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f7741a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f7742b;

    /* renamed from: c, reason: collision with root package name */
    public final Consumer f7743c;

    /* renamed from: d, reason: collision with root package name */
    public final Consumer f7744d;

    /* renamed from: e, reason: collision with root package name */
    public final C0665ga f7745e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0624el f7746f;

    public Yf(File file, Function function, Consumer consumer, Consumer consumer2, C0665ga c0665ga, InterfaceC0624el interfaceC0624el) {
        this.f7741a = file;
        this.f7742b = function;
        this.f7743c = consumer;
        this.f7744d = consumer2;
        this.f7745e = c0665ga;
        this.f7746f = interfaceC0624el;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7741a.exists()) {
            E9 b6 = this.f7745e.b(this.f7741a.getName());
            Consumer consumer = this.f7743c;
            try {
                b6.f6745a.lock();
                b6.f6746b.a();
            } catch (Throwable unused) {
            }
            if (!this.f7741a.exists()) {
                consumer.consume(this.f7741a);
                b6.c();
                C0665ga c0665ga = this.f7745e;
                String name = this.f7741a.getName();
                synchronized (c0665ga) {
                    c0665ga.f8266b.remove(name);
                }
                return;
            }
            Object apply = this.f7742b.apply(this.f7741a);
            if (apply != null) {
                if (this.f7746f.a(apply)) {
                    this.f7744d.consume(apply);
                } else {
                    consumer = new Po();
                }
            }
            consumer.consume(this.f7741a);
            b6.c();
            this.f7745e.a(this.f7741a.getName());
        }
    }
}
