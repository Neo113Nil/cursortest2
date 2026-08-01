package e0;

import K.C0024u;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: e0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0112E {

    /* renamed from: a, reason: collision with root package name */
    public C0138z f2102a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2103b;

    /* renamed from: c, reason: collision with root package name */
    public long f2104c;

    /* renamed from: d, reason: collision with root package name */
    public long f2105d;

    /* renamed from: e, reason: collision with root package name */
    public long f2106e;

    /* renamed from: f, reason: collision with root package name */
    public long f2107f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2179j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2187r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0024u c0024u, C0024u c0024u2);

    public final void c(X x2) {
        C0138z c0138z = this.f2102a;
        if (c0138z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2179j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0138z.f2374a;
            recyclerView.a0();
            T.r rVar = recyclerView.f1574e;
            C0138z c0138z2 = (C0138z) rVar.f811b;
            RecyclerView recyclerView2 = c0138z2.f2374a;
            View view = x2.f2172a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                rVar.v(view);
            } else {
                C0115b c0115b = (C0115b) rVar.f812c;
                if (c0115b.d(indexOfChild)) {
                    c0115b.g(indexOfChild);
                    rVar.v(view);
                    c0138z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1568b;
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
