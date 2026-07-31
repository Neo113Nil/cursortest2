package M;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: f, reason: collision with root package name */
    public final g f2751f;

    /* renamed from: g, reason: collision with root package name */
    public int f2752g;

    /* renamed from: h, reason: collision with root package name */
    public k f2753h;

    /* renamed from: i, reason: collision with root package name */
    public int f2754i;

    public i(g gVar, int i3) {
        super(i3, gVar.b());
        this.f2751f = gVar;
        this.f2752g = gVar.j();
        this.f2754i = -1;
        b();
    }

    public final void a() {
        if (this.f2752g != this.f2751f.j()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // M.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i3 = this.f2730d;
        g gVar = this.f2751f;
        gVar.add(i3, obj);
        this.f2730d++;
        this.f2731e = gVar.b();
        this.f2752g = gVar.j();
        this.f2754i = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        g gVar = this.f2751f;
        Object[] objArr = gVar.f2746i;
        if (objArr == null) {
            this.f2753h = null;
            return;
        }
        int i3 = (gVar.f2748k - 1) & (-32);
        int i4 = this.f2730d;
        if (i4 > i3) {
            i4 = i3;
        }
        int i5 = (gVar.f2744g / 5) + 1;
        k kVar = this.f2753h;
        if (kVar == null) {
            this.f2753h = new k(objArr, i4, i3, i5);
            return;
        }
        kVar.f2730d = i4;
        kVar.f2731e = i3;
        kVar.f2757f = i5;
        if (kVar.f2758g.length < i5) {
            kVar.f2758g = new Object[i5];
        }
        kVar.f2758g[0] = objArr;
        ?? r6 = i4 == i3 ? 1 : 0;
        kVar.f2759h = r6;
        kVar.b(i4 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2730d;
        this.f2754i = i3;
        k kVar = this.f2753h;
        g gVar = this.f2751f;
        if (kVar == null) {
            Object[] objArr = gVar.f2747j;
            this.f2730d = i3 + 1;
            return objArr[i3];
        }
        if (kVar.hasNext()) {
            this.f2730d++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.f2747j;
        int i4 = this.f2730d;
        this.f2730d = i4 + 1;
        return objArr2[i4 - kVar.f2731e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2730d;
        this.f2754i = i3 - 1;
        k kVar = this.f2753h;
        g gVar = this.f2751f;
        if (kVar == null) {
            Object[] objArr = gVar.f2747j;
            int i4 = i3 - 1;
            this.f2730d = i4;
            return objArr[i4];
        }
        int i5 = kVar.f2731e;
        if (i3 <= i5) {
            this.f2730d = i3 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.f2747j;
        int i6 = i3 - 1;
        this.f2730d = i6;
        return objArr2[i6 - i5];
    }

    @Override // M.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i3 = this.f2754i;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f2751f;
        gVar.c(i3);
        int i4 = this.f2754i;
        if (i4 < this.f2730d) {
            this.f2730d = i4;
        }
        this.f2731e = gVar.b();
        this.f2752g = gVar.j();
        this.f2754i = -1;
        b();
    }

    @Override // M.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i3 = this.f2754i;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f2751f;
        gVar.set(i3, obj);
        this.f2752g = gVar.j();
        b();
    }
}
