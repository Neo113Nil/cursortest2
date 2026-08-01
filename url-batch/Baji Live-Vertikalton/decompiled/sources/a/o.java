package a;

import X.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends X0.f implements W0.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(x xVar, int i) {
        super(1);
        this.f1074b = i;
        this.f1075c = xVar;
    }

    @Override // W0.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1074b) {
            case 0:
                X0.e.e((C0055b) obj, "backEvent");
                x xVar = this.f1075c;
                Q0.b bVar = xVar.f1095b;
                ListIterator listIterator = bVar.listIterator(bVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f781a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1096c != null) {
                    xVar.a();
                }
                xVar.f1096c = a2;
                break;
            default:
                X0.e.e((C0055b) obj, "backEvent");
                x xVar2 = this.f1075c;
                if (xVar2.f1096c == null) {
                    Q0.b bVar2 = xVar2.f1095b;
                    ListIterator listIterator2 = bVar2.listIterator(bVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f781a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return P0.d.f626c;
    }
}
