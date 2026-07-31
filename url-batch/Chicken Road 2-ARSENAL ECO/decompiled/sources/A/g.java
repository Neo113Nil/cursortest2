package A;

import java.util.ArrayList;
import q.C0591k;
import u0.C0673c;

/* loaded from: classes.dex */
public final class g implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18b;

    public /* synthetic */ g(int i7, Object obj) {
        this.f17a = i7;
        this.f18b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f17a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((C0673c) this.f18b).i(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f23c) {
                    try {
                        C0591k c0591k = i.f24d;
                        ArrayList arrayList = (ArrayList) c0591k.getOrDefault((String) this.f18b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c0591k.remove((String) this.f18b);
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            ((C.a) arrayList.get(i7)).accept(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
