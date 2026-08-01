package f0;

import K.C0012l;
import K.C0017q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public C0109z f1951a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1952b;

    /* renamed from: c, reason: collision with root package name */
    public long f1953c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f1954e;

    /* renamed from: f, reason: collision with root package name */
    public long f1955f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2018j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2026r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0017q c0017q, C0017q c0017q2);

    public final void c(X x2) {
        C0109z c0109z = this.f1951a;
        if (c0109z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2018j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0109z.f2189a;
            recyclerView.a0();
            C0012l c0012l = recyclerView.f1443e;
            C0109z c0109z2 = (C0109z) c0012l.f431b;
            RecyclerView recyclerView2 = c0109z2.f2189a;
            View view = x2.f2012a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0012l.v(view);
            } else {
                C0086b c0086b = (C0086b) c0012l.f432c;
                if (c0086b.d(indexOfChild)) {
                    c0086b.g(indexOfChild);
                    c0012l.v(view);
                    c0109z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1438b;
                o2.j(I2);
                o2.g(I2);
            }
            recyclerView.b0(!z2);
            if (z2 || !x2.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(X x2);

    public abstract void e();

    public abstract boolean f();
}
