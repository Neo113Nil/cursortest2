package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* loaded from: classes3.dex */
public final class Uf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f1077a;
    public final Function b;
    public final Consumer c;
    public final Consumer d;
    public final C0042aa e;
    public final InterfaceC0079bl f;

    public Uf(File file, Function function, Consumer consumer, Consumer consumer2, C0042aa c0042aa, InterfaceC0079bl interfaceC0079bl) {
        this.f1077a = file;
        this.b = function;
        this.c = consumer;
        this.d = consumer2;
        this.e = c0042aa;
        this.f = interfaceC0079bl;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1077a.exists()) {
            C0649y9 b = this.e.b(this.f1077a.getName());
            Consumer consumer = this.c;
            try {
                b.f1581a.lock();
                b.b.a();
            } catch (Throwable unused) {
            }
            if (!this.f1077a.exists()) {
                consumer.consume(this.f1077a);
                b.c();
                C0042aa c0042aa = this.e;
                String name = this.f1077a.getName();
                synchronized (c0042aa) {
                    c0042aa.b.remove(name);
                }
                return;
            }
            Object apply = this.b.apply(this.f1077a);
            if (apply != null) {
                if (this.f.a(apply)) {
                    this.d.consume(apply);
                } else {
                    consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Uf$$ExternalSyntheticLambda0
                        @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                        public final void consume(Object obj) {
                            Uf.a((File) obj);
                        }
                    };
                }
            }
            consumer.consume(this.f1077a);
            b.c();
            this.e.a(this.f1077a.getName());
        }
    }
}
