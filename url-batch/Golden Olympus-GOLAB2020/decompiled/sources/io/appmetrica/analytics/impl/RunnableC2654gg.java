package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2654gg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f39087a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f39088b;

    /* renamed from: c, reason: collision with root package name */
    public final Consumer f39089c;

    /* renamed from: d, reason: collision with root package name */
    public final Consumer f39090d;

    /* renamed from: e, reason: collision with root package name */
    public final C3010ua f39091e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2498al f39092f;

    public RunnableC2654gg(File file, Function function, Consumer consumer, Consumer consumer2, C3010ua c3010ua, InterfaceC2498al interfaceC2498al) {
        this.f39087a = file;
        this.f39088b = function;
        this.f39089c = consumer;
        this.f39090d = consumer2;
        this.f39091e = c3010ua;
        this.f39092f = interfaceC2498al;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f39087a.exists()) {
            S9 b4 = this.f39091e.b(this.f39087a.getName());
            Consumer consumer = this.f39089c;
            try {
                b4.f38250a.lock();
                b4.f38251b.a();
            } catch (Throwable unused) {
            }
            if (!this.f39087a.exists()) {
                consumer.consume(this.f39087a);
                b4.c();
                C3010ua c3010ua = this.f39091e;
                String name = this.f39087a.getName();
                synchronized (c3010ua) {
                    c3010ua.f39933b.remove(name);
                }
                return;
            }
            Object apply = this.f39088b.apply(this.f39087a);
            if (apply != null) {
                if (this.f39092f.a(apply)) {
                    this.f39090d.consume(apply);
                } else {
                    consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.kp
                        @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                        public final void consume(Object obj) {
                            RunnableC2654gg.a((File) obj);
                        }
                    };
                }
            }
            consumer.consume(this.f39087a);
            b4.c();
            this.f39091e.a(this.f39087a.getName());
        }
    }
}
