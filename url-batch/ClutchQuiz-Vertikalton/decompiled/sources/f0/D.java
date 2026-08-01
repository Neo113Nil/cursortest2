package f0;

import K.C0012m;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public C0118y f2132a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2133b;

    /* renamed from: c, reason: collision with root package name */
    public long f2134c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2135e;

    /* renamed from: f, reason: collision with root package name */
    public long f2136f;

    public static void b(W w2) {
        RecyclerView recyclerView;
        int i = w2.f2199j;
        if (w2.g() || (i & 4) != 0 || (recyclerView = w2.f2207r) == null) {
            return;
        }
        recyclerView.F(w2);
    }

    public abstract boolean a(W w2, W w3, K.r rVar, K.r rVar2);

    public final void c(W w2) {
        C0118y c0118y = this.f2132a;
        if (c0118y != null) {
            boolean z2 = true;
            w2.o(true);
            if (w2.h != null && w2.i == null) {
                w2.h = null;
            }
            w2.i = null;
            if ((w2.f2199j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0118y.f2367a;
            recyclerView.a0();
            C0012m c0012m = recyclerView.f1588e;
            C0118y c0118y2 = (C0118y) c0012m.f422b;
            RecyclerView recyclerView2 = c0118y2.f2367a;
            View view = w2.f2193a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0012m.v(view);
            } else {
                C0096b c0096b = (C0096b) c0012m.f423c;
                if (c0096b.d(indexOfChild)) {
                    c0096b.f(indexOfChild);
                    c0012m.v(view);
                    c0118y2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                W I2 = RecyclerView.I(view);
                N n2 = recyclerView.f1583b;
                n2.j(I2);
                n2.g(I2);
            }
            recyclerView.b0(!z2);
            if (z2 || !w2.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(W w2);

    public abstract void e();

    public abstract boolean f();
}
