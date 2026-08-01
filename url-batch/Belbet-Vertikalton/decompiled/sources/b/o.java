package b;

import Z.A;
import i1.InterfaceC0192l;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends j1.i implements InterfaceC0192l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f2198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, int i) {
        super(1);
        this.f2197b = i;
        this.f2198c = wVar;
    }

    @Override // i1.InterfaceC0192l
    public final Object g(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f2197b) {
            case 0:
                j1.h.e((C0089b) obj, "backEvent");
                w wVar = this.f2198c;
                X0.i iVar = wVar.f2214b;
                ListIterator listIterator = iVar.listIterator(iVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f1420a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (wVar.f2215c != null) {
                    wVar.a();
                }
                wVar.f2215c = a2;
                break;
            default:
                j1.h.e((C0089b) obj, "backEvent");
                w wVar2 = this.f2198c;
                if (wVar2.f2215c == null) {
                    X0.i iVar2 = wVar2.f2214b;
                    ListIterator listIterator2 = iVar2.listIterator(iVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f1420a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return W0.i.f1345a;
    }
}
