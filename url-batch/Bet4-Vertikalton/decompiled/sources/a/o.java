package a;

import Y.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends d1.e implements c1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1195b = i;
        this.f1196c = obj;
    }

    @Override // c1.l
    public final Object e(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1195b) {
            case 0:
                d1.d.e((C0058b) obj, "backEvent");
                x xVar = (x) this.f1196c;
                S0.e eVar = xVar.f1216b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f919a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1217c != null) {
                    xVar.a();
                }
                xVar.f1217c = a2;
                return R0.f.f780c;
            case 1:
                d1.d.e((C0058b) obj, "backEvent");
                x xVar2 = (x) this.f1196c;
                if (xVar2.f1217c == null) {
                    S0.e eVar2 = xVar2.f1216b;
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f919a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return R0.f.f780c;
            default:
                return obj == ((S0.c) this.f1196c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
