package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class am implements de {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ am(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.de
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                bm bmVar = (bm) obj;
                if (bmVar == null) {
                    bmVar = new bm(-3);
                }
                ((a5) this.b).M(bmVar);
                return;
            default:
                bm bmVar2 = (bm) obj;
                synchronized (cm.c) {
                    try {
                        w50 w50Var = cm.d;
                        ArrayList arrayList = (ArrayList) w50Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        w50Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((de) arrayList.get(i)).accept(bmVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
