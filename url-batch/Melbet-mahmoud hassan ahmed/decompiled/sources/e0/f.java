package e0;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import l0.p;
import l0.q;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15777a = d0.j.f("Schedulers");

    static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            g0.b bVar = new g0.b(context, iVar);
            m0.d.a(context, SystemJobService.class, true);
            d0.j.c().a(f15777a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c7 = c(context);
        if (c7 != null) {
            return c7;
        }
        androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
        m0.d.a(context, SystemAlarmService.class, true);
        d0.j.c().a(f15777a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q B = workDatabase.B();
        workDatabase.c();
        try {
            List<p> k7 = B.k(aVar.h());
            List<p> s7 = B.s(200);
            if (k7 != null && k7.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<p> it = k7.iterator();
                while (it.hasNext()) {
                    B.d(it.next().f18477a, currentTimeMillis);
                }
            }
            workDatabase.r();
            if (k7 != null && k7.size() > 0) {
                p[] pVarArr = (p[]) k7.toArray(new p[k7.size()]);
                for (e eVar : list) {
                    if (eVar.f()) {
                        eVar.d(pVarArr);
                    }
                }
            }
            if (s7 == null || s7.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) s7.toArray(new p[s7.size()]);
            for (e eVar2 : list) {
                if (!eVar2.f()) {
                    eVar2.d(pVarArr2);
                }
            }
        } finally {
            workDatabase.g();
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            d0.j.c().a(f15777a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            d0.j.c().a(f15777a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
