package v5;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import c6.i;
import c6.j;
import c6.p;
import d6.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.d;
import p.e;
import t5.o;
import u5.c;
import u5.g;
import u5.m;
import u5.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements g, y5.b, c {

    /* renamed from: x, reason: collision with root package name */
    public static final String f9958x = o.f("GreedyScheduler");

    /* renamed from: d, reason: collision with root package name */
    public final Context f9959d;

    /* renamed from: e, reason: collision with root package name */
    public final m f9960e;

    /* renamed from: i, reason: collision with root package name */
    public final e f9961i;

    /* renamed from: s, reason: collision with root package name */
    public final a f9963s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9964t;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f9967w;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f9962r = new HashSet();

    /* renamed from: v, reason: collision with root package name */
    public final c6.e f9966v = new c6.e(13);

    /* renamed from: u, reason: collision with root package name */
    public final Object f9965u = new Object();

    public b(Context context, t5.b bVar, i iVar, m mVar) {
        this.f9959d = context;
        this.f9960e = mVar;
        this.f9961i = new e(iVar, this);
        this.f9963s = new a(this, bVar.f9287e);
    }

    @Override // u5.g
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f9967w;
        m mVar = this.f9960e;
        if (bool == null) {
            this.f9967w = Boolean.valueOf(k.a(this.f9959d, mVar.f9650b));
        }
        boolean booleanValue = this.f9967w.booleanValue();
        String str2 = f9958x;
        if (!booleanValue) {
            o.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f9964t) {
            mVar.f9654f.a(this);
            this.f9964t = true;
        }
        o.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f9963s;
        if (aVar != null && (runnable = (Runnable) aVar.f9957c.remove(str)) != null) {
            ((Handler) aVar.f9956b.f5643e).removeCallbacks(runnable);
        }
        Iterator it = this.f9966v.o(str).iterator();
        while (it.hasNext()) {
            mVar.f9652d.a(new d6.m(mVar, (u5.i) it.next(), false));
        }
    }

    @Override // y5.b
    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            j A = g8.b.A((p) obj);
            o.d().a(f9958x, "Constraints not met: Cancelling work ID " + A);
            u5.i p4 = this.f9966v.p(A);
            if (p4 != null) {
                m mVar = this.f9960e;
                mVar.f9652d.a(new d6.m(mVar, p4, false));
            }
        }
    }

    @Override // y5.b
    public final void c(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            j A = g8.b.A((p) obj);
            c6.e eVar = this.f9966v;
            if (!eVar.g(A)) {
                o.d().a(f9958x, "Constraints met: Scheduling work ID " + A);
                this.f9960e.e(eVar.r(A), null);
            }
        }
    }

    @Override // u5.g
    public final void d(p... pVarArr) {
        if (this.f9967w == null) {
            this.f9967w = Boolean.valueOf(k.a(this.f9959d, this.f9960e.f9650b));
        }
        if (!this.f9967w.booleanValue()) {
            o.d().e(f9958x, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f9964t) {
            this.f9960e.f9654f.a(this);
            this.f9964t = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            if (!this.f9966v.g(g8.b.A(pVar))) {
                long a9 = pVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.f1840b == 1) {
                    if (currentTimeMillis < a9) {
                        a aVar = this.f9963s;
                        if (aVar != null) {
                            d dVar = aVar.f9956b;
                            HashMap hashMap = aVar.f9957c;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.f1839a);
                            if (runnable != null) {
                                ((Handler) dVar.f5643e).removeCallbacks(runnable);
                            }
                            n nVar = new n(2, aVar, pVar);
                            hashMap.put(pVar.f1839a, nVar);
                            ((Handler) dVar.f5643e).postDelayed(nVar, pVar.a() - System.currentTimeMillis());
                        }
                    } else if (pVar.b()) {
                        t5.d dVar2 = pVar.j;
                        if (dVar2.f9295c) {
                            o.d().a(f9958x, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (dVar2.f9299h.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f1839a);
                        } else {
                            o.d().a(f9958x, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f9966v.g(g8.b.A(pVar))) {
                        o.d().a(f9958x, "Starting work for " + pVar.f1839a);
                        m mVar = this.f9960e;
                        c6.e eVar = this.f9966v;
                        eVar.getClass();
                        mVar.e(eVar.r(g8.b.A(pVar)), null);
                    }
                }
            }
        }
        synchronized (this.f9965u) {
            try {
                if (!hashSet.isEmpty()) {
                    o.d().a(f9958x, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f9962r.addAll(hashSet);
                    this.f9961i.g(this.f9962r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u5.g
    public final boolean e() {
        return false;
    }

    @Override // u5.c
    public final void f(j jVar, boolean z10) {
        this.f9966v.p(jVar);
        synchronized (this.f9965u) {
            try {
                Iterator it = this.f9962r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (g8.b.A(pVar).equals(jVar)) {
                        o.d().a(f9958x, "Stopping tracking for " + jVar);
                        this.f9962r.remove(pVar);
                        this.f9961i.g(this.f9962r);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
