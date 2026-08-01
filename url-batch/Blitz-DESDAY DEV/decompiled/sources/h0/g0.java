package h0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2497a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f2498b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2499c = Integer.MIN_VALUE;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2501f;

    public g0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f2501f = staggeredGridLayoutManager;
        this.f2500e = i;
    }

    public final void a() {
        View view = (View) this.f2497a.get(r0.size() - 1);
        d0 d0Var = (d0) view.getLayoutParams();
        this.f2499c = this.f2501f.f1693r.b(view);
        d0Var.getClass();
    }

    public final void b() {
        this.f2497a.clear();
        this.f2498b = Integer.MIN_VALUE;
        this.f2499c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        return this.f2501f.f1698w ? e(r1.size() - 1, -1) : e(0, this.f2497a.size());
    }

    public final int d() {
        return this.f2501f.f1698w ? e(0, this.f2497a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2501f;
        int k2 = staggeredGridLayoutManager.f1693r.k();
        int g2 = staggeredGridLayoutManager.f1693r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f2497a.get(i);
            int e2 = staggeredGridLayoutManager.f1693r.e(view);
            int b2 = staggeredGridLayoutManager.f1693r.b(view);
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
        int i2 = this.f2499c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2497a.size() == 0) {
            return i;
        }
        a();
        return this.f2499c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.f2497a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2501f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1698w && I.H(view2) >= i) || ((!staggeredGridLayoutManager.f1698w && I.H(view2) <= i) || !view2.hasFocusable())) {
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
                if ((staggeredGridLayoutManager.f1698w && I.H(view3) <= i) || ((!staggeredGridLayoutManager.f1698w && I.H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.f2498b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2497a.size() == 0) {
            return i;
        }
        View view = (View) this.f2497a.get(0);
        d0 d0Var = (d0) view.getLayoutParams();
        this.f2498b = this.f2501f.f1693r.e(view);
        d0Var.getClass();
        return this.f2498b;
    }
}
