package g0;

import K.C0019q;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public C0111C f2265a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2266b;

    /* renamed from: c, reason: collision with root package name */
    public long f2267c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2268e;

    /* renamed from: f, reason: collision with root package name */
    public long f2269f;

    public static void b(c0 c0Var) {
        RecyclerView recyclerView;
        int i = c0Var.f2345j;
        if (c0Var.h() || (i & 4) != 0 || (recyclerView = c0Var.f2353r) == null) {
            return;
        }
        recyclerView.I(c0Var);
    }

    public abstract boolean a(c0 c0Var, c0 c0Var2, C0019q c0019q, C0019q c0019q2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(c0 c0Var) {
        C0111C c0111c = this.f2265a;
        if (c0111c != null) {
            boolean z2 = true;
            c0Var.p(true);
            if (c0Var.h != null && c0Var.i == null) {
                c0Var.h = null;
            }
            c0Var.i = null;
            if ((c0Var.f2345j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0111c.f2261a;
            recyclerView.i0();
            C0118d c0118d = recyclerView.f1567f;
            C0117c c0117c = c0118d.f2356b;
            C0111C c0111c2 = c0118d.f2355a;
            int i = c0118d.d;
            View view = c0Var.f2339a;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0118d.d = 2;
                    int indexOfChild = c0111c2.f2261a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c0118d.j(view);
                    } else if (c0117c.d(indexOfChild)) {
                        c0117c.g(indexOfChild);
                        c0118d.j(view);
                        c0111c2.h(indexOfChild);
                    }
                    if (z2) {
                        c0 L2 = RecyclerView.L(view);
                        S s2 = recyclerView.f1562c;
                        s2.l(L2);
                        s2.i(L2);
                        if (RecyclerView.f1528A0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.j0(!z2);
                    if (z2 && c0Var.l()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c0118d.d = 0;
                }
            }
            if (c0118d.f2358e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z2 = false;
            if (z2) {
            }
            recyclerView.j0(!z2);
            if (z2) {
            }
        }
    }

    public abstract void d(c0 c0Var);

    public abstract void e();

    public abstract boolean f();
}
