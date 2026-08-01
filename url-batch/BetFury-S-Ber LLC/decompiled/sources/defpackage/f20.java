package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f20 extends ny implements t10 {
    public static final Method I;
    public o0 H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.ny
    public final xk a(Context context, boolean z) {
        e20 e20Var = new e20(context, z);
        e20Var.setHoverListener(this);
        return e20Var;
    }

    @Override // defpackage.t10
    public final void h(r10 r10Var, MenuItem menuItem) {
        o0 o0Var = this.H;
        if (o0Var != null) {
            o0Var.h(r10Var, menuItem);
        }
    }

    @Override // defpackage.t10
    public final void j(r10 r10Var, u10 u10Var) {
        o0 o0Var = this.H;
        if (o0Var != null) {
            o0Var.j(r10Var, u10Var);
        }
    }
}
