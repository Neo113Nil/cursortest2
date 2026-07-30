package J0;

import G0.s;
import K1.o;
import P0.p;
import Q0.m;
import Q0.v;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class g implements L0.b, v {

    /* renamed from: u, reason: collision with root package name */
    public static final String f1331u = s.f("DelayMetCommandHandler");

    /* renamed from: d, reason: collision with root package name */
    public final Context f1332d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1333e;

    /* renamed from: i, reason: collision with root package name */
    public final P0.j f1334i;

    /* renamed from: l, reason: collision with root package name */
    public final j f1335l;

    /* renamed from: m, reason: collision with root package name */
    public final D0.j f1336m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f1337n;

    /* renamed from: o, reason: collision with root package name */
    public int f1338o;

    /* renamed from: p, reason: collision with root package name */
    public final m f1339p;

    /* renamed from: q, reason: collision with root package name */
    public final o f1340q;

    /* renamed from: r, reason: collision with root package name */
    public PowerManager.WakeLock f1341r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1342s;

    /* renamed from: t, reason: collision with root package name */
    public final H0.j f1343t;

    public g(Context context, int i2, j jVar, H0.j jVar2) {
        this.f1332d = context;
        this.f1333e = i2;
        this.f1335l = jVar;
        this.f1334i = jVar2.f902a;
        this.f1343t = jVar2;
        P0.i iVar = jVar.f1355m.j;
        D0.j jVar3 = (D0.j) jVar.f1352e;
        this.f1339p = (m) jVar3.f330e;
        this.f1340q = (o) jVar3.f332l;
        this.f1336m = new D0.j(iVar, this);
        this.f1342s = false;
        this.f1338o = 0;
        this.f1337n = new Object();
    }

    public static void a(g gVar) {
        int i2 = gVar.f1333e;
        o oVar = gVar.f1340q;
        Context context = gVar.f1332d;
        j jVar = gVar.f1335l;
        P0.j jVar2 = gVar.f1334i;
        String str = jVar2.f2204a;
        int i5 = gVar.f1338o;
        String str2 = f1331u;
        if (i5 >= 2) {
            s.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f1338o = 2;
        s.d().a(str2, "Stopping work for WorkSpec " + str);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, jVar2);
        oVar.execute(new i(i2, 0, jVar, intent));
        if (!jVar.f1354l.d(str)) {
            s.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        s.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, jVar2);
        oVar.execute(new i(i2, 0, jVar, intent2));
    }

    @Override // L0.b
    public final void b(ArrayList arrayList) {
        this.f1339p.execute(new f(this, 0));
    }

    public final void c() {
        synchronized (this.f1337n) {
            try {
                this.f1336m.Z();
                this.f1335l.f1353i.a(this.f1334i);
                PowerManager.WakeLock wakeLock = this.f1341r;
                if (wakeLock != null && wakeLock.isHeld()) {
                    s.d().a(f1331u, "Releasing wakelock " + this.f1341r + "for WorkSpec " + this.f1334i);
                    this.f1341r.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L0.b
    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC1053a.x((p) it.next()).equals(this.f1334i)) {
                this.f1339p.execute(new f(this, 1));
                return;
            }
        }
    }

    public final void e() {
        String str = this.f1334i.f2204a;
        StringBuilder l7 = C4.p.l(str, " (");
        l7.append(this.f1333e);
        l7.append(")");
        this.f1341r = Q0.o.a(this.f1332d, l7.toString());
        s d7 = s.d();
        String str2 = "Acquiring wakelock " + this.f1341r + "for WorkSpec " + str;
        String str3 = f1331u;
        d7.a(str3, str2);
        this.f1341r.acquire();
        p g7 = this.f1335l.f1355m.f920c.t().g(str);
        if (g7 == null) {
            this.f1339p.execute(new f(this, 0));
            return;
        }
        boolean b7 = g7.b();
        this.f1342s = b7;
        if (b7) {
            this.f1336m.Y(Collections.singletonList(g7));
            return;
        }
        s.d().a(str3, "No constraints for " + str);
        d(Collections.singletonList(g7));
    }

    public final void f(boolean z7) {
        s d7 = s.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        P0.j jVar = this.f1334i;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z7);
        d7.a(f1331u, sb.toString());
        c();
        int i2 = this.f1333e;
        j jVar2 = this.f1335l;
        o oVar = this.f1340q;
        Context context = this.f1332d;
        if (z7) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, jVar);
            oVar.execute(new i(i2, 0, jVar2, intent));
        }
        if (this.f1342s) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            oVar.execute(new i(i2, 0, jVar2, intent2));
        }
    }
}
