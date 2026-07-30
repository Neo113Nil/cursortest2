package J0;

import G0.s;
import G0.t;
import K1.o;
import P0.p;
import Q0.n;
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
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class c implements H0.c {

    /* renamed from: m, reason: collision with root package name */
    public static final String f1320m = s.f("CommandHandler");

    /* renamed from: d, reason: collision with root package name */
    public final Context f1321d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1322e = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final Object f1323i = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final P0.e f1324l;

    public c(Context context, P0.e eVar) {
        this.f1321d = context;
        this.f1324l = eVar;
    }

    public static P0.j b(Intent intent) {
        return new P0.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, P0.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2204a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f2205b);
    }

    public final void a(Intent intent, int i2, j jVar) {
        List<H0.j> list;
        String action = intent.getAction();
        int i5 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s.d().a(f1320m, "Handling constraints changed " + intent);
            Context context = this.f1321d;
            e eVar = new e(context, i2, jVar);
            D0.j jVar2 = eVar.f1328b;
            ArrayList d7 = jVar.f1355m.f920c.t().d();
            String str = d.f1325a;
            int size = d7.size();
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            int i7 = 0;
            while (i7 < size) {
                Object obj = d7.get(i7);
                i7++;
                G0.e eVar2 = ((p) obj).j;
                z7 |= eVar2.f797d;
                z8 |= eVar2.f795b;
                z9 |= eVar2.f798e;
                z10 |= eVar2.f794a != t.f825d;
                if (z7 && z8 && z9 && z10) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f4107a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z8).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z10);
            context.sendBroadcast(intent2);
            jVar2.Y(d7);
            ArrayList arrayList = new ArrayList(d7.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = d7.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = d7.get(i8);
                i8++;
                p pVar = (p) obj2;
                String str3 = pVar.f2220a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || jVar2.x(str3))) {
                    arrayList.add(pVar);
                }
            }
            int size3 = arrayList.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList.get(i9);
                i9++;
                p pVar2 = (p) obj3;
                String str4 = pVar2.f2220a;
                P0.j x7 = AbstractC1053a.x(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, x7);
                s.d().a(e.f1326c, "Creating a delay_met command for workSpec with id (" + str4 + ")");
                ((o) ((D0.j) jVar.f1352e).f332l).execute(new i(eVar.f1327a, i5, jVar, intent3));
            }
            jVar2.Z();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            s.d().a(f1320m, "Handling reschedule " + intent + ", " + i2);
            jVar.f1355m.d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            s.d().b(f1320m, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f1321d;
            P0.j b7 = b(intent);
            s d8 = s.d();
            String str5 = f1320m;
            d8.a(str5, "Handling schedule work for " + b7);
            WorkDatabase workDatabase = jVar.f1355m.f920c;
            workDatabase.c();
            try {
                p g7 = workDatabase.t().g(b7.f2204a);
                if (g7 == null) {
                    s.d().g(str5, "Skipping scheduling " + b7 + " because it's no longer in the DB");
                    return;
                }
                if (g7.f2221b.a()) {
                    s.d().g(str5, "Skipping scheduling " + b7 + "because it is finished.");
                    return;
                }
                long a7 = g7.a();
                if (g7.b()) {
                    s.d().a(str5, "Opportunistically setting an alarm for " + b7 + "at " + a7);
                    b.b(context2, workDatabase, b7, a7);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((o) ((D0.j) jVar.f1352e).f332l).execute(new i(i2, i5, jVar, intent4));
                } else {
                    s.d().a(str5, "Setting up Alarms for " + b7 + "at " + a7);
                    b.b(context2, workDatabase, b7, a7);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f1323i) {
                try {
                    P0.j b8 = b(intent);
                    s d9 = s.d();
                    String str6 = f1320m;
                    d9.a(str6, "Handing delay met for " + b8);
                    if (this.f1322e.containsKey(b8)) {
                        s.d().a(str6, "WorkSpec " + b8 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f1321d, i2, jVar, this.f1324l.x(b8));
                        this.f1322e.put(b8, gVar);
                        gVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                s.d().g(f1320m, "Ignoring intent " + intent);
                return;
            }
            P0.j b9 = b(intent);
            boolean z11 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            s.d().a(f1320m, "Handling onExecutionCompleted " + intent + ", " + i2);
            c(b9, z11);
            return;
        }
        P0.e eVar3 = this.f1324l;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            H0.j v7 = eVar3.v(new P0.j(string, i10));
            list = arrayList2;
            if (v7 != null) {
                arrayList2.add(v7);
                list = arrayList2;
            }
        } else {
            list = eVar3.w(string);
        }
        for (H0.j jVar3 : list) {
            s.d().a(f1320m, "Handing stopWork work for " + string);
            H0.p pVar3 = jVar.f1355m;
            pVar3.f921d.r(new n(pVar3, jVar3, false));
            Context context3 = this.f1321d;
            WorkDatabase workDatabase2 = jVar.f1355m.f920c;
            P0.j id = jVar3.f902a;
            String str7 = b.f1319a;
            P0.i p7 = workDatabase2.p();
            P0.g h7 = p7.h(id);
            if (h7 != null) {
                b.a(context3, id, h7.f2198c);
                s.d().a(b.f1319a, "Removing SystemIdInfo for workSpecId (" + id + ")");
                Intrinsics.checkNotNullParameter(id, "id");
                String str8 = id.f2204a;
                int i11 = id.f2205b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p7.f2200a;
                workDatabase_Impl.b();
                P0.h hVar = (P0.h) p7.f2202c;
                m0.j a8 = hVar.a();
                if (str8 == null) {
                    a8.l(1);
                } else {
                    a8.f(1, str8);
                }
                a8.r(i11, 2);
                workDatabase_Impl.c();
                try {
                    a8.a();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    hVar.d(a8);
                }
            }
            jVar.c(jVar3.f902a, false);
        }
    }

    @Override // H0.c
    public final void c(P0.j jVar, boolean z7) {
        synchronized (this.f1323i) {
            try {
                g gVar = (g) this.f1322e.remove(jVar);
                this.f1324l.v(jVar);
                if (gVar != null) {
                    gVar.f(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
