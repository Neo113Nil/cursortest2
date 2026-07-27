package K;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: i, reason: collision with root package name */
    public final f f3438i;

    /* renamed from: j, reason: collision with root package name */
    public int f3439j;

    /* renamed from: k, reason: collision with root package name */
    public j f3440k;

    /* renamed from: l, reason: collision with root package name */
    public int f3441l;

    public h(f fVar, int i2) {
        super(i2, fVar.e());
        this.f3438i = fVar;
        this.f3439j = fVar.B();
        this.f3441l = -1;
        c();
    }

    @Override // K.a, java.util.ListIterator
    public final void add(Object obj) {
        b();
        int i2 = this.f3418d;
        f fVar = this.f3438i;
        fVar.add(i2, obj);
        this.f3418d++;
        this.f3419e = fVar.e();
        this.f3439j = fVar.B();
        this.f3441l = -1;
        c();
    }

    public final void b() {
        if (this.f3439j != this.f3438i.B()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        f fVar = this.f3438i;
        Object[] objArr = fVar.f3433l;
        if (objArr == null) {
            this.f3440k = null;
            return;
        }
        int i2 = (fVar.f3435n - 1) & (-32);
        int i4 = this.f3418d;
        if (i4 > i2) {
            i4 = i2;
        }
        int i5 = (fVar.f3431j / 5) + 1;
        j jVar = this.f3440k;
        if (jVar == null) {
            this.f3440k = new j(objArr, i4, i2, i5);
            return;
        }
        jVar.f3418d = i4;
        jVar.f3419e = i2;
        jVar.f3444i = i5;
        if (jVar.f3445j.length < i5) {
            jVar.f3445j = new Object[i5];
        }
        jVar.f3445j[0] = objArr;
        ?? r6 = i4 == i2 ? 1 : 0;
        jVar.f3446k = r6;
        jVar.c(i4 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f3418d;
        this.f3441l = i2;
        j jVar = this.f3440k;
        f fVar = this.f3438i;
        if (jVar == null) {
            Object[] objArr = fVar.f3434m;
            this.f3418d = i2 + 1;
            return objArr[i2];
        }
        if (jVar.hasNext()) {
            this.f3418d++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f3434m;
        int i4 = this.f3418d;
        this.f3418d = i4 + 1;
        return objArr2[i4 - jVar.f3419e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f3418d;
        this.f3441l = i2 - 1;
        j jVar = this.f3440k;
        f fVar = this.f3438i;
        if (jVar == null) {
            Object[] objArr = fVar.f3434m;
            int i4 = i2 - 1;
            this.f3418d = i4;
            return objArr[i4];
        }
        int i5 = jVar.f3419e;
        if (i2 <= i5) {
            this.f3418d = i2 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f3434m;
        int i6 = i2 - 1;
        this.f3418d = i6;
        return objArr2[i6 - i5];
    }

    @Override // K.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i2 = this.f3441l;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f3438i;
        fVar.h(i2);
        int i4 = this.f3441l;
        if (i4 < this.f3418d) {
            this.f3418d = i4;
        }
        this.f3419e = fVar.e();
        this.f3439j = fVar.B();
        this.f3441l = -1;
        c();
    }

    @Override // K.a, java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i2 = this.f3441l;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f3438i;
        fVar.set(i2, obj);
        this.f3439j = fVar.B();
        c();
    }
}
