package u5;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import c6.p;
import com.google.android.gms.internal.measurement.cf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements c {
    public static final String A = t5.o.f("Processor");

    /* renamed from: e, reason: collision with root package name */
    public final Context f9622e;

    /* renamed from: i, reason: collision with root package name */
    public final t5.b f9623i;

    /* renamed from: r, reason: collision with root package name */
    public final a1.n f9624r;

    /* renamed from: s, reason: collision with root package name */
    public final WorkDatabase f9625s;

    /* renamed from: w, reason: collision with root package name */
    public final List f9629w;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f9627u = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f9626t = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f9630x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f9631y = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public PowerManager.WakeLock f9621d = null;

    /* renamed from: z, reason: collision with root package name */
    public final Object f9632z = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f9628v = new HashMap();

    public e(Context context, t5.b bVar, a1.n nVar, WorkDatabase workDatabase, List list) {
        this.f9622e = context;
        this.f9623i = bVar;
        this.f9624r = nVar;
        this.f9625s = workDatabase;
        this.f9629w = list;
    }

    public static boolean b(String str, o oVar) {
        if (oVar == null) {
            t5.o.d().a(A, "WorkerWrapper could not be found for " + str);
            return false;
        }
        oVar.F = true;
        oVar.h();
        oVar.E.cancel(true);
        if (oVar.f9665t == null || !(oVar.E.f3948d instanceof e6.a)) {
            t5.o.d().a(o.G, "WorkSpec " + oVar.f9664s + " is already done. Not interrupting.");
        } else {
            oVar.f9665t.stop();
        }
        t5.o.d().a(A, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f9632z) {
            this.f9631y.add(cVar);
        }
    }

    public final boolean c(String str) {
        boolean z10;
        synchronized (this.f9632z) {
            try {
                z10 = this.f9627u.containsKey(str) || this.f9626t.containsKey(str);
            } finally {
            }
        }
        return z10;
    }

    public final void d(c cVar) {
        synchronized (this.f9632z) {
            this.f9631y.remove(cVar);
        }
    }

    public final void e(c6.j jVar) {
        ((f6.b) this.f9624r.f42r).execute(new a6.f(18, this, jVar));
    }

    @Override // u5.c
    public final void f(c6.j jVar, boolean z10) {
        synchronized (this.f9632z) {
            try {
                o oVar = (o) this.f9627u.get(jVar.f1824a);
                if (oVar != null && jVar.equals(g8.b.A(oVar.f9664s))) {
                    this.f9627u.remove(jVar.f1824a);
                }
                t5.o.d().a(A, e.class.getSimpleName() + " " + jVar.f1824a + " executed; reschedule = " + z10);
                ArrayList arrayList = this.f9631y;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((c) obj).f(jVar, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str, t5.g gVar) {
        synchronized (this.f9632z) {
            try {
                t5.o.d().e(A, "Moving WorkSpec (" + str + ") to the foreground");
                o oVar = (o) this.f9627u.remove(str);
                if (oVar != null) {
                    if (this.f9621d == null) {
                        PowerManager.WakeLock a9 = d6.o.a(this.f9622e, "ProcessorForegroundLck");
                        this.f9621d = a9;
                        a9.acquire();
                    }
                    this.f9626t.put(str, oVar);
                    Intent d10 = b6.a.d(this.f9622e, g8.b.A(oVar.f9664s), gVar);
                    Context context = this.f9622e;
                    if (Build.VERSION.SDK_INT >= 26) {
                        e3.j.t(context, d10);
                    } else {
                        context.startService(d10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(i iVar, p.e eVar) {
        Throwable th;
        c6.j jVar = iVar.f9636a;
        String str = jVar.f1824a;
        ArrayList arrayList = new ArrayList();
        p pVar = (p) this.f9625s.t(new m8.f(this, arrayList, str, 1));
        if (pVar == null) {
            t5.o.d().g(A, "Didn't find WorkSpec for id " + jVar);
            e(jVar);
            return false;
        }
        synchronized (this.f9632z) {
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
                if (c(str)) {
                    Set set = (Set) this.f9628v.get(str);
                    if (((i) set.iterator().next()).f9636a.f1825b == jVar.f1825b) {
                        set.add(iVar);
                        t5.o.d().a(A, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        e(jVar);
                    }
                    return false;
                }
                if (pVar.f1856t != jVar.f1825b) {
                    e(jVar);
                    return false;
                }
                q6.i iVar2 = new q6.i(this.f9622e, this.f9623i, this.f9624r, this, this.f9625s, pVar, arrayList);
                iVar2.g = this.f9629w;
                if (eVar != null) {
                    iVar2.f8058i = eVar;
                }
                o oVar = new o(iVar2);
                e6.j jVar2 = oVar.D;
                jVar2.a(new cf(this, iVar.f9636a, jVar2, 13), (f6.b) this.f9624r.f42r);
                this.f9627u.put(str, oVar);
                HashSet hashSet = new HashSet();
                hashSet.add(iVar);
                this.f9628v.put(str, hashSet);
                ((d6.l) this.f9624r.f41i).execute(oVar);
                t5.o.d().a(A, e.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f9632z) {
            try {
                if (this.f9626t.isEmpty()) {
                    Context context = this.f9622e;
                    String str = b6.a.f1215x;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f9622e.startService(intent);
                    } catch (Throwable th) {
                        t5.o.d().c(A, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f9621d;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f9621d = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
