package Z0;

import K.C;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class d extends C implements Iterator, InterfaceC0284a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1536e;

    public d(f fVar, int i) {
        this.f1536e = i;
        k1.e.e(fVar, "map");
        this.d = fVar;
        this.f569b = -1;
        this.f570c = fVar.h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1536e) {
            case 0:
                b();
                int i = this.f568a;
                f fVar = (f) this.d;
                if (i >= fVar.f1544f) {
                    throw new NoSuchElementException();
                }
                this.f568a = i + 1;
                this.f569b = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i2 = this.f568a;
                f fVar2 = (f) this.d;
                if (i2 >= fVar2.f1544f) {
                    throw new NoSuchElementException();
                }
                this.f568a = i2 + 1;
                this.f569b = i2;
                Object obj = fVar2.f1540a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.f568a;
                f fVar3 = (f) this.d;
                if (i3 >= fVar3.f1544f) {
                    throw new NoSuchElementException();
                }
                this.f568a = i3 + 1;
                this.f569b = i3;
                Object[] objArr = fVar3.f1541b;
                k1.e.b(objArr);
                Object obj2 = objArr[this.f569b];
                e();
                return obj2;
        }
    }
}
