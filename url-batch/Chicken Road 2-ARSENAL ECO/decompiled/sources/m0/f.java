package m0;

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
import l0.C0488b;
import t0.C0650b;
import t0.InterfaceC0649a;
import u.AbstractC0669d;
import u0.C0680j;
import u0.C0686p;
import w0.C0709a;

/* loaded from: classes.dex */
public final class f implements c, InterfaceC0649a {

    /* renamed from: r, reason: collision with root package name */
    public static final String f5342r = l0.q.f("Processor");

    /* renamed from: g, reason: collision with root package name */
    public final Context f5344g;

    /* renamed from: h, reason: collision with root package name */
    public final C0488b f5345h;

    /* renamed from: i, reason: collision with root package name */
    public final B0.c f5346i;

    /* renamed from: j, reason: collision with root package name */
    public final WorkDatabase f5347j;

    /* renamed from: n, reason: collision with root package name */
    public final List f5351n;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f5349l = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f5348k = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f5352o = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f5353p = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public PowerManager.WakeLock f5343f = null;

    /* renamed from: q, reason: collision with root package name */
    public final Object f5354q = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f5350m = new HashMap();

    public f(Context context, C0488b c0488b, B0.c cVar, WorkDatabase workDatabase, List list) {
        this.f5344g = context;
        this.f5345h = c0488b;
        this.f5346i = cVar;
        this.f5347j = workDatabase;
        this.f5351n = list;
    }

    public static boolean b(String str, q qVar) {
        if (qVar == null) {
            l0.q.d().a(f5342r, "WorkerWrapper could not be found for " + str);
            return false;
        }
        qVar.f5410w = true;
        qVar.h();
        qVar.f5409v.cancel(true);
        if (qVar.f5398k == null || !(qVar.f5409v.f6173f instanceof C0709a)) {
            l0.q.d().a(q.f5392x, "WorkSpec " + qVar.f5397j + " is already done. Not interrupting.");
        } else {
            qVar.f5398k.stop();
        }
        l0.q.d().a(f5342r, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f5354q) {
            this.f5353p.add(cVar);
        }
    }

    public final boolean c(String str) {
        boolean z5;
        synchronized (this.f5354q) {
            try {
                z5 = this.f5349l.containsKey(str) || this.f5348k.containsKey(str);
            } finally {
            }
        }
        return z5;
    }

    public final void d(c cVar) {
        synchronized (this.f5354q) {
            this.f5353p.remove(cVar);
        }
    }

    public final void e(C0680j c0680j) {
        ((D0.q) this.f5346i.f71g).execute(new G4.c(this, 5, c0680j));
    }

    @Override // m0.c
    public final void f(C0680j c0680j, boolean z5) {
        synchronized (this.f5354q) {
            try {
                q qVar = (q) this.f5349l.get(c0680j.f5985a);
                if (qVar != null && c0680j.equals(i6.g.n(qVar.f5397j))) {
                    this.f5349l.remove(c0680j.f5985a);
                }
                l0.q.d().a(f5342r, f.class.getSimpleName() + " " + c0680j.f5985a + " executed; reschedule = " + z5);
                ArrayList arrayList = this.f5353p;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((c) obj).f(c0680j, z5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str, l0.i iVar) {
        synchronized (this.f5354q) {
            try {
                l0.q.d().e(f5342r, "Moving WorkSpec (" + str + ") to the foreground");
                q qVar = (q) this.f5349l.remove(str);
                if (qVar != null) {
                    if (this.f5343f == null) {
                        PowerManager.WakeLock a7 = v0.m.a(this.f5344g, "ProcessorForegroundLck");
                        this.f5343f = a7;
                        a7.acquire();
                    }
                    this.f5348k.put(str, qVar);
                    Intent b7 = C0650b.b(this.f5344g, i6.g.n(qVar.f5397j), iVar);
                    Context context = this.f5344g;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC0669d.b(context, b7);
                    } else {
                        context.startService(b7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(j jVar, B0.c cVar) {
        Throwable th;
        C0680j c0680j = jVar.f5358a;
        String str = c0680j.f5985a;
        ArrayList arrayList = new ArrayList();
        C0686p c0686p = (C0686p) this.f5347j.n(new e(this, arrayList, str, 0));
        if (c0686p == null) {
            l0.q.d().g(f5342r, "Didn't find WorkSpec for id " + c0680j);
            e(c0680j);
            return false;
        }
        synchronized (this.f5354q) {
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
                    Set set = (Set) this.f5350m.get(str);
                    if (((j) set.iterator().next()).f5358a.f5986b == c0680j.f5986b) {
                        set.add(jVar);
                        l0.q.d().a(f5342r, "Work " + c0680j + " is already enqueued for processing");
                    } else {
                        e(c0680j);
                    }
                    return false;
                }
                if (c0686p.f6019t != c0680j.f5986b) {
                    e(c0680j);
                    return false;
                }
                p pVar = new p(this.f5344g, this.f5345h, this.f5346i, this, this.f5347j, c0686p, arrayList);
                pVar.f5389g = this.f5351n;
                if (cVar != null) {
                    pVar.f5391i = cVar;
                }
                q qVar = new q(pVar);
                w0.j jVar2 = qVar.f5408u;
                jVar2.a(new A.n(this, jVar.f5358a, jVar2, 8), (D0.q) this.f5346i.f71g);
                this.f5349l.put(str, qVar);
                HashSet hashSet = new HashSet();
                hashSet.add(jVar);
                this.f5350m.put(str, hashSet);
                ((v0.k) this.f5346i.f72h).execute(qVar);
                l0.q.d().a(f5342r, f.class.getSimpleName() + ": processing " + c0680j);
                return true;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f5354q) {
            try {
                if (this.f5348k.isEmpty()) {
                    Context context = this.f5344g;
                    String str = C0650b.f5944o;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f5344g.startService(intent);
                    } catch (Throwable th) {
                        l0.q.d().c(f5342r, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f5343f;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f5343f = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
