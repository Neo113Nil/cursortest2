package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e7 implements f8.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2258d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2259e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2260i;

    /* renamed from: r, reason: collision with root package name */
    public final Object f2261r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f2262s;

    public e7() {
        this.f2258d = 0;
        l5 l5Var = new l5(0);
        this.f2260i = l5Var;
        e7 e7Var = new e7(null, l5Var);
        this.f2261r = e7Var;
        this.f2259e = e7Var.d();
        v5 v5Var = new v5(5);
        this.f2262s = v5Var;
        e7Var.f("require", new of(v5Var));
        ((HashMap) v5Var.f2870e).put("internal.platform", y6.f3008e);
        e7Var.f("runtime.counter", new l3(Double.valueOf(0.0d)));
    }

    public f5 a(f5 f5Var) {
        return ((l5) this.f2260i).e(this, f5Var);
    }

    public f5 b(e7 e7Var, r9... r9VarArr) {
        f5 f5Var = f5.f2280b;
        for (r9 r9Var : r9VarArr) {
            f5Var = oa.h(r9Var);
            ia.y((e7) this.f2261r);
            if ((f5Var instanceof g5) || (f5Var instanceof e5)) {
                f5Var = ((l5) this.f2260i).e(e7Var, f5Var);
            }
        }
        return f5Var;
    }

    public f5 c(n1 n1Var) {
        f5 f5Var = f5.f2280b;
        Iterator p4 = n1Var.p();
        while (p4.hasNext()) {
            f5Var = ((l5) this.f2260i).e(this, n1Var.r(((Integer) p4.next()).intValue()));
            if (f5Var instanceof t2) {
                break;
            }
        }
        return f5Var;
    }

    @Override // f8.y
    public ListenableFuture call() {
        int i3 = this.f2258d;
        Object obj = this.f2259e;
        f8.d0 d0Var = f8.d0.f4128d;
        int i10 = 4;
        Object obj2 = this.f2262s;
        Object obj3 = this.f2261r;
        Object obj4 = this.f2260i;
        switch (i3) {
            case 2:
                final c2.b1 b1Var = (c2.b1) obj4;
                final int i11 = 0;
                final f8.s g = f8.l0.g((ListenableFuture) obj, new ue(b1Var, i11), d0Var);
                final f8.s g2 = f8.l0.g(g, (dd) obj3, (Executor) obj2);
                f8.z zVar = new f8.z() { // from class: com.google.android.gms.internal.measurement.we
                    @Override // f8.z
                    public final ListenableFuture apply(Object obj5) {
                        switch (i11) {
                            case 0:
                                c2.b1 b1Var2 = (c2.b1) b1Var;
                                f8.s sVar = (f8.s) g;
                                f8.s sVar2 = (f8.s) g2;
                                if (f8.l0.b(sVar).equals(f8.l0.b(sVar2))) {
                                    return f8.l0.d(obj5);
                                }
                                dd ddVar = new dd(2, b1Var2, sVar2);
                                int i12 = cg.f2205a;
                                f8.s g10 = f8.l0.g(sVar2, new dd(4, mf.a(), ddVar), (f8.w0) b1Var2.f1494e);
                                synchronized (b1Var2.f1497i) {
                                }
                                return g10;
                            default:
                                re reVar = (re) b1Var;
                                return reVar.f2758c.i((dd) g, (Executor) g2);
                        }
                    }
                };
                int i12 = cg.f2205a;
                return f8.l0.g(g2, new dd(i10, mf.a(), zVar), d0Var);
            default:
                final re reVar = (re) obj4;
                final dd ddVar = (dd) obj3;
                final Executor executor = (Executor) obj2;
                final int i13 = 1;
                f8.z zVar2 = new f8.z() { // from class: com.google.android.gms.internal.measurement.we
                    @Override // f8.z
                    public final ListenableFuture apply(Object obj5) {
                        switch (i13) {
                            case 0:
                                c2.b1 b1Var2 = (c2.b1) reVar;
                                f8.s sVar = (f8.s) ddVar;
                                f8.s sVar2 = (f8.s) executor;
                                if (f8.l0.b(sVar).equals(f8.l0.b(sVar2))) {
                                    return f8.l0.d(obj5);
                                }
                                dd ddVar2 = new dd(2, b1Var2, sVar2);
                                int i122 = cg.f2205a;
                                f8.s g10 = f8.l0.g(sVar2, new dd(4, mf.a(), ddVar2), (f8.w0) b1Var2.f1494e);
                                synchronized (b1Var2.f1497i) {
                                }
                                return g10;
                            default:
                                re reVar2 = (re) reVar;
                                return reVar2.f2758c.i((dd) ddVar, (Executor) executor);
                        }
                    }
                };
                int i14 = cg.f2205a;
                return f8.l0.g((f8.r) obj, new dd(i10, mf.a(), zVar2), d0Var);
        }
    }

    public e7 d() {
        return new e7(this, (l5) this.f2260i);
    }

    public boolean e(String str) {
        if (((HashMap) this.f2261r).containsKey(str)) {
            return true;
        }
        e7 e7Var = (e7) this.f2259e;
        if (e7Var != null) {
            return e7Var.e(str);
        }
        return false;
    }

    public void f(String str, f5 f5Var) {
        e7 e7Var;
        HashMap hashMap = (HashMap) this.f2261r;
        if (!hashMap.containsKey(str) && (e7Var = (e7) this.f2259e) != null && e7Var.e(str)) {
            e7Var.f(str, f5Var);
        } else {
            if (((HashMap) this.f2262s).containsKey(str)) {
                return;
            }
            if (f5Var == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, f5Var);
            }
        }
    }

    public void g(String str, f5 f5Var) {
        if (((HashMap) this.f2262s).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.f2261r;
        if (f5Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, f5Var);
        }
    }

    public f5 h(String str) {
        HashMap hashMap = (HashMap) this.f2261r;
        if (hashMap.containsKey(str)) {
            return (f5) hashMap.get(str);
        }
        e7 e7Var = (e7) this.f2259e;
        if (e7Var != null) {
            return e7Var.h(str);
        }
        throw new IllegalArgumentException(str + " is not defined");
    }

    public /* synthetic */ e7(Object obj, ListenableFuture listenableFuture, dd ddVar, Executor executor, int i3) {
        this.f2258d = i3;
        this.f2260i = obj;
        this.f2259e = listenableFuture;
        this.f2261r = ddVar;
        this.f2262s = executor;
    }

    public e7(e7 e7Var, l5 l5Var) {
        this.f2258d = 1;
        this.f2261r = new HashMap();
        this.f2262s = new HashMap();
        this.f2259e = e7Var;
        this.f2260i = l5Var;
    }
}
