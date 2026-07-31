package q0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: f, reason: collision with root package name */
    public final g f5952f;

    /* renamed from: g, reason: collision with root package name */
    public int f5953g;

    /* renamed from: h, reason: collision with root package name */
    public k f5954h;
    public int i;

    public i(g gVar, int i) {
        super(i, gVar.f5949k);
        this.f5952f = gVar;
        this.f5953g = gVar.f();
        this.i = -1;
        b();
    }

    public final void a() {
        if (this.f5953g != this.f5952f.f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // q0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.f5931d;
        g gVar = this.f5952f;
        gVar.add(i, obj);
        this.f5931d++;
        this.f5932e = gVar.a();
        this.f5953g = gVar.f();
        this.i = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        g gVar = this.f5952f;
        Object[] objArr = gVar.i;
        if (objArr == null) {
            this.f5954h = null;
            return;
        }
        int i = (gVar.f5949k - 1) & (-32);
        int i8 = this.f5931d;
        if (i8 > i) {
            i8 = i;
        }
        int i9 = (gVar.f5946g / 5) + 1;
        k kVar = this.f5954h;
        if (kVar == null) {
            this.f5954h = new k(objArr, i8, i, i9);
            return;
        }
        kVar.f5931d = i8;
        kVar.f5932e = i;
        kVar.f5957f = i9;
        if (kVar.f5958g.length < i9) {
            kVar.f5958g = new Object[i9];
        }
        kVar.f5958g[0] = objArr;
        ?? r62 = i8 == i ? 1 : 0;
        kVar.f5959h = r62;
        kVar.b(i8 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f5931d;
        this.i = i;
        k kVar = this.f5954h;
        g gVar = this.f5952f;
        if (kVar == null) {
            Object[] objArr = gVar.f5948j;
            this.f5931d = i + 1;
            return objArr[i];
        }
        if (kVar.hasNext()) {
            this.f5931d++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.f5948j;
        int i8 = this.f5931d;
        this.f5931d = i8 + 1;
        return objArr2[i8 - kVar.f5932e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5931d;
        this.i = i - 1;
        k kVar = this.f5954h;
        g gVar = this.f5952f;
        if (kVar == null) {
            Object[] objArr = gVar.f5948j;
            int i8 = i - 1;
            this.f5931d = i8;
            return objArr[i8];
        }
        int i9 = kVar.f5932e;
        if (i <= i9) {
            this.f5931d = i - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.f5948j;
        int i10 = i - 1;
        this.f5931d = i10;
        return objArr2[i10 - i9];
    }

    @Override // q0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f5952f;
        gVar.b(i);
        int i8 = this.i;
        if (i8 < this.f5931d) {
            this.f5931d = i8;
        }
        this.f5932e = gVar.a();
        this.f5953g = gVar.f();
        this.i = -1;
        b();
    }

    @Override // q0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f5952f;
        gVar.set(i, obj);
        this.f5953g = gVar.f();
        b();
    }
}
