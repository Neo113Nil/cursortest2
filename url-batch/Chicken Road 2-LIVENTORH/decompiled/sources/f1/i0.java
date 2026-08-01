package f1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public c0 f1373a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1374b;

    /* renamed from: c, reason: collision with root package name */
    public long f1375c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f1376e;

    /* renamed from: f, reason: collision with root package name */
    public long f1377f;

    public static void b(b1 b1Var) {
        RecyclerView recyclerView;
        int i = b1Var.f1316j;
        if (b1Var.f() || (i & 4) != 0 || (recyclerView = b1Var.f1324r) == null) {
            return;
        }
        recyclerView.F(b1Var);
    }

    public abstract boolean a(b1 b1Var, b1 b1Var2, h0 h0Var, h0 h0Var2);

    public final void c(b1 b1Var) {
        c0 c0Var = this.f1373a;
        if (c0Var != null) {
            RecyclerView recyclerView = c0Var.f1328a;
            boolean z3 = true;
            b1Var.n(true);
            View view = b1Var.f1309a;
            if (b1Var.f1315h != null && b1Var.i == null) {
                b1Var.f1315h = null;
            }
            b1Var.i = null;
            if ((b1Var.f1316j & 16) != 0) {
                return;
            }
            s0 s0Var = recyclerView.f665g;
            recyclerView.b0();
            androidx.emoji2.text.t tVar = recyclerView.f669j;
            c cVar = (c) tVar.f356c;
            c0 c0Var2 = (c0) tVar.f355b;
            int indexOfChild = c0Var2.f1328a.indexOfChild(view);
            if (indexOfChild == -1) {
                tVar.A(view);
            } else if (cVar.d(indexOfChild)) {
                cVar.f(indexOfChild);
                tVar.A(view);
                c0Var2.h(indexOfChild);
            } else {
                z3 = false;
            }
            if (z3) {
                b1 I = RecyclerView.I(view);
                s0Var.k(I);
                s0Var.h(I);
            }
            recyclerView.c0(!z3);
            if (z3 || !b1Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(b1 b1Var);

    public abstract void e();

    public abstract boolean f();
}
