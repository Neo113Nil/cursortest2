package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class y43 {
    public static c83 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        c83 c = c83.c(null, rootWindowInsets);
        z73 z73Var = c.a;
        z73Var.w(c);
        View rootView = view.getRootView();
        z73Var.d(rootView);
        z73Var.o(rootView);
        z73Var.p();
        return c;
    }
}
