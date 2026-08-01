package g0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2435a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f2436b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2437c = Integer.MIN_VALUE;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2439f;

    public i0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f2439f = staggeredGridLayoutManager;
        this.f2438e = i;
    }

    public final void a() {
        View view = (View) this.f2435a.get(r0.size() - 1);
        f0 f0Var = (f0) view.getLayoutParams();
        this.f2437c = this.f2439f.f1645r.b(view);
        f0Var.getClass();
    }

    public final void b() {
        this.f2435a.clear();
        this.f2436b = Integer.MIN_VALUE;
        this.f2437c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        return this.f2439f.f1650w ? e(r1.size() - 1, -1) : e(0, this.f2435a.size());
    }

    public final int d() {
        return this.f2439f.f1650w ? e(0, this.f2435a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2439f;
        int k2 = staggeredGridLayoutManager.f1645r.k();
        int g2 = staggeredGridLayoutManager.f1645r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f2435a.get(i);
            int e2 = staggeredGridLayoutManager.f1645r.e(view);
            int b2 = staggeredGridLayoutManager.f1645r.b(view);
            boolean z2 = e2 <= g2;
            boolean z3 = b2 >= k2;
            if (z2 && z3 && (e2 < k2 || b2 > g2)) {
                return J.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.f2437c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2435a.size() == 0) {
            return i;
        }
        a();
        return this.f2437c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.f2435a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2439f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1650w && J.H(view2) >= i) || ((!staggeredGridLayoutManager.f1650w && J.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f1650w && J.H(view3) <= i) || ((!staggeredGridLayoutManager.f1650w && J.H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.f2436b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2435a.size() == 0) {
            return i;
        }
        View view = (View) this.f2435a.get(0);
        f0 f0Var = (f0) view.getLayoutParams();
        this.f2436b = this.f2439f.f1645r.e(view);
        f0Var.getClass();
        return this.f2436b;
    }
}
