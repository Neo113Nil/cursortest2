package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0204o;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class L0 extends G0 implements H0 {

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

    @Override // l.H0
    public final void f(MenuC0202m menuC0202m, C0204o c0204o) {
        B0.d dVar = this.f3269C;
        if (dVar != null) {
            dVar.f(menuC0202m, c0204o);
        }
    }

    @Override // l.G0
    public final C0289t0 p(Context context, boolean z2) {
        K0 k02 = new K0(context, z2);
        k02.setHoverListener(this);
        return k02;
    }

    @Override // l.H0
    public final void t(MenuC0202m menuC0202m, C0204o c0204o) {
        B0.d dVar = this.f3269C;
        if (dVar != null) {
            dVar.t(menuC0202m, c0204o);
        }
    }
}
