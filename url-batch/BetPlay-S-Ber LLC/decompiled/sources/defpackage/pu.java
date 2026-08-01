package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class pu extends lr implements du {
    public static final Method I;
    public j1 H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.lr
    public final dg a(Context context, boolean z) {
        ou ouVar = new ou(context, z);
        ouVar.setHoverListener(this);
        return ouVar;
    }

    @Override // defpackage.du
    public final void g(au auVar, MenuItem menuItem) {
        j1 j1Var = this.H;
        if (j1Var != null) {
            j1Var.g(auVar, menuItem);
        }
    }

    @Override // defpackage.du
    public final void j(au auVar, eu euVar) {
        j1 j1Var = this.H;
        if (j1Var != null) {
            j1Var.j(auVar, euVar);
        }
    }
}
