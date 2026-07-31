package e0;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import e0.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class d implements b, k0.a {

    /* renamed from: q, reason: collision with root package name */
    private static final String f15762q = d0.j.f("Processor");

    /* renamed from: g, reason: collision with root package name */
    private Context f15764g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.work.a f15765h;

    /* renamed from: i, reason: collision with root package name */
    private n0.a f15766i;

    /* renamed from: j, reason: collision with root package name */
    private WorkDatabase f15767j;

    /* renamed from: m, reason: collision with root package name */
    private List<e> f15770m;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, j> f15769l = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private Map<String, j> f15768k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private Set<String> f15771n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private final List<b> f15772o = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private PowerManager.WakeLock f15763f = null;

    /* renamed from: p, reason: collision with root package name */
    private final Object f15773p = new Object();

    private static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private b f15774f;

        /* renamed from: g, reason: collision with root package name */
        private String f15775g;

        /* renamed from: h, reason: collision with root package name */
        private p4.a<Boolean> f15776h;

        a(b bVar, String str, p4.a<Boolean> aVar) {
            this.f15774f = bVar;
            this.f15775g = str;
            this.f15776h = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            try {
                z6 = this.f15776h.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z6 = true;
            }
            this.f15774f.a(this.f15775g, z6);
        }
    }

    public d(Context context, androidx.work.a aVar, n0.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.f15764g = context;
        this.f15765h = aVar;
        this.f15766i = aVar2;
        this.f15767j = workDatabase;
        this.f15770m = list;
    }

    private static boolean e(String str, j jVar) {
        if (jVar == null) {
            d0.j.c().a(f15762q, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        jVar.d();
        d0.j.c().a(f15762q, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void m() {
        synchronized (this.f15773p) {
            if (!(!this.f15768k.isEmpty())) {
                try {
                    this.f15764g.startService(androidx.work.impl.foreground.a.f(this.f15764g));
                } catch (Throwable th) {
                    d0.j.c().b(f15762q, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f15763f;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f15763f = null;
                }
            }
        }
    }

    @Override // e0.b
    public void a(String str, boolean z6) {
        synchronized (this.f15773p) {
            this.f15769l.remove(str);
            d0.j.c().a(f15762q, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z6)), new Throwable[0]);
            Iterator<b> it = this.f15772o.iterator();
            while (it.hasNext()) {
                it.next().a(str, z6);
            }
        }
    }

    @Override // k0.a
    public void b(String str, d0.e eVar) {
        synchronized (this.f15773p) {
            d0.j.c().d(f15762q, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            j remove = this.f15769l.remove(str);
            if (remove != null) {
                if (this.f15763f == null) {
                    PowerManager.WakeLock b7 = m0.j.b(this.f15764g, "ProcessorForegroundLck");
                    this.f15763f = b7;
                    b7.acquire();
                }
                this.f15768k.put(str, remove);
                androidx.core.content.a.e(this.f15764g, androidx.work.impl.foreground.a.d(this.f15764g, str, eVar));
            }
        }
    }

    @Override // k0.a
    public void c(String str) {
        synchronized (this.f15773p) {
            this.f15768k.remove(str);
            m();
        }
    }

    public void d(b bVar) {
        synchronized (this.f15773p) {
            this.f15772o.add(bVar);
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.f15773p) {
            contains = this.f15771n.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z6;
        synchronized (this.f15773p) {
            z6 = this.f15769l.containsKey(str) || this.f15768k.containsKey(str);
        }
        return z6;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.f15773p) {
            containsKey = this.f15768k.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.f15773p) {
            this.f15772o.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f15773p) {
            if (g(str)) {
                d0.j.c().a(f15762q, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j a7 = new j.c(this.f15764g, this.f15765h, this.f15766i, this, this.f15767j, str).c(this.f15770m).b(aVar).a();
            p4.a<Boolean> b7 = a7.b();
            b7.d(new a(this, str, b7), this.f15766i.a());
            this.f15769l.put(str, a7);
            this.f15766i.c().execute(a7);
            d0.j.c().a(f15762q, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e7;
        synchronized (this.f15773p) {
            boolean z6 = true;
            d0.j.c().a(f15762q, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f15771n.add(str);
            j remove = this.f15768k.remove(str);
            if (remove == null) {
                z6 = false;
            }
            if (remove == null) {
                remove = this.f15769l.remove(str);
            }
            e7 = e(str, remove);
            if (z6) {
                m();
            }
        }
        return e7;
    }

    public boolean n(String str) {
        boolean e7;
        synchronized (this.f15773p) {
            d0.j.c().a(f15762q, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e7 = e(str, this.f15768k.remove(str));
        }
        return e7;
    }

    public boolean o(String str) {
        boolean e7;
        synchronized (this.f15773p) {
            d0.j.c().a(f15762q, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e7 = e(str, this.f15769l.remove(str));
        }
        return e7;
    }
}
