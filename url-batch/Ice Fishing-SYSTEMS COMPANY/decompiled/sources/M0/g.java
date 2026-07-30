package M0;

import J0.s;
import N2.A;
import T0.l;
import T0.n;
import T0.t;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f4.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class g implements O0.b, t {

    /* renamed from: F, reason: collision with root package name */
    public static final String f1846F = s.f("DelayMetCommandHandler");

    /* renamed from: A, reason: collision with root package name */
    public final l f1847A;

    /* renamed from: B, reason: collision with root package name */
    public final A f1848B;

    /* renamed from: C, reason: collision with root package name */
    public PowerManager.WakeLock f1849C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1850D;

    /* renamed from: E, reason: collision with root package name */
    public final K0.j f1851E;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1852n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1853u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.j f1854v;

    /* renamed from: w, reason: collision with root package name */
    public final j f1855w;

    /* renamed from: x, reason: collision with root package name */
    public final Y2.e f1856x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1857y;

    /* renamed from: z, reason: collision with root package name */
    public int f1858z;

    public g(Context context, int i, j jVar, K0.j jVar2) {
        this.f1852n = context;
        this.f1853u = i;
        this.f1855w = jVar;
        this.f1854v = jVar2.f1514a;
        this.f1851E = jVar2;
        p pVar = jVar.f1872x.f1538j;
        Y2.e eVar = jVar.f1869u;
        this.f1847A = (l) eVar.f3963u;
        this.f1848B = (A) eVar.f3965w;
        this.f1856x = new Y2.e(pVar, this);
        this.f1850D = false;
        this.f1858z = 0;
        this.f1857y = new Object();
    }

    public static void a(g gVar) {
        S0.j jVar = gVar.f1854v;
        int i = gVar.f1858z;
        String str = jVar.f2905a;
        String str2 = f1846F;
        if (i >= 2) {
            s.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f1858z = 2;
        s.d().a(str2, "Stopping work for WorkSpec " + str);
        Context context = gVar.f1852n;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, jVar);
        j jVar2 = gVar.f1855w;
        int i4 = gVar.f1853u;
        i iVar = new i(i4, 0, jVar2, intent);
        A a9 = gVar.f1848B;
        a9.execute(iVar);
        if (!jVar2.f1871w.d(str)) {
            s.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        s.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, jVar);
        a9.execute(new i(i4, 0, jVar2, intent2));
    }

    public final void b() {
        synchronized (this.f1857y) {
            try {
                this.f1856x.I();
                this.f1855w.f1870v.a(this.f1854v);
                PowerManager.WakeLock wakeLock = this.f1849C;
                if (wakeLock != null && wakeLock.isHeld()) {
                    s.d().a(f1846F, "Releasing wakelock " + this.f1849C + "for WorkSpec " + this.f1854v);
                    this.f1849C.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        S0.j jVar = this.f1854v;
        StringBuilder sb = new StringBuilder();
        String str = jVar.f2905a;
        sb.append(str);
        sb.append(" (");
        this.f1849C = n.a(this.f1852n, AbstractC5051n.e(this.f1853u, ")", sb));
        s d2 = s.d();
        String str2 = "Acquiring wakelock " + this.f1849C + "for WorkSpec " + str;
        String str3 = f1846F;
        d2.a(str3, str2);
        this.f1849C.acquire();
        S0.p h9 = this.f1855w.f1872x.f1532c.t().h(str);
        if (h9 == null) {
            this.f1847A.execute(new f(this, 0));
            return;
        }
        boolean b9 = h9.b();
        this.f1850D = b9;
        if (b9) {
            this.f1856x.H(Collections.singletonList(h9));
            return;
        }
        s.d().a(str3, "No constraints for " + str);
        f(Collections.singletonList(h9));
    }

    public final void d(boolean z8) {
        s d2 = s.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        S0.j jVar = this.f1854v;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z8);
        d2.a(f1846F, sb.toString());
        b();
        int i = this.f1853u;
        j jVar2 = this.f1855w;
        A a9 = this.f1848B;
        Context context = this.f1852n;
        if (z8) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, jVar);
            a9.execute(new i(i, 0, jVar2, intent));
        }
        if (this.f1850D) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            a9.execute(new i(i, 0, jVar2, intent2));
        }
    }

    @Override // O0.b
    public final void e(ArrayList arrayList) {
        this.f1847A.execute(new f(this, 0));
    }

    @Override // O0.b
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (U2.a.e((S0.p) it.next()).equals(this.f1854v)) {
                this.f1847A.execute(new f(this, 1));
                return;
            }
        }
    }
}
