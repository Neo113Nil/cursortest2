package m6;

import v5.k;

/* loaded from: classes.dex */
public final class u0 {
    public static final <T> void a(t0<? super T> t0Var, int i7) {
        if (p0.a()) {
            if (!(i7 != -1)) {
                throw new AssertionError();
            }
        }
        y5.d<? super T> c7 = t0Var.c();
        boolean z6 = i7 == 4;
        if (z6 || !(c7 instanceof kotlinx.coroutines.internal.f) || b(i7) != b(t0Var.f19331h)) {
            d(t0Var, c7, z6);
            return;
        }
        f0 f0Var = ((kotlinx.coroutines.internal.f) c7).f18332i;
        y5.g context = c7.getContext();
        if (f0Var.Q(context)) {
            f0Var.P(context, t0Var);
        } else {
            e(t0Var);
        }
    }

    public static final boolean b(int i7) {
        return i7 == 1 || i7 == 2;
    }

    public static final boolean c(int i7) {
        return i7 == 2;
    }

    public static final <T> void d(t0<? super T> t0Var, y5.d<? super T> dVar, boolean z6) {
        Object h7;
        Object l7 = t0Var.l();
        Throwable f7 = t0Var.f(l7);
        if (f7 != null) {
            k.a aVar = v5.k.f22832f;
            h7 = v5.l.a(f7);
        } else {
            k.a aVar2 = v5.k.f22832f;
            h7 = t0Var.h(l7);
        }
        Object a7 = v5.k.a(h7);
        if (!z6) {
            dVar.resumeWith(a7);
            return;
        }
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) dVar;
        y5.d<T> dVar2 = fVar.f18333j;
        Object obj = fVar.f18335l;
        y5.g context = dVar2.getContext();
        Object c7 = kotlinx.coroutines.internal.c0.c(context, obj);
        h2<?> e7 = c7 != kotlinx.coroutines.internal.c0.f18321a ? e0.e(dVar2, context, c7) : null;
        try {
            fVar.f18333j.resumeWith(a7);
            v5.q qVar = v5.q.f22838a;
        } finally {
            if (e7 == null || e7.y0()) {
                kotlinx.coroutines.internal.c0.a(context, c7);
            }
        }
    }

    private static final void e(t0<?> t0Var) {
        z0 a7 = f2.f19284a.a();
        if (a7.X()) {
            a7.T(t0Var);
            return;
        }
        a7.V(true);
        try {
            d(t0Var, t0Var.c(), true);
            do {
            } while (a7.Z());
        } finally {
            try {
            } finally {
            }
        }
    }
}
