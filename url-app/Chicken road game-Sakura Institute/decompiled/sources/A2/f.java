package A2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends h implements Iterator, N2.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f832k;

    public f(e map, int i2) {
        this.f832k = i2;
        Intrinsics.checkNotNullParameter(map, "map");
        this.f838j = map;
        this.f836e = -1;
        this.f837i = map.f826n;
        d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f832k) {
            case 0:
                c();
                int i2 = this.f835d;
                e eVar = (e) this.f838j;
                if (i2 >= eVar.f824l) {
                    throw new NoSuchElementException();
                }
                this.f835d = i2 + 1;
                this.f836e = i2;
                g gVar = new g(eVar, i2);
                d();
                return gVar;
            case 1:
                c();
                int i4 = this.f835d;
                e eVar2 = (e) this.f838j;
                if (i4 >= eVar2.f824l) {
                    throw new NoSuchElementException();
                }
                this.f835d = i4 + 1;
                this.f836e = i4;
                Object obj = eVar2.f819d[i4];
                d();
                return obj;
            default:
                c();
                int i5 = this.f835d;
                e eVar3 = (e) this.f838j;
                if (i5 >= eVar3.f824l) {
                    throw new NoSuchElementException();
                }
                this.f835d = i5 + 1;
                this.f836e = i5;
                Object[] objArr = eVar3.f820e;
                Intrinsics.c(objArr);
                Object obj2 = objArr[this.f836e];
                d();
                return obj2;
        }
    }
}
