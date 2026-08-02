package B;

import java.util.ArrayList;
import p.C1174j;

/* loaded from: classes.dex */
public final class h implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f96b;

    public /* synthetic */ h(int i3, Object obj) {
        this.f95a = i3;
        this.f96b = obj;
    }

    @Override // D.a
    public final void accept(Object obj) {
        switch (this.f95a) {
            case 0:
                i iVar = (i) obj;
                if (iVar == null) {
                    iVar = new i(-3);
                }
                ((V0.e) this.f96b).C(iVar);
                return;
            default:
                i iVar2 = (i) obj;
                synchronized (j.f101c) {
                    try {
                        C1174j c1174j = j.f102d;
                        ArrayList arrayList = (ArrayList) c1174j.get((String) this.f96b);
                        if (arrayList == null) {
                            return;
                        }
                        c1174j.remove((String) this.f96b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((D.a) arrayList.get(i3)).accept(iVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
