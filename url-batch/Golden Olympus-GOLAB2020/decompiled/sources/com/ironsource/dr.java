package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class dr {

    /* renamed from: a, reason: collision with root package name */
    private C1529o5 f15911a;

    /* renamed from: b, reason: collision with root package name */
    private er f15912b;

    /* renamed from: c, reason: collision with root package name */
    private Timer f15913c = null;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            dr.this.f15912b.b();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            dr.this.f15912b.b();
        }
    }

    public dr(C1529o5 c1529o5, er erVar) {
        this.f15911a = c1529o5;
        this.f15912b = erVar;
    }

    private void d() {
        Timer timer = this.f15913c;
        if (timer != null) {
            timer.cancel();
            this.f15913c = null;
        }
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f15912b.b();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f15913c = timer;
        timer.schedule(new a(), this.f15911a.j());
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f15913c = timer;
        timer.schedule(new b(), this.f15911a.b());
    }
}
