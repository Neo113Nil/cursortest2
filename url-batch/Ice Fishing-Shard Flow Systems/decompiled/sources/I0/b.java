package I0;

import D0.j;
import G0.A;
import G0.C0103c;
import G0.s;
import H0.c;
import H0.h;
import H0.p;
import P0.e;
import P0.i;
import Q0.l;
import Q0.n;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class b implements h, L0.b, c {

    /* renamed from: r, reason: collision with root package name */
    public static final String f1254r = s.f("GreedyScheduler");

    /* renamed from: d, reason: collision with root package name */
    public final Context f1255d;

    /* renamed from: e, reason: collision with root package name */
    public final p f1256e;

    /* renamed from: i, reason: collision with root package name */
    public final j f1257i;

    /* renamed from: m, reason: collision with root package name */
    public final a f1259m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1260n;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f1263q;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f1258l = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final e f1262p = new e(1);

    /* renamed from: o, reason: collision with root package name */
    public final Object f1261o = new Object();

    public b(Context context, C0103c c0103c, i iVar, p pVar) {
        this.f1255d = context;
        this.f1256e = pVar;
        this.f1257i = new j(iVar, this);
        this.f1259m = new a(this, c0103c.f787e);
    }

    @Override // H0.h
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f1263q;
        p pVar = this.f1256e;
        if (bool == null) {
            this.f1263q = Boolean.valueOf(l.a(this.f1255d, pVar.f919b));
        }
        boolean booleanValue = this.f1263q.booleanValue();
        String str2 = f1254r;
        if (!booleanValue) {
            s.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f1260n) {
            pVar.f923f.a(this);
            this.f1260n = true;
        }
        s.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f1259m;
        if (aVar != null && (runnable = (Runnable) aVar.f1253c.remove(str)) != null) {
            ((Handler) aVar.f1252b.f6269d).removeCallbacks(runnable);
        }
        Iterator it = this.f1262p.w(str).iterator();
        while (it.hasNext()) {
            pVar.f921d.r(new n(pVar, (H0.j) it.next(), false));
        }
    }

    @Override // L0.b
    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            P0.j x7 = AbstractC1053a.x((P0.p) obj);
            s.d().a(f1254r, "Constraints not met: Cancelling work ID " + x7);
            H0.j v7 = this.f1262p.v(x7);
            if (v7 != null) {
                p pVar = this.f1256e;
                pVar.f921d.r(new n(pVar, v7, false));
            }
        }
    }

    @Override // H0.c
    public final void c(P0.j jVar, boolean z7) {
        this.f1262p.v(jVar);
        synchronized (this.f1261o) {
            try {
                Iterator it = this.f1258l.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    P0.p pVar = (P0.p) it.next();
                    if (AbstractC1053a.x(pVar).equals(jVar)) {
                        s.d().a(f1254r, "Stopping tracking for " + jVar);
                        this.f1258l.remove(pVar);
                        this.f1257i.Y(this.f1258l);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L0.b
    public final void d(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            P0.j x7 = AbstractC1053a.x((P0.p) obj);
            e eVar = this.f1262p;
            if (!eVar.n(x7)) {
                s.d().a(f1254r, "Constraints met: Scheduling work ID " + x7);
                this.f1256e.e(eVar.x(x7), null);
            }
        }
    }

    @Override // H0.h
    public final void e(P0.p... pVarArr) {
        if (this.f1263q == null) {
            this.f1263q = Boolean.valueOf(l.a(this.f1255d, this.f1256e.f919b));
        }
        if (!this.f1263q.booleanValue()) {
            s.d().e(f1254r, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f1260n) {
            this.f1256e.f923f.a(this);
            this.f1260n = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (P0.p spec : pVarArr) {
            if (!this.f1262p.n(AbstractC1053a.x(spec))) {
                long a7 = spec.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (spec.f2221b == A.f770d) {
                    if (currentTimeMillis < a7) {
                        a aVar = this.f1259m;
                        if (aVar != null) {
                            l2.c cVar = aVar.f1252b;
                            HashMap hashMap = aVar.f1253c;
                            Runnable runnable = (Runnable) hashMap.remove(spec.f2220a);
                            if (runnable != null) {
                                ((Handler) cVar.f6269d).removeCallbacks(runnable);
                            }
                            F.a aVar2 = new F.a(6, aVar, spec, false);
                            hashMap.put(spec.f2220a, aVar2);
                            ((Handler) cVar.f6269d).postDelayed(aVar2, spec.a() - System.currentTimeMillis());
                        }
                    } else if (spec.b()) {
                        G0.e eVar = spec.j;
                        if (eVar.f796c) {
                            s.d().a(f1254r, "Ignoring " + spec + ". Requires device idle.");
                        } else if (eVar.f801h.isEmpty()) {
                            hashSet.add(spec);
                            hashSet2.add(spec.f2220a);
                        } else {
                            s.d().a(f1254r, "Ignoring " + spec + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f1262p.n(AbstractC1053a.x(spec))) {
                        s.d().a(f1254r, "Starting work for " + spec.f2220a);
                        p pVar = this.f1256e;
                        e eVar2 = this.f1262p;
                        eVar2.getClass();
                        Intrinsics.checkNotNullParameter(spec, "spec");
                        pVar.e(eVar2.x(AbstractC1053a.x(spec)), null);
                    }
                }
            }
        }
        synchronized (this.f1261o) {
            try {
                if (!hashSet.isEmpty()) {
                    s.d().a(f1254r, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f1258l.addAll(hashSet);
                    this.f1257i.Y(this.f1258l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H0.h
    public final boolean f() {
        return false;
    }
}
