package g1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f1671a;

    /* renamed from: e, reason: collision with root package name */
    public View f1674e;
    public int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final g f1672b = new g();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1673c = new ArrayList();

    public h(p0 p0Var) {
        this.f1671a = p0Var;
    }

    public final void a(View view, int i, boolean z4) {
        RecyclerView recyclerView = this.f1671a.f1752a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f1672b.e(childCount, z4);
        if (z4) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.M(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z4) {
        RecyclerView recyclerView = this.f1671a.f1752a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f1672b.e(childCount, z4);
        if (z4) {
            i(view);
        }
        q1 M = RecyclerView.M(view);
        if (M != null) {
            if (!M.j() && !M.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(M);
                throw new IllegalArgumentException(a4.b.e(recyclerView, sb));
            }
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "reAttach " + M);
            }
            M.f1774j &= -257;
        } else if (RecyclerView.G0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(a4.b.e(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f5 = f(i);
        this.f1672b.g(f5);
        RecyclerView recyclerView = this.f1671a.f1752a;
        View childAt = recyclerView.getChildAt(f5);
        if (childAt != null) {
            q1 M = RecyclerView.M(childAt);
            if (M != null) {
                if (M.j() && !M.o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(M);
                    throw new IllegalArgumentException(a4.b.e(recyclerView, sb));
                }
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "tmpDetach " + M);
                }
                M.a(256);
            }
        } else if (RecyclerView.G0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f5);
            throw new IllegalArgumentException(a4.b.e(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f5);
    }

    public final View d(int i) {
        return this.f1671a.f1752a.getChildAt(f(i));
    }

    public final int e() {
        return this.f1671a.f1752a.getChildCount() - this.f1673c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f1671a.f1752a.getChildCount();
        int i4 = i;
        while (i4 < childCount) {
            g gVar = this.f1672b;
            int b2 = i - (i4 - gVar.b(i4));
            if (b2 == 0) {
                while (gVar.d(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += b2;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f1671a.f1752a.getChildAt(i);
    }

    public final int h() {
        return this.f1671a.f1752a.getChildCount();
    }

    public final void i(View view) {
        this.f1673c.add(view);
        q1 M = RecyclerView.M(view);
        if (M != null) {
            View view2 = M.f1768a;
            RecyclerView recyclerView = this.f1671a.f1752a;
            int i = M.f1781q;
            if (i != -1) {
                M.f1780p = i;
            } else {
                M.f1780p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.P()) {
                view2.setImportantForAccessibility(4);
            } else {
                M.f1781q = 4;
                recyclerView.f801y0.add(M);
            }
        }
    }

    public final void j(View view) {
        q1 M;
        if (!this.f1673c.remove(view) || (M = RecyclerView.M(view)) == null) {
            return;
        }
        RecyclerView recyclerView = this.f1671a.f1752a;
        int i = M.f1780p;
        if (recyclerView.P()) {
            M.f1781q = i;
            recyclerView.f801y0.add(M);
        } else {
            M.f1768a.setImportantForAccessibility(i);
        }
        M.f1780p = 0;
    }

    public final String toString() {
        return this.f1672b.toString() + ", hidden list:" + this.f1673c.size();
    }
}
