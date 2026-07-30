package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dv2 {
    public static final dv2 lS5Rgt96tfkO;
    public q3 PxuCJdSBwIXG;

    static {
        dv2 dv2Var = new dv2();
        dv2Var.PxuCJdSBwIXG = null;
        lS5Rgt96tfkO = dv2Var;
    }

    public static q3 PxuCJdSBwIXG(Context context) {
        q3 q3Var;
        dv2 dv2Var = lS5Rgt96tfkO;
        synchronized (dv2Var) {
            try {
                if (dv2Var.PxuCJdSBwIXG == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    dv2Var.PxuCJdSBwIXG = new q3(context, (byte) 0);
                }
                q3Var = dv2Var.PxuCJdSBwIXG;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q3Var;
    }
}
