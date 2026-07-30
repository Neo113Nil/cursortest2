package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class in1 {
    public static ip1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ip1 c = ip1.c(null, rootWindowInsets);
        fp1 fp1Var = c.a;
        fp1Var.t(c);
        fp1Var.d(view.getRootView());
        return c;
    }
}
