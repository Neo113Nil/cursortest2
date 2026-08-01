package a;

import X.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends Z0.e implements Y0.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1113b = i;
        this.f1114c = obj;
    }

    @Override // Y0.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1113b) {
            case 0:
                Z0.d.e((C0055b) obj, "backEvent");
                x xVar = (x) this.f1114c;
                R0.f fVar = xVar.f1134b;
                ListIterator listIterator = fVar.listIterator(fVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f830a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1135c != null) {
                    xVar.a();
                }
                xVar.f1135c = a2;
                return Q0.e.f694c;
            case 1:
                Z0.d.e((C0055b) obj, "backEvent");
                x xVar2 = (x) this.f1114c;
                if (xVar2.f1135c == null) {
                    R0.f fVar2 = xVar2.f1134b;
                    ListIterator listIterator2 = fVar2.listIterator(fVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f830a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return Q0.e.f694c;
            default:
                return obj == ((R0.d) this.f1114c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
