package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class xl {

    /* renamed from: g, reason: collision with root package name */
    private static final String f20324g = "xl";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f20325a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f20326b;

    /* renamed from: c, reason: collision with root package name */
    private final zu f20327c;

    /* renamed from: e, reason: collision with root package name */
    private Timer f20329e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20328d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final ok f20330f = new a();

    class a implements ok {
        a() {
        }

        @Override // com.ironsource.ok
        public void a() {
        }

        @Override // com.ironsource.ok
        public void b() {
            xl.this.f20327c.c(System.currentTimeMillis());
            xl.this.c();
        }

        @Override // com.ironsource.ok
        public void c() {
            xl.this.f20327c.b(System.currentTimeMillis());
            xl xlVar = xl.this;
            xlVar.b(xlVar.f20327c.a());
        }

        @Override // com.ironsource.ok
        public void d() {
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            xl.this.f20325a.b(xl.this.f20330f);
            xl.this.f20327c.b();
            xl.this.f20326b.run();
        }
    }

    public xl(Runnable runnable, com.ironsource.lifecycle.b bVar, zu zuVar) {
        this.f20326b = runnable;
        this.f20325a = bVar;
        this.f20327c = zuVar;
    }

    public void b() {
        c();
        this.f20325a.b(this.f20330f);
        this.f20327c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j4) {
        synchronized (this.f20328d) {
            c();
            Timer timer = new Timer();
            this.f20329e = timer;
            timer.schedule(new b(), j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f20328d) {
            try {
                Timer timer = this.f20329e;
                if (timer != null) {
                    timer.cancel();
                    this.f20329e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void a(long j4) {
        if (j4 < 0) {
            Log.d(f20324g, "cannot start timer with delay < 0");
            return;
        }
        this.f20325a.a(this.f20330f);
        this.f20327c.a(j4);
        if (this.f20325a.e()) {
            this.f20327c.c(System.currentTimeMillis());
        } else {
            b(j4);
        }
    }
}
