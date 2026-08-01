package k0;

import androidx.emoji2.text.q;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f implements m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2292b;

    public /* synthetic */ f(int i, Object obj) {
        this.f2291a = i;
        this.f2292b = obj;
    }

    @Override // m0.a
    public final void accept(Object obj) {
        switch (this.f2291a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((q) this.f2292b).E(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f2297c) {
                    try {
                        q.j jVar = h.d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f2292b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f2292b);
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
