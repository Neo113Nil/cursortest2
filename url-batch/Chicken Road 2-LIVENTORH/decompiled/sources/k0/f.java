package k0;

import androidx.emoji2.text.q;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f implements m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2144b;

    public /* synthetic */ f(int i, Object obj) {
        this.f2143a = i;
        this.f2144b = obj;
    }

    @Override // m0.a
    public final void accept(Object obj) {
        switch (this.f2143a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((q) this.f2144b).C(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f2149c) {
                    try {
                        q.j jVar = h.d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f2144b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f2144b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((m0.a) arrayList.get(i)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
