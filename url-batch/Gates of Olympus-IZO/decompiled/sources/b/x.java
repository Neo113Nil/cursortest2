package b;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f4204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(F f3, int i3) {
        super(1);
        this.f4203e = i3;
        this.f4204f = f3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f4203e) {
            case 0:
                C0242b c0242b = (C0242b) obj;
                Z1.i.f(c0242b, "backEvent");
                F f3 = this.f4204f;
                M1.j jVar = f3.f4133b;
                ListIterator listIterator = jVar.listIterator(jVar.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((w) obj2).f4200a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                w wVar = (w) obj2;
                if (f3.f4134c != null) {
                    f3.b();
                }
                f3.f4134c = wVar;
                if (wVar != null) {
                    wVar.d(c0242b);
                }
                break;
            default:
                C0242b c0242b2 = (C0242b) obj;
                Z1.i.f(c0242b2, "backEvent");
                F f4 = this.f4204f;
                w wVar2 = f4.f4134c;
                if (wVar2 == null) {
                    M1.j jVar2 = f4.f4133b;
                    ListIterator listIterator2 = jVar2.listIterator(jVar2.b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((w) obj3).f4200a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    wVar2 = (w) obj3;
                }
                if (wVar2 != null) {
                    wVar2.c(c0242b2);
                }
                break;
        }
        return L1.z.f2729a;
    }
}
