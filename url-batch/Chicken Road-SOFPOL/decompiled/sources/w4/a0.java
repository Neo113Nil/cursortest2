package w4;

import a0.g1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import u.i1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public w f7878a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7879b;

    /* renamed from: c, reason: collision with root package name */
    public long f7880c;

    /* renamed from: d, reason: collision with root package name */
    public long f7881d;

    /* renamed from: e, reason: collision with root package name */
    public long f7882e;

    /* renamed from: f, reason: collision with root package name */
    public long f7883f;

    public final void a(p0 p0Var) {
        w wVar = this.f7878a;
        if (wVar != null) {
            RecyclerView recyclerView = wVar.f8055a;
            boolean z3 = true;
            p0Var.m(true);
            if ((p0Var.f8005b & 16) != 0) {
                return;
            }
            j0 j0Var = recyclerView.f911d;
            recyclerView.F();
            g1 g1Var = recyclerView.f917g;
            i1 i1Var = (i1) g1Var.f85c;
            w wVar2 = (w) g1Var.f84b;
            int indexOfChild = wVar2.f8055a.indexOfChild(null);
            if (indexOfChild == -1) {
                g1Var.O(null);
            } else if (i1Var.e(indexOfChild)) {
                i1Var.h(indexOfChild);
                g1Var.O(null);
                wVar2.a(indexOfChild);
            } else {
                z3 = false;
            }
            if (z3) {
                p0 s5 = RecyclerView.s(null);
                j0Var.j(s5);
                j0Var.h(s5);
            }
            recyclerView.G(!z3);
            if (z3 || !p0Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(null, false);
        }
    }

    public abstract void b(p0 p0Var);

    public abstract void c();

    public abstract boolean d();
}
