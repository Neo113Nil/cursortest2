package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class au extends yq implements ot {
    public static final Method I;
    public k0 H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.yq
    public final lg a(Context context, boolean z) {
        zt ztVar = new zt(context, z);
        ztVar.setHoverListener(this);
        return ztVar;
    }

    @Override // defpackage.ot
    public final void j(mt mtVar, MenuItem menuItem) {
        k0 k0Var = this.H;
        if (k0Var != null) {
            k0Var.j(mtVar, menuItem);
        }
    }

    @Override // defpackage.ot
    public final void k(mt mtVar, pt ptVar) {
        k0 k0Var = this.H;
        if (k0Var != null) {
            k0Var.k(mtVar, ptVar);
        }
    }
}
