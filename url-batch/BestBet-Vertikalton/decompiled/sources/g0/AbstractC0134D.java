package g0;

import K.C0019o;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0134D {

    /* renamed from: a, reason: collision with root package name */
    public C0160y f2714a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2715b;

    /* renamed from: c, reason: collision with root package name */
    public long f2716c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2717e;

    /* renamed from: f, reason: collision with root package name */
    public long f2718f;

    public static void b(Y y2) {
        RecyclerView recyclerView;
        int i = y2.f2783j;
        if (y2.g() || (i & 4) != 0 || (recyclerView = y2.f2791r) == null) {
            return;
        }
        recyclerView.I(y2);
    }

    public abstract boolean a(Y y2, Y y3, C0019o c0019o, C0019o c0019o2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Y y2) {
        C0160y c0160y = this.f2714a;
        if (c0160y != null) {
            boolean z2 = true;
            y2.o(true);
            if (y2.h != null && y2.i == null) {
                y2.h = null;
            }
            y2.i = null;
            if ((y2.f2783j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0160y.f2954a;
            recyclerView.h0();
            C0138b c0138b = recyclerView.f1977f;
            F1.a aVar = c0138b.f2799b;
            C0160y c0160y2 = c0138b.f2798a;
            int i = c0138b.d;
            View view = y2.f2777a;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0138b.d = 2;
                    int indexOfChild = c0160y2.f2954a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c0138b.j(view);
                    } else if (aVar.d(indexOfChild)) {
                        aVar.g(indexOfChild);
                        c0138b.j(view);
                        c0160y2.h(indexOfChild);
                    }
                    if (z2) {
                        Y L2 = RecyclerView.L(view);
                        N n2 = recyclerView.f1972c;
                        n2.l(L2);
                        n2.i(L2);
                        if (RecyclerView.f1944y0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.i0(!z2);
                    if (z2 && y2.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c0138b.d = 0;
                }
            }
            if (c0138b.f2801e != view) {
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

    public abstract void d(Y y2);

    public abstract void e();

    public abstract boolean f();
}
