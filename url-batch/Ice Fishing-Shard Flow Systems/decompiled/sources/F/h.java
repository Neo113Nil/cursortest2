package F;

import java.util.ArrayList;
import u.C0939j;

/* loaded from: classes.dex */
public final class h implements H.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f737b;

    public /* synthetic */ h(int i2, Object obj) {
        this.f736a = i2;
        this.f737b = obj;
    }

    @Override // H.a
    public final void accept(Object obj) {
        switch (this.f736a) {
            case 0:
                i iVar = (i) obj;
                if (iVar == null) {
                    iVar = new i(-3);
                }
                ((P0.l) this.f737b).c(iVar);
                return;
            default:
                i iVar2 = (i) obj;
                synchronized (j.f742c) {
                    try {
                        C0939j c0939j = j.f743d;
                        ArrayList arrayList = (ArrayList) c0939j.get((String) this.f737b);
                        if (arrayList == null) {
                            return;
                        }
                        c0939j.remove((String) this.f737b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((H.a) arrayList.get(i2)).accept(iVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
