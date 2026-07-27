package B;

import java.util.ArrayList;
import r.C1401k;

/* loaded from: classes.dex */
public final class f implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117b;

    public /* synthetic */ f(int i2, Object obj) {
        this.f116a = i2;
        this.f117b = obj;
    }

    @Override // D.a
    public final void accept(Object obj) {
        switch (this.f116a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((B0.c) this.f117b).h(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f122c) {
                    try {
                        C1401k c1401k = h.f123d;
                        ArrayList arrayList = (ArrayList) c1401k.getOrDefault((String) this.f117b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c1401k.remove((String) this.f117b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((D.a) arrayList.get(i2)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
