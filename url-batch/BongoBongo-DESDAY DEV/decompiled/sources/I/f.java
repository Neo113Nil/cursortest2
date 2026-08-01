package I;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements K.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f329b;

    public /* synthetic */ f(int i, Object obj) {
        this.f328a = i;
        this.f329b = obj;
    }

    @Override // K.a
    public final void a(Object obj) {
        switch (this.f328a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((C.j) this.f329b).D(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f334c) {
                    try {
                        p.k kVar = h.d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f329b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f329b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((K.a) arrayList.get(i)).a(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
