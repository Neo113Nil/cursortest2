package com.ironsource;

import com.ironsource.C1526o2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1540q2 {

    /* renamed from: a, reason: collision with root package name */
    private final C1526o2 f18748a;

    /* renamed from: b, reason: collision with root package name */
    private final gm f18749b;

    /* renamed from: c, reason: collision with root package name */
    private final xl f18750c = c();

    /* renamed from: d, reason: collision with root package name */
    private Timer f18751d;

    /* renamed from: com.ironsource.q2$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1540q2.this.f18749b.b();
        }
    }

    /* renamed from: com.ironsource.q2$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C1540q2.this.f18749b.b();
        }
    }

    public C1540q2(C1526o2 c1526o2, @NotNull gm gmVar) {
        this.f18748a = c1526o2;
        this.f18749b = gmVar;
    }

    private xl c() {
        return new xl(new a(), com.ironsource.lifecycle.b.d(), new zu());
    }

    private synchronized void j() {
        Timer timer = this.f18751d;
        if (timer != null) {
            timer.cancel();
            this.f18751d = null;
        }
    }

    protected C1526o2 b() {
        return this.f18748a;
    }

    protected boolean d() {
        return this.f18748a.c() > 0;
    }

    public void e() {
        if (this.f18748a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f18748a.c());
        }
    }

    public void f() {
        if (this.f18748a.a() == C1526o2.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f18748a.d());
        }
    }

    public void g() {
        if (this.f18748a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f18748a.a() != C1526o2.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f18748a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f18748a.d());
    }

    protected void i() {
        xl xlVar = this.f18750c;
        if (xlVar != null) {
            xlVar.b();
        }
    }

    public void k() {
        if (this.f18748a.a() != C1526o2.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f18748a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f18748a.b());
    }

    private synchronized void b(long j4) {
        j();
        Timer timer = new Timer();
        this.f18751d = timer;
        timer.schedule(new b(), j4);
    }

    public void a() {
        if (this.f18748a.a() == C1526o2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    protected void a(long j4) {
        xl xlVar = this.f18750c;
        if (xlVar != null) {
            xlVar.a(j4);
        }
    }
}
