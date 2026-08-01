package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k2 extends f2 implements g2 {
    public static final Method I;
    public a0.a H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.g2
    public final void c(k.m mVar, k.o oVar) {
        a0.a aVar = this.H;
        if (aVar != null) {
            aVar.c(mVar, oVar);
        }
    }

    @Override // l.g2
    public final void j(k.m mVar, MenuItem menuItem) {
        a0.a aVar = this.H;
        if (aVar != null) {
            aVar.j(mVar, menuItem);
        }
    }

    @Override // l.f2
    public final s1 q(Context context, boolean z3) {
        j2 j2Var = new j2(context, z3);
        j2Var.setHoverListener(this);
        return j2Var;
    }
}
