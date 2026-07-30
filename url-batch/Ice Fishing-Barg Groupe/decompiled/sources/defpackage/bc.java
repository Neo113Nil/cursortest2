package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bc {
    public final ArrayList PxuCJdSBwIXG;
    public final CopyOnWriteArrayList TSizfFm2Yiuu;
    public final /* synthetic */ int Y1f8riQaR6yg;
    public final /* synthetic */ Object e9gEMXR7LXtO;
    public boolean lS5Rgt96tfkO;

    public bc(boolean z) {
        this.PxuCJdSBwIXG = new ArrayList();
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = new CopyOnWriteArrayList();
    }

    public final void Y1f8riQaR6yg(boolean z) {
        this.lS5Rgt96tfkO = z;
        ArrayList arrayList = this.PxuCJdSBwIXG;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            of1 of1Var = (of1) obj;
            of1Var.a92UlCVFR9N8(of1Var.e9gEMXR7LXtO && z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc(int i, Object obj) {
        this(false);
        this.Y1f8riQaR6yg = i;
        this.e9gEMXR7LXtO = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bc(y2 y2Var) {
        this(true);
        this.Y1f8riQaR6yg = 3;
        this.e9gEMXR7LXtO = y2Var;
    }

    public final void PxuCJdSBwIXG() {
    }

    public final void TSizfFm2Yiuu(zb zbVar) {
    }

    public final void lS5Rgt96tfkO(zb zbVar) {
    }
}
