package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vp0 implements a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a20
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wp0 wp0Var = (wp0) obj;
                if (wp0Var == null) {
                    wp0Var = new wp0(-3);
                }
                ((t21) this.b).G(wp0Var);
                return;
            default:
                wp0 wp0Var2 = (wp0) obj;
                synchronized (xp0.c) {
                    try {
                        fl2 fl2Var = xp0.d;
                        ArrayList arrayList = (ArrayList) fl2Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        fl2Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((a20) arrayList.get(i)).accept(wp0Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
