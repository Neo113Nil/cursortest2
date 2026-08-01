package g0;

import G1.AbstractC0001b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138b {

    /* renamed from: a, reason: collision with root package name */
    public final C0160y f2798a;

    /* renamed from: e, reason: collision with root package name */
    public View f2801e;
    public int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final F1.a f2799b = new F1.a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2800c = new ArrayList();

    public C0138b(C0160y c0160y) {
        this.f2798a = c0160y;
    }

    public final void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = this.f2798a.f2954a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f2799b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.L(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = this.f2798a.f2954a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f2799b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        Y L2 = RecyclerView.L(view);
        if (L2 != null) {
            if (!L2.k() && !L2.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(L2);
                throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, sb));
            }
            if (RecyclerView.f1944y0) {
                Log.d("RecyclerView", "reAttach " + L2);
            }
            L2.f2783j &= -257;
        } else if (RecyclerView.f1943x0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f2 = f(i);
        this.f2799b.g(f2);
        RecyclerView recyclerView = this.f2798a.f2954a;
        View childAt = recyclerView.getChildAt(f2);
        if (childAt != null) {
            Y L2 = RecyclerView.L(childAt);
            if (L2 != null) {
                if (L2.k() && !L2.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(L2);
                    throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, sb));
                }
                if (RecyclerView.f1944y0) {
                    Log.d("RecyclerView", "tmpDetach " + L2);
                }
                L2.a(256);
            }
        } else if (RecyclerView.f1943x0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f2);
            throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f2);
    }

    public final View d(int i) {
        return this.f2798a.f2954a.getChildAt(f(i));
    }

    public final int e() {
        return this.f2798a.f2954a.getChildCount() - this.f2800c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f2798a.f2954a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            F1.a aVar = this.f2799b;
            int b2 = i - (i2 - aVar.b(i2));
            if (b2 == 0) {
                while (aVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f2798a.f2954a.getChildAt(i);
    }

    public final int h() {
        return this.f2798a.f2954a.getChildCount();
    }

    public final void i(View view) {
        this.f2800c.add(view);
        C0160y c0160y = this.f2798a;
        Y L2 = RecyclerView.L(view);
        if (L2 != null) {
            int i = L2.f2790q;
            View view2 = L2.f2777a;
            if (i != -1) {
                L2.f2789p = i;
            } else {
                WeakHashMap weakHashMap = K.Q.f578a;
                L2.f2789p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0160y.f2954a;
            if (recyclerView.O()) {
                L2.f2790q = 4;
                recyclerView.f1999r0.add(L2);
            } else {
                WeakHashMap weakHashMap2 = K.Q.f578a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        if (this.f2800c.remove(view)) {
            C0160y c0160y = this.f2798a;
            Y L2 = RecyclerView.L(view);
            if (L2 != null) {
                int i = L2.f2789p;
                RecyclerView recyclerView = c0160y.f2954a;
                if (recyclerView.O()) {
                    L2.f2790q = i;
                    recyclerView.f1999r0.add(L2);
                } else {
                    WeakHashMap weakHashMap = K.Q.f578a;
                    L2.f2777a.setImportantForAccessibility(i);
                }
                L2.f2789p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2799b.toString() + ", hidden list:" + this.f2800c.size();
    }
}
