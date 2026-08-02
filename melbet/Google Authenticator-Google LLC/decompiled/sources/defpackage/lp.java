package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lp {
    public static final /* synthetic */ int s = 0;
    private static final List t = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    int j;
    RecyclerView q;
    kr r;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    int g = -1;
    public lp h = null;
    public lp i = null;
    List k = null;
    List l = null;
    private int u = 0;
    le m = null;
    boolean n = false;
    public int o = 0;
    public int p = -1;

    public lp(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    final boolean A() {
        return (this.j & 32) != 0;
    }

    public final FrameLayout B() {
        return (FrameLayout) this.a;
    }

    public final int a() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.b(this);
    }

    public final int b() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List c() {
        List list;
        return ((this.j & 1024) != 0 || (list = this.k) == null || list.size() == 0) ? t : this.l;
    }

    public final void d(Object obj) {
        if (obj == null) {
            e(1024);
            return;
        }
        if ((1024 & this.j) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = DesugarCollections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void e(int i) {
        this.j = i | this.j;
    }

    public final void f() {
        this.d = -1;
        this.g = -1;
    }

    final void g() {
        List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    final void h() {
        this.j &= -33;
    }

    public final void i() {
        this.j &= -257;
    }

    public final void j(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((kz) view.getLayoutParams()).e = true;
        }
    }

    final void k() {
        int i = RecyclerView.aa;
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.u = 0;
        this.h = null;
        this.i = null;
        g();
        this.o = 0;
        this.p = -1;
        RecyclerView.u(this);
    }

    public final void l(int i, int i2) {
        this.j = (i & i2) | (this.j & (~i2));
    }

    public final void m(boolean z) {
        int i;
        int i2 = this.u;
        int i3 = z ? i2 - 1 : i2 + 1;
        this.u = i3;
        if (i3 < 0) {
            this.u = 0;
            int i4 = RecyclerView.aa;
            toString();
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else {
            if (!z && i3 == 1) {
                i = this.j | 16;
            } else if (z && i3 == 0) {
                i = this.j & (-17);
            }
            this.j = i;
        }
        int i5 = RecyclerView.aa;
    }

    final void n(le leVar, boolean z) {
        this.m = leVar;
        this.n = z;
    }

    final void o() {
        this.m.l(this);
    }

    public final boolean p(int i) {
        return (this.j & i) != 0;
    }

    final boolean q() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.q) ? false : true;
    }

    public final boolean r() {
        return (this.j & 1) != 0;
    }

    public final boolean s() {
        return (this.j & 4) != 0;
    }

    public final boolean t() {
        if ((this.j & 16) != 0) {
            return false;
        }
        View view = this.a;
        int i = yq.a;
        return !view.hasTransientState();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (v()) {
            sb.append(" scrap ");
            sb.append(true != this.n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (s()) {
            sb.append(" invalid");
        }
        if (!r()) {
            sb.append(" unbound");
        }
        if (y()) {
            sb.append(" update");
        }
        if (u()) {
            sb.append(" removed");
        }
        if (z()) {
            sb.append(" ignored");
        }
        if (w()) {
            sb.append(" tmpDetached");
        }
        if (!t()) {
            sb.append(" not recyclable(" + this.u + ")");
        }
        if ((this.j & 512) != 0 || s()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return (this.j & 8) != 0;
    }

    final boolean v() {
        return this.m != null;
    }

    public final boolean w() {
        return (this.j & 256) != 0;
    }

    public final boolean x() {
        return (this.j & 2) != 0;
    }

    final boolean y() {
        return (this.j & 2) != 0;
    }

    public final boolean z() {
        return (this.j & 128) != 0;
    }
}
