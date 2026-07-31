package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1458f<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object f16186a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Timer f16187b;

    /* renamed from: c, reason: collision with root package name */
    protected long f16188c;

    /* renamed from: d, reason: collision with root package name */
    protected T f16189d;

    /* renamed from: com.ironsource.f$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC1458f.this.b();
        }
    }

    public AbstractC1458f() {
    }

    protected void a(T t4) {
        if (a() || t4 == null) {
            return;
        }
        this.f16189d = t4;
        c();
        synchronized (this.f16186a) {
            Timer timer = new Timer();
            this.f16187b = timer;
            timer.schedule(new a(), this.f16188c);
        }
    }

    protected abstract void b();

    protected void c() {
        synchronized (this.f16186a) {
            try {
                Timer timer = this.f16187b;
                if (timer != null) {
                    timer.cancel();
                    this.f16187b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        this.f16189d = null;
    }

    public AbstractC1458f(long j4) {
        this.f16188c = j4;
    }

    protected boolean a() {
        return this.f16188c <= 0;
    }
}
