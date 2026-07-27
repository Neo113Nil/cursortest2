package d2;

import java.util.Comparator;
import java.util.Iterator;
import o2.C0924c;

/* loaded from: classes.dex */
public final class n extends AbstractC0546c {

    /* renamed from: d, reason: collision with root package name */
    public final i f6087d;

    /* renamed from: e, reason: collision with root package name */
    public final Comparator f6088e;

    public n(i iVar, Comparator comparator) {
        this.f6087d = iVar;
        this.f6088e = comparator;
    }

    @Override // d2.AbstractC0546c
    public final Object B(Object obj) {
        i iVar = this.f6087d;
        i iVar2 = null;
        while (!iVar.isEmpty()) {
            int compare = this.f6088e.compare(obj, iVar.getKey());
            if (compare == 0) {
                if (iVar.i().isEmpty()) {
                    if (iVar2 != null) {
                        return iVar2.getKey();
                    }
                    return null;
                }
                i i2 = iVar.i();
                while (!i2.f().isEmpty()) {
                    i2 = i2.f();
                }
                return i2.getKey();
            }
            if (compare < 0) {
                iVar = iVar.i();
            } else {
                iVar2 = iVar;
                iVar = iVar.f();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    @Override // d2.AbstractC0546c
    public final void C(u3.d dVar) {
        this.f6087d.n(dVar);
    }

    @Override // d2.AbstractC0546c
    public final AbstractC0546c D(Iterable iterable, Object obj) {
        i iVar = this.f6087d;
        Comparator comparator = this.f6088e;
        return new n(((k) iVar.j(obj, iterable, comparator)).k(2, null, null), comparator);
    }

    @Override // d2.AbstractC0546c
    public final AbstractC0546c E(Object obj) {
        if (!e(obj)) {
            return this;
        }
        i iVar = this.f6087d;
        Comparator comparator = this.f6088e;
        return new n(iVar.l(obj, comparator).k(2, null, null), comparator);
    }

    public final i F(Object obj) {
        i iVar = this.f6087d;
        while (!iVar.isEmpty()) {
            int compare = this.f6088e.compare(obj, iVar.getKey());
            if (compare < 0) {
                iVar = iVar.i();
            } else {
                if (compare == 0) {
                    return iVar;
                }
                iVar = iVar.f();
            }
        }
        return null;
    }

    @Override // d2.AbstractC0546c
    public final boolean e(Object obj) {
        return F(obj) != null;
    }

    @Override // d2.AbstractC0546c
    public final Object h(C0924c c0924c) {
        i F3 = F(c0924c);
        if (F3 != null) {
            return F3.getValue();
        }
        return null;
    }

    @Override // d2.AbstractC0546c
    public final boolean isEmpty() {
        return this.f6087d.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0547d(this.f6087d, this.f6088e, false);
    }

    @Override // d2.AbstractC0546c
    public final Comparator j() {
        return this.f6088e;
    }

    @Override // d2.AbstractC0546c
    public final Object s() {
        return this.f6087d.p().getKey();
    }

    @Override // d2.AbstractC0546c
    public final int size() {
        return this.f6087d.size();
    }

    @Override // d2.AbstractC0546c
    public final Object w() {
        return this.f6087d.m().getKey();
    }

    @Override // d2.AbstractC0546c
    public final Iterator x() {
        return new C0547d(this.f6087d, this.f6088e, true);
    }
}
