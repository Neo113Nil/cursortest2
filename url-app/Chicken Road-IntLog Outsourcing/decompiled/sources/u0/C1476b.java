package u0;

import B0.n;
import B0.q;
import C0.m;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import s0.C1414b;
import s0.C1416d;
import s0.s;
import t0.InterfaceC1425d;
import t0.h;
import t0.j;
import t0.o;
import u1.AbstractC1477a;
import x0.InterfaceC1536b;
import x0.c;
import x1.e;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476b implements h, InterfaceC1536b, InterfaceC1425d {

    /* renamed from: j, reason: collision with root package name */
    public static final String f12035j = s.f("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f12036a;

    /* renamed from: b, reason: collision with root package name */
    public final o f12037b;

    /* renamed from: c, reason: collision with root package name */
    public final c f12038c;

    /* renamed from: e, reason: collision with root package name */
    public final C1475a f12040e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12041f;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f12044i;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f12039d = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final e f12043h = new e();

    /* renamed from: g, reason: collision with root package name */
    public final Object f12042g = new Object();

    public C1476b(Context context, C1414b c1414b, n nVar, o oVar) {
        this.f12036a = context;
        this.f12037b = oVar;
        this.f12038c = new c(nVar, this);
        this.f12040e = new C1475a(this, c1414b.f11755e);
    }

    @Override // t0.h
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f12044i;
        o oVar = this.f12037b;
        if (bool == null) {
            this.f12044i = Boolean.valueOf(m.a(this.f12036a, oVar.f11883b));
        }
        boolean booleanValue = this.f12044i.booleanValue();
        String str2 = f12035j;
        if (!booleanValue) {
            s.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f12041f) {
            oVar.f11887f.a(this);
            this.f12041f = true;
        }
        s.d().a(str2, "Cancelling work ID " + str);
        C1475a c1475a = this.f12040e;
        if (c1475a != null && (runnable = (Runnable) c1475a.f12034c.remove(str)) != null) {
            ((Handler) c1475a.f12033b.f3053a).removeCallbacks(runnable);
        }
        Iterator it = this.f12043h.s(str).iterator();
        while (it.hasNext()) {
            oVar.f11885d.o(new C0.o(oVar, (j) it.next(), false));
        }
    }

    @Override // x0.InterfaceC1536b
    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B0.j p5 = AbstractC1477a.p((q) it.next());
            s.d().a(f12035j, "Constraints not met: Cancelling work ID " + p5);
            j t5 = this.f12043h.t(p5);
            if (t5 != null) {
                o oVar = this.f12037b;
                oVar.f11885d.o(new C0.o(oVar, t5, false));
            }
        }
    }

    @Override // x0.InterfaceC1536b
    public final void c(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            B0.j p5 = AbstractC1477a.p((q) it.next());
            e eVar = this.f12043h;
            if (!eVar.p(p5)) {
                s.d().a(f12035j, "Constraints met: Scheduling work ID " + p5);
                this.f12037b.e(eVar.u(p5), null);
            }
        }
    }

    @Override // t0.InterfaceC1425d
    public final void d(B0.j jVar, boolean z) {
        this.f12043h.t(jVar);
        synchronized (this.f12042g) {
            try {
                Iterator it = this.f12039d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    q qVar = (q) it.next();
                    if (AbstractC1477a.p(qVar).equals(jVar)) {
                        s.d().a(f12035j, "Stopping tracking for " + jVar);
                        this.f12039d.remove(qVar);
                        this.f12038c.d(this.f12039d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t0.h
    public final boolean e() {
        return false;
    }

    @Override // t0.h
    public final void f(q... qVarArr) {
        if (this.f12044i == null) {
            this.f12044i = Boolean.valueOf(m.a(this.f12036a, this.f12037b.f11883b));
        }
        if (!this.f12044i.booleanValue()) {
            s.d().e(f12035j, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f12041f) {
            this.f12037b.f11887f.a(this);
            this.f12041f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (q qVar : qVarArr) {
            if (!this.f12043h.p(AbstractC1477a.p(qVar))) {
                long a6 = qVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (qVar.f174b == 1) {
                    if (currentTimeMillis < a6) {
                        C1475a c1475a = this.f12040e;
                        if (c1475a != null) {
                            HashMap hashMap = c1475a.f12034c;
                            Runnable runnable = (Runnable) hashMap.remove(qVar.f173a);
                            U.e eVar = c1475a.f12033b;
                            if (runnable != null) {
                                ((Handler) eVar.f3053a).removeCallbacks(runnable);
                            }
                            s0.m mVar = new s0.m(c1475a, qVar, 4, false);
                            hashMap.put(qVar.f173a, mVar);
                            ((Handler) eVar.f3053a).postDelayed(mVar, qVar.a() - System.currentTimeMillis());
                        }
                    } else if (qVar.b()) {
                        C1416d c1416d = qVar.f182j;
                        if (c1416d.f11764c) {
                            s.d().a(f12035j, "Ignoring " + qVar + ". Requires device idle.");
                        } else if (c1416d.f11769h.isEmpty()) {
                            hashSet.add(qVar);
                            hashSet2.add(qVar.f173a);
                        } else {
                            s.d().a(f12035j, "Ignoring " + qVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f12043h.p(AbstractC1477a.p(qVar))) {
                        s.d().a(f12035j, "Starting work for " + qVar.f173a);
                        o oVar = this.f12037b;
                        e eVar2 = this.f12043h;
                        eVar2.getClass();
                        oVar.e(eVar2.u(AbstractC1477a.p(qVar)), null);
                    }
                }
            }
        }
        synchronized (this.f12042g) {
            try {
                if (!hashSet.isEmpty()) {
                    s.d().a(f12035j, "Starting tracking for " + TextUtils.join(StringUtils.COMMA, hashSet2));
                    this.f12039d.addAll(hashSet);
                    this.f12038c.d(this.f12039d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
