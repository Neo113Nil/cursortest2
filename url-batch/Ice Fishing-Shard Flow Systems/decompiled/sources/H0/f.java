package H0;

import G0.C0103c;
import G0.s;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class f implements c, O0.a {

    /* renamed from: u, reason: collision with root package name */
    public static final String f886u = s.f("Processor");

    /* renamed from: e, reason: collision with root package name */
    public final Context f888e;

    /* renamed from: i, reason: collision with root package name */
    public final C0103c f889i;

    /* renamed from: l, reason: collision with root package name */
    public final D0.j f890l;

    /* renamed from: m, reason: collision with root package name */
    public final WorkDatabase f891m;

    /* renamed from: q, reason: collision with root package name */
    public final List f895q;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f893o = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f892n = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f896r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f897s = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public PowerManager.WakeLock f887d = null;

    /* renamed from: t, reason: collision with root package name */
    public final Object f898t = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f894p = new HashMap();

    public f(Context context, C0103c c0103c, D0.j jVar, WorkDatabase workDatabase, List list) {
        this.f888e = context;
        this.f889i = c0103c;
        this.f890l = jVar;
        this.f891m = workDatabase;
        this.f895q = list;
    }

    public static boolean b(String str, r rVar) {
        if (rVar == null) {
            s.d().a(f886u, "WorkerWrapper could not be found for " + str);
            return false;
        }
        rVar.f954z = true;
        rVar.h();
        rVar.f953y.cancel(true);
        if (rVar.f942n == null || !(rVar.f953y.f2395d instanceof R0.a)) {
            s.d().a(r.f936A, "WorkSpec " + rVar.f941m + " is already done. Not interrupting.");
        } else {
            rVar.f942n.stop();
        }
        s.d().a(f886u, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f898t) {
            this.f897s.add(cVar);
        }
    }

    @Override // H0.c
    public final void c(P0.j jVar, boolean z7) {
        synchronized (this.f898t) {
            try {
                r rVar = (r) this.f893o.get(jVar.f2204a);
                if (rVar != null && jVar.equals(AbstractC1053a.x(rVar.f941m))) {
                    this.f893o.remove(jVar.f2204a);
                }
                s.d().a(f886u, f.class.getSimpleName() + " " + jVar.f2204a + " executed; reschedule = " + z7);
                ArrayList arrayList = this.f897s;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c) obj).c(jVar, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z7;
        synchronized (this.f898t) {
            try {
                z7 = this.f893o.containsKey(str) || this.f892n.containsKey(str);
            } finally {
            }
        }
        return z7;
    }

    public final void e(c cVar) {
        synchronized (this.f898t) {
            this.f897s.remove(cVar);
        }
    }

    public final void f(P0.j jVar) {
        ((K1.o) this.f890l.f332l).execute(new A.j(this, 3, jVar));
    }

    public final void g(String str, G0.j jVar) {
        synchronized (this.f898t) {
            try {
                s.d().e(f886u, "Moving WorkSpec (" + str + ") to the foreground");
                r rVar = (r) this.f893o.remove(str);
                if (rVar != null) {
                    if (this.f887d == null) {
                        PowerManager.WakeLock a7 = Q0.o.a(this.f888e, "ProcessorForegroundLck");
                        this.f887d = a7;
                        a7.acquire();
                    }
                    this.f892n.put(str, rVar);
                    Intent e7 = O0.b.e(this.f888e, AbstractC1053a.x(rVar.f941m), jVar);
                    Context context = this.f888e;
                    if (Build.VERSION.SDK_INT >= 26) {
                        C.a.s(context, e7);
                    } else {
                        context.startService(e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(j jVar, D0.j jVar2) {
        Throwable th;
        P0.j jVar3 = jVar.f902a;
        String str = jVar3.f2204a;
        ArrayList arrayList = new ArrayList();
        P0.p pVar = (P0.p) this.f891m.n(new e(this, arrayList, str, 0));
        if (pVar == null) {
            s.d().g(f886u, "Didn't find WorkSpec for id " + jVar3);
            f(jVar3);
            return false;
        }
        synchronized (this.f898t) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                if (d(str)) {
                    Set set = (Set) this.f894p.get(str);
                    if (((j) set.iterator().next()).f902a.f2205b == jVar3.f2205b) {
                        set.add(jVar);
                        s.d().a(f886u, "Work " + jVar3 + " is already enqueued for processing");
                    } else {
                        f(jVar3);
                    }
                    return false;
                }
                if (pVar.f2238t != jVar3.f2205b) {
                    f(jVar3);
                    return false;
                }
                q qVar = new q(this.f888e, this.f889i, this.f890l, this, this.f891m, pVar, arrayList);
                qVar.f933g = this.f895q;
                if (jVar2 != null) {
                    qVar.f935i = jVar2;
                }
                r rVar = new r(qVar);
                R0.k kVar = rVar.f952x;
                kVar.a(new F.n(this, jVar.f902a, kVar, 1), (K1.o) this.f890l.f332l);
                this.f893o.put(str, rVar);
                HashSet hashSet = new HashSet();
                hashSet.add(jVar);
                this.f894p.put(str, hashSet);
                ((Q0.m) this.f890l.f330e).execute(rVar);
                s.d().a(f886u, f.class.getSimpleName() + ": processing " + jVar3);
                return true;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f898t) {
            try {
                if (this.f892n.isEmpty()) {
                    Context context = this.f888e;
                    String str = O0.b.f1903r;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f888e.startService(intent);
                    } catch (Throwable th) {
                        s.d().c(f886u, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f887d;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f887d = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
