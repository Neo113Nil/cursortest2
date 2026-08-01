package g1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public p0 f1813a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1814b;

    /* renamed from: c, reason: collision with root package name */
    public long f1815c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f1816e;

    /* renamed from: f, reason: collision with root package name */
    public long f1817f;

    public static void b(q1 q1Var) {
        RecyclerView recyclerView;
        int i = q1Var.f1774j;
        if (q1Var.f() || (i & 4) != 0 || (recyclerView = q1Var.f1782r) == null) {
            return;
        }
        recyclerView.J(q1Var);
    }

    public abstract boolean a(q1 q1Var, q1 q1Var2, v0 v0Var, v0 v0Var2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(q1 q1Var) {
        p0 p0Var = this.f1813a;
        if (p0Var != null) {
            RecyclerView recyclerView = p0Var.f1752a;
            boolean z4 = true;
            q1Var.n(true);
            View view = q1Var.f1768a;
            if (q1Var.h != null && q1Var.i == null) {
                q1Var.h = null;
            }
            q1Var.i = null;
            if ((q1Var.f1774j & 16) != 0) {
                return;
            }
            g1 g1Var = recyclerView.h;
            recyclerView.k0();
            h hVar = recyclerView.f772k;
            g gVar = hVar.f1672b;
            p0 p0Var2 = hVar.f1671a;
            int i = hVar.d;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    hVar.d = 2;
                    int indexOfChild = p0Var2.f1752a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        hVar.j(view);
                    } else if (gVar.d(indexOfChild)) {
                        gVar.g(indexOfChild);
                        hVar.j(view);
                        p0Var2.k(indexOfChild);
                    }
                    if (z4) {
                        q1 M = RecyclerView.M(view);
                        g1Var.m(M);
                        g1Var.j(M);
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m0(!z4);
                    if (z4 && q1Var.j()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    hVar.d = 0;
                }
            }
            if (hVar.f1674e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z4 = false;
            if (z4) {
            }
            recyclerView.m0(!z4);
            if (z4) {
            }
        }
    }

    public abstract void d(q1 q1Var);

    public abstract void e();

    public abstract boolean f();
}
