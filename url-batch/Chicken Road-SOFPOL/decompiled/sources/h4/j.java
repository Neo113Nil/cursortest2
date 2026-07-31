package h4;

import a0.g1;
import android.util.Log;
import b.u;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.u0;
import o4.n;
import o4.o;
import o4.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3188a;

    /* renamed from: b, reason: collision with root package name */
    public int f3189b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f3190c;

    /* renamed from: d, reason: collision with root package name */
    public Cloneable f3191d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3192e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f3193f;

    public j(q qVar) {
        this.f3188a = 1;
        this.f3190c = qVar;
        this.f3191d = new u0(0);
    }

    public static boolean m(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean n(f fVar) {
        return fVar == null || fVar.f3181g;
    }

    public void a(boolean z3) {
        for (f fVar : ((k) this.f3192e).d()) {
            if (fVar != null && z3) {
                fVar.f3180f.a(true);
            }
        }
    }

    public boolean b() {
        if (this.f3189b < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (f fVar : ((k) this.f3192e).d()) {
            if (fVar != null && n(fVar) && fVar.f3180f.b()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar);
                z3 = true;
            }
        }
        if (((ArrayList) this.f3191d) != null) {
            for (int i = 0; i < ((ArrayList) this.f3191d).size(); i++) {
                f fVar2 = (f) ((ArrayList) this.f3191d).get(i);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.getClass();
                }
            }
        }
        this.f3191d = arrayList;
        return z3;
    }

    public void c(boolean z3) {
        for (f fVar : ((k) this.f3192e).d()) {
            if (fVar != null && z3) {
                fVar.f3180f.c(true);
            }
        }
    }

    public void d(boolean z3) {
        for (f fVar : ((k) this.f3192e).d()) {
            if (fVar != null && z3) {
                fVar.f3180f.d(true);
            }
        }
    }

    public boolean e() {
        if (this.f3189b < 1) {
            return false;
        }
        for (f fVar : ((k) this.f3192e).d()) {
            if (fVar != null && fVar.f3180f.e()) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        if (this.f3189b < 1) {
            return;
        }
        for (f fVar : ((k) this.f3192e).d()) {
            if (fVar != null) {
                fVar.f3180f.f();
            }
        }
    }

    public void g(boolean z3) {
        for (f fVar : ((k) this.f3192e).d()) {
            if (fVar != null && z3) {
                fVar.f3180f.g(true);
            }
        }
    }

    public boolean h() {
        boolean z3 = false;
        if (this.f3189b < 1) {
            return false;
        }
        for (f fVar : ((k) this.f3192e).d()) {
            if (fVar != null && n(fVar) && fVar.f3180f.h()) {
                z3 = true;
            }
        }
        return z3;
    }

    public void i() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public o j(int i) {
        return l(i, (q) this.f3190c, null, false);
    }

    public o k(String str, boolean z3) {
        Object obj;
        q qVar;
        q6.i.e(str, "route");
        u0 u0Var = (u0) this.f3191d;
        q6.i.e(u0Var, "<this>");
        Iterator it = ((x6.a) x6.g.a0(new d6.b(1, u0Var))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            o oVar = (o) obj;
            String str2 = (String) oVar.f5671e.f4352e;
            boolean z7 = false;
            if ((str2 == null ? false : str2.equals(str)) || oVar.f5671e.e(str) != null) {
                z7 = true;
            }
            if (z7) {
                break;
            }
        }
        o oVar2 = (o) obj;
        if (oVar2 != null) {
            return oVar2;
        }
        if (!z3 || (qVar = ((q) this.f3190c).f5672f) == null) {
            return null;
        }
        j jVar = qVar.i;
        jVar.getClass();
        if (y6.j.e0(str)) {
            return null;
        }
        return jVar.k(str, true);
    }

    public o l(int i, o oVar, o oVar2, boolean z3) {
        q qVar = (q) this.f3190c;
        u0 u0Var = (u0) this.f3191d;
        o oVar3 = (o) u0Var.c(i);
        if (oVar2 != null) {
            if (q6.i.a(oVar3, oVar2) && q6.i.a(oVar3.f5672f, oVar2.f5672f)) {
                return oVar3;
            }
            oVar3 = null;
        } else if (oVar3 != null) {
            return oVar3;
        }
        if (z3) {
            Iterator it = ((x6.a) x6.g.a0(new d6.b(1, u0Var))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    oVar3 = null;
                    break;
                }
                o oVar4 = (o) it.next();
                oVar3 = (!(oVar4 instanceof q) || oVar4.equals(oVar)) ? null : ((q) oVar4).i.l(i, qVar, oVar2, true);
                if (oVar3 != null) {
                    break;
                }
            }
        }
        if (oVar3 != null) {
            return oVar3;
        }
        q qVar2 = qVar.f5672f;
        if (qVar2 == null || qVar2.equals(oVar)) {
            return null;
        }
        q qVar3 = qVar.f5672f;
        q6.i.b(qVar3);
        return qVar3.i.l(i, qVar, oVar2, z3);
    }

    public n o(n nVar, g1 g1Var, boolean z3, o oVar) {
        n nVar2;
        q qVar = (q) this.f3190c;
        ArrayList arrayList = new ArrayList();
        Iterator it = qVar.iterator();
        while (true) {
            r4.i iVar = (r4.i) it;
            if (!iVar.hasNext()) {
                break;
            }
            o oVar2 = (o) iVar.next();
            nVar2 = q6.i.a(oVar2, oVar) ? null : oVar2.c(g1Var);
            if (nVar2 != null) {
                arrayList.add(nVar2);
            }
        }
        n nVar3 = (n) d6.m.Z(arrayList);
        q qVar2 = qVar.f5672f;
        if (qVar2 != null && z3 && !qVar2.equals(oVar)) {
            nVar2 = qVar2.e(g1Var, qVar);
        }
        return (n) d6.m.Z(d6.l.N(new n[]{nVar, nVar3, nVar2}));
    }

    public String toString() {
        switch (this.f3188a) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public j() {
        this.f3188a = 0;
        this.f3190c = new ArrayList();
        this.f3192e = new k(0);
        new u(2, this);
        this.f3193f = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new w5.f(this);
        new CopyOnWriteArrayList();
        final int i = 0;
        new p3.a(this) { // from class: h4.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f3187b;

            {
                this.f3187b = this;
            }

            @Override // p3.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f3187b.a(false);
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f3187b.c(false);
                            break;
                        }
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        boolean z3 = ((f3.b) obj).f2715a;
                        this.f3187b.d(false);
                        break;
                    default:
                        boolean z7 = ((f3.c) obj).f2716a;
                        this.f3187b.g(false);
                        break;
                }
            }
        };
        final int i8 = 1;
        new p3.a(this) { // from class: h4.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f3187b;

            {
                this.f3187b = this;
            }

            @Override // p3.a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        this.f3187b.a(false);
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f3187b.c(false);
                            break;
                        }
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        boolean z3 = ((f3.b) obj).f2715a;
                        this.f3187b.d(false);
                        break;
                    default:
                        boolean z7 = ((f3.c) obj).f2716a;
                        this.f3187b.g(false);
                        break;
                }
            }
        };
        final int i9 = 2;
        new p3.a(this) { // from class: h4.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f3187b;

            {
                this.f3187b = this;
            }

            @Override // p3.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        this.f3187b.a(false);
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f3187b.c(false);
                            break;
                        }
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        boolean z3 = ((f3.b) obj).f2715a;
                        this.f3187b.d(false);
                        break;
                    default:
                        boolean z7 = ((f3.c) obj).f2716a;
                        this.f3187b.g(false);
                        break;
                }
            }
        };
        final int i10 = 3;
        new p3.a(this) { // from class: h4.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f3187b;

            {
                this.f3187b = this;
            }

            @Override // p3.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f3187b.a(false);
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            this.f3187b.c(false);
                            break;
                        }
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        boolean z3 = ((f3.b) obj).f2715a;
                        this.f3187b.d(false);
                        break;
                    default:
                        boolean z7 = ((f3.c) obj).f2716a;
                        this.f3187b.g(false);
                        break;
                }
            }
        };
        this.f3189b = -1;
        new ArrayDeque();
        new b(1, this);
    }
}
