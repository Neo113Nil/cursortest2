package f0;

import K.C0011l;
import K.C0016q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: f0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0088E {

    /* renamed from: a, reason: collision with root package name */
    public C0114z f2014a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2015b;

    /* renamed from: c, reason: collision with root package name */
    public long f2016c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2017e;

    /* renamed from: f, reason: collision with root package name */
    public long f2018f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2081j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2089r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0016q c0016q, C0016q c0016q2);

    public final void c(X x2) {
        C0114z c0114z = this.f2014a;
        if (c0114z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2081j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0114z.f2252a;
            recyclerView.a0();
            C0011l c0011l = recyclerView.f1476e;
            C0114z c0114z2 = (C0114z) c0011l.f415b;
            RecyclerView recyclerView2 = c0114z2.f2252a;
            View view = x2.f2075a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0011l.v(view);
            } else {
                C0091b c0091b = (C0091b) c0011l.f416c;
                if (c0091b.d(indexOfChild)) {
                    c0091b.g(indexOfChild);
                    c0011l.v(view);
                    c0114z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1471b;
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
