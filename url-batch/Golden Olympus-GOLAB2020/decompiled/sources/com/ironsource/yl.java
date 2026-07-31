package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class yl implements ok {

    /* renamed from: b, reason: collision with root package name */
    private Timer f20439b;

    /* renamed from: e, reason: collision with root package name */
    private long f20442e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f20443f;

    /* renamed from: a, reason: collision with root package name */
    private String f20438a = "INTERNAL";

    /* renamed from: c, reason: collision with root package name */
    private boolean f20440c = false;

    /* renamed from: d, reason: collision with root package name */
    private Long f20441d = null;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            yl.this.f20443f.run();
        }
    }

    public yl(long j4, Runnable runnable, boolean z4) {
        this.f20442e = j4;
        this.f20443f = runnable;
        if (z4) {
            g();
        }
    }

    private synchronized void f() {
        Timer timer = this.f20439b;
        if (timer != null) {
            timer.cancel();
            this.f20439b = null;
        }
    }

    private synchronized void h() {
        if (this.f20439b == null) {
            Timer timer = new Timer();
            this.f20439b = timer;
            timer.schedule(new a(), this.f20442e);
            Calendar.getInstance().setTimeInMillis(this.f20441d.longValue());
        }
    }

    @Override // com.ironsource.ok
    public void b() {
        if (this.f20439b != null) {
            f();
        }
    }

    @Override // com.ironsource.ok
    public void c() {
        Long l4;
        if (this.f20439b == null && (l4 = this.f20441d) != null) {
            long longValue = l4.longValue() - System.currentTimeMillis();
            this.f20442e = longValue;
            if (longValue > 0) {
                h();
            } else {
                e();
                this.f20443f.run();
            }
        }
    }

    @Override // com.ironsource.ok
    public void d() {
    }

    public void e() {
        f();
        this.f20440c = false;
        this.f20441d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.f20440c) {
            return;
        }
        this.f20440c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.f20441d = Long.valueOf(System.currentTimeMillis() + this.f20442e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }

    @Override // com.ironsource.ok
    public void a() {
    }
}
