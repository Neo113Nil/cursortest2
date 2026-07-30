package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xk1 extends ye1 implements kk1 {
    public static final Method O;
    public ar0 N;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.kk1
    public final void f(fk1 fk1Var, MenuItem menuItem) {
        ar0 ar0Var = this.N;
        if (ar0Var != null) {
            ar0Var.f(fk1Var, menuItem);
        }
    }

    @Override // defpackage.kk1
    public final void i(fk1 fk1Var, lk1 lk1Var) {
        ar0 ar0Var = this.N;
        if (ar0Var != null) {
            ar0Var.i(fk1Var, lk1Var);
        }
    }

    @Override // defpackage.ye1
    public final ne0 q(Context context, boolean z) {
        wk1 wk1Var = new wk1(context, z);
        wk1Var.setHoverListener(this);
        return wk1Var;
    }
}
