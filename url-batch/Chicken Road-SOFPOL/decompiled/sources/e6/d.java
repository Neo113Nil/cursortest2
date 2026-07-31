package e6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends e4.c implements Iterator, r6.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2517h;

    public d(f fVar, int i) {
        this.f2517h = i;
        i.e(fVar, "map");
        this.f2491g = fVar;
        this.f2489e = -1;
        this.f2490f = fVar.f2528k;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2517h) {
            case 0:
                b();
                int i = this.f2488d;
                f fVar = (f) this.f2491g;
                if (i >= fVar.i) {
                    throw new NoSuchElementException();
                }
                this.f2488d = i + 1;
                this.f2489e = i;
                e eVar = new e(fVar, i);
                c();
                return eVar;
            case 1:
                b();
                int i8 = this.f2488d;
                f fVar2 = (f) this.f2491g;
                if (i8 >= fVar2.i) {
                    throw new NoSuchElementException();
                }
                this.f2488d = i8 + 1;
                this.f2489e = i8;
                Object obj = fVar2.f2522d[i8];
                c();
                return obj;
            default:
                b();
                int i9 = this.f2488d;
                f fVar3 = (f) this.f2491g;
                if (i9 >= fVar3.i) {
                    throw new NoSuchElementException();
                }
                this.f2488d = i9 + 1;
                this.f2489e = i9;
                Object[] objArr = fVar3.f2523e;
                i.b(objArr);
                Object obj2 = objArr[this.f2489e];
                c();
                return obj2;
        }
    }
}
