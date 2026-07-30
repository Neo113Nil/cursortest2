package f6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import q0.q;
import r1.r;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements ListIterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3396f;

    /* renamed from: g, reason: collision with root package name */
    public int f3397g;

    /* renamed from: h, reason: collision with root package name */
    public int f3398h;

    /* renamed from: i, reason: collision with root package name */
    public int f3399i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3400j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r rVar, int i7, int i8) {
        this(rVar, (i8 & 1) != 0 ? 0 : i7, 0, rVar.f7889i);
        this.f3396f = 3;
    }

    public void a() {
        int i7;
        i7 = ((AbstractList) ((b) this.f3400j).f3405j).modCount;
        if (i7 != this.f3399i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i7;
        int i8;
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a();
                b bVar = (b) this.f3400j;
                int i9 = this.f3397g;
                this.f3397g = i9 + 1;
                bVar.add(i9, obj);
                this.f3398h = -1;
                i7 = ((AbstractList) bVar).modCount;
                this.f3399i = i7;
                return;
            case 1:
                b();
                c cVar = (c) this.f3400j;
                int i10 = this.f3397g;
                this.f3397g = i10 + 1;
                cVar.add(i10, obj);
                this.f3398h = -1;
                i8 = ((AbstractList) cVar).modCount;
                this.f3399i = i8;
                return;
            case 2:
                c();
                q qVar = (q) this.f3400j;
                qVar.add(this.f3397g + 1, obj);
                this.f3398h = -1;
                this.f3397g++;
                this.f3399i = qVar.x();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        int i7;
        i7 = ((AbstractList) ((c) this.f3400j)).modCount;
        if (i7 != this.f3399i) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((q) this.f3400j).x() != this.f3399i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.f3397g < ((b) this.f3400j).f3403h;
            case 1:
                return this.f3397g < ((c) this.f3400j).f3408g;
            case 2:
                return this.f3397g < ((q) this.f3400j).size() - 1;
            default:
                return this.f3397g < this.f3399i;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.f3397g > 0) {
                }
                break;
            case 1:
                if (this.f3397g > 0) {
                }
                break;
            case 2:
                if (this.f3397g >= 0) {
                }
                break;
            default:
                if (this.f3397g > this.f3398h) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a();
                int i7 = this.f3397g;
                b bVar = (b) this.f3400j;
                if (i7 >= bVar.f3403h) {
                    throw new NoSuchElementException();
                }
                this.f3397g = i7 + 1;
                this.f3398h = i7;
                return bVar.f3401f[bVar.f3402g + i7];
            case 1:
                b();
                int i8 = this.f3397g;
                c cVar = (c) this.f3400j;
                if (i8 >= cVar.f3408g) {
                    throw new NoSuchElementException();
                }
                this.f3397g = i8 + 1;
                this.f3398h = i8;
                return cVar.f3407f[i8];
            case 2:
                c();
                int i9 = this.f3397g + 1;
                this.f3398h = i9;
                q qVar = (q) this.f3400j;
                q0.r.a(i9, qVar.size());
                Object obj = qVar.get(i9);
                this.f3397g = i9;
                return obj;
            default:
                Object[] objArr = ((r) this.f3400j).f7886f;
                int i10 = this.f3397g;
                this.f3397g = i10 + 1;
                Object obj2 = objArr[i10];
                k.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (n) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.f3397g;
            case 1:
                return this.f3397g;
            case 2:
                return this.f3397g + 1;
            default:
                return this.f3397g - this.f3398h;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a();
                int i7 = this.f3397g;
                if (i7 <= 0) {
                    throw new NoSuchElementException();
                }
                int i8 = i7 - 1;
                this.f3397g = i8;
                this.f3398h = i8;
                b bVar = (b) this.f3400j;
                return bVar.f3401f[bVar.f3402g + i8];
            case 1:
                b();
                int i9 = this.f3397g;
                if (i9 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i9 - 1;
                this.f3397g = i10;
                this.f3398h = i10;
                return ((c) this.f3400j).f3407f[i10];
            case 2:
                c();
                int i11 = this.f3397g;
                q qVar = (q) this.f3400j;
                q0.r.a(i11, qVar.size());
                int i12 = this.f3397g;
                this.f3398h = i12;
                this.f3397g--;
                return qVar.get(i12);
            default:
                Object[] objArr = ((r) this.f3400j).f7886f;
                int i13 = this.f3397g - 1;
                this.f3397g = i13;
                Object obj = objArr[i13];
                k.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (n) obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i7;
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i7 = this.f3397g;
                break;
            case 1:
                i7 = this.f3397g;
                break;
            case 2:
                return this.f3397g;
            default:
                i7 = this.f3397g - this.f3398h;
                break;
        }
        return i7 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7;
        int i8;
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b bVar = (b) this.f3400j;
                a();
                int i9 = this.f3398h;
                if (i9 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.g(i9);
                this.f3397g = this.f3398h;
                this.f3398h = -1;
                i7 = ((AbstractList) bVar).modCount;
                this.f3399i = i7;
                return;
            case 1:
                c cVar = (c) this.f3400j;
                b();
                int i10 = this.f3398h;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.g(i10);
                this.f3397g = this.f3398h;
                this.f3398h = -1;
                i8 = ((AbstractList) cVar).modCount;
                this.f3399i = i8;
                return;
            case 2:
                c();
                q qVar = (q) this.f3400j;
                qVar.remove(this.f3397g);
                this.f3397g--;
                this.f3398h = -1;
                this.f3399i = qVar.x();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f3396f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a();
                int i7 = this.f3398h;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f3400j).set(i7, obj);
                return;
            case 1:
                b();
                int i8 = this.f3398h;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f3400j).set(i8, obj);
                return;
            case 2:
                q qVar = (q) this.f3400j;
                c();
                int i9 = this.f3398h;
                if (i9 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                qVar.set(i9, obj);
                this.f3399i = qVar.x();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(r rVar, int i7, int i8, int i9) {
        this.f3396f = 3;
        this.f3400j = rVar;
        this.f3397g = i7;
        this.f3398h = i8;
        this.f3399i = i9;
    }

    public a(c cVar, int i7) {
        int i8;
        this.f3396f = 1;
        this.f3400j = cVar;
        this.f3397g = i7;
        this.f3398h = -1;
        i8 = ((AbstractList) cVar).modCount;
        this.f3399i = i8;
    }

    public a(q qVar, int i7) {
        this.f3396f = 2;
        this.f3400j = qVar;
        this.f3397g = i7 - 1;
        this.f3398h = -1;
        this.f3399i = qVar.x();
    }

    public a(b bVar, int i7) {
        int i8;
        this.f3396f = 0;
        this.f3400j = bVar;
        this.f3397g = i7;
        this.f3398h = -1;
        i8 = ((AbstractList) bVar).modCount;
        this.f3399i = i8;
    }
}
