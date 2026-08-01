package a;

import X.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends b1.e implements a1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1138b = i;
        this.f1139c = obj;
    }

    @Override // a1.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1138b) {
            case 0:
                b1.d.e((C0055b) obj, "backEvent");
                x xVar = (x) this.f1139c;
                T0.f fVar = xVar.f1159b;
                ListIterator listIterator = fVar.listIterator(fVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f859a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1160c != null) {
                    xVar.a();
                }
                xVar.f1160c = a2;
                return S0.f.f759c;
            case 1:
                b1.d.e((C0055b) obj, "backEvent");
                x xVar2 = (x) this.f1139c;
                if (xVar2.f1160c == null) {
                    T0.f fVar2 = xVar2.f1159b;
                    ListIterator listIterator2 = fVar2.listIterator(fVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f859a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return S0.f.f759c;
            default:
                return obj == ((T0.d) this.f1139c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
