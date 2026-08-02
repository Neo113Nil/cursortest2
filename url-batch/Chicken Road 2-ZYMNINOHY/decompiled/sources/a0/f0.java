package a0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.AbstractC1359a;
import q0.C1358G;
import q0.C1378u;
import q0.C1381x;
import q0.InterfaceC1354C;
import q0.InterfaceC1383z;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0.i f4110a;

    /* renamed from: e, reason: collision with root package name */
    public final M f4114e;

    /* renamed from: h, reason: collision with root package name */
    public final b0.d f4117h;

    /* renamed from: i, reason: collision with root package name */
    public final W.F f4118i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4120k;

    /* renamed from: l, reason: collision with root package name */
    public Y.A f4121l;

    /* renamed from: j, reason: collision with root package name */
    public q0.e0 f4119j = new q0.e0();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f4112c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4113d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4111b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4115f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f4116g = new HashSet();

    public f0(M m4, b0.d dVar, W.F f4, b0.i iVar) {
        this.f4110a = iVar;
        this.f4114e = m4;
        this.f4117h = dVar;
        this.f4118i = f4;
    }

    public final T.T a(int i4, ArrayList arrayList, q0.e0 e0Var) {
        if (!arrayList.isEmpty()) {
            this.f4119j = e0Var;
            for (int i5 = i4; i5 < arrayList.size() + i4; i5++) {
                e0 e0Var2 = (e0) arrayList.get(i5 - i4);
                ArrayList arrayList2 = this.f4111b;
                if (i5 > 0) {
                    e0 e0Var3 = (e0) arrayList2.get(i5 - 1);
                    e0Var2.f4104d = e0Var3.f4101a.o.f15061b.o() + e0Var3.f4104d;
                    e0Var2.f4105e = false;
                    e0Var2.f4103c.clear();
                } else {
                    e0Var2.f4104d = 0;
                    e0Var2.f4105e = false;
                    e0Var2.f4103c.clear();
                }
                int o = e0Var2.f4101a.o.f15061b.o();
                for (int i6 = i5; i6 < arrayList2.size(); i6++) {
                    ((e0) arrayList2.get(i6)).f4104d += o;
                }
                arrayList2.add(i5, e0Var2);
                this.f4113d.put(e0Var2.f4102b, e0Var2);
                if (this.f4120k) {
                    e(e0Var2);
                    if (this.f4112c.isEmpty()) {
                        this.f4116g.add(e0Var2);
                    } else {
                        d0 d0Var = (d0) this.f4115f.get(e0Var2);
                        if (d0Var != null) {
                            d0Var.f4085a.c(d0Var.f4086b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final T.T b() {
        ArrayList arrayList = this.f4111b;
        if (arrayList.isEmpty()) {
            return T.T.f2704a;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            e0 e0Var = (e0) arrayList.get(i5);
            e0Var.f4104d = i4;
            i4 += e0Var.f4101a.o.f15061b.o();
        }
        return new l0(arrayList, this.f4119j);
    }

    public final void c() {
        Iterator it = this.f4116g.iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (e0Var.f4103c.isEmpty()) {
                d0 d0Var = (d0) this.f4115f.get(e0Var);
                if (d0Var != null) {
                    d0Var.f4085a.c(d0Var.f4086b);
                }
                it.remove();
            }
        }
    }

    public final void d(e0 e0Var) {
        if (e0Var.f4105e && e0Var.f4103c.isEmpty()) {
            d0 d0Var = (d0) this.f4115f.remove(e0Var);
            d0Var.getClass();
            c0 c0Var = d0Var.f4087c;
            AbstractC1359a abstractC1359a = d0Var.f4085a;
            abstractC1359a.s(d0Var.f4086b);
            abstractC1359a.v(c0Var);
            abstractC1359a.u(c0Var);
            this.f4116g.remove(e0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a0.X, q0.C] */
    public final void e(e0 e0Var) {
        C1381x c1381x = e0Var.f4101a;
        ?? r12 = new InterfaceC1354C() { // from class: a0.X
            @Override // q0.InterfaceC1354C
            public final void a(AbstractC1359a abstractC1359a, T.T t4) {
                W.F f4 = f0.this.f4114e.f3962h;
                f4.d(2);
                f4.e(22);
            }
        };
        c0 c0Var = new c0(this, e0Var);
        this.f4115f.put(e0Var, new d0(c1381x, r12, c0Var));
        String str = W.J.f3263a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c1381x.getClass();
        f0.e eVar = c1381x.f14947c;
        eVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.f8493c;
        C1358G c1358g = new C1358G();
        c1358g.f14830a = handler;
        c1358g.f14831b = c0Var;
        copyOnWriteArrayList.add(c1358g);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        f0.e eVar2 = c1381x.f14948d;
        eVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = eVar2.f8493c;
        f0.d dVar = new f0.d();
        dVar.f8490a = c0Var;
        copyOnWriteArrayList2.add(dVar);
        c1381x.l(r12, this.f4121l, this.f4110a);
    }

    public final void f(InterfaceC1383z interfaceC1383z) {
        IdentityHashMap identityHashMap = this.f4112c;
        e0 e0Var = (e0) identityHashMap.remove(interfaceC1383z);
        e0Var.getClass();
        e0Var.f4101a.r(interfaceC1383z);
        e0Var.f4103c.remove(((C1378u) interfaceC1383z).f15069a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(e0Var);
    }

    public final void g(int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            ArrayList arrayList = this.f4111b;
            e0 e0Var = (e0) arrayList.remove(i6);
            this.f4113d.remove(e0Var.f4102b);
            int i7 = -e0Var.f4101a.o.f15061b.o();
            for (int i8 = i6; i8 < arrayList.size(); i8++) {
                ((e0) arrayList.get(i8)).f4104d += i7;
            }
            e0Var.f4105e = true;
            if (this.f4120k) {
                d(e0Var);
            }
        }
    }
}
