package a;

import X.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends X0.e implements W0.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1077b = i;
        this.f1078c = obj;
    }

    @Override // W0.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1077b) {
            case 0:
                X0.d.e((C0055b) obj, "backEvent");
                x xVar = (x) this.f1078c;
                Q0.f fVar = xVar.f1098b;
                ListIterator listIterator = fVar.listIterator(fVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f787a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1099c != null) {
                    xVar.a();
                }
                xVar.f1099c = a2;
                return P0.d.f626c;
            case 1:
                X0.d.e((C0055b) obj, "backEvent");
                x xVar2 = (x) this.f1078c;
                if (xVar2.f1099c == null) {
                    Q0.f fVar2 = xVar2.f1098b;
                    ListIterator listIterator2 = fVar2.listIterator(fVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f787a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return P0.d.f626c;
            default:
                return obj == ((Q0.d) this.f1078c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
