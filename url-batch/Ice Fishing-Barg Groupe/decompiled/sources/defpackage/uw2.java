package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class uw2 {
    public Boolean PxuCJdSBwIXG;
    public final /* synthetic */ PxuCJdSBwIXG TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final /* synthetic */ PxuCJdSBwIXG a92UlCVFR9N8;
    public final Bundle e9gEMXR7LXtO;
    public boolean lS5Rgt96tfkO;

    public uw2(PxuCJdSBwIXG pxuCJdSBwIXG, int i, Bundle bundle) {
        this.a92UlCVFR9N8 = pxuCJdSBwIXG;
        Boolean bool = Boolean.TRUE;
        this.TSizfFm2Yiuu = pxuCJdSBwIXG;
        this.PxuCJdSBwIXG = bool;
        this.lS5Rgt96tfkO = false;
        this.Y1f8riQaR6yg = i;
        this.e9gEMXR7LXtO = bundle;
    }

    public abstract void PxuCJdSBwIXG(xq xqVar);

    public final void TSizfFm2Yiuu() {
        synchronized (this) {
            this.PxuCJdSBwIXG = null;
        }
        synchronized (this.TSizfFm2Yiuu.dgRBjINgWbAK) {
            this.TSizfFm2Yiuu.dgRBjINgWbAK.remove(this);
        }
    }

    public abstract boolean lS5Rgt96tfkO();
}
