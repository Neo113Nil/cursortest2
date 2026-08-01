package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0168o;
import k.MenuC0166m;

/* loaded from: classes.dex */
public final class K0 extends F0 implements G0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2845D;

    /* renamed from: C, reason: collision with root package name */
    public C.g f2846C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2845D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.G0
    public final void f(MenuC0166m menuC0166m, C0168o c0168o) {
        C.g gVar = this.f2846C;
        if (gVar != null) {
            gVar.f(menuC0166m, c0168o);
        }
    }

    @Override // l.F0
    public final C0236s0 p(Context context, boolean z2) {
        J0 j02 = new J0(context, z2);
        j02.setHoverListener(this);
        return j02;
    }

    @Override // l.G0
    public final void u(MenuC0166m menuC0166m, C0168o c0168o) {
        C.g gVar = this.f2846C;
        if (gVar != null) {
            gVar.u(menuC0166m, c0168o);
        }
    }
}
