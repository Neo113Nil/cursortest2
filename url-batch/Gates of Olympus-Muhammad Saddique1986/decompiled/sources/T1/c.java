package T1;

import f2.j;
import g2.InterfaceC0439a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends e implements Iterator, InterfaceC0439a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4347h;

    public c(f fVar, int i3) {
        this.f4347h = i3;
        j.f(fVar, "map");
        this.f4353g = fVar;
        this.f4351e = -1;
        this.f4352f = fVar.f4362k;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4347h) {
            case 0:
                b();
                int i3 = this.f4350d;
                f fVar = (f) this.f4353g;
                if (i3 >= fVar.f4360i) {
                    throw new NoSuchElementException();
                }
                this.f4350d = i3 + 1;
                this.f4351e = i3;
                d dVar = new d(fVar, i3);
                c();
                return dVar;
            case 1:
                b();
                int i4 = this.f4350d;
                f fVar2 = (f) this.f4353g;
                if (i4 >= fVar2.f4360i) {
                    throw new NoSuchElementException();
                }
                this.f4350d = i4 + 1;
                this.f4351e = i4;
                Object obj = fVar2.f4355d[i4];
                c();
                return obj;
            default:
                b();
                int i5 = this.f4350d;
                f fVar3 = (f) this.f4353g;
                if (i5 >= fVar3.f4360i) {
                    throw new NoSuchElementException();
                }
                this.f4350d = i5 + 1;
                this.f4351e = i5;
                Object[] objArr = fVar3.f4356e;
                j.c(objArr);
                Object obj2 = objArr[this.f4351e];
                c();
                return obj2;
        }
    }
}
