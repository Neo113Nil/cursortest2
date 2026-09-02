package b3;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements ListIterator, g3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f728g;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final a3.a f730j;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f727f = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f729h = -1;

    public a(c cVar, int i) {
        int i4;
        this.f730j = cVar;
        this.f728g = i;
        i4 = ((AbstractList) cVar).modCount;
        this.i = i4;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f730j).f734j).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i4;
        switch (this.f727f) {
            case 0:
                a();
                b bVar = (b) this.f730j;
                int i5 = this.f728g;
                this.f728g = i5 + 1;
                bVar.add(i5, obj);
                this.f729h = -1;
                i = ((AbstractList) bVar).modCount;
                this.i = i;
                break;
            default:
                b();
                c cVar = (c) this.f730j;
                int i6 = this.f728g;
                this.f728g = i6 + 1;
                cVar.add(i6, obj);
                this.f729h = -1;
                i4 = ((AbstractList) cVar).modCount;
                this.i = i4;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f730j)).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f727f) {
            case 0:
                if (this.f728g < ((b) this.f730j).f733h) {
                }
                break;
            default:
                if (this.f728g < ((c) this.f730j).f736g) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f727f) {
            case 0:
                if (this.f728g > 0) {
                }
                break;
            default:
                if (this.f728g > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f727f) {
            case 0:
                a();
                int i = this.f728g;
                b bVar = (b) this.f730j;
                if (i >= bVar.f733h) {
                    throw new NoSuchElementException();
                }
                this.f728g = i + 1;
                this.f729h = i;
                return bVar.f731f[bVar.f732g + i];
            default:
                b();
                int i4 = this.f728g;
                c cVar = (c) this.f730j;
                if (i4 >= cVar.f736g) {
                    throw new NoSuchElementException();
                }
                this.f728g = i4 + 1;
                this.f729h = i4;
                return cVar.f735f[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f727f) {
        }
        return this.f728g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f727f) {
            case 0:
                a();
                int i = this.f728g;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i - 1;
                this.f728g = i4;
                this.f729h = i4;
                b bVar = (b) this.f730j;
                return bVar.f731f[bVar.f732g + i4];
            default:
                b();
                int i5 = this.f728g;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f728g = i6;
                this.f729h = i6;
                return ((c) this.f730j).f735f[i6];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f727f) {
            case 0:
                i = this.f728g;
                break;
            default:
                i = this.f728g;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i4;
        switch (this.f727f) {
            case 0:
                b bVar = (b) this.f730j;
                a();
                int i5 = this.f729h;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.b(i5);
                this.f728g = this.f729h;
                this.f729h = -1;
                i = ((AbstractList) bVar).modCount;
                this.i = i;
                return;
            default:
                c cVar = (c) this.f730j;
                b();
                int i6 = this.f729h;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i6);
                this.f728g = this.f729h;
                this.f729h = -1;
                i4 = ((AbstractList) cVar).modCount;
                this.i = i4;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f727f) {
            case 0:
                a();
                int i = this.f729h;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f730j).set(i, obj);
                return;
            default:
                b();
                int i4 = this.f729h;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f730j).set(i4, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i4;
        this.f730j = bVar;
        this.f728g = i;
        i4 = ((AbstractList) bVar).modCount;
        this.i = i4;
    }
}
