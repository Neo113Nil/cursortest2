package h0;

import L.C0019q;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: h0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0118F {

    /* renamed from: a, reason: collision with root package name */
    public C0113A f2386a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2387b;

    /* renamed from: c, reason: collision with root package name */
    public long f2388c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2389e;

    /* renamed from: f, reason: collision with root package name */
    public long f2390f;

    public static void b(a0 a0Var) {
        RecyclerView recyclerView;
        int i = a0Var.f2462j;
        if (a0Var.g() || (i & 4) != 0 || (recyclerView = a0Var.f2470r) == null) {
            return;
        }
        recyclerView.I(a0Var);
    }

    public abstract boolean a(a0 a0Var, a0 a0Var2, C0019q c0019q, C0019q c0019q2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(a0 a0Var) {
        C0113A c0113a = this.f2386a;
        if (c0113a != null) {
            boolean z2 = true;
            a0Var.o(true);
            if (a0Var.f2461h != null && a0Var.i == null) {
                a0Var.f2461h = null;
            }
            a0Var.i = null;
            if ((a0Var.f2462j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0113a.f2382a;
            recyclerView.h0();
            C0121c c0121c = recyclerView.f1660f;
            C0120b c0120b = c0121c.f2477b;
            C0113A c0113a2 = c0121c.f2476a;
            int i = c0121c.d;
            View view = a0Var.f2455a;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0121c.d = 2;
                    int indexOfChild = c0113a2.f2382a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c0121c.j(view);
                    } else if (c0120b.d(indexOfChild)) {
                        c0120b.g(indexOfChild);
                        c0121c.j(view);
                        c0113a2.h(indexOfChild);
                    }
                    if (z2) {
                        a0 L2 = RecyclerView.L(view);
                        P p2 = recyclerView.f1655c;
                        p2.l(L2);
                        p2.i(L2);
                        if (RecyclerView.f1627y0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.i0(!z2);
                    if (z2 && a0Var.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c0121c.d = 0;
                }
            }
            if (c0121c.f2479e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z2 = false;
            if (z2) {
            }
            recyclerView.i0(!z2);
            if (z2) {
            }
        }
    }

    public abstract void d(a0 a0Var);

    public abstract void e();

    public abstract boolean f();
}
