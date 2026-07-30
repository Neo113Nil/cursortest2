package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.majelw.libystne.R;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ij2 {
    public static final zn1 a(xm0 xm0Var, Object obj, CoroutineContext coroutineContext, a00 a00Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            coroutineContext = h.m;
        }
        boolean h = a00Var.h(coroutineContext) | a00Var.h(xm0Var);
        Object M = a00Var.M();
        o30 o30Var = null;
        Object obj2 = sz.a;
        if (h || M == obj2) {
            M = new ed(coroutineContext, xm0Var, o30Var, 21);
            a00Var.i0(M);
        }
        Function2 function2 = (Function2) M;
        Object M2 = a00Var.M();
        if (M2 == obj2) {
            M2 = j(obj);
            a00Var.i0(M2);
        }
        zn1 zn1Var = (zn1) M2;
        boolean h2 = a00Var.h(function2);
        Object M3 = a00Var.M();
        if (h2 || M3 == obj2) {
            M3 = new bn2(function2, zn1Var, o30Var, 1);
            a00Var.i0(M3);
        }
        l41.i(xm0Var, coroutineContext, (Function2) M3, a00Var);
        return zn1Var;
    }

    public static final zn1 b(to2 to2Var, a00 a00Var) {
        return a(to2Var, to2Var.getValue(), h.m, a00Var, 0, 0);
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final eo1 d() {
        mh mhVar = an2.b;
        eo1 eo1Var = (eo1) mhVar.get();
        if (eo1Var != null) {
            return eo1Var;
        }
        eo1 eo1Var2 = new eo1(new yz[0]);
        mhVar.E(eo1Var2);
        return eo1Var2;
    }

    public static final ia0 e(zm2 zm2Var, Function0 function0) {
        mh mhVar = an2.a;
        return new ia0(zm2Var, function0);
    }

    public static final ia0 f(Function0 function0) {
        mh mhVar = an2.a;
        return new ia0(null, function0);
    }

    public static final id1 g(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            id1 id1Var = tag instanceof id1 ? (id1) tag : null;
            if (id1Var != null) {
                return id1Var;
            }
            Object g = ti2.g(view);
            view = g instanceof View ? (View) g : null;
        }
        return null;
    }

    public static String h(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            lh.e("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final long i(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : aw.b(j, aw.d(j) * f);
    }

    public static lz1 j(Object obj) {
        return new lz1(obj, by1.B);
    }

    public static final zn1 k(Object obj, a00 a00Var) {
        Object M = a00Var.M();
        if (M == sz.a) {
            M = j(obj);
            a00Var.i0(M);
        }
        zn1 zn1Var = (zn1) M;
        zn1Var.setValue(obj);
        return zn1Var;
    }

    public static final void l(View view, id1 id1Var) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, id1Var);
    }

    public static final void m(Context context, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("template_session", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("main_entered", z);
        edit.apply();
    }

    public static final double n(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static int o(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
