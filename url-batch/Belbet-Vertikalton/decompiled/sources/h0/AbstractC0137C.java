package h0;

import M.C0019o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: h0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0137C {

    /* renamed from: a, reason: collision with root package name */
    public C0173x f2893a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2894b;

    /* renamed from: c, reason: collision with root package name */
    public long f2895c;

    /* renamed from: d, reason: collision with root package name */
    public long f2896d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f2897f;

    public static void b(V v2) {
        RecyclerView recyclerView;
        int i = v2.j;
        if (v2.g() || (i & 4) != 0 || (recyclerView = v2.f2972r) == null) {
            return;
        }
        recyclerView.F(v2);
    }

    public abstract boolean a(V v2, V v3, C0019o c0019o, C0019o c0019o2);

    public final void c(V v2) {
        C0173x c0173x = this.f2893a;
        if (c0173x != null) {
            boolean z2 = true;
            v2.o(true);
            if (v2.f2964h != null && v2.i == null) {
                v2.f2964h = null;
            }
            v2.i = null;
            if ((v2.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0173x.f3135a;
            recyclerView.a0();
            I0.h hVar = recyclerView.e;
            C0173x c0173x2 = (C0173x) hVar.f591b;
            RecyclerView recyclerView2 = c0173x2.f3135a;
            View view = v2.f2958a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                hVar.v(view);
            } else {
                F1.a aVar = (F1.a) hVar.f592c;
                if (aVar.d(indexOfChild)) {
                    aVar.g(indexOfChild);
                    hVar.v(view);
                    c0173x2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                V I2 = RecyclerView.I(view);
                C0147M c0147m = recyclerView.f2014b;
                c0147m.j(I2);
                c0147m.g(I2);
            }
            recyclerView.b0(!z2);
            if (z2 || !v2.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(V v2);

    public abstract void e();

    public abstract boolean f();
}
