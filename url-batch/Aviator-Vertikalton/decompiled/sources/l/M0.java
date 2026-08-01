package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0202o;
import k.MenuC0200m;

/* loaded from: classes.dex */
public final class M0 extends H0 implements I0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f3268D;

    /* renamed from: C, reason: collision with root package name */
    public B0.d f3269C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3268D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.I0
    public final void e(MenuC0200m menuC0200m, C0202o c0202o) {
        B0.d dVar = this.f3269C;
        if (dVar != null) {
            dVar.e(menuC0200m, c0202o);
        }
    }

    @Override // l.I0
    public final void p(MenuC0200m menuC0200m, C0202o c0202o) {
        B0.d dVar = this.f3269C;
        if (dVar != null) {
            dVar.p(menuC0200m, c0202o);
        }
    }

    @Override // l.H0
    public final C0289u0 q(Context context, boolean z2) {
        L0 l02 = new L0(context, z2);
        l02.setHoverListener(this);
        return l02;
    }
}
