package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gp implements uf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uf
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                hp hpVar = (hp) obj;
                if (hpVar == null) {
                    hpVar = new hp(-3);
                }
                ((i5) this.b).J(hpVar);
                return;
            default:
                hp hpVar2 = (hp) obj;
                synchronized (ip.c) {
                    try {
                        zd0 zd0Var = ip.d;
                        ArrayList arrayList = (ArrayList) zd0Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        zd0Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((uf) arrayList.get(i)).accept(hpVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
