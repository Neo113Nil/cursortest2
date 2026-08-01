package h0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121c {

    /* renamed from: a, reason: collision with root package name */
    public final C0113A f2476a;

    /* renamed from: e, reason: collision with root package name */
    public View f2479e;
    public int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0120b f2477b = new C0120b();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2478c = new ArrayList();

    public C0121c(C0113A c0113a) {
        this.f2476a = c0113a;
    }

    public final void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = this.f2476a.f2382a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f2477b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.L(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = this.f2476a.f2382a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f2477b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        a0 L2 = RecyclerView.L(view);
        if (L2 != null) {
            if (!L2.k() && !L2.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(L2);
                throw new IllegalArgumentException(Z.V.d(recyclerView, sb));
            }
            if (RecyclerView.f1627y0) {
                Log.d("RecyclerView", "reAttach " + L2);
            }
            L2.f2462j &= -257;
        } else if (RecyclerView.f1626x0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(Z.V.d(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f2 = f(i);
        this.f2477b.g(f2);
        RecyclerView recyclerView = this.f2476a.f2382a;
        View childAt = recyclerView.getChildAt(f2);
        if (childAt != null) {
            a0 L2 = RecyclerView.L(childAt);
            if (L2 != null) {
                if (L2.k() && !L2.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(L2);
                    throw new IllegalArgumentException(Z.V.d(recyclerView, sb));
                }
                if (RecyclerView.f1627y0) {
                    Log.d("RecyclerView", "tmpDetach " + L2);
                }
                L2.a(256);
            }
        } else if (RecyclerView.f1626x0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f2);
            throw new IllegalArgumentException(Z.V.d(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f2);
    }

    public final View d(int i) {
        return this.f2476a.f2382a.getChildAt(f(i));
    }

    public final int e() {
        return this.f2476a.f2382a.getChildCount() - this.f2478c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f2476a.f2382a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0120b c0120b = this.f2477b;
            int b2 = i - (i2 - c0120b.b(i2));
            if (b2 == 0) {
                while (c0120b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f2476a.f2382a.getChildAt(i);
    }

    public final int h() {
        return this.f2476a.f2382a.getChildCount();
    }

    public final void i(View view) {
        this.f2478c.add(view);
        C0113A c0113a = this.f2476a;
        a0 L2 = RecyclerView.L(view);
        if (L2 != null) {
            int i = L2.f2469q;
            View view2 = L2.f2455a;
            if (i != -1) {
                L2.f2468p = i;
            } else {
                WeakHashMap weakHashMap = L.T.f490a;
                L2.f2468p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0113a.f2382a;
            if (recyclerView.O()) {
                L2.f2469q = 4;
                recyclerView.f1682r0.add(L2);
            } else {
                WeakHashMap weakHashMap2 = L.T.f490a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        if (this.f2478c.remove(view)) {
            C0113A c0113a = this.f2476a;
            a0 L2 = RecyclerView.L(view);
            if (L2 != null) {
                int i = L2.f2468p;
                RecyclerView recyclerView = c0113a.f2382a;
                if (recyclerView.O()) {
                    L2.f2469q = i;
                    recyclerView.f1682r0.add(L2);
                } else {
                    WeakHashMap weakHashMap = L.T.f490a;
                    L2.f2455a.setImportantForAccessibility(i);
                }
                L2.f2468p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2477b.toString() + ", hidden list:" + this.f2478c.size();
    }
}
