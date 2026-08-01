package g0;

import K.C0019q;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0116F {

    /* renamed from: a, reason: collision with root package name */
    public C0111A f2300a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2301b;

    /* renamed from: c, reason: collision with root package name */
    public long f2302c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2303e;

    /* renamed from: f, reason: collision with root package name */
    public long f2304f;

    public static void b(a0 a0Var) {
        RecyclerView recyclerView;
        int i = a0Var.f2372j;
        if (a0Var.g() || (i & 4) != 0 || (recyclerView = a0Var.f2380r) == null) {
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
        C0111A c0111a = this.f2300a;
        if (c0111a != null) {
            boolean z2 = true;
            a0Var.o(true);
            if (a0Var.h != null && a0Var.i == null) {
                a0Var.h = null;
            }
            a0Var.i = null;
            if ((a0Var.f2372j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0111a.f2296a;
            recyclerView.h0();
            C0119c c0119c = recyclerView.f1597f;
            C0118b c0118b = c0119c.f2387b;
            C0111A c0111a2 = c0119c.f2386a;
            int i = c0119c.d;
            View view = a0Var.f2366a;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0119c.d = 2;
                    int indexOfChild = c0111a2.f2296a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c0119c.j(view);
                    } else if (c0118b.d(indexOfChild)) {
                        c0118b.g(indexOfChild);
                        c0119c.j(view);
                        c0111a2.h(indexOfChild);
                    }
                    if (z2) {
                        a0 L2 = RecyclerView.L(view);
                        P p2 = recyclerView.f1592c;
                        p2.l(L2);
                        p2.i(L2);
                        if (RecyclerView.f1565y0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.i0(!z2);
                    if (z2 && a0Var.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c0119c.d = 0;
                }
            }
            if (c0119c.f2389e != view) {
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
