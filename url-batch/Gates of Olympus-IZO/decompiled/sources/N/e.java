package N;

import Z1.w;
import a.AbstractC0157a;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: g, reason: collision with root package name */
    public final Q.c f2826g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2827h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2828i;

    /* renamed from: j, reason: collision with root package name */
    public int f2829j;

    public e(Q.c cVar, n[] nVarArr) {
        super(cVar.f3083e, nVarArr);
        this.f2826g = cVar;
        this.f2829j = cVar.f3085g;
    }

    public final void c(int i3, m mVar, Object obj, int i4) {
        int i5 = i4 * 5;
        n[] nVarArr = this.f2823d;
        if (i5 <= 30) {
            int J3 = 1 << AbstractC0157a.J(i3, i5);
            if (mVar.h(J3)) {
                nVarArr[i4].a(mVar.f2843d, Integer.bitCount(mVar.f2840a) * 2, mVar.f(J3));
                this.f2824e = i4;
                return;
            } else {
                int t3 = mVar.t(J3);
                m s3 = mVar.s(t3);
                nVarArr[i4].a(mVar.f2843d, Integer.bitCount(mVar.f2840a) * 2, t3);
                c(i3, s3, obj, i4 + 1);
                return;
            }
        }
        n nVar = nVarArr[i4];
        Object[] objArr = mVar.f2843d;
        nVar.a(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i4];
            if (Z1.i.a(nVar2.f2844d[nVar2.f2846f], obj)) {
                this.f2824e = i4;
                return;
            } else {
                nVarArr[i4].f2846f += 2;
            }
        }
    }

    @Override // N.d, java.util.Iterator
    public final Object next() {
        if (this.f2826g.f3085g != this.f2829j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f2825f) {
            throw new NoSuchElementException();
        }
        n nVar = this.f2823d[this.f2824e];
        this.f2827h = nVar.f2844d[nVar.f2846f];
        this.f2828i = true;
        return super.next();
    }

    @Override // N.d, java.util.Iterator
    public final void remove() {
        if (!this.f2828i) {
            throw new IllegalStateException();
        }
        boolean z3 = this.f2825f;
        Q.c cVar = this.f2826g;
        if (!z3) {
            w.c(cVar).remove(this.f2827h);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            n nVar = this.f2823d[this.f2824e];
            Object obj = nVar.f2844d[nVar.f2846f];
            w.c(cVar).remove(this.f2827h);
            c(obj != null ? obj.hashCode() : 0, cVar.f3083e, obj, 0);
        }
        this.f2827h = null;
        this.f2828i = false;
        this.f2829j = cVar.f3085g;
    }
}
