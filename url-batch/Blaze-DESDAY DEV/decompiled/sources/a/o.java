package a;

import Y.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends g1.e implements f1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1225b = i;
        this.f1226c = obj;
    }

    @Override // f1.l
    public final Object e(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1225b) {
            case 0:
                g1.d.e((C0058b) obj, "backEvent");
                x xVar = (x) this.f1226c;
                V0.e eVar = xVar.f1246b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f946a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1247c != null) {
                    xVar.a();
                }
                xVar.f1247c = a2;
                return U0.f.f904c;
            case 1:
                g1.d.e((C0058b) obj, "backEvent");
                x xVar2 = (x) this.f1226c;
                if (xVar2.f1247c == null) {
                    V0.e eVar2 = xVar2.f1246b;
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f946a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return U0.f.f904c;
            default:
                return obj == ((V0.c) this.f1226c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
