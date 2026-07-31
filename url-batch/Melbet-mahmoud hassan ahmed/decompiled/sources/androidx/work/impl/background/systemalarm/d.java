package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import d0.j;
import java.util.Collections;
import java.util.List;
import l0.p;
import m0.n;

/* loaded from: classes.dex */
public class d implements h0.c, e0.b, n.b {

    /* renamed from: o, reason: collision with root package name */
    private static final String f1488o = j.f("DelayMetCommandHandler");

    /* renamed from: f, reason: collision with root package name */
    private final Context f1489f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1490g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1491h;

    /* renamed from: i, reason: collision with root package name */
    private final e f1492i;

    /* renamed from: j, reason: collision with root package name */
    private final h0.d f1493j;

    /* renamed from: m, reason: collision with root package name */
    private PowerManager.WakeLock f1496m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1497n = false;

    /* renamed from: l, reason: collision with root package name */
    private int f1495l = 0;

    /* renamed from: k, reason: collision with root package name */
    private final Object f1494k = new Object();

    d(Context context, int i7, String str, e eVar) {
        this.f1489f = context;
        this.f1490g = i7;
        this.f1492i = eVar;
        this.f1491h = str;
        this.f1493j = new h0.d(context, eVar.f(), this);
    }

    private void d() {
        synchronized (this.f1494k) {
            this.f1493j.e();
            this.f1492i.h().c(this.f1491h);
            PowerManager.WakeLock wakeLock = this.f1496m;
            if (wakeLock != null && wakeLock.isHeld()) {
                j.c().a(f1488o, String.format("Releasing wakelock %s for WorkSpec %s", this.f1496m, this.f1491h), new Throwable[0]);
                this.f1496m.release();
            }
        }
    }

    private void g() {
        synchronized (this.f1494k) {
            if (this.f1495l < 2) {
                this.f1495l = 2;
                j c7 = j.c();
                String str = f1488o;
                c7.a(str, String.format("Stopping work for WorkSpec %s", this.f1491h), new Throwable[0]);
                Intent g7 = b.g(this.f1489f, this.f1491h);
                e eVar = this.f1492i;
                eVar.k(new e.b(eVar, g7, this.f1490g));
                if (this.f1492i.e().g(this.f1491h)) {
                    j.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f1491h), new Throwable[0]);
                    Intent f7 = b.f(this.f1489f, this.f1491h);
                    e eVar2 = this.f1492i;
                    eVar2.k(new e.b(eVar2, f7, this.f1490g));
                } else {
                    j.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f1491h), new Throwable[0]);
                }
            } else {
                j.c().a(f1488o, String.format("Already stopped work for %s", this.f1491h), new Throwable[0]);
            }
        }
    }

    @Override // e0.b
    public void a(String str, boolean z6) {
        j.c().a(f1488o, String.format("onExecuted %s, %s", str, Boolean.valueOf(z6)), new Throwable[0]);
        d();
        if (z6) {
            Intent f7 = b.f(this.f1489f, this.f1491h);
            e eVar = this.f1492i;
            eVar.k(new e.b(eVar, f7, this.f1490g));
        }
        if (this.f1497n) {
            Intent b7 = b.b(this.f1489f);
            e eVar2 = this.f1492i;
            eVar2.k(new e.b(eVar2, b7, this.f1490g));
        }
    }

    @Override // m0.n.b
    public void b(String str) {
        j.c().a(f1488o, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // h0.c
    public void c(List<String> list) {
        g();
    }

    @Override // h0.c
    public void e(List<String> list) {
        if (list.contains(this.f1491h)) {
            synchronized (this.f1494k) {
                if (this.f1495l == 0) {
                    this.f1495l = 1;
                    j.c().a(f1488o, String.format("onAllConstraintsMet for %s", this.f1491h), new Throwable[0]);
                    if (this.f1492i.e().j(this.f1491h)) {
                        this.f1492i.h().b(this.f1491h, 600000L, this);
                    } else {
                        d();
                    }
                } else {
                    j.c().a(f1488o, String.format("Already started work for %s", this.f1491h), new Throwable[0]);
                }
            }
        }
    }

    void f() {
        this.f1496m = m0.j.b(this.f1489f, String.format("%s (%s)", this.f1491h, Integer.valueOf(this.f1490g)));
        j c7 = j.c();
        String str = f1488o;
        c7.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f1496m, this.f1491h), new Throwable[0]);
        this.f1496m.acquire();
        p l7 = this.f1492i.g().o().B().l(this.f1491h);
        if (l7 == null) {
            g();
            return;
        }
        boolean b7 = l7.b();
        this.f1497n = b7;
        if (b7) {
            this.f1493j.d(Collections.singletonList(l7));
        } else {
            j.c().a(str, String.format("No constraints for %s", this.f1491h), new Throwable[0]);
            e(Collections.singletonList(this.f1491h));
        }
    }
}
