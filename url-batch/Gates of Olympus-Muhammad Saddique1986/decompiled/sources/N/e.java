package N;

import f2.x;
import h2.AbstractC0508a;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: g, reason: collision with root package name */
    public final Q.c f3508g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3509h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3510i;

    /* renamed from: j, reason: collision with root package name */
    public int f3511j;

    public e(Q.c cVar, n[] nVarArr) {
        super(cVar.f3949e, nVarArr);
        this.f3508g = cVar;
        this.f3511j = cVar.f3951g;
    }

    public final void c(int i3, m mVar, Object obj, int i4) {
        int i5 = i4 * 5;
        n[] nVarArr = this.f3505d;
        if (i5 <= 30) {
            int I3 = 1 << AbstractC0508a.I(i3, i5);
            if (mVar.h(I3)) {
                nVarArr[i4].a(mVar.f3525d, Integer.bitCount(mVar.f3522a) * 2, mVar.f(I3));
                this.f3506e = i4;
                return;
            } else {
                int t3 = mVar.t(I3);
                m s3 = mVar.s(t3);
                nVarArr[i4].a(mVar.f3525d, Integer.bitCount(mVar.f3522a) * 2, t3);
                c(i3, s3, obj, i4 + 1);
                return;
            }
        }
        n nVar = nVarArr[i4];
        Object[] objArr = mVar.f3525d;
        nVar.a(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i4];
            if (f2.j.a(nVar2.f3526d[nVar2.f3528f], obj)) {
                this.f3506e = i4;
                return;
            } else {
                nVarArr[i4].f3528f += 2;
            }
        }
    }

    @Override // N.d, java.util.Iterator
    public final Object next() {
        if (this.f3508g.f3951g != this.f3511j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f3507f) {
            throw new NoSuchElementException();
        }
        n nVar = this.f3505d[this.f3506e];
        this.f3509h = nVar.f3526d[nVar.f3528f];
        this.f3510i = true;
        return super.next();
    }

    @Override // N.d, java.util.Iterator
    public final void remove() {
        if (!this.f3510i) {
            throw new IllegalStateException();
        }
        boolean z3 = this.f3507f;
        Q.c cVar = this.f3508g;
        if (!z3) {
            x.c(cVar).remove(this.f3509h);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            n nVar = this.f3505d[this.f3506e];
            Object obj = nVar.f3526d[nVar.f3528f];
            x.c(cVar).remove(this.f3509h);
            c(obj != null ? obj.hashCode() : 0, cVar.f3949e, obj, 0);
        }
        this.f3509h = null;
        this.f3510i = false;
        this.f3511j = cVar.f3951g;
    }
}
