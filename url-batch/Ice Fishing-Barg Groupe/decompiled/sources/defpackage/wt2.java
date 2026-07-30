package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wt2 {
    public static final kp2 PxuCJdSBwIXG(wt2 wt2Var, int i, String str) {
        wt2Var.getClass();
        return new kp2(new aq0(0, 0, 0, 0), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r3 == defpackage.fp.lS5Rgt96tfkO) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xt2 lS5Rgt96tfkO(hp hpVar) {
        xt2 xt2Var;
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        View view = (View) tf0Var.wdg6QnbFHrFF(h2.a92UlCVFR9N8);
        WeakHashMap weakHashMap = xt2.VhhvGxCb8gfr;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new xt2(view);
                    weakHashMap.put(view, obj);
                }
                xt2Var = (xt2) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(xt2Var) | tf0Var.rtx2ld2ELZv4(view);
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        if (!rtx2ld2ELZv4) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu = new xf2(11, xt2Var, view);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        mm2.rtx2ld2ELZv4(xt2Var, (le0) nLZGh9p8gVSu, tf0Var);
        return xt2Var;
    }
}
