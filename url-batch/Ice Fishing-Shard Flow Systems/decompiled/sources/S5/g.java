package S5;

import I.H;
import f6.InterfaceC0406a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends H implements Iterator, InterfaceC0406a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2523m;

    public g(i map, int i2) {
        this.f2523m = i2;
        Intrinsics.checkNotNullParameter(map, "map");
        this.f1145l = map;
        this.f1143e = -1;
        this.f1144i = map.f2536p;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2523m) {
            case 0:
                b();
                int i2 = this.f1142d;
                i iVar = (i) this.f1145l;
                if (i2 >= iVar.f2534n) {
                    throw new NoSuchElementException();
                }
                this.f1142d = i2 + 1;
                this.f1143e = i2;
                h hVar = new h(iVar, i2);
                e();
                return hVar;
            case 1:
                b();
                int i5 = this.f1142d;
                i iVar2 = (i) this.f1145l;
                if (i5 >= iVar2.f2534n) {
                    throw new NoSuchElementException();
                }
                this.f1142d = i5 + 1;
                this.f1143e = i5;
                Object obj = iVar2.f2529d[i5];
                e();
                return obj;
            default:
                b();
                int i7 = this.f1142d;
                i iVar3 = (i) this.f1145l;
                if (i7 >= iVar3.f2534n) {
                    throw new NoSuchElementException();
                }
                this.f1142d = i7 + 1;
                this.f1143e = i7;
                Object[] objArr = iVar3.f2530e;
                Intrinsics.b(objArr);
                Object obj2 = objArr[this.f1143e];
                e();
                return obj2;
        }
    }
}
