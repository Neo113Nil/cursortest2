package h0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2541a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f2542b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2543c = Integer.MIN_VALUE;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2545f;

    public j0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f2545f = staggeredGridLayoutManager;
        this.f2544e = i;
    }

    public final void a() {
        View view = (View) this.f2541a.get(r0.size() - 1);
        g0 g0Var = (g0) view.getLayoutParams();
        this.f2543c = this.f2545f.f1708r.b(view);
        g0Var.getClass();
    }

    public final void b() {
        this.f2541a.clear();
        this.f2542b = Integer.MIN_VALUE;
        this.f2543c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        return this.f2545f.f1713w ? e(r1.size() - 1, -1) : e(0, this.f2541a.size());
    }

    public final int d() {
        return this.f2545f.f1713w ? e(0, this.f2541a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2545f;
        int k2 = staggeredGridLayoutManager.f1708r.k();
        int g2 = staggeredGridLayoutManager.f1708r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f2541a.get(i);
            int e2 = staggeredGridLayoutManager.f1708r.e(view);
            int b2 = staggeredGridLayoutManager.f1708r.b(view);
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
        int i2 = this.f2543c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2541a.size() == 0) {
            return i;
        }
        a();
        return this.f2543c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.f2541a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2545f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1713w && J.H(view2) >= i) || ((!staggeredGridLayoutManager.f1713w && J.H(view2) <= i) || !view2.hasFocusable())) {
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
                if ((staggeredGridLayoutManager.f1713w && J.H(view3) <= i) || ((!staggeredGridLayoutManager.f1713w && J.H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.f2542b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f2541a.size() == 0) {
            return i;
        }
        View view = (View) this.f2541a.get(0);
        g0 g0Var = (g0) view.getLayoutParams();
        this.f2542b = this.f2545f.f1708r.e(view);
        g0Var.getClass();
        return this.f2542b;
    }
}
