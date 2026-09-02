package o0;

import W4.o;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k.RunnableC0460t;
import l0.q;
import m0.j;
import u0.C0673c;
import u0.C0677g;
import u0.C0678h;
import u0.C0679i;
import u0.C0680j;
import u0.C0686p;
import v0.l;

/* loaded from: classes.dex */
public final class c implements m0.c {

    /* renamed from: j, reason: collision with root package name */
    public static final String f5568j = q.f("CommandHandler");

    /* renamed from: f, reason: collision with root package name */
    public final Context f5569f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f5570g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Object f5571h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final C0673c f5572i;

    public c(Context context, C0673c c0673c) {
        this.f5569f = context;
        this.f5572i = c0673c;
    }

    public static C0680j b(Intent intent) {
        return new C0680j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, C0680j c0680j) {
        intent.putExtra("KEY_WORKSPEC_ID", c0680j.f5985a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c0680j.f5986b);
    }

    public final void a(Intent intent, int i7, i iVar) {
        List<j> list;
        String action = intent.getAction();
        int i8 = 1;
        int i9 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            q.d().a(f5568j, "Handling constraints changed " + intent);
            Context context = this.f5569f;
            e eVar = new e(context, i7, iVar);
            B0.c cVar = eVar.f5576b;
            ArrayList d7 = iVar.f5599j.f5375c.t().d();
            String str = d.f5573a;
            int size = d7.size();
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = d7.get(i10);
                i10++;
                l0.d dVar = ((C0686p) obj).f6009j;
                z5 |= dVar.f5258d;
                z6 |= dVar.f5256b;
                z7 |= dVar.f5259e;
                z8 |= dVar.f5255a != 1;
                if (z5 && z6 && z7 && z8) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f3578a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z6).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z8);
            context.sendBroadcast(intent2);
            cVar.w(d7);
            ArrayList arrayList = new ArrayList(d7.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = d7.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = d7.get(i11);
                i11++;
                C0686p c0686p = (C0686p) obj2;
                String str3 = c0686p.f6000a;
                if (currentTimeMillis >= c0686p.a() && (!c0686p.b() || cVar.d(str3))) {
                    arrayList.add(c0686p);
                }
            }
            int size3 = arrayList.size();
            while (i9 < size3) {
                Object obj3 = arrayList.get(i9);
                i9++;
                C0686p c0686p2 = (C0686p) obj3;
                String str4 = c0686p2.f6000a;
                C0680j n7 = i6.g.n(c0686p2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, n7);
                q.d().a(e.f5574c, "Creating a delay_met command for workSpec with id (" + str4 + ")");
                ((D0.q) ((B0.c) iVar.f5596g).f71g).execute(new RunnableC0460t(iVar, intent3, eVar.f5575a, i8));
            }
            cVar.x();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            q.d().a(f5568j, "Handling reschedule " + intent + ", " + i7);
            iVar.f5599j.d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            q.d().b(f5568j, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f5569f;
            C0680j b7 = b(intent);
            q d8 = q.d();
            String str5 = f5568j;
            d8.a(str5, "Handling schedule work for " + b7);
            WorkDatabase workDatabase = iVar.f5599j.f5375c;
            workDatabase.c();
            try {
                C0686p g7 = workDatabase.t().g(b7.f5985a);
                if (g7 == null) {
                    q.d().g(str5, "Skipping scheduling " + b7 + " because it's no longer in the DB");
                    return;
                }
                if (o.a(g7.f6001b)) {
                    q.d().g(str5, "Skipping scheduling " + b7 + "because it is finished.");
                    return;
                }
                long a7 = g7.a();
                if (g7.b()) {
                    q.d().a(str5, "Opportunistically setting an alarm for " + b7 + "at " + a7);
                    b.b(context2, workDatabase, b7, a7);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((D0.q) ((B0.c) iVar.f5596g).f71g).execute(new RunnableC0460t(iVar, intent4, i7, i8));
                } else {
                    q.d().a(str5, "Setting up Alarms for " + b7 + "at " + a7);
                    b.b(context2, workDatabase, b7, a7);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f5571h) {
                try {
                    C0680j b8 = b(intent);
                    q d9 = q.d();
                    String str6 = f5568j;
                    d9.a(str6, "Handing delay met for " + b8);
                    if (this.f5570g.containsKey(b8)) {
                        q.d().a(str6, "WorkSpec " + b8 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f5569f, i7, iVar, this.f5572i.l(b8));
                        this.f5570g.put(b8, gVar);
                        gVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                q.d().g(f5568j, "Ignoring intent " + intent);
                return;
            }
            C0680j b9 = b(intent);
            boolean z9 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            q.d().a(f5568j, "Handling onExecutionCompleted " + intent + ", " + i7);
            f(b9, z9);
            return;
        }
        C0673c c0673c = this.f5572i;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i12 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            j k4 = c0673c.k(new C0680j(string, i12));
            list = arrayList2;
            if (k4 != null) {
                arrayList2.add(k4);
                list = arrayList2;
            }
        } else {
            list = c0673c.j(string);
        }
        for (j jVar : list) {
            q.d().a(f5568j, "Handing stopWork work for " + string);
            m0.o oVar = iVar.f5599j;
            oVar.f5376d.a(new l(oVar, jVar, false));
            Context context3 = this.f5569f;
            WorkDatabase workDatabase2 = iVar.f5599j.f5375c;
            C0680j c0680j = jVar.f5358a;
            String str7 = b.f5567a;
            C0679i p4 = workDatabase2.p();
            C0677g b10 = p4.b(c0680j);
            if (b10 != null) {
                b.a(context3, c0680j, b10.f5979c);
                q.d().a(b.f5567a, "Removing SystemIdInfo for workSpecId (" + c0680j + ")");
                String str8 = c0680j.f5985a;
                int i13 = c0680j.f5986b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p4.f5981f;
                workDatabase_Impl.b();
                C0678h c0678h = (C0678h) p4.f5983h;
                V.i a8 = c0678h.a();
                if (str8 == null) {
                    a8.o(1);
                } else {
                    a8.B(str8, 1);
                }
                a8.t(i13, 2);
                workDatabase_Impl.c();
                try {
                    a8.a();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    c0678h.n(a8);
                }
            }
            iVar.f(jVar.f5358a, false);
        }
    }

    @Override // m0.c
    public final void f(C0680j c0680j, boolean z5) {
        synchronized (this.f5571h) {
            try {
                g gVar = (g) this.f5570g.remove(c0680j);
                this.f5572i.k(c0680j);
                if (gVar != null) {
                    gVar.f(z5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
