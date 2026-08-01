package J;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements L.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f634b;

    public /* synthetic */ f(int i, Object obj) {
        this.f633a = i;
        this.f634b = obj;
    }

    @Override // L.a
    public final void a(Object obj) {
        switch (this.f633a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((B1.c) this.f634b).G(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f639c) {
                    try {
                        q.k kVar = h.f640d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f634b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f634b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((L.a) arrayList.get(i)).a(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
