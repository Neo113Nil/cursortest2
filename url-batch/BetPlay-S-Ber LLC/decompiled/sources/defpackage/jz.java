package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class jz {
    public ez a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(c00 c00Var) {
        RecyclerView recyclerView;
        int i = c00Var.j;
        if (c00Var.f() || (i & 4) != 0 || (recyclerView = c00Var.r) == null) {
            return;
        }
        recyclerView.F(c00Var);
    }

    public abstract boolean a(c00 c00Var, c00 c00Var2, uv uvVar, uv uvVar2);

    public final void c(c00 c00Var) {
        ez ezVar = this.a;
        if (ezVar != null) {
            RecyclerView recyclerView = ezVar.a;
            boolean z = true;
            c00Var.n(true);
            View view = c00Var.a;
            if (c00Var.h != null && c00Var.i == null) {
                c00Var.h = null;
            }
            c00Var.i = null;
            if ((c00Var.j & 16) != 0) {
                return;
            }
            tz tzVar = recyclerView.g;
            recyclerView.b0();
            r6 r6Var = recyclerView.j;
            aa aaVar = (aa) r6Var.c;
            ez ezVar2 = (ez) r6Var.b;
            int indexOfChild = ezVar2.a.indexOfChild(view);
            if (indexOfChild == -1) {
                r6Var.y(view);
            } else if (aaVar.d(indexOfChild)) {
                aaVar.g(indexOfChild);
                r6Var.y(view);
                ezVar2.h(indexOfChild);
            } else {
                z = false;
            }
            if (z) {
                c00 I = RecyclerView.I(view);
                tzVar.k(I);
                tzVar.h(I);
            }
            recyclerView.c0(!z);
            if (z || !c00Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(c00 c00Var);

    public abstract void e();

    public abstract boolean f();
}
