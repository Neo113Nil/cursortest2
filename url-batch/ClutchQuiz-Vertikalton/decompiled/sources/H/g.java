package H;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements J.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f229b;

    public /* synthetic */ g(int i, Object obj) {
        this.f228a = i;
        this.f229b = obj;
    }

    @Override // J.a
    public final void a(Object obj) {
        switch (this.f228a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((B.j) this.f229b).E(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f234c) {
                    try {
                        o.k kVar = i.d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f229b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f229b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((J.a) arrayList.get(i)).a(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
