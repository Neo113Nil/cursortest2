package f0;

import K.C0011l;
import K.C0016q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: f0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0089E {

    /* renamed from: a, reason: collision with root package name */
    public C0115z f2082a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2083b;

    /* renamed from: c, reason: collision with root package name */
    public long f2084c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2085e;

    /* renamed from: f, reason: collision with root package name */
    public long f2086f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2149j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2157r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0016q c0016q, C0016q c0016q2);

    public final void c(X x2) {
        C0115z c0115z = this.f2082a;
        if (c0115z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2149j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0115z.f2320a;
            recyclerView.a0();
            C0011l c0011l = recyclerView.f1546e;
            C0115z c0115z2 = (C0115z) c0011l.f475b;
            RecyclerView recyclerView2 = c0115z2.f2320a;
            View view = x2.f2143a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0011l.v(view);
            } else {
                C0092b c0092b = (C0092b) c0011l.f476c;
                if (c0092b.d(indexOfChild)) {
                    c0092b.g(indexOfChild);
                    c0011l.v(view);
                    c0115z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1541b;
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
