package f0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2133a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f2134b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2135c = Integer.MIN_VALUE;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2137f;

    public f0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f2137f = staggeredGridLayoutManager;
        this.f2136e = i;
    }

    public final void a() {
        View view = (View) this.f2133a.get(r0.size() - 1);
        c0 c0Var = (c0) view.getLayoutParams();
        this.f2135c = this.f2137f.f1520r.b(view);
        c0Var.getClass();
    }

    public final void b() {
        this.f2133a.clear();
        this.f2134b = Integer.MIN_VALUE;
        this.f2135c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        return this.f2137f.f1525w ? e(r1.size() - 1, -1) : e(0, this.f2133a.size());
    }

    public final int d() {
        return this.f2137f.f1525w ? e(0, this.f2133a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2137f;
        int k2 = staggeredGridLayoutManager.f1520r.k();
        int g2 = staggeredGridLayoutManager.f1520r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f2133a.get(i);
            int e2 = staggeredGridLayoutManager.f1520r.e(view);
            int b2 = staggeredGridLayoutManager.f1520r.b(view);
            boolean z2 = e2 <= g2;
            boolean z3 = b2 >= k2;
            if (z2 && z3 && (e2 < k2 || b2 > g2)) {
                return I.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.f2135c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2133a.size() == 0) {
            return i;
        }
        a();
        return this.f2135c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.f2133a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2137f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1525w && I.H(view2) >= i) || ((!staggeredGridLayoutManager.f1525w && I.H(view2) <= i) || !view2.hasFocusable())) {
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
                if ((staggeredGridLayoutManager.f1525w && I.H(view3) <= i) || ((!staggeredGridLayoutManager.f1525w && I.H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.f2134b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2133a.size() == 0) {
            return i;
        }
        View view = (View) this.f2133a.get(0);
        c0 c0Var = (c0) view.getLayoutParams();
        this.f2134b = this.f2137f.f1520r.e(view);
        c0Var.getClass();
        return this.f2134b;
    }
}
