package t0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s0.C1414b;
import s0.s;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class f implements InterfaceC1425d {

    /* renamed from: m, reason: collision with root package name */
    public static final String f11851m = s.f("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f11853b;

    /* renamed from: c, reason: collision with root package name */
    public final C1414b f11854c;

    /* renamed from: d, reason: collision with root package name */
    public final B4.i f11855d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f11856e;

    /* renamed from: i, reason: collision with root package name */
    public final List f11860i;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f11858g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f11857f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f11861j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f11862k = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f11852a = null;

    /* renamed from: l, reason: collision with root package name */
    public final Object f11863l = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f11859h = new HashMap();

    public f(Context context, C1414b c1414b, B4.i iVar, WorkDatabase workDatabase, List list) {
        this.f11853b = context;
        this.f11854c = c1414b;
        this.f11855d = iVar;
        this.f11856e = workDatabase;
        this.f11860i = list;
    }

    public static boolean b(String str, q qVar) {
        if (qVar == null) {
            s.d().a(f11851m, "WorkerWrapper could not be found for " + str);
            return false;
        }
        qVar.f11919r = true;
        qVar.h();
        qVar.f11918q.cancel(true);
        if (qVar.f11907f == null || !(qVar.f11918q.f428a instanceof D0.a)) {
            s.d().a(q.f11901s, "WorkSpec " + qVar.f11906e + " is already done. Not interrupting.");
        } else {
            qVar.f11907f.stop();
        }
        s.d().a(f11851m, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(InterfaceC1425d interfaceC1425d) {
        synchronized (this.f11863l) {
            this.f11862k.add(interfaceC1425d);
        }
    }

    public final boolean c(String str) {
        boolean z;
        synchronized (this.f11863l) {
            try {
                z = this.f11858g.containsKey(str) || this.f11857f.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    @Override // t0.InterfaceC1425d
    public final void d(B0.j jVar, boolean z) {
        synchronized (this.f11863l) {
            try {
                q qVar = (q) this.f11858g.get(jVar.f157a);
                if (qVar != null && jVar.equals(AbstractC1477a.p(qVar.f11906e))) {
                    this.f11858g.remove(jVar.f157a);
                }
                s.d().a(f11851m, f.class.getSimpleName() + " " + jVar.f157a + " executed; reschedule = " + z);
                Iterator it = this.f11862k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1425d) it.next()).d(jVar, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(InterfaceC1425d interfaceC1425d) {
        synchronized (this.f11863l) {
            this.f11862k.remove(interfaceC1425d);
        }
    }

    public final void f(B0.j jVar) {
        B4.i iVar = this.f11855d;
        ((A.c) iVar.f313d).execute(new B3.c(this, 24, jVar));
    }

    public final void g(String str, s0.i iVar) {
        synchronized (this.f11863l) {
            try {
                s.d().e(f11851m, "Moving WorkSpec (" + str + ") to the foreground");
                q qVar = (q) this.f11858g.remove(str);
                if (qVar != null) {
                    if (this.f11852a == null) {
                        PowerManager.WakeLock a6 = C0.q.a(this.f11853b, "ProcessorForegroundLck");
                        this.f11852a = a6;
                        a6.acquire();
                    }
                    this.f11857f.put(str, qVar);
                    Intent e3 = A0.b.e(this.f11853b, AbstractC1477a.p(qVar.f11906e), iVar);
                    Context context = this.f11853b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        v.d.b(context, e3);
                    } else {
                        context.startService(e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(j jVar, B4.i iVar) {
        B0.j jVar2 = jVar.f11867a;
        String str = jVar2.f157a;
        ArrayList arrayList = new ArrayList();
        B0.q qVar = (B0.q) this.f11856e.n(new O1.f(this, arrayList, str, 1));
        if (qVar == null) {
            s.d().g(f11851m, "Didn't find WorkSpec for id " + jVar2);
            f(jVar2);
            return false;
        }
        synchronized (this.f11863l) {
            try {
                if (c(str)) {
                    Set set = (Set) this.f11859h.get(str);
                    if (((j) set.iterator().next()).f11867a.f158b == jVar2.f158b) {
                        set.add(jVar);
                        s.d().a(f11851m, "Work " + jVar2 + " is already enqueued for processing");
                    } else {
                        f(jVar2);
                    }
                    return false;
                }
                if (qVar.f192t != jVar2.f158b) {
                    f(jVar2);
                    return false;
                }
                p pVar = new p(this.f11853b, this.f11854c, this.f11855d, this, this.f11856e, qVar, arrayList);
                pVar.f11898g = this.f11860i;
                if (iVar != null) {
                    pVar.f11900i = iVar;
                }
                q qVar2 = new q(pVar);
                D0.k kVar = qVar2.f11917p;
                kVar.a(new B.l(this, jVar.f11867a, kVar, 6), (A.c) this.f11855d.f313d);
                this.f11858g.put(str, qVar2);
                HashSet hashSet = new HashSet();
                hashSet.add(jVar);
                this.f11859h.put(str, hashSet);
                ((C0.n) this.f11855d.f311b).execute(qVar2);
                s.d().a(f11851m, f.class.getSimpleName() + ": processing " + jVar2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f11863l) {
            try {
                if (this.f11857f.isEmpty()) {
                    Context context = this.f11853b;
                    String str = A0.b.f6j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f11853b.startService(intent);
                    } catch (Throwable th) {
                        s.d().c(f11851m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f11852a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f11852a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
