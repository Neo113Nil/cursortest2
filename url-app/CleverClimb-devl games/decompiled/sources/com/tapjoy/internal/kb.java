package com.tapjoy.internal;

import com.tapjoy.internal.kg;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class kb implements kg {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f8483a = Logger.getLogger(kb.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final kg f8484b = new kd() { // from class: com.tapjoy.internal.kb.1
        @Override // com.tapjoy.internal.kd
        protected final void a() {
            final kb kbVar = kb.this;
            new Executor() { // from class: com.tapjoy.internal.kb.2
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    new Thread(runnable, kb.this.getClass().getSimpleName()).start();
                }
            }.execute(new Runnable() { // from class: com.tapjoy.internal.kb.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        kb.this.b();
                        c();
                        if (f() == kg.a.RUNNING) {
                            try {
                                kb.this.d();
                            } finally {
                            }
                        }
                        kb.this.c();
                        d();
                    } catch (Throwable th) {
                        a(th);
                        throw js.a(th);
                    }
                }
            });
        }

        @Override // com.tapjoy.internal.kd
        protected final void b() {
            kb.this.a();
        }
    };

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public abstract void d();

    public String toString() {
        return getClass().getSimpleName() + " [" + f() + "]";
    }

    @Override // com.tapjoy.internal.kg
    public final kf e() {
        return this.f8484b.e();
    }

    @Override // com.tapjoy.internal.kg
    public final kg.a f() {
        return this.f8484b.f();
    }
}
