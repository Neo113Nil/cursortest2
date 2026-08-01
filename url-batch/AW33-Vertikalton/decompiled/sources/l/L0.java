package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0159o;
import k.MenuC0157m;

/* loaded from: classes.dex */
public final class L0 extends G0 implements H0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2893D;

    /* renamed from: C, reason: collision with root package name */
    public B0.d f2894C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2893D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.H0
    public final void d(MenuC0157m menuC0157m, C0159o c0159o) {
        B0.d dVar = this.f2894C;
        if (dVar != null) {
            dVar.d(menuC0157m, c0159o);
        }
    }

    @Override // l.H0
    public final void o(MenuC0157m menuC0157m, C0159o c0159o) {
        B0.d dVar = this.f2894C;
        if (dVar != null) {
            dVar.o(menuC0157m, c0159o);
        }
    }

    @Override // l.G0
    public final C0261t0 q(Context context, boolean z2) {
        K0 k02 = new K0(context, z2);
        k02.setHoverListener(this);
        return k02;
    }
}
