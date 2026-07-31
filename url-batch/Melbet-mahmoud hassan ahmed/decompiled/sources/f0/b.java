package f0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import d0.j;
import d0.s;
import e0.e;
import e0.i;
import h0.c;
import h0.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l0.p;
import m0.f;

/* loaded from: classes.dex */
public class b implements e, c, e0.b {

    /* renamed from: n, reason: collision with root package name */
    private static final String f16088n = j.f("GreedyScheduler");

    /* renamed from: f, reason: collision with root package name */
    private final Context f16089f;

    /* renamed from: g, reason: collision with root package name */
    private final i f16090g;

    /* renamed from: h, reason: collision with root package name */
    private final d f16091h;

    /* renamed from: j, reason: collision with root package name */
    private a f16093j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16094k;

    /* renamed from: m, reason: collision with root package name */
    Boolean f16096m;

    /* renamed from: i, reason: collision with root package name */
    private final Set<p> f16092i = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final Object f16095l = new Object();

    public b(Context context, androidx.work.a aVar, n0.a aVar2, i iVar) {
        this.f16089f = context;
        this.f16090g = iVar;
        this.f16091h = new d(context, aVar2, this);
        this.f16093j = new a(this, aVar.k());
    }

    private void g() {
        this.f16096m = Boolean.valueOf(f.b(this.f16089f, this.f16090g.i()));
    }

    private void h() {
        if (this.f16094k) {
            return;
        }
        this.f16090g.m().d(this);
        this.f16094k = true;
    }

    private void i(String str) {
        synchronized (this.f16095l) {
            Iterator<p> it = this.f16092i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f18477a.equals(str)) {
                    j.c().a(f16088n, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f16092i.remove(next);
                    this.f16091h.d(this.f16092i);
                    break;
                }
            }
        }
    }

    @Override // e0.b
    public void a(String str, boolean z6) {
        i(str);
    }

    @Override // e0.e
    public void b(String str) {
        if (this.f16096m == null) {
            g();
        }
        if (!this.f16096m.booleanValue()) {
            j.c().d(f16088n, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        j.c().a(f16088n, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f16093j;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f16090g.x(str);
    }

    @Override // h0.c
    public void c(List<String> list) {
        for (String str : list) {
            j.c().a(f16088n, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f16090g.x(str);
        }
    }

    @Override // e0.e
    public void d(p... pVarArr) {
        if (this.f16096m == null) {
            g();
        }
        if (!this.f16096m.booleanValue()) {
            j.c().d(f16088n, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a7 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f18478b == s.ENQUEUED) {
                if (currentTimeMillis < a7) {
                    a aVar = this.f16093j;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 23 && pVar.f18486j.h()) {
                        j.c().a(f16088n, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i7 < 24 || !pVar.f18486j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f18477a);
                    } else {
                        j.c().a(f16088n, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    j.c().a(f16088n, String.format("Starting work for %s", pVar.f18477a), new Throwable[0]);
                    this.f16090g.u(pVar.f18477a);
                }
            }
        }
        synchronized (this.f16095l) {
            if (!hashSet.isEmpty()) {
                j.c().a(f16088n, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f16092i.addAll(hashSet);
                this.f16091h.d(this.f16092i);
            }
        }
    }

    @Override // h0.c
    public void e(List<String> list) {
        for (String str : list) {
            j.c().a(f16088n, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f16090g.u(str);
        }
    }

    @Override // e0.e
    public boolean f() {
        return false;
    }
}
