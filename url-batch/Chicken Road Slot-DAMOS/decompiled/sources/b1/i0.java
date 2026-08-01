package b1;

import java.util.ListIterator;
import kotlin.collections.s0;
import kotlin.collections.t0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 implements ListIterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f987d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f988e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f989i;

    public i0(t0 t0Var, int i3) {
        this.f989i = t0Var;
        this.f988e = t0Var.f5585e.listIterator(kotlin.collections.e0.p(i3, t0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f987d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ListIterator listIterator = (ListIterator) this.f988e;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f987d) {
            case 0:
                if (((wd.a0) this.f988e).f10139d < ((j0) this.f989i).f994r - 1) {
                }
                break;
        }
        return ((ListIterator) this.f988e).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f987d) {
            case 0:
                if (((wd.a0) this.f988e).f10139d >= 0) {
                }
                break;
        }
        return ((ListIterator) this.f988e).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f987d) {
            case 0:
                wd.a0 a0Var = (wd.a0) this.f988e;
                int i3 = a0Var.f10139d + 1;
                j0 j0Var = (j0) this.f989i;
                x.a(i3, j0Var.f994r);
                a0Var.f10139d = i3;
                break;
        }
        return ((ListIterator) this.f988e).previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f987d) {
            case 0:
                return ((wd.a0) this.f988e).f10139d + 1;
            case 1:
                s0 s0Var = (s0) this.f989i;
                return (s0Var.size() - 1) - ((ListIterator) this.f988e).previousIndex();
            default:
                t0 t0Var = (t0) this.f989i;
                return (t0Var.size() - 1) - ((ListIterator) this.f988e).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f987d) {
            case 0:
                wd.a0 a0Var = (wd.a0) this.f988e;
                int i3 = a0Var.f10139d;
                j0 j0Var = (j0) this.f989i;
                x.a(i3, j0Var.f994r);
                a0Var.f10139d = i3 - 1;
                break;
        }
        return ((ListIterator) this.f988e).next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f987d) {
            case 0:
                return ((wd.a0) this.f988e).f10139d;
            case 1:
                s0 s0Var = (s0) this.f989i;
                return (s0Var.size() - 1) - ((ListIterator) this.f988e).nextIndex();
            default:
                t0 t0Var = (t0) this.f989i;
                return (t0Var.size() - 1) - ((ListIterator) this.f988e).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f987d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f988e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f987d) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f988e).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i0(s0 s0Var, int i3) {
        this.f989i = s0Var;
        this.f988e = s0Var.f5584d.listIterator(kotlin.collections.e0.p(i3, s0Var));
    }

    public i0(wd.a0 a0Var, j0 j0Var) {
        this.f988e = a0Var;
        this.f989i = j0Var;
    }
}
