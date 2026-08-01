package h0;

import M.C0015p;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public C0138z f2369a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2370b;

    /* renamed from: c, reason: collision with root package name */
    public long f2371c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2372e;

    /* renamed from: f, reason: collision with root package name */
    public long f2373f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2436j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2444r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0015p c0015p, C0015p c0015p2);

    public final void c(X x2) {
        C0138z c0138z = this.f2369a;
        if (c0138z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2436j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0138z.f2611a;
            recyclerView.a0();
            A1.j jVar = recyclerView.f1648e;
            C0138z c0138z2 = (C0138z) jVar.f80b;
            RecyclerView recyclerView2 = c0138z2.f2611a;
            View view = x2.f2430a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                jVar.x(view);
            } else {
                C0115b c0115b = (C0115b) jVar.f81c;
                if (c0115b.d(indexOfChild)) {
                    c0115b.g(indexOfChild);
                    jVar.x(view);
                    c0138z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1643b;
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
