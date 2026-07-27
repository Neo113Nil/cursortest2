package L;

import M2.J;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: j, reason: collision with root package name */
    public final e f3471j;

    /* renamed from: k, reason: collision with root package name */
    public Object f3472k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3473l;

    /* renamed from: m, reason: collision with root package name */
    public int f3474m;

    public f(e eVar, n[] nVarArr) {
        super(eVar.f3467i, nVarArr);
        this.f3471j = eVar;
        this.f3474m = eVar.f3469k;
    }

    public final void d(int i2, m mVar, Object obj, int i4) {
        int i5 = i4 * 5;
        n[] nVarArr = this.f3462d;
        if (i5 <= 30) {
            int H3 = 1 << M1.a.H(i2, i5);
            if (mVar.h(H3)) {
                nVarArr[i4].b(mVar.f3487d, Integer.bitCount(mVar.f3484a) * 2, mVar.f(H3));
                this.f3463e = i4;
                return;
            } else {
                int t4 = mVar.t(H3);
                m s4 = mVar.s(t4);
                nVarArr[i4].b(mVar.f3487d, Integer.bitCount(mVar.f3484a) * 2, t4);
                d(i2, s4, obj, i4 + 1);
                return;
            }
        }
        n nVar = nVarArr[i4];
        Object[] objArr = mVar.f3487d;
        nVar.b(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i4];
            if (Intrinsics.a(nVar2.f3488d[nVar2.f3490i], obj)) {
                this.f3463e = i4;
                return;
            } else {
                nVarArr[i4].f3490i += 2;
            }
        }
    }

    @Override // L.d, java.util.Iterator
    public final Object next() {
        if (this.f3471j.f3469k != this.f3474m) {
            throw new ConcurrentModificationException();
        }
        if (!this.f3464i) {
            throw new NoSuchElementException();
        }
        n nVar = this.f3462d[this.f3463e];
        this.f3472k = nVar.f3488d[nVar.f3490i];
        this.f3473l = true;
        return super.next();
    }

    @Override // L.d, java.util.Iterator
    public final void remove() {
        if (!this.f3473l) {
            throw new IllegalStateException();
        }
        boolean z4 = this.f3464i;
        e eVar = this.f3471j;
        if (!z4) {
            J.c(eVar).remove(this.f3472k);
        } else {
            if (!z4) {
                throw new NoSuchElementException();
            }
            n nVar = this.f3462d[this.f3463e];
            Object obj = nVar.f3488d[nVar.f3490i];
            J.c(eVar).remove(this.f3472k);
            d(obj != null ? obj.hashCode() : 0, eVar.f3467i, obj, 0);
        }
        this.f3472k = null;
        this.f3473l = false;
        this.f3474m = eVar.f3469k;
    }
}
