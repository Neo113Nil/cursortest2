package b1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public d0 f816a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f817b;
    public long c;

    /* renamed from: d, reason: collision with root package name */
    public long f818d;

    /* renamed from: e, reason: collision with root package name */
    public long f819e;

    /* renamed from: f, reason: collision with root package name */
    public long f820f;

    public static void b(c1 c1Var) {
        RecyclerView recyclerView;
        int i4 = c1Var.f753j;
        if (c1Var.f() || (i4 & 4) != 0 || (recyclerView = c1Var.f761r) == null) {
            return;
        }
        recyclerView.F(c1Var);
    }

    public abstract boolean a(c1 c1Var, c1 c1Var2, i0 i0Var, i0 i0Var2);

    public final void c(c1 c1Var) {
        d0 d0Var = this.f816a;
        if (d0Var != null) {
            RecyclerView recyclerView = d0Var.f764a;
            boolean z3 = true;
            c1Var.n(true);
            View view = c1Var.f747a;
            if (c1Var.h != null && c1Var.f752i == null) {
                c1Var.h = null;
            }
            c1Var.f752i = null;
            if ((c1Var.f753j & 16) != 0) {
                return;
            }
            t0 t0Var = recyclerView.g;
            recyclerView.b0();
            androidx.emoji2.text.s sVar = recyclerView.f637j;
            c cVar = (c) sVar.c;
            d0 d0Var2 = (d0) sVar.f357b;
            int indexOfChild = d0Var2.f764a.indexOfChild(view);
            if (indexOfChild == -1) {
                sVar.v(view);
            } else if (cVar.d(indexOfChild)) {
                cVar.g(indexOfChild);
                sVar.v(view);
                d0Var2.h(indexOfChild);
            } else {
                z3 = false;
            }
            if (z3) {
                c1 I = RecyclerView.I(view);
                t0Var.k(I);
                t0Var.h(I);
            }
            recyclerView.c0(!z3);
            if (z3 || !c1Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(c1 c1Var);

    public abstract void e();

    public abstract boolean f();
}
