package k;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h2 extends c2 implements d2 {
    public static final Method I;
    public a2.e H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.d2
    public final void e(j.m mVar, MenuItem menuItem) {
        a2.e eVar = this.H;
        if (eVar != null) {
            eVar.e(mVar, menuItem);
        }
    }

    @Override // k.d2
    public final void k(j.m mVar, j.o oVar) {
        a2.e eVar = this.H;
        if (eVar != null) {
            eVar.k(mVar, oVar);
        }
    }

    @Override // k.c2
    public final p1 q(Context context, boolean z3) {
        g2 g2Var = new g2(context, z3);
        g2Var.setHoverListener(this);
        return g2Var;
    }
}
