package a;

import X.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends e1.e implements d1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1182b = i;
        this.f1183c = obj;
    }

    @Override // d1.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1182b) {
            case 0:
                e1.d.e((C0054b) obj, "backEvent");
                x xVar = (x) this.f1183c;
                W0.f fVar = xVar.f1203b;
                ListIterator listIterator = fVar.listIterator(fVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f899a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1204c != null) {
                    xVar.a();
                }
                xVar.f1204c = a2;
                return V0.e.f878c;
            case 1:
                e1.d.e((C0054b) obj, "backEvent");
                x xVar2 = (x) this.f1183c;
                if (xVar2.f1204c == null) {
                    W0.f fVar2 = xVar2.f1203b;
                    ListIterator listIterator2 = fVar2.listIterator(fVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f899a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return V0.e.f878c;
            default:
                return obj == ((W0.d) this.f1183c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
