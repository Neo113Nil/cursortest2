package F0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final f f468e;

    /* renamed from: f, reason: collision with root package name */
    public int f469f;

    /* renamed from: g, reason: collision with root package name */
    public int f470g;

    /* renamed from: h, reason: collision with root package name */
    public int f471h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f472i;

    public d(f fVar, int i2) {
        this.f472i = i2;
        P0.h.e(fVar, "map");
        this.f468e = fVar;
        this.f470g = -1;
        this.f471h = fVar.f484l;
        b();
    }

    public final void a() {
        if (this.f468e.f484l != this.f471h) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i2 = this.f469f;
            f fVar = this.f468e;
            if (i2 >= fVar.f482j || fVar.f479g[i2] >= 0) {
                return;
            } else {
                this.f469f = i2 + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f469f < this.f468e.f482j;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f472i) {
            case 0:
                a();
                int i2 = this.f469f;
                f fVar = this.f468e;
                if (i2 >= fVar.f482j) {
                    throw new NoSuchElementException();
                }
                this.f469f = i2 + 1;
                this.f470g = i2;
                e eVar = new e(fVar, i2);
                b();
                return eVar;
            case 1:
                a();
                int i3 = this.f469f;
                f fVar2 = this.f468e;
                if (i3 >= fVar2.f482j) {
                    throw new NoSuchElementException();
                }
                this.f469f = i3 + 1;
                this.f470g = i3;
                Object obj = fVar2.f477e[i3];
                b();
                return obj;
            default:
                a();
                int i4 = this.f469f;
                f fVar3 = this.f468e;
                if (i4 >= fVar3.f482j) {
                    throw new NoSuchElementException();
                }
                this.f469f = i4 + 1;
                this.f470g = i4;
                Object[] objArr = fVar3.f478f;
                P0.h.b(objArr);
                Object obj2 = objArr[this.f470g];
                b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.f470g == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        f fVar = this.f468e;
        fVar.b();
        fVar.k(this.f470g);
        this.f470g = -1;
        this.f471h = fVar.f484l;
    }
}
