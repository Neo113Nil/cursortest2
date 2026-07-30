package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ec0 implements tr {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public /* synthetic */ ec0(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    @Override // defpackage.tr
    public final void accept(Object obj) {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                gc0 gc0Var = (gc0) obj;
                if (gc0Var == null) {
                    gc0Var = new gc0(-3);
                }
                ((op0) this.lS5Rgt96tfkO).S9EYkSpbGuxq(gc0Var);
                return;
            default:
                gc0 gc0Var2 = (gc0) obj;
                synchronized (hc0.TSizfFm2Yiuu) {
                    try {
                        t52 t52Var = hc0.Y1f8riQaR6yg;
                        ArrayList arrayList = (ArrayList) t52Var.get((String) this.lS5Rgt96tfkO);
                        if (arrayList == null) {
                            return;
                        }
                        t52Var.remove((String) this.lS5Rgt96tfkO);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((tr) arrayList.get(i)).accept(gc0Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
