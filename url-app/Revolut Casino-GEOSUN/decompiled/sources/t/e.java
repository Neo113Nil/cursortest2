package t;

import L.Q;
import java.util.ArrayList;
import v.InterfaceC0248a;

/* loaded from: classes.dex */
public final class e implements InterfaceC0248a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2976b;

    public /* synthetic */ e(int i2, Object obj) {
        this.f2975a = i2;
        this.f2976b = obj;
    }

    @Override // v.InterfaceC0248a
    public final void accept(Object obj) {
        switch (this.f2975a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((Q) this.f2976b).s(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f2981c) {
                    try {
                        k.i iVar = g.f2982d;
                        ArrayList arrayList = (ArrayList) iVar.getOrDefault((String) this.f2976b, null);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f2976b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((InterfaceC0248a) arrayList.get(i2)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
