package a;

import Z.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends h1.e implements g1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj) {
        super(1);
        this.f1271b = i;
        this.f1272c = obj;
    }

    @Override // g1.l
    public final Object e(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1271b) {
            case 0:
                h1.d.e((C0057b) obj, "backEvent");
                x xVar = (x) this.f1272c;
                W0.e eVar = xVar.f1292b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f989a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1293c != null) {
                    xVar.a();
                }
                xVar.f1293c = a2;
                return V0.e.f946c;
            case 1:
                h1.d.e((C0057b) obj, "backEvent");
                x xVar2 = (x) this.f1272c;
                if (xVar2.f1293c == null) {
                    W0.e eVar2 = xVar2.f1292b;
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f989a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return V0.e.f946c;
            default:
                return obj == ((W0.c) this.f1272c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
