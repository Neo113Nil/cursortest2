package a;

import X.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends g1.g implements f1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(x xVar, int i) {
        super(1);
        this.f1219b = i;
        this.f1220c = xVar;
    }

    @Override // f1.l
    public final Object g(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1219b) {
            case 0:
                g1.f.e((C0055b) obj, "backEvent");
                x xVar = this.f1220c;
                V0.c cVar = xVar.f1237b;
                ListIterator listIterator = cVar.listIterator(cVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f924a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1238c != null) {
                    xVar.b();
                }
                xVar.f1238c = a2;
                break;
            default:
                g1.f.e((C0055b) obj, "backEvent");
                x xVar2 = this.f1220c;
                if (xVar2.f1238c == null) {
                    V0.c cVar2 = xVar2.f1237b;
                    ListIterator listIterator2 = cVar2.listIterator(cVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f924a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return U0.i.f864a;
    }
}
