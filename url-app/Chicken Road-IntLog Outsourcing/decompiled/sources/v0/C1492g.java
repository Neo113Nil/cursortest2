package v0;

import B0.j;
import B0.q;
import C0.n;
import C0.x;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s0.s;
import u1.AbstractC1477a;
import x0.InterfaceC1536b;

/* renamed from: v0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492g implements InterfaceC1536b, x {

    /* renamed from: m, reason: collision with root package name */
    public static final String f12068m = s.f("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f12069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12070b;

    /* renamed from: c, reason: collision with root package name */
    public final j f12071c;

    /* renamed from: d, reason: collision with root package name */
    public final C1494i f12072d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.c f12073e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12074f;

    /* renamed from: g, reason: collision with root package name */
    public int f12075g;

    /* renamed from: h, reason: collision with root package name */
    public final n f12076h;

    /* renamed from: i, reason: collision with root package name */
    public final A.c f12077i;

    /* renamed from: j, reason: collision with root package name */
    public PowerManager.WakeLock f12078j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12079k;

    /* renamed from: l, reason: collision with root package name */
    public final t0.j f12080l;

    public C1492g(Context context, int i2, C1494i c1494i, t0.j jVar) {
        this.f12069a = context;
        this.f12070b = i2;
        this.f12072d = c1494i;
        this.f12071c = jVar.f11867a;
        this.f12080l = jVar;
        B0.n nVar = c1494i.f12088e.f11891j;
        B4.i iVar = c1494i.f12085b;
        this.f12076h = (n) iVar.f311b;
        this.f12077i = (A.c) iVar.f313d;
        this.f12073e = new x0.c(nVar, this);
        this.f12079k = false;
        this.f12075g = 0;
        this.f12074f = new Object();
    }

    public static void a(C1492g c1492g) {
        j jVar = c1492g.f12071c;
        int i2 = c1492g.f12075g;
        String str = jVar.f157a;
        String str2 = f12068m;
        if (i2 >= 2) {
            s.d().a(str2, "Already stopped work for " + str);
            return;
        }
        c1492g.f12075g = 2;
        s.d().a(str2, "Stopping work for WorkSpec " + str);
        Context context = c1492g.f12069a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        C1488c.c(intent, jVar);
        C1494i c1494i = c1492g.f12072d;
        int i3 = c1492g.f12070b;
        A0.d dVar = new A0.d(i3, intent, c1494i);
        A.c cVar = c1492g.f12077i;
        cVar.execute(dVar);
        if (!c1494i.f12087d.c(str)) {
            s.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        s.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        C1488c.c(intent2, jVar);
        cVar.execute(new A0.d(i3, intent2, c1494i));
    }

    @Override // x0.InterfaceC1536b
    public final void b(ArrayList arrayList) {
        this.f12076h.execute(new RunnableC1491f(this, 0));
    }

    @Override // x0.InterfaceC1536b
    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC1477a.p((q) it.next()).equals(this.f12071c)) {
                this.f12076h.execute(new RunnableC1491f(this, 1));
                return;
            }
        }
    }

    public final void d() {
        synchronized (this.f12074f) {
            try {
                this.f12073e.e();
                this.f12072d.f12086c.a(this.f12071c);
                PowerManager.WakeLock wakeLock = this.f12078j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    s.d().a(f12068m, "Releasing wakelock " + this.f12078j + "for WorkSpec " + this.f12071c);
                    this.f12078j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        j jVar = this.f12071c;
        StringBuilder sb = new StringBuilder();
        String str = jVar.f157a;
        sb.append(str);
        sb.append(" (");
        sb.append(this.f12070b);
        sb.append(")");
        this.f12078j = C0.q.a(this.f12069a, sb.toString());
        s d6 = s.d();
        String str2 = "Acquiring wakelock " + this.f12078j + "for WorkSpec " + str;
        String str3 = f12068m;
        d6.a(str3, str2);
        this.f12078j.acquire();
        q g6 = this.f12072d.f12088e.f11884c.t().g(str);
        if (g6 == null) {
            this.f12076h.execute(new RunnableC1491f(this, 0));
            return;
        }
        boolean b6 = g6.b();
        this.f12079k = b6;
        if (b6) {
            this.f12073e.d(Collections.singletonList(g6));
            return;
        }
        s.d().a(str3, "No constraints for " + str);
        c(Collections.singletonList(g6));
    }

    public final void f(boolean z) {
        s d6 = s.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        j jVar = this.f12071c;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z);
        d6.a(f12068m, sb.toString());
        d();
        int i2 = this.f12070b;
        C1494i c1494i = this.f12072d;
        A.c cVar = this.f12077i;
        Context context = this.f12069a;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C1488c.c(intent, jVar);
            cVar.execute(new A0.d(i2, intent, c1494i));
        }
        if (this.f12079k) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            cVar.execute(new A0.d(i2, intent2, c1494i));
        }
    }
}
