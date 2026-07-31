package k0;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class K extends I {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f40876g = true;

    K() {
    }

    @Override // k0.M
    public void f(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i4);
        } else if (f40876g) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f40876g = false;
            }
        }
    }
}
