package e0;

import K.C0024u;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: e0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0111E {

    /* renamed from: a, reason: collision with root package name */
    public C0137z f2098a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2099b;

    /* renamed from: c, reason: collision with root package name */
    public long f2100c;

    /* renamed from: d, reason: collision with root package name */
    public long f2101d;

    /* renamed from: e, reason: collision with root package name */
    public long f2102e;

    /* renamed from: f, reason: collision with root package name */
    public long f2103f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2175j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2183r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0024u c0024u, C0024u c0024u2);

    public final void c(X x2) {
        C0137z c0137z = this.f2098a;
        if (c0137z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2175j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0137z.f2370a;
            recyclerView.a0();
            T.r rVar = recyclerView.f1573e;
            C0137z c0137z2 = (C0137z) rVar.f810b;
            RecyclerView recyclerView2 = c0137z2.f2370a;
            View view = x2.f2168a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                rVar.v(view);
            } else {
                C0114b c0114b = (C0114b) rVar.f811c;
                if (c0114b.d(indexOfChild)) {
                    c0114b.g(indexOfChild);
                    rVar.v(view);
                    c0137z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1567b;
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
