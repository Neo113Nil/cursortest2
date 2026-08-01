package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0163o;
import k.MenuC0161m;

/* loaded from: classes.dex */
public final class L0 extends G0 implements H0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2828D;

    /* renamed from: C, reason: collision with root package name */
    public C.g f2829C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2828D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.H0
    public final void e(MenuC0161m menuC0161m, C0163o c0163o) {
        C.g gVar = this.f2829C;
        if (gVar != null) {
            gVar.e(menuC0161m, c0163o);
        }
    }

    @Override // l.G0
    public final C0245t0 p(Context context, boolean z2) {
        K0 k02 = new K0(context, z2);
        k02.setHoverListener(this);
        return k02;
    }

    @Override // l.H0
    public final void s(MenuC0161m menuC0161m, C0163o c0163o) {
        C.g gVar = this.f2829C;
        if (gVar != null) {
            gVar.s(menuC0161m, c0163o);
        }
    }
}
