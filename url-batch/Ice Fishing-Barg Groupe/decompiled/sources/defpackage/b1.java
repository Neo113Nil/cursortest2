package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        p81 p81Var = r1.BUo4iHFctTZi;
        synchronized (p81Var) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = p81Var.PxuCJdSBwIXG;
                int i2 = p81Var.lS5Rgt96tfkO;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        r1 r1Var = (r1) objArr[i3];
                        boolean showLayoutBounds = r1Var.getShowLayoutBounds();
                        r1.Companion.getClass();
                        r1Var.setShowLayoutBounds(c1.PxuCJdSBwIXG());
                        if (showLayoutBounds != r1Var.getShowLayoutBounds()) {
                            r1Var.post(new z0(r1Var, 2));
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        r1 r1Var2 = (r1) objArr[i3];
                        r1Var2.post(new z0(r1Var2, 3));
                        i3++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
