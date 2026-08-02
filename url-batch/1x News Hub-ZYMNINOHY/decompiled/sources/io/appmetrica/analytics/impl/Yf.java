package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* loaded from: classes.dex */
public final class Yf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f6902a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f6903b;

    /* renamed from: c, reason: collision with root package name */
    public final Consumer f6904c;

    /* renamed from: d, reason: collision with root package name */
    public final Consumer f6905d;

    /* renamed from: e, reason: collision with root package name */
    public final C0514ga f6906e;
    public final InterfaceC0473el f;

    public Yf(File file, Function function, Consumer consumer, Consumer consumer2, C0514ga c0514ga, InterfaceC0473el interfaceC0473el) {
        this.f6902a = file;
        this.f6903b = function;
        this.f6904c = consumer;
        this.f6905d = consumer2;
        this.f6906e = c0514ga;
        this.f = interfaceC0473el;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6902a.exists()) {
            E9 b3 = this.f6906e.b(this.f6902a.getName());
            Consumer consumer = this.f6904c;
            try {
                b3.f5956a.lock();
                b3.f5957b.a();
            } catch (Throwable unused) {
            }
            if (!this.f6902a.exists()) {
                consumer.consume(this.f6902a);
                b3.c();
                C0514ga c0514ga = this.f6906e;
                String name = this.f6902a.getName();
                synchronized (c0514ga) {
                    c0514ga.f7392b.remove(name);
                }
                return;
            }
            Object apply = this.f6903b.apply(this.f6902a);
            if (apply != null) {
                if (this.f.a(apply)) {
                    this.f6905d.consume(apply);
                } else {
                    consumer = new Po();
                }
            }
            consumer.consume(this.f6902a);
            b3.c();
            this.f6906e.a(this.f6902a.getName());
        }
    }
}
