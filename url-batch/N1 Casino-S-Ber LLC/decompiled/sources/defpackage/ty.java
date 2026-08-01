package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class ty {
    public oy a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(nz nzVar) {
        int i = nzVar.j;
        if (!nzVar.g() && (i & 4) == 0) {
            nzVar.b();
        }
    }

    public abstract boolean a(nz nzVar, nz nzVar2, ev evVar, ev evVar2);

    public final void c(nz nzVar) {
        oy oyVar = this.a;
        if (oyVar != null) {
            RecyclerView recyclerView = oyVar.a;
            boolean z = true;
            nzVar.o(true);
            View view = nzVar.a;
            if (nzVar.h != null && nzVar.i == null) {
                nzVar.h = null;
            }
            nzVar.i = null;
            if ((nzVar.j & 16) != 0) {
                return;
            }
            ez ezVar = recyclerView.g;
            recyclerView.d0();
            a6 a6Var = recyclerView.j;
            ca caVar = (ca) a6Var.c;
            oy oyVar2 = (oy) a6Var.b;
            int indexOfChild = oyVar2.a.indexOfChild(view);
            if (indexOfChild == -1) {
                a6Var.y(view);
            } else if (caVar.d(indexOfChild)) {
                caVar.g(indexOfChild);
                a6Var.y(view);
                oyVar2.h(indexOfChild);
            } else {
                z = false;
            }
            if (z) {
                nz J = RecyclerView.J(view);
                ezVar.k(J);
                ezVar.h(J);
            }
            recyclerView.e0(!z);
            if (z || !nzVar.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(nz nzVar);

    public abstract void e();

    public abstract boolean f();
}
