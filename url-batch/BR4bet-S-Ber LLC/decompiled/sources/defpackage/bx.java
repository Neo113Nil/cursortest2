package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class bx extends pt implements ow {
    public static final Method I;
    public rc0 H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.pt
    public final mi a(Context context, boolean z) {
        ax axVar = new ax(context, z);
        axVar.setHoverListener(this);
        return axVar;
    }

    @Override // defpackage.ow
    public final void h(mw mwVar, MenuItem menuItem) {
        rc0 rc0Var = this.H;
        if (rc0Var != null) {
            rc0Var.h(mwVar, menuItem);
        }
    }

    @Override // defpackage.ow
    public final void j(mw mwVar, qw qwVar) {
        rc0 rc0Var = this.H;
        if (rc0Var != null) {
            rc0Var.j(mwVar, qwVar);
        }
    }
}
