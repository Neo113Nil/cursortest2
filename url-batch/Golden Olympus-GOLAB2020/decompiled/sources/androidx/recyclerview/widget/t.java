package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class t extends RecyclerView.m {

    /* renamed from: g, reason: collision with root package name */
    boolean f13175g = true;

    public final void A(RecyclerView.E e4) {
        I(e4);
        h(e4);
    }

    public final void B(RecyclerView.E e4) {
        J(e4);
    }

    public final void C(RecyclerView.E e4, boolean z4) {
        K(e4, z4);
        h(e4);
    }

    public final void D(RecyclerView.E e4, boolean z4) {
        L(e4, z4);
    }

    public final void E(RecyclerView.E e4) {
        M(e4);
        h(e4);
    }

    public final void F(RecyclerView.E e4) {
        N(e4);
    }

    public final void G(RecyclerView.E e4) {
        O(e4);
        h(e4);
    }

    public final void H(RecyclerView.E e4) {
        P(e4);
    }

    public void I(RecyclerView.E e4) {
    }

    public void J(RecyclerView.E e4) {
    }

    public void K(RecyclerView.E e4, boolean z4) {
    }

    public void L(RecyclerView.E e4, boolean z4) {
    }

    public void M(RecyclerView.E e4) {
    }

    public void N(RecyclerView.E e4) {
    }

    public void O(RecyclerView.E e4) {
    }

    public void P(RecyclerView.E e4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.E e4, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i4;
        int i5;
        return (bVar == null || ((i4 = bVar.f12916a) == (i5 = bVar2.f12916a) && bVar.f12917b == bVar2.f12917b)) ? w(e4) : y(e4, i4, bVar.f12917b, i5, bVar2.f12917b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.E e4, RecyclerView.E e5, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i4;
        int i5;
        int i6 = bVar.f12916a;
        int i7 = bVar.f12917b;
        if (e5.shouldIgnore()) {
            int i8 = bVar.f12916a;
            i5 = bVar.f12917b;
            i4 = i8;
        } else {
            i4 = bVar2.f12916a;
            i5 = bVar2.f12917b;
        }
        return x(e4, e5, i6, i7, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.E e4, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i4 = bVar.f12916a;
        int i5 = bVar.f12917b;
        View view = e4.itemView;
        int left = bVar2 == null ? view.getLeft() : bVar2.f12916a;
        int top = bVar2 == null ? view.getTop() : bVar2.f12917b;
        if (e4.isRemoved() || (i4 == left && i5 == top)) {
            return z(e4);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(e4, i4, i5, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.E e4, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i4 = bVar.f12916a;
        int i5 = bVar2.f12916a;
        if (i4 != i5 || bVar.f12917b != bVar2.f12917b) {
            return y(e4, i4, bVar.f12917b, i5, bVar2.f12917b);
        }
        E(e4);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.E e4) {
        return !this.f13175g || e4.isInvalid();
    }

    public abstract boolean w(RecyclerView.E e4);

    public abstract boolean x(RecyclerView.E e4, RecyclerView.E e5, int i4, int i5, int i6, int i7);

    public abstract boolean y(RecyclerView.E e4, int i4, int i5, int i6, int i7);

    public abstract boolean z(RecyclerView.E e4);
}
