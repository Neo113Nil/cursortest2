package h0;

import a2.s;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f implements j0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1988b;

    public /* synthetic */ f(int i4, Object obj) {
        this.f1987a = i4;
        this.f1988b = obj;
    }

    @Override // j0.a
    public final void accept(Object obj) {
        switch (this.f1987a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((s) this.f1988b).E(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.c) {
                    try {
                        n.j jVar = h.f1993d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f1988b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f1988b);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ((j0.a) arrayList.get(i4)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
