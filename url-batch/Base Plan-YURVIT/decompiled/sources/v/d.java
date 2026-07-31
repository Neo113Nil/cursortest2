package v;

import N.P;
import java.util.ArrayList;
import x.InterfaceC0249a;

/* loaded from: classes.dex */
public final class d implements InterfaceC0249a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3066b;

    public /* synthetic */ d(int i2, Object obj) {
        this.f3065a = i2;
        this.f3066b = obj;
    }

    @Override // x.InterfaceC0249a
    public final void accept(Object obj) {
        switch (this.f3065a) {
            case 0:
                e eVar = (e) obj;
                if (eVar == null) {
                    eVar = new e(-3);
                }
                ((P) this.f3066b).A(eVar);
                return;
            default:
                e eVar2 = (e) obj;
                synchronized (f.f3071c) {
                    try {
                        m.i iVar = f.f3072d;
                        ArrayList arrayList = (ArrayList) iVar.getOrDefault((String) this.f3066b, null);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f3066b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((InterfaceC0249a) arrayList.get(i2)).accept(eVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
