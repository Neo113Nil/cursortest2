package k0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: h, reason: collision with root package name */
    public final f f5312h;

    /* renamed from: i, reason: collision with root package name */
    public int f5313i;

    /* renamed from: j, reason: collision with root package name */
    public j f5314j;

    /* renamed from: k, reason: collision with root package name */
    public int f5315k;

    public h(f fVar, int i7) {
        super(i7, fVar.f5309m);
        this.f5312h = fVar;
        this.f5313i = fVar.x();
        this.f5315k = -1;
        b();
    }

    public final void a() {
        if (this.f5313i != this.f5312h.x()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // k0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i7 = this.f5292f;
        f fVar = this.f5312h;
        fVar.add(i7, obj);
        this.f5292f++;
        this.f5293g = fVar.a();
        this.f5313i = fVar.x();
        this.f5315k = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f5312h;
        Object[] objArr = fVar.f5307k;
        if (objArr == null) {
            this.f5314j = null;
            return;
        }
        int i7 = (fVar.f5309m - 1) & (-32);
        int i8 = this.f5292f;
        if (i8 > i7) {
            i8 = i7;
        }
        int i9 = (fVar.f5305i / 5) + 1;
        j jVar = this.f5314j;
        if (jVar == null) {
            this.f5314j = new j(objArr, i8, i7, i9);
            return;
        }
        jVar.f5292f = i8;
        jVar.f5293g = i7;
        jVar.f5318h = i9;
        if (jVar.f5319i.length < i9) {
            jVar.f5319i = new Object[i9];
        }
        jVar.f5319i[0] = objArr;
        ?? r62 = i8 == i7 ? 1 : 0;
        jVar.f5320j = r62;
        jVar.b(i8 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f5292f;
        this.f5315k = i7;
        j jVar = this.f5314j;
        f fVar = this.f5312h;
        if (jVar == null) {
            Object[] objArr = fVar.f5308l;
            this.f5292f = i7 + 1;
            return objArr[i7];
        }
        if (jVar.hasNext()) {
            this.f5292f++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f5308l;
        int i8 = this.f5292f;
        this.f5292f = i8 + 1;
        return objArr2[i8 - jVar.f5293g];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f5292f;
        this.f5315k = i7 - 1;
        j jVar = this.f5314j;
        f fVar = this.f5312h;
        if (jVar == null) {
            Object[] objArr = fVar.f5308l;
            int i8 = i7 - 1;
            this.f5292f = i8;
            return objArr[i8];
        }
        int i9 = jVar.f5293g;
        if (i7 <= i9) {
            this.f5292f = i7 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f5308l;
        int i10 = i7 - 1;
        this.f5292f = i10;
        return objArr2[i10 - i9];
    }

    @Override // k0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i7 = this.f5315k;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f5312h;
        fVar.g(i7);
        int i8 = this.f5315k;
        if (i8 < this.f5292f) {
            this.f5292f = i8;
        }
        this.f5293g = fVar.a();
        this.f5313i = fVar.x();
        this.f5315k = -1;
        b();
    }

    @Override // k0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i7 = this.f5315k;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f5312h;
        fVar.set(i7, obj);
        this.f5313i = fVar.x();
        b();
    }
}
