package defpackage;

import android.app.Dialog;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ef1 {
    public static final Object j = new Object();
    public final Object a = new Object();
    public final dd2 b = new dd2();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    public ef1() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        uh.t().a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        lh.g(q40.m("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(df1 df1Var) {
        boolean z;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (df1Var.b) {
            int i = df1Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            df1Var.c = i2;
            wt1 wt1Var = df1Var.a;
            Object obj = this.e;
            ar0 ar0Var = (ar0) wt1Var;
            ar0Var.getClass();
            id1 id1Var = (id1) obj;
            ta0 ta0Var = (ta0) ar0Var.n;
            if (id1Var != null) {
                z = ta0Var.mShowsDialog;
                if (z) {
                    View requireView = ta0Var.requireView();
                    if (requireView.getParent() != null) {
                        lh.g("DialogFragment can not be attached to a container view");
                        return;
                    }
                    dialog = ta0Var.mDialog;
                    if (dialog != null) {
                        if (as0.G(3)) {
                            StringBuilder sb = new StringBuilder("DialogFragment ");
                            sb.append(ar0Var);
                            sb.append(" setting the content view on ");
                            dialog3 = ta0Var.mDialog;
                            sb.append(dialog3);
                            Log.d("FragmentManager", sb.toString());
                        }
                        dialog2 = ta0Var.mDialog;
                        dialog2.setContentView(requireView);
                    }
                }
            }
        }
    }

    public final void c(df1 df1Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (df1Var != null) {
                b(df1Var);
                df1Var = null;
            } else {
                dd2 dd2Var = this.b;
                dd2Var.getClass();
                bd2 bd2Var = new bd2(dd2Var);
                dd2Var.o.put(bd2Var, Boolean.FALSE);
                while (bd2Var.hasNext()) {
                    b((df1) ((Map.Entry) bd2Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }
}
