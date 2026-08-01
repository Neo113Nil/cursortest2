package J;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements L.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f367b;

    public /* synthetic */ f(int i, Object obj) {
        this.f366a = i;
        this.f367b = obj;
    }

    @Override // L.a
    public final void a(Object obj) {
        switch (this.f366a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((D.j) this.f367b).D(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f372c) {
                    try {
                        q.k kVar = h.d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f367b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f367b);
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
