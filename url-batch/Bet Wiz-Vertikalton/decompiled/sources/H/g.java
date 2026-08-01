package H;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements J.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f267b;

    public /* synthetic */ g(int i, Object obj) {
        this.f266a = i;
        this.f267b = obj;
    }

    @Override // J.a
    public final void a(Object obj) {
        switch (this.f266a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((B.j) this.f267b).E(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f272c) {
                    try {
                        o.k kVar = i.d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f267b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f267b);
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
