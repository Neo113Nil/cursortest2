package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h2 extends c2 implements d2 {
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

    @Override // l.d2
    public final void c(k.m mVar, k.o oVar) {
        a0.a aVar = this.H;
        if (aVar != null) {
            aVar.c(mVar, oVar);
        }
    }

    @Override // l.d2
    public final void f(k.m mVar, MenuItem menuItem) {
        a0.a aVar = this.H;
        if (aVar != null) {
            aVar.f(mVar, menuItem);
        }
    }

    @Override // l.c2
    public final p1 q(Context context, boolean z4) {
        g2 g2Var = new g2(context, z4);
        g2Var.setHoverListener(this);
        return g2Var;
    }
}
