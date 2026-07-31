package r0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import q6.v;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: g, reason: collision with root package name */
    public final u0.f f6479g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6480h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f6481j;

    public d(u0.f fVar, k[] kVarArr) {
        super(fVar.f7147e, kVarArr);
        this.f6479g = fVar;
        this.f6481j = fVar.f7149g;
    }

    public final void c(int i, j jVar, Object obj, int i8) {
        int i9 = i8 * 5;
        k[] kVarArr = this.f6476d;
        if (i9 <= 30) {
            int L = 1 << h0.a.L(i, i9);
            if (jVar.h(L)) {
                kVarArr[i8].a(jVar.f6492d, Integer.bitCount(jVar.f6489a) * 2, jVar.f(L));
                this.f6477e = i8;
                return;
            } else {
                int t3 = jVar.t(L);
                j s5 = jVar.s(t3);
                kVarArr[i8].a(jVar.f6492d, Integer.bitCount(jVar.f6489a) * 2, t3);
                c(i, s5, obj, i8 + 1);
                return;
            }
        }
        k kVar = kVarArr[i8];
        Object[] objArr = jVar.f6492d;
        kVar.a(objArr, objArr.length, 0);
        while (true) {
            k kVar2 = kVarArr[i8];
            if (q6.i.a(kVar2.f6493d[kVar2.f6495f], obj)) {
                this.f6477e = i8;
                return;
            } else {
                kVarArr[i8].f6495f += 2;
            }
        }
    }

    @Override // r0.c, java.util.Iterator
    public final Object next() {
        if (this.f6479g.f7149g != this.f6481j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f6478f) {
            throw new NoSuchElementException();
        }
        k kVar = this.f6476d[this.f6477e];
        this.f6480h = kVar.f6493d[kVar.f6495f];
        this.i = true;
        return super.next();
    }

    @Override // r0.c, java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        boolean z3 = this.f6478f;
        u0.f fVar = this.f6479g;
        if (!z3) {
            v.b(fVar).remove(this.f6480h);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            k kVar = this.f6476d[this.f6477e];
            Object obj = kVar.f6493d[kVar.f6495f];
            v.b(fVar).remove(this.f6480h);
            c(obj != null ? obj.hashCode() : 0, fVar.f7147e, obj, 0);
        }
        this.f6480h = null;
        this.i = false;
        this.f6481j = fVar.f7149g;
    }
}
