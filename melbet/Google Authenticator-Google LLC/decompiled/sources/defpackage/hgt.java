package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hgt implements ListIterator {
    final Object a;
    int b;
    hgr c;
    hgr d;
    hgr e;
    final /* synthetic */ hgu f;

    public hgt(hgu hguVar, Object obj, int i) {
        this.f = hguVar;
        hgq hgqVar = (hgq) hguVar.d.get(obj);
        int i2 = hgqVar == null ? 0 : hgqVar.c;
        hoq.P(i, i2);
        if (i >= i2 / 2) {
            this.e = hgqVar == null ? null : hgqVar.b;
            this.b = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.c = hgqVar == null ? null : hgqVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.a = obj;
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.e = this.f.a(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        hgr hgrVar = this.c;
        if (hgrVar == null) {
            throw new NoSuchElementException();
        }
        this.d = hgrVar;
        this.e = hgrVar;
        this.c = hgrVar.c;
        this.b++;
        return this.d.getValue();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        hgr hgrVar = this.e;
        if (hgrVar == null) {
            throw new NoSuchElementException();
        }
        this.d = hgrVar;
        this.c = hgrVar;
        this.e = hgrVar.d;
        this.b--;
        return this.d.getValue();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        hoq.I(this.d != null, "no calls to next() since the last call to remove()");
        hgr hgrVar = this.d;
        if (hgrVar != this.c) {
            this.e = hgrVar.d;
            this.b--;
        } else {
            this.c = hgrVar.c;
        }
        this.f.l(hgrVar);
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        hoq.H(this.d != null);
        this.d.setValue(obj);
    }

    public hgt(hgu hguVar, Object obj) {
        this.f = hguVar;
        this.a = obj;
        hgq hgqVar = (hgq) hguVar.d.get(obj);
        this.c = hgqVar == null ? null : hgqVar.a;
    }
}
