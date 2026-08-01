package b1;

import b0.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1043a = new Object();

    public static final void a(int i3, int i10) {
        if (i3 < 0 || i3 >= i10) {
            throw new IndexOutOfBoundsException("index (" + i3 + ") is out of bound of [0, " + i10 + ')');
        }
    }

    public static final boolean b(e0 e0Var, int i3, t0.b bVar, boolean z10) {
        boolean z11;
        synchronized (f1043a) {
            try {
                int i10 = e0Var.f972d;
                if (i10 == i3) {
                    e0Var.f971c = bVar;
                    z11 = true;
                    if (z10) {
                        e0Var.f973e++;
                    }
                    e0Var.f972d = i10 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    public static final int c(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i10 = (i3 + length) >>> 1;
            long j3 = jArr[i10];
            if (j > j3) {
                i3 = i10 + 1;
            } else {
                if (j >= j3) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static i e() {
        return (i) r.f1029b.get();
    }

    public static final e0 f(w wVar) {
        e0 e0Var = wVar.f1042d;
        e0Var.getClass();
        return (e0) r.t(e0Var, wVar);
    }

    public static final int g(w wVar) {
        e0 e0Var = wVar.f1042d;
        e0Var.getClass();
        return ((e0) r.h(e0Var)).f973e;
    }

    public static i h(i iVar) {
        if (iVar instanceof k0) {
            k0 k0Var = (k0) iVar;
            if (k0Var.f1001t == x0.i.b()) {
                k0Var.f999r = null;
                return iVar;
            }
        }
        if (iVar instanceof l0) {
            l0 l0Var = (l0) iVar;
            if (l0Var.f1006i == x0.i.b()) {
                l0Var.f1005h = null;
                return iVar;
            }
        }
        i g = r.g(iVar, null, false);
        g.j();
        return g;
    }

    public static final boolean i(w wVar, Function1 function1) {
        int i3;
        t0.b bVar;
        Object invoke;
        i j;
        boolean b10;
        do {
            synchronized (f1043a) {
                e0 e0Var = wVar.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i3 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.e g = bVar.g();
            invoke = function1.invoke(g);
            t0.b e2 = g.e();
            if (Intrinsics.a(e2, bVar)) {
                break;
            }
            e0 e0Var3 = wVar.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = b((e0) r.w(e0Var3, wVar, j), i3, e2, true);
            }
            r.n(j, wVar);
        } while (!b10);
        return ((Boolean) invoke).booleanValue();
    }

    public static Object j(s0 s0Var, Function0 function0) {
        i k0Var;
        i iVar = (i) r.f1029b.get();
        if (iVar instanceof k0) {
            k0 k0Var2 = (k0) iVar;
            if (k0Var2.f1001t == x0.i.b()) {
                Function1 function1 = k0Var2.f999r;
                Function1 function12 = k0Var2.f1000s;
                try {
                    ((k0) iVar).f999r = r.k(s0Var, function1, true);
                    ((k0) iVar).f1000s = function12;
                    return function0.invoke();
                } finally {
                    k0Var2.f999r = function1;
                    k0Var2.f1000s = function12;
                }
            }
        }
        if (iVar == null || (iVar instanceof d)) {
            k0Var = new k0(iVar instanceof d ? (d) iVar : null, s0Var, null, true, false);
        } else {
            k0Var = iVar.u(s0Var);
        }
        try {
            i j = k0Var.j();
            try {
                Object invoke = function0.invoke();
                i.q(j);
                k0Var.c();
                return invoke;
            } catch (Throwable th) {
                i.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            k0Var.c();
            throw th2;
        }
    }

    public static void k(i iVar, i iVar2, Function1 function1) {
        if (iVar != iVar2) {
            iVar2.getClass();
            i.q(iVar);
            iVar2.c();
        } else if (iVar instanceof k0) {
            ((k0) iVar).f999r = function1;
        } else if (iVar instanceof l0) {
            ((l0) iVar).f1005h = function1;
        } else {
            a2.r.n(iVar, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void l() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
