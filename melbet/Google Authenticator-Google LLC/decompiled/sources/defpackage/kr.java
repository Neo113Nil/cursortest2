package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kr {
    public final ks b = new ks();
    public boolean c = false;
    public final int d = 1;

    public abstract int a();

    public int b(int i) {
        return 0;
    }

    public long c(int i) {
        return -1L;
    }

    public abstract lp d(ViewGroup viewGroup, int i);

    public final void e() {
        this.b.a();
    }

    public final void f(int i) {
        this.b.c(i, 1, null);
    }

    public final void g(int i, int i2) {
        this.b.b(i, i2);
    }

    public final void h(int i, int i2) {
        this.b.d(i, i2);
    }

    public final void i(int i, int i2) {
        this.b.e(i, i2);
    }

    public abstract void k(lp lpVar, int i);

    public final void o(boolean z) {
        if (this.b.f()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.c = z;
    }

    public final void p(int i, int i2) {
        this.b.c(i, i2, null);
    }

    public boolean q() {
        return false;
    }

    public final void r(kt ktVar) {
        this.b.registerObserver(ktVar);
    }

    public final void s(kt ktVar) {
        this.b.unregisterObserver(ktVar);
    }

    public void j(RecyclerView recyclerView) {
    }

    public void l(RecyclerView recyclerView) {
    }

    public void m(lp lpVar) {
    }

    public void n(lp lpVar) {
    }
}
