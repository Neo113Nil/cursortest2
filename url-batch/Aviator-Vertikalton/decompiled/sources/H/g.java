package H;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements J.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f234b;

    public /* synthetic */ g(int i, Object obj) {
        this.f233a = i;
        this.f234b = obj;
    }

    @Override // J.a
    public final void a(Object obj) {
        switch (this.f233a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((B.j) this.f234b).E(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f239c) {
                    try {
                        o.k kVar = i.f240d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f234b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f234b);
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
