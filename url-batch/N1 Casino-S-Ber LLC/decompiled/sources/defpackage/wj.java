package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class wj implements dd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dd
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xj xjVar = (xj) obj;
                if (xjVar == null) {
                    xjVar = new xj(-3);
                }
                ((q4) this.b).M(xjVar);
                return;
            default:
                xj xjVar2 = (xj) obj;
                synchronized (yj.c) {
                    try {
                        u20 u20Var = yj.d;
                        ArrayList arrayList = (ArrayList) u20Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        u20Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((dd) arrayList.get(i)).accept(xjVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
