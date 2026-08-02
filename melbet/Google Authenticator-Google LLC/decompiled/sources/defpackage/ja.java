package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ja {
    public View d;
    public final kee e;
    public int c = 0;
    public final iz a = new iz();
    public final List b = new ArrayList();

    public ja(kee keeVar) {
        this.e = keeVar;
    }

    public final int a() {
        return this.e.B() - this.b.size();
    }

    public final int b(int i) {
        if (i < 0) {
            return -1;
        }
        int B = this.e.B();
        int i2 = i;
        while (i2 < B) {
            iz izVar = this.a;
            int a = i - (i2 - izVar.a(i2));
            if (a == 0) {
                while (izVar.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += a;
        }
        return -1;
    }

    public final int c() {
        return this.e.B();
    }

    final int d(View view) {
        int C = this.e.C(view);
        if (C != -1) {
            iz izVar = this.a;
            if (!izVar.f(C)) {
                return C - izVar.a(C);
            }
        }
        return -1;
    }

    public final View e(int i) {
        return this.e.D(b(i));
    }

    public final View f(int i) {
        return this.e.D(i);
    }

    public final void g(View view, int i, boolean z) {
        int B = i < 0 ? this.e.B() : b(0);
        this.a.c(B, z);
        if (z) {
            j(view);
        }
        RecyclerView recyclerView = (RecyclerView) this.e.a;
        recyclerView.addView(view, B);
        lp h = RecyclerView.h(view);
        kr krVar = recyclerView.l;
        if (krVar != null && h != null) {
            krVar.m(h);
        }
        List list = recyclerView.v;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((la) recyclerView.v.get(size)).a(view);
            }
        }
    }

    public final void h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int B = i < 0 ? this.e.B() : b(i);
        this.a.c(B, z);
        if (z) {
            j(view);
        }
        kee keeVar = this.e;
        lp h = RecyclerView.h(view);
        if (h != null) {
            if (!h.w() && !h.z()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + h + ((RecyclerView) keeVar.a).k());
            }
            h.i();
        }
        ((RecyclerView) keeVar.a).attachViewToParent(view, B, layoutParams);
    }

    final void i(int i) {
        iz izVar = this.a;
        int b = b(i);
        izVar.g(b);
        kee keeVar = this.e;
        View D = keeVar.D(b);
        if (D != null) {
            lp h = RecyclerView.h(D);
            if (h != null) {
                if (h.w() && !h.z()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + h + ((RecyclerView) keeVar.a).k());
                }
                h.e(256);
            }
        } else {
            int i2 = RecyclerView.aa;
        }
        ((RecyclerView) keeVar.a).detachViewFromParent(b);
    }

    public final void j(View view) {
        this.b.add(view);
        lp h = RecyclerView.h(view);
        if (h != null) {
            kee keeVar = this.e;
            int i = h.p;
            if (i != -1) {
                h.o = i;
            } else {
                h.o = h.a.getImportantForAccessibility();
            }
            ((RecyclerView) keeVar.a).an(h, 4);
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.E(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
