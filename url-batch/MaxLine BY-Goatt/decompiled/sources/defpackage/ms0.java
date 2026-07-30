package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ms0 {
    public static final ls0 a = ls0.c;

    public static ls0 a(fr0 fr0Var) {
        while (fr0Var != null) {
            if (fr0Var.isAdded()) {
                fr0Var.getParentFragmentManager().getClass();
            }
            fr0Var = fr0Var.getParentFragment();
        }
        return a;
    }

    public static void b(ls0 ls0Var, e63 e63Var) {
        fr0 fr0Var = e63Var.m;
        String name = fr0Var.getClass().getName();
        Set set = ls0Var.a;
        if (set.contains(ks0.m)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), e63Var);
        }
        if (set.contains(ks0.n)) {
            q1 q1Var = new q1(10, name, e63Var);
            if (!fr0Var.isAdded()) {
                q1Var.run();
                throw null;
            }
            Handler handler = fr0Var.getParentFragmentManager().t.o;
            handler.getClass();
            if (Intrinsics.b(handler.getLooper(), Looper.myLooper())) {
                q1Var.run();
                throw null;
            }
            handler.post(q1Var);
        }
    }

    public static void c(e63 e63Var) {
        if (as0.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(e63Var.m.getClass().getName()), e63Var);
        }
    }

    public static final void d(fr0 fr0Var, String str) {
        str.getClass();
        gs0 gs0Var = new gs0(fr0Var, "Attempting to reuse fragment " + fr0Var + " with previous ID " + str);
        c(gs0Var);
        ls0 a2 = a(fr0Var);
        if (a2.a.contains(ks0.o) && e(a2, fr0Var.getClass(), gs0.class)) {
            b(a2, gs0Var);
        }
    }

    public static boolean e(ls0 ls0Var, Class cls, Class cls2) {
        Set set = (Set) ls0Var.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.b(cls2.getSuperclass(), e63.class) || !zv.q(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
