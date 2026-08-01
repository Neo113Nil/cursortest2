package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class x10 {
    public s10 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(q20 q20Var) {
        RecyclerView recyclerView;
        int i = q20Var.j;
        if (q20Var.f() || (i & 4) != 0 || (recyclerView = q20Var.r) == null) {
            return;
        }
        recyclerView.F(q20Var);
    }

    public abstract boolean a(q20 q20Var, q20 q20Var2, hy hyVar, hy hyVar2);

    public final void c(q20 q20Var) {
        s10 s10Var = this.a;
        if (s10Var != null) {
            RecyclerView recyclerView = s10Var.a;
            boolean z = true;
            q20Var.n(true);
            View view = q20Var.a;
            if (q20Var.h != null && q20Var.i == null) {
                q20Var.h = null;
            }
            q20Var.i = null;
            if ((q20Var.j & 16) != 0) {
                return;
            }
            h20 h20Var = recyclerView.g;
            recyclerView.b0();
            k6 k6Var = recyclerView.j;
            ra raVar = (ra) k6Var.h;
            s10 s10Var2 = (s10) k6Var.g;
            int indexOfChild = s10Var2.a.indexOfChild(view);
            if (indexOfChild == -1) {
                k6Var.D(view);
            } else if (raVar.d(indexOfChild)) {
                raVar.g(indexOfChild);
                k6Var.D(view);
                s10Var2.h(indexOfChild);
            } else {
                z = false;
            }
            if (z) {
                q20 I = RecyclerView.I(view);
                h20Var.k(I);
                h20Var.h(I);
            }
            recyclerView.c0(!z);
            if (z || !q20Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(q20 q20Var);

    public abstract void e();

    public abstract boolean f();
}
