package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hgs implements ListIterator {
    int a;
    hgr b;
    hgr c;
    hgr d;
    int e;
    final /* synthetic */ hgu f;

    public hgs(hgu hguVar, int i) {
        this.f = hguVar;
        this.e = hguVar.f;
        int i2 = hguVar.e;
        hoq.P(i, i2);
        if (i >= i2 / 2) {
            this.d = hguVar.b;
            this.a = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.b = hguVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.c = null;
    }

    private final void c() {
        if (this.f.f != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hgr next() {
        c();
        hgr hgrVar = this.b;
        if (hgrVar == null) {
            throw new NoSuchElementException();
        }
        this.c = hgrVar;
        this.d = hgrVar;
        this.b = hgrVar.a;
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hgr previous() {
        c();
        hgr hgrVar = this.d;
        if (hgrVar == null) {
            throw new NoSuchElementException();
        }
        this.c = hgrVar;
        this.b = hgrVar;
        this.d = hgrVar.b;
        this.a--;
        return this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        c();
        return this.b != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        c();
        return this.d != null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        hoq.I(this.c != null, "no calls to next() since the last call to remove()");
        hgr hgrVar = this.c;
        if (hgrVar != this.b) {
            this.d = hgrVar.b;
            this.a--;
        } else {
            this.b = hgrVar.a;
        }
        hgu hguVar = this.f;
        hguVar.l(hgrVar);
        this.c = null;
        this.e = hguVar.f;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
