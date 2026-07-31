package M;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: f, reason: collision with root package name */
    public final g f3442f;

    /* renamed from: g, reason: collision with root package name */
    public int f3443g;

    /* renamed from: h, reason: collision with root package name */
    public k f3444h;

    /* renamed from: i, reason: collision with root package name */
    public int f3445i;

    public i(g gVar, int i3) {
        super(i3, gVar.b());
        this.f3442f = gVar;
        this.f3443g = gVar.j();
        this.f3445i = -1;
        b();
    }

    public final void a() {
        if (this.f3443g != this.f3442f.j()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // M.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i3 = this.f3421d;
        g gVar = this.f3442f;
        gVar.add(i3, obj);
        this.f3421d++;
        this.f3422e = gVar.b();
        this.f3443g = gVar.j();
        this.f3445i = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        g gVar = this.f3442f;
        Object[] objArr = gVar.f3437i;
        if (objArr == null) {
            this.f3444h = null;
            return;
        }
        int i3 = (gVar.f3439k - 1) & (-32);
        int i4 = this.f3421d;
        if (i4 > i3) {
            i4 = i3;
        }
        int i5 = (gVar.f3435g / 5) + 1;
        k kVar = this.f3444h;
        if (kVar == null) {
            this.f3444h = new k(objArr, i4, i3, i5);
            return;
        }
        kVar.f3421d = i4;
        kVar.f3422e = i3;
        kVar.f3448f = i5;
        if (kVar.f3449g.length < i5) {
            kVar.f3449g = new Object[i5];
        }
        kVar.f3449g[0] = objArr;
        ?? r6 = i4 == i3 ? 1 : 0;
        kVar.f3450h = r6;
        kVar.b(i4 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f3421d;
        this.f3445i = i3;
        k kVar = this.f3444h;
        g gVar = this.f3442f;
        if (kVar == null) {
            Object[] objArr = gVar.f3438j;
            this.f3421d = i3 + 1;
            return objArr[i3];
        }
        if (kVar.hasNext()) {
            this.f3421d++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.f3438j;
        int i4 = this.f3421d;
        this.f3421d = i4 + 1;
        return objArr2[i4 - kVar.f3422e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f3421d;
        this.f3445i = i3 - 1;
        k kVar = this.f3444h;
        g gVar = this.f3442f;
        if (kVar == null) {
            Object[] objArr = gVar.f3438j;
            int i4 = i3 - 1;
            this.f3421d = i4;
            return objArr[i4];
        }
        int i5 = kVar.f3422e;
        if (i3 <= i5) {
            this.f3421d = i3 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.f3438j;
        int i6 = i3 - 1;
        this.f3421d = i6;
        return objArr2[i6 - i5];
    }

    @Override // M.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i3 = this.f3445i;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f3442f;
        gVar.c(i3);
        int i4 = this.f3445i;
        if (i4 < this.f3421d) {
            this.f3421d = i4;
        }
        this.f3422e = gVar.b();
        this.f3443g = gVar.j();
        this.f3445i = -1;
        b();
    }

    @Override // M.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i3 = this.f3445i;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f3442f;
        gVar.set(i3, obj);
        this.f3443g = gVar.j();
        b();
    }
}
