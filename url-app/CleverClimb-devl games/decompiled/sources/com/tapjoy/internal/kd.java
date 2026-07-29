package com.tapjoy.internal;

import com.tapjoy.internal.kg;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class kd implements kg {

    /* renamed from: b, reason: collision with root package name */
    private final a f8493b;

    /* renamed from: c, reason: collision with root package name */
    private final a f8494c;

    /* renamed from: a, reason: collision with root package name */
    private final ReentrantLock f8492a = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private kg.a f8495d = kg.a.NEW;
    private boolean e = false;

    protected abstract void a();

    protected abstract void b();

    public kd() {
        byte b2 = 0;
        this.f8493b = new a(this, b2);
        this.f8494c = new a(this, b2);
    }

    @Override // com.tapjoy.internal.kg
    public final kf e() {
        this.f8492a.lock();
        try {
            try {
                if (this.f8495d == kg.a.NEW) {
                    this.f8495d = kg.a.STARTING;
                    a();
                }
            } catch (Throwable th) {
                a(th);
            }
            this.f8492a.unlock();
            return this.f8493b;
        } catch (Throwable th2) {
            this.f8492a.unlock();
            throw th2;
        }
    }

    private kf g() {
        this.f8492a.lock();
        try {
            try {
                if (this.f8495d == kg.a.NEW) {
                    this.f8495d = kg.a.TERMINATED;
                    this.f8493b.a(kg.a.TERMINATED);
                    this.f8494c.a(kg.a.TERMINATED);
                } else if (this.f8495d == kg.a.STARTING) {
                    this.e = true;
                    this.f8493b.a(kg.a.STOPPING);
                } else if (this.f8495d == kg.a.RUNNING) {
                    this.f8495d = kg.a.STOPPING;
                    b();
                }
            } catch (Throwable th) {
                a(th);
            }
            this.f8492a.unlock();
            return this.f8494c;
        } catch (Throwable th2) {
            this.f8492a.unlock();
            throw th2;
        }
    }

    protected final void c() {
        this.f8492a.lock();
        try {
            if (this.f8495d != kg.a.STARTING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.f8495d);
                a(illegalStateException);
                throw illegalStateException;
            }
            this.f8495d = kg.a.RUNNING;
            if (this.e) {
                g();
            } else {
                this.f8493b.a(kg.a.RUNNING);
            }
        } finally {
            this.f8492a.unlock();
        }
    }

    protected final void d() {
        this.f8492a.lock();
        try {
            if (this.f8495d != kg.a.STOPPING && this.f8495d != kg.a.RUNNING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStopped() when the service is " + this.f8495d);
                a(illegalStateException);
                throw illegalStateException;
            }
            this.f8495d = kg.a.TERMINATED;
            this.f8494c.a(kg.a.TERMINATED);
        } finally {
            this.f8492a.unlock();
        }
    }

    protected final void a(Throwable th) {
        jq.a(th);
        this.f8492a.lock();
        try {
            if (this.f8495d == kg.a.STARTING) {
                this.f8493b.a(th);
                this.f8494c.a((Throwable) new Exception("Service failed to start.", th));
            } else if (this.f8495d == kg.a.STOPPING) {
                this.f8494c.a(th);
            } else if (this.f8495d == kg.a.RUNNING) {
                this.f8494c.a((Throwable) new Exception("Service failed while running", th));
            } else if (this.f8495d == kg.a.NEW || this.f8495d == kg.a.TERMINATED) {
                throw new IllegalStateException("Failed while in state:" + this.f8495d, th);
            }
            this.f8495d = kg.a.FAILED;
        } finally {
            this.f8492a.unlock();
        }
    }

    @Override // com.tapjoy.internal.kg
    public final kg.a f() {
        kg.a aVar;
        this.f8492a.lock();
        try {
            if (this.e && this.f8495d == kg.a.STARTING) {
                aVar = kg.a.STOPPING;
            } else {
                aVar = this.f8495d;
            }
            return aVar;
        } finally {
            this.f8492a.unlock();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + f() + "]";
    }

    class a extends kc {
        private a() {
        }

        /* synthetic */ a(kd kdVar, byte b2) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tapjoy.internal.kc, java.util.concurrent.Future
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kg.a get(long j, TimeUnit timeUnit) {
            try {
                return (kg.a) super.get(j, timeUnit);
            } catch (TimeoutException unused) {
                throw new TimeoutException(kd.this.toString());
            }
        }
    }
}
