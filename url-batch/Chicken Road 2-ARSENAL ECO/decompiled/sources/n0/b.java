package n0;

import F3.i;
import H1.A;
import android.content.Context;
import android.text.TextUtils;
import i6.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l0.C0488b;
import l0.d;
import l0.q;
import m0.c;
import m0.h;
import m0.o;
import q0.InterfaceC0594b;
import u0.C0673c;
import u0.C0680j;
import u0.C0686p;
import v0.j;
import v0.l;

/* loaded from: classes.dex */
public final class b implements h, InterfaceC0594b, c {

    /* renamed from: o, reason: collision with root package name */
    public static final String f5494o = q.f("GreedyScheduler");

    /* renamed from: f, reason: collision with root package name */
    public final Context f5495f;

    /* renamed from: g, reason: collision with root package name */
    public final o f5496g;

    /* renamed from: h, reason: collision with root package name */
    public final B0.c f5497h;

    /* renamed from: j, reason: collision with root package name */
    public final C0540a f5499j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5500k;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f5503n;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f5498i = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final C0673c f5502m = new C0673c(12);

    /* renamed from: l, reason: collision with root package name */
    public final Object f5501l = new Object();

    public b(Context context, C0488b c0488b, A a7, o oVar) {
        this.f5495f = context;
        this.f5496g = oVar;
        this.f5497h = new B0.c(a7, this);
        this.f5499j = new C0540a(this, c0488b.f5248e);
    }

    @Override // m0.h
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f5503n;
        o oVar = this.f5496g;
        if (bool == null) {
            this.f5503n = Boolean.valueOf(j.a(this.f5495f, oVar.f5374b));
        }
        boolean booleanValue = this.f5503n.booleanValue();
        String str2 = f5494o;
        if (!booleanValue) {
            q.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f5500k) {
            oVar.f5378f.a(this);
            this.f5500k = true;
        }
        q.d().a(str2, "Cancelling work ID " + str);
        C0540a c0540a = this.f5499j;
        if (c0540a != null && (runnable = (Runnable) c0540a.f5493c.remove(str)) != null) {
            c0540a.f5492b.f741a.removeCallbacks(runnable);
        }
        Iterator it = this.f5502m.j(str).iterator();
        while (it.hasNext()) {
            oVar.f5376d.a(new l(oVar, (m0.j) it.next(), false));
        }
    }

    @Override // m0.h
    public final void b(C0686p... c0686pArr) {
        if (this.f5503n == null) {
            this.f5503n = Boolean.valueOf(j.a(this.f5495f, this.f5496g.f5374b));
        }
        if (!this.f5503n.booleanValue()) {
            q.d().e(f5494o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f5500k) {
            this.f5496g.f5378f.a(this);
            this.f5500k = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C0686p c0686p : c0686pArr) {
            if (!this.f5502m.e(g.n(c0686p))) {
                long a7 = c0686p.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (c0686p.f6001b == 1) {
                    if (currentTimeMillis < a7) {
                        C0540a c0540a = this.f5499j;
                        if (c0540a != null) {
                            i iVar = c0540a.f5492b;
                            HashMap hashMap = c0540a.f5493c;
                            Runnable runnable = (Runnable) hashMap.remove(c0686p.f6000a);
                            if (runnable != null) {
                                iVar.f741a.removeCallbacks(runnable);
                            }
                            A.a aVar = new A.a(c0540a, c0686p, 24, false);
                            hashMap.put(c0686p.f6000a, aVar);
                            iVar.f741a.postDelayed(aVar, c0686p.a() - System.currentTimeMillis());
                        }
                    } else if (c0686p.b()) {
                        d dVar = c0686p.f6009j;
                        if (dVar.f5257c) {
                            q.d().a(f5494o, "Ignoring " + c0686p + ". Requires device idle.");
                        } else if (dVar.f5262h.isEmpty()) {
                            hashSet.add(c0686p);
                            hashSet2.add(c0686p.f6000a);
                        } else {
                            q.d().a(f5494o, "Ignoring " + c0686p + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f5502m.e(g.n(c0686p))) {
                        q.d().a(f5494o, "Starting work for " + c0686p.f6000a);
                        o oVar = this.f5496g;
                        C0673c c0673c = this.f5502m;
                        c0673c.getClass();
                        oVar.e(c0673c.l(g.n(c0686p)), null);
                    }
                }
            }
        }
        synchronized (this.f5501l) {
            try {
                if (!hashSet.isEmpty()) {
                    q.d().a(f5494o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f5498i.addAll(hashSet);
                    this.f5497h.w(this.f5498i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q0.InterfaceC0594b
    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C0680j n7 = g.n((C0686p) obj);
            q.d().a(f5494o, "Constraints not met: Cancelling work ID " + n7);
            m0.j k4 = this.f5502m.k(n7);
            if (k4 != null) {
                o oVar = this.f5496g;
                oVar.f5376d.a(new l(oVar, k4, false));
            }
        }
    }

    @Override // q0.InterfaceC0594b
    public final void d(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C0680j n7 = g.n((C0686p) obj);
            C0673c c0673c = this.f5502m;
            if (!c0673c.e(n7)) {
                q.d().a(f5494o, "Constraints met: Scheduling work ID " + n7);
                this.f5496g.e(c0673c.l(n7), null);
            }
        }
    }

    @Override // m0.h
    public final boolean e() {
        return false;
    }

    @Override // m0.c
    public final void f(C0680j c0680j, boolean z5) {
        this.f5502m.k(c0680j);
        synchronized (this.f5501l) {
            try {
                Iterator it = this.f5498i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0686p c0686p = (C0686p) it.next();
                    if (g.n(c0686p).equals(c0680j)) {
                        q.d().a(f5494o, "Stopping tracking for " + c0680j);
                        this.f5498i.remove(c0686p);
                        this.f5497h.w(this.f5498i);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
