package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ud0 {
    public ud0() {
        new ConcurrentHashMap();
    }

    public static final Object E(long j, he heVar, ie ieVar) {
        long j2;
        Object ldVar;
        Object G;
        int i = el.h;
        int i2 = 1;
        boolean z = j > 0;
        if (z) {
            gl glVar = gl.NANOSECONDS;
            long S = mv.S(999999L, glVar);
            if (el.b(j)) {
                if (el.b(S) && (S ^ j) < 0) {
                    s9.k("Summing infinite durations of different signs yields an undefined result.");
                    return null;
                }
            } else if (el.b(S)) {
                j = S;
            } else {
                int i3 = ((int) j) & 1;
                if (i3 == (((int) S) & 1)) {
                    long j3 = (j >> 1) + (S >> 1);
                    if (i3 == 0) {
                        if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                            j = mv.n(j3 / 1000000);
                        } else {
                            j = j3 << 1;
                            int i4 = fl.a;
                        }
                    } else if (-4611686018426L > j3 || j3 >= 4611686018427L) {
                        j = mv.n(d50.i(j3));
                    } else {
                        j = (j3 * 1000000) << 1;
                        int i5 = fl.a;
                    }
                } else {
                    j = i3 == 1 ? el.a(j >> 1, S >> 1) : el.a(S >> 1, j >> 1);
                }
            }
            int i6 = ((int) j) & 1;
            if (i6 != 1 || el.b(j)) {
                gl glVar2 = gl.MILLISECONDS;
                glVar2.getClass();
                if (j == el.f) {
                    j2 = Long.MAX_VALUE;
                } else if (j == el.g) {
                    j2 = Long.MIN_VALUE;
                } else {
                    long j4 = j >> 1;
                    if (i6 != 0) {
                        glVar = glVar2;
                    }
                    j2 = glVar2.getTimeUnit$kotlin_stdlib().convert(j4, glVar.getTimeUnit$kotlin_stdlib());
                }
            } else {
                j2 = j >> 1;
            }
        } else {
            if (z) {
                throw new md();
            }
            j2 = 0;
        }
        if (j2 <= 0) {
            throw new hi0("Timed out immediately", null);
        }
        ii0 ii0Var = new ii0(j2, ieVar);
        qg qgVar = ii0Var.i.g;
        qgVar.getClass();
        bi.H(ii0Var, true, new jb(i2, d50.t(qgVar).i(ii0Var.j, ii0Var, ii0Var.h)));
        try {
            gk0.b(heVar);
            ldVar = heVar.g(ii0Var, ii0Var);
        } catch (Throwable th) {
            ldVar = new ld(th, false);
        }
        Object obj = bh.COROUTINE_SUSPENDED;
        if (ldVar == obj || (G = ii0Var.G(ldVar)) == n9.h) {
            return obj;
        }
        if (G instanceof ld) {
            Throwable th2 = ((ld) G).a;
            if (!(th2 instanceof hi0)) {
                throw th2;
            }
            if (((hi0) th2).f != ii0Var) {
                throw th2;
            }
            if (ldVar instanceof ld) {
                throw ((ld) ldVar).a;
            }
        } else {
            ldVar = n9.T(G);
        }
        return ldVar;
    }

    public static void z(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            h0.d(window, z);
        } else {
            if (i >= 30) {
                h0.c(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public abstract boolean A(View view, float f);

    public abstract boolean B(View view, int i);

    public abstract void C(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void D(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int a(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float b(int i);

    public abstract int c(View view, int i);

    public abstract int d(View view, int i);

    public abstract Typeface e(Context context, kp kpVar, Resources resources, int i);

    public abstract Typeface f(Context context, np[] npVarArr, int i);

    public Typeface g(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface h(Context context, Resources resources, int i, String str);

    public abstract int i(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n(View view);

    public abstract int o(CoordinatorLayout coordinatorLayout);

    public abstract int p();

    public int q(View view) {
        return 0;
    }

    public int r() {
        return 0;
    }

    public abstract boolean s(float f);

    public abstract boolean t(View view);

    public abstract boolean u(float f, float f2);

    public abstract void w(int i);

    public abstract void x(View view, int i, int i2);

    public abstract void y(View view, float f, float f2);

    public void v(View view, int i) {
    }
}
