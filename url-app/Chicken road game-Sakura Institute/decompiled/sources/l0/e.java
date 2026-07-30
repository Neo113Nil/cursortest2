package l0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import r6.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: i, reason: collision with root package name */
    public final o0.c f5752i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5753j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5754k;

    /* renamed from: l, reason: collision with root package name */
    public int f5755l;

    public e(o0.c cVar, l[] lVarArr) {
        super(cVar.f6817g, lVarArr);
        this.f5752i = cVar;
        this.f5755l = cVar.f6819i;
    }

    public final void c(int i7, k kVar, Object obj, int i8) {
        int i9 = i8 * 5;
        l[] lVarArr = this.f5749f;
        if (i9 <= 30) {
            int E = 1 << t6.a.E(i7, i9);
            if (kVar.h(E)) {
                lVarArr[i8].a(kVar.f5765d, Integer.bitCount(kVar.f5762a) * 2, kVar.f(E));
                this.f5750g = i8;
                return;
            } else {
                int t2 = kVar.t(E);
                k s5 = kVar.s(t2);
                lVarArr[i8].a(kVar.f5765d, Integer.bitCount(kVar.f5762a) * 2, t2);
                c(i7, s5, obj, i8 + 1);
                return;
            }
        }
        l lVar = lVarArr[i8];
        Object[] objArr = kVar.f5765d;
        lVar.a(objArr, objArr.length, 0);
        while (true) {
            l lVar2 = lVarArr[i8];
            if (r6.k.a(lVar2.f5766f[lVar2.f5768h], obj)) {
                this.f5750g = i8;
                return;
            } else {
                lVarArr[i8].f5768h += 2;
            }
        }
    }

    @Override // l0.d, java.util.Iterator
    public final Object next() {
        if (this.f5752i.f6819i != this.f5755l) {
            throw new ConcurrentModificationException();
        }
        if (!this.f5751h) {
            throw new NoSuchElementException();
        }
        l lVar = this.f5749f[this.f5750g];
        this.f5753j = lVar.f5766f[lVar.f5768h];
        this.f5754k = true;
        return super.next();
    }

    @Override // l0.d, java.util.Iterator
    public final void remove() {
        if (!this.f5754k) {
            throw new IllegalStateException();
        }
        boolean z8 = this.f5751h;
        o0.c cVar = this.f5752i;
        if (!z8) {
            y.c(cVar).remove(this.f5753j);
        } else {
            if (!z8) {
                throw new NoSuchElementException();
            }
            l lVar = this.f5749f[this.f5750g];
            Object obj = lVar.f5766f[lVar.f5768h];
            y.c(cVar).remove(this.f5753j);
            c(obj != null ? obj.hashCode() : 0, cVar.f6817g, obj, 0);
        }
        this.f5753j = null;
        this.f5754k = false;
        this.f5755l = cVar.f6819i;
    }
}
