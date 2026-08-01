package a;

import X.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends b1.e implements a1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1152b = i;
        this.f1153c = obj;
    }

    @Override // a1.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1152b) {
            case 0:
                b1.d.e((C0054b) obj, "backEvent");
                x xVar = (x) this.f1153c;
                T0.f fVar = xVar.f1173b;
                ListIterator listIterator = fVar.listIterator(fVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f873a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1174c != null) {
                    xVar.a();
                }
                xVar.f1174c = a2;
                return S0.d.f774c;
            case 1:
                b1.d.e((C0054b) obj, "backEvent");
                x xVar2 = (x) this.f1153c;
                if (xVar2.f1174c == null) {
                    T0.f fVar2 = xVar2.f1173b;
                    ListIterator listIterator2 = fVar2.listIterator(fVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f873a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return S0.d.f774c;
            default:
                return obj == ((T0.d) this.f1153c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
