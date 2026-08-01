package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class rj implements hd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hd
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                sj sjVar = (sj) obj;
                if (sjVar == null) {
                    sjVar = new sj(-3);
                }
                ((h5) this.b).G(sjVar);
                return;
            default:
                sj sjVar2 = (sj) obj;
                synchronized (tj.c) {
                    try {
                        h30 h30Var = tj.d;
                        ArrayList arrayList = (ArrayList) h30Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        h30Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((hd) arrayList.get(i)).accept(sjVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
