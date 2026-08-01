package H;

import java.util.ArrayList;
import u0.C0365d;

/* loaded from: classes.dex */
public final class g implements J.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f491b;

    public /* synthetic */ g(int i, Object obj) {
        this.f490a = i;
        this.f491b = obj;
    }

    @Override // J.a
    public final void a(Object obj) {
        switch (this.f490a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((C0365d) this.f491b).g(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f496c) {
                    try {
                        o.k kVar = i.d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f491b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f491b);
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
