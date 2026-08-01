package a;

import Z.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends g1.e implements f1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1280b = i;
        this.f1281c = obj;
    }

    @Override // f1.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1280b) {
            case 0:
                g1.d.e((b) obj, "backEvent");
                x xVar = (x) this.f1281c;
                X0.h hVar = xVar.f1301b;
                ListIterator listIterator = hVar.listIterator(hVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f1008a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1302c != null) {
                    xVar.a();
                }
                xVar.f1302c = a2;
                return W0.e.f956c;
            case 1:
                g1.d.e((b) obj, "backEvent");
                x xVar2 = (x) this.f1281c;
                if (xVar2.f1302c == null) {
                    X0.h hVar2 = xVar2.f1301b;
                    ListIterator listIterator2 = hVar2.listIterator(hVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f1008a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return W0.e.f956c;
            default:
                return obj == ((X0.e) this.f1281c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
