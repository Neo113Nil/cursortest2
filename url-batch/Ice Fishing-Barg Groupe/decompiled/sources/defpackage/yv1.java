package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yv1 {
    public final HashSet PxuCJdSBwIXG = new HashSet();

    public final void PxuCJdSBwIXG() {
        if (vi0.TSizfFm2Yiuu == null) {
            vi0.TSizfFm2Yiuu = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != vi0.TSizfFm2Yiuu) {
            u9.rtx2ld2ELZv4("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.PxuCJdSBwIXG.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            u9.VhhvGxCb8gfr();
        }
    }
}
