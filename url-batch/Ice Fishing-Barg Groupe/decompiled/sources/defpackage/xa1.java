package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xa1 {
    public static String PxuCJdSBwIXG(q3 q3Var, int i) {
        q3Var.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = q3Var.PxuCJdSBwIXG;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static x32 lS5Rgt96tfkO(za1 za1Var) {
        za1Var.getClass();
        return z32.ngxnMNrpiKat(za1Var, new xy0(19));
    }
}
