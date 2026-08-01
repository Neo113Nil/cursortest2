package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class d80 {
    public w70 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(x80 x80Var) {
        int i = x80Var.j;
        if (!x80Var.g() && (i & 4) == 0) {
            x80Var.b();
        }
    }

    public abstract boolean a(x80 x80Var, x80 x80Var2, t30 t30Var, t30 t30Var2);

    public final void c(x80 x80Var) {
        w70 w70Var = this.a;
        if (w70Var != null) {
            RecyclerView recyclerView = w70Var.a;
            boolean z = true;
            x80Var.o(true);
            View view = x80Var.a;
            if (x80Var.h != null && x80Var.i == null) {
                x80Var.h = null;
            }
            x80Var.i = null;
            if ((x80Var.j & 16) != 0) {
                return;
            }
            o80 o80Var = recyclerView.g;
            recyclerView.d0();
            s6 s6Var = recyclerView.j;
            mb mbVar = (mb) s6Var.c;
            w70 w70Var2 = (w70) s6Var.b;
            int indexOfChild = w70Var2.a.indexOfChild(view);
            if (indexOfChild == -1) {
                s6Var.x(view);
            } else if (mbVar.d(indexOfChild)) {
                mbVar.g(indexOfChild);
                s6Var.x(view);
                w70Var2.h(indexOfChild);
            } else {
                z = false;
            }
            if (z) {
                x80 J = RecyclerView.J(view);
                o80Var.k(J);
                o80Var.h(J);
            }
            recyclerView.e0(!z);
            if (z || !x80Var.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(x80 x80Var);

    public abstract void e();

    public abstract boolean f();
}
