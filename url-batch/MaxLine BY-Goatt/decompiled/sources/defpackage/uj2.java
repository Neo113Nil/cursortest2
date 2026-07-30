package defpackage;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.majelw.libystne.R;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class uj2 {
    public static x01 a;
    public static dq2 b;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static xx2 a(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return xx2.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return xx2.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return xx2.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return xx2.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return xx2.SSL_3_0;
        }
        lh.e("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static final zd2 b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            zd2 zd2Var = tag instanceof zd2 ? (zd2) tag : null;
            if (zd2Var != null) {
                return zd2Var;
            }
            Object g = ti2.g(view);
            view = g instanceof View ? (View) g : null;
        }
        return null;
    }

    public static void c(nv2 nv2Var, zt2 zt2Var, bw2 bw2Var, t81 t81Var, wv2 wv2Var, boolean z, cu1 cu1Var) {
        long a2;
        w72 w72Var;
        if (z) {
            int g = cu1Var.g(jw2.d(nv2Var.b));
            if (g < bw2Var.a.a.n.length()) {
                w72Var = bw2Var.b(g);
            } else if (g != 0) {
                w72Var = bw2Var.b(g - 1);
            } else {
                a2 = iu2.a(zt2Var.b, zt2Var.g, zt2Var.h, iu2.a, 1);
                w72Var = new w72(0.0f, 0.0f, 1.0f, (int) (a2 & 4294967295L));
            }
            float f = w72Var.b;
            float f2 = w72Var.a;
            long T = t81Var.T(ap.i(f2, f));
            w72 p = tk3.p(ap.i(au1.d(T), au1.e(T)), ph2.a(w72Var.c - f2, w72Var.d - f));
            if (Intrinsics.b((wv2) wv2Var.a.b.get(), wv2Var)) {
                wv2Var.b.h(p);
            }
        }
    }

    public static final void d(View view, zd2 zd2Var) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, zd2Var);
    }

    public static final void e(a00 a00Var, Object obj, Function2 function2) {
        if (a00Var.S || !Intrinsics.b(a00Var.M(), obj)) {
            a00Var.i0(obj);
            a00Var.b(obj, function2);
        }
    }

    public static final String f(int i, a00 a00Var) {
        return ((Resources) a00Var.j(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    public static final String g(int i, Object[] objArr, a00 a00Var) {
        return ((Resources) a00Var.j(AndroidCompositionLocals_androidKt.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void h() {
        throw new UnsupportedOperationException();
    }
}
