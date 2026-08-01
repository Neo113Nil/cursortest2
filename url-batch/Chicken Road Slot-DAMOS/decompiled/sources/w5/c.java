package w5;

import a1.n;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c6.j;
import c6.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k5.k;
import n0.l;
import t5.o;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements u5.c {

    /* renamed from: s, reason: collision with root package name */
    public static final String f10082s = o.f("CommandHandler");

    /* renamed from: d, reason: collision with root package name */
    public final Context f10083d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f10084e = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final Object f10085i = new Object();

    /* renamed from: r, reason: collision with root package name */
    public final c6.e f10086r;

    public c(Context context, c6.e eVar) {
        this.f10083d = context;
        this.f10086r = eVar;
    }

    public static j b(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f1824a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f1825b);
    }

    public final void a(Intent intent, int i3, i iVar) {
        List<u5.i> list;
        int i10;
        String action = intent.getAction();
        int i11 = 2;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o.d().a(f10082s, "Handling constraints changed " + intent);
            Context context = this.f10083d;
            e eVar = new e(context, i3, iVar);
            p.e eVar2 = eVar.f10090b;
            ArrayList h10 = iVar.f10112s.f9651c.B().h();
            String str = d.f10087a;
            int size = h10.size();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    i10 = 0;
                    break;
                }
                Object obj = h10.get(i12);
                i12++;
                t5.d dVar = ((p) obj).j;
                i10 = 0;
                z10 |= dVar.f9296d;
                z11 |= dVar.f9294b;
                z12 |= dVar.f9297e;
                z13 |= dVar.f9293a != 1;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f773a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            eVar2.g(h10);
            ArrayList arrayList = new ArrayList(h10.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = h10.size();
            int i13 = i10;
            while (i13 < size2) {
                Object obj2 = h10.get(i13);
                i13++;
                p pVar = (p) obj2;
                String str3 = pVar.f1839a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || eVar2.c(str3))) {
                    arrayList.add(pVar);
                }
            }
            int size3 = arrayList.size();
            int i14 = i10;
            while (i14 < size3) {
                Object obj3 = arrayList.get(i14);
                i14++;
                p pVar2 = (p) obj3;
                String str4 = pVar2.f1839a;
                j A = g8.b.A(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, A);
                o.d().a(e.f10088c, "Creating a delay_met command for workSpec with id (" + str4 + ")");
                ((f6.b) ((n) iVar.f10109e).f42r).execute(new b6.c(eVar.f10089a, i11, iVar, intent3));
            }
            eVar2.h();
            return;
        }
        boolean z14 = false;
        if ("ACTION_RESCHEDULE".equals(action)) {
            o.d().a(f10082s, "Handling reschedule " + intent + ", " + i3);
            iVar.f10112s.d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            o.d().b(f10082s, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f10083d;
            j b10 = b(intent);
            o d10 = o.d();
            String str5 = f10082s;
            d10.a(str5, "Handling schedule work for " + b10);
            WorkDatabase workDatabase = iVar.f10112s.f9651c;
            workDatabase.c();
            try {
                p k10 = workDatabase.B().k(b10.f1824a);
                if (k10 == null) {
                    o.d().g(str5, "Skipping scheduling " + b10 + " because it's no longer in the DB");
                    return;
                }
                if (l.a(k10.f1840b)) {
                    o.d().g(str5, "Skipping scheduling " + b10 + "because it is finished.");
                    return;
                }
                long a9 = k10.a();
                if (k10.b()) {
                    o.d().a(str5, "Opportunistically setting an alarm for " + b10 + "at " + a9);
                    b.b(context2, workDatabase, b10, a9);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((f6.b) ((n) iVar.f10109e).f42r).execute(new b6.c(i3, i11, iVar, intent4));
                } else {
                    o.d().a(str5, "Setting up Alarms for " + b10 + "at " + a9);
                    b.b(context2, workDatabase, b10, a9);
                }
                workDatabase.u();
                return;
            } finally {
                workDatabase.h();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f10085i) {
                try {
                    j b11 = b(intent);
                    o d11 = o.d();
                    String str6 = f10082s;
                    d11.a(str6, "Handing delay met for " + b11);
                    if (this.f10084e.containsKey(b11)) {
                        o.d().a(str6, "WorkSpec " + b11 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f10083d, i3, iVar, this.f10086r.r(b11));
                        this.f10084e.put(b11, gVar);
                        gVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                o.d().g(f10082s, "Ignoring intent " + intent);
                return;
            }
            j b12 = b(intent);
            boolean z15 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            o.d().a(f10082s, "Handling onExecutionCompleted " + intent + ", " + i3);
            f(b12, z15);
            return;
        }
        c6.e eVar3 = this.f10086r;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i15 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            u5.i p4 = eVar3.p(new j(string, i15));
            list = arrayList2;
            if (p4 != null) {
                arrayList2.add(p4);
                list = arrayList2;
            }
        } else {
            list = eVar3.o(string);
        }
        for (u5.i iVar2 : list) {
            o.d().a(f10082s, "Handing stopWork work for " + string);
            m mVar = iVar.f10112s;
            mVar.f9652d.a(new d6.m(mVar, iVar2, z14));
            Context context3 = this.f10083d;
            WorkDatabase workDatabase2 = iVar.f10112s.f9651c;
            j jVar = iVar2.f9636a;
            String str7 = b.f10081a;
            c6.i y3 = workDatabase2.y();
            c6.g f3 = y3.f(jVar);
            if (f3 != null) {
                b.a(context3, jVar, f3.f1818c);
                o.d().a(b.f10081a, "Removing SystemIdInfo for workSpecId (" + jVar + ")");
                String str8 = jVar.f1824a;
                int i16 = jVar.f1825b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) y3.f1820a;
                workDatabase_Impl.b();
                c6.h hVar = (c6.h) y3.f1822c;
                k a10 = hVar.a();
                if (str8 == null) {
                    a10.r(1);
                } else {
                    a10.l(1, str8);
                }
                a10.f(2, i16);
                workDatabase_Impl.c();
                try {
                    a10.a();
                    workDatabase_Impl.u();
                } finally {
                    workDatabase_Impl.h();
                    hVar.c(a10);
                }
            }
            iVar.f(iVar2.f9636a, false);
            z14 = false;
        }
    }

    @Override // u5.c
    public final void f(j jVar, boolean z10) {
        synchronized (this.f10085i) {
            try {
                g gVar = (g) this.f10084e.remove(jVar);
                this.f10086r.p(jVar);
                if (gVar != null) {
                    gVar.f(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
