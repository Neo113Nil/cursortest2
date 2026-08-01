package a;

import Y.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends k1.f implements j1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(x xVar, int i) {
        super(1);
        this.f1599b = i;
        this.f1600c = xVar;
    }

    @Override // j1.l
    public final Object g(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1599b) {
            case 0:
                k1.e.e((C0056b) obj, "backEvent");
                x xVar = this.f1600c;
                Y0.h hVar = xVar.f1617b;
                ListIterator listIterator = hVar.listIterator(hVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f1279a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1618c != null) {
                    xVar.a();
                }
                xVar.f1618c = a2;
                break;
            default:
                k1.e.e((C0056b) obj, "backEvent");
                x xVar2 = this.f1600c;
                if (xVar2.f1618c == null) {
                    Y0.h hVar2 = xVar2.f1617b;
                    ListIterator listIterator2 = hVar2.listIterator(hVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f1279a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return X0.g.f1277c;
    }
}
