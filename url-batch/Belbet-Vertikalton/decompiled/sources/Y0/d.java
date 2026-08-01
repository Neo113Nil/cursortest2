package Y0;

import M.B;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends B implements Iterator, k1.a {
    public final /* synthetic */ int e;

    public d(f fVar, int i) {
        this.e = i;
        j1.h.e(fVar, "map");
        this.f702d = fVar;
        this.f700b = -1;
        this.f701c = fVar.f1411h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.f699a;
                f fVar = (f) this.f702d;
                if (i >= fVar.f1409f) {
                    throw new NoSuchElementException();
                }
                this.f699a = i + 1;
                this.f700b = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i2 = this.f699a;
                f fVar2 = (f) this.f702d;
                if (i2 >= fVar2.f1409f) {
                    throw new NoSuchElementException();
                }
                this.f699a = i2 + 1;
                this.f700b = i2;
                Object obj = fVar2.f1405a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.f699a;
                f fVar3 = (f) this.f702d;
                if (i3 >= fVar3.f1409f) {
                    throw new NoSuchElementException();
                }
                this.f699a = i3 + 1;
                this.f700b = i3;
                Object[] objArr = fVar3.f1406b;
                j1.h.b(objArr);
                Object obj2 = objArr[this.f700b];
                e();
                return obj2;
        }
    }
}
