package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* loaded from: classes.dex */
public final class Tf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f10997a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f10998b;

    /* renamed from: c, reason: collision with root package name */
    public final Consumer f10999c;

    /* renamed from: d, reason: collision with root package name */
    public final Consumer f11000d;

    /* renamed from: e, reason: collision with root package name */
    public final Z9 f11001e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0492al f11002f;

    public Tf(File file, Function function, Consumer consumer, Consumer consumer2, Z9 z9, InterfaceC0492al interfaceC0492al) {
        this.f10997a = file;
        this.f10998b = function;
        this.f10999c = consumer;
        this.f11000d = consumer2;
        this.f11001e = z9;
        this.f11002f = interfaceC0492al;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10997a.exists()) {
            C1075x9 b4 = this.f11001e.b(this.f10997a.getName());
            Consumer consumer = this.f10999c;
            try {
                b4.f13020a.lock();
                b4.f13021b.a();
            } catch (Throwable unused) {
            }
            if (!this.f10997a.exists()) {
                consumer.consume(this.f10997a);
                b4.c();
                Z9 z9 = this.f11001e;
                String name = this.f10997a.getName();
                synchronized (z9) {
                    z9.f11364b.remove(name);
                }
                return;
            }
            Object apply = this.f10998b.apply(this.f10997a);
            if (apply != null) {
                if (this.f11002f.a(apply)) {
                    this.f11000d.consume(apply);
                } else {
                    consumer = new Po();
                }
            }
            consumer.consume(this.f10997a);
            b4.c();
            this.f11001e.a(this.f10997a.getName());
        }
    }
}
