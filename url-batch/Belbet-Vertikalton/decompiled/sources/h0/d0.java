package h0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3009a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f3010b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f3011c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f3012d = 0;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3013f;

    public d0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3013f = staggeredGridLayoutManager;
        this.e = i;
    }

    public final void a() {
        View view = (View) this.f3009a.get(r0.size() - 1);
        a0 a0Var = (a0) view.getLayoutParams();
        this.f3011c = this.f3013f.f2064r.b(view);
        a0Var.getClass();
    }

    public final void b() {
        this.f3009a.clear();
        this.f3010b = Integer.MIN_VALUE;
        this.f3011c = Integer.MIN_VALUE;
        this.f3012d = 0;
    }

    public final int c() {
        return this.f3013f.f2069w ? e(r1.size() - 1, -1) : e(0, this.f3009a.size());
    }

    public final int d() {
        return this.f3013f.f2069w ? e(0, this.f3009a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3013f;
        int k2 = staggeredGridLayoutManager.f2064r.k();
        int g2 = staggeredGridLayoutManager.f2064r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f3009a.get(i);
            int e = staggeredGridLayoutManager.f2064r.e(view);
            int b2 = staggeredGridLayoutManager.f2064r.b(view);
            boolean z2 = e <= g2;
            boolean z3 = b2 >= k2;
            if (z2 && z3 && (e < k2 || b2 > g2)) {
                return AbstractC0141G.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.f3011c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3009a.size() == 0) {
            return i;
        }
        a();
        return this.f3011c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.f3009a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3013f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2069w && AbstractC0141G.H(view2) >= i) || ((!staggeredGridLayoutManager.f2069w && AbstractC0141G.H(view2) <= i) || !view2.hasFocusable())) {
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
                if ((staggeredGridLayoutManager.f2069w && AbstractC0141G.H(view3) <= i) || ((!staggeredGridLayoutManager.f2069w && AbstractC0141G.H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.f3010b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3009a.size() == 0) {
            return i;
        }
        View view = (View) this.f3009a.get(0);
        a0 a0Var = (a0) view.getLayoutParams();
        this.f3010b = this.f3013f.f2064r.e(view);
        a0Var.getClass();
        return this.f3010b;
    }
}
