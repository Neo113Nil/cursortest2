package W0;

import K.D;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends D implements Iterator, h1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f905e;

    public d(f fVar, int i) {
        this.f905e = i;
        g1.f.e(fVar, "map");
        this.d = fVar;
        this.f356b = -1;
        this.f357c = fVar.h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f905e) {
            case 0:
                b();
                int i = this.f355a;
                f fVar = (f) this.d;
                if (i >= fVar.f913f) {
                    throw new NoSuchElementException();
                }
                this.f355a = i + 1;
                this.f356b = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i2 = this.f355a;
                f fVar2 = (f) this.d;
                if (i2 >= fVar2.f913f) {
                    throw new NoSuchElementException();
                }
                this.f355a = i2 + 1;
                this.f356b = i2;
                Object obj = fVar2.f909a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.f355a;
                f fVar3 = (f) this.d;
                if (i3 >= fVar3.f913f) {
                    throw new NoSuchElementException();
                }
                this.f355a = i3 + 1;
                this.f356b = i3;
                Object[] objArr = fVar3.f910b;
                g1.f.b(objArr);
                Object obj2 = objArr[this.f356b];
                e();
                return obj2;
        }
    }
}
