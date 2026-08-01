package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pz extends rz implements Iterator, pw {
    public final /* synthetic */ int j;

    public pz(sz szVar, int i) {
        this.j = i;
        szVar.getClass();
        this.i = szVar;
        this.g = -1;
        this.h = szVar.m;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                b();
                int i = this.f;
                sz szVar = (sz) this.i;
                if (i >= szVar.k) {
                    throw new NoSuchElementException();
                }
                this.f = i + 1;
                this.g = i;
                qz qzVar = new qz(szVar, i);
                e();
                return qzVar;
            case 1:
                b();
                int i2 = this.f;
                sz szVar2 = (sz) this.i;
                if (i2 >= szVar2.k) {
                    throw new NoSuchElementException();
                }
                this.f = i2 + 1;
                this.g = i2;
                Object obj = szVar2.f[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.f;
                sz szVar3 = (sz) this.i;
                if (i3 >= szVar3.k) {
                    throw new NoSuchElementException();
                }
                this.f = i3 + 1;
                this.g = i3;
                Object[] objArr = szVar3.g;
                objArr.getClass();
                Object obj2 = objArr[this.g];
                e();
                return obj2;
        }
    }
}
