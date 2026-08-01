package f0;

import K.C0011l;
import K.C0016q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public C0111z f2057a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2058b;

    /* renamed from: c, reason: collision with root package name */
    public long f2059c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2060e;

    /* renamed from: f, reason: collision with root package name */
    public long f2061f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2124j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2132r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0016q c0016q, C0016q c0016q2);

    public final void c(X x2) {
        C0111z c0111z = this.f2057a;
        if (c0111z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2124j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0111z.f2295a;
            recyclerView.a0();
            C0011l c0011l = recyclerView.f1518e;
            C0111z c0111z2 = (C0111z) c0011l.f404b;
            RecyclerView recyclerView2 = c0111z2.f2295a;
            View view = x2.f2118a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0011l.v(view);
            } else {
                C0088b c0088b = (C0088b) c0011l.f405c;
                if (c0088b.d(indexOfChild)) {
                    c0088b.g(indexOfChild);
                    c0011l.v(view);
                    c0111z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1513b;
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
