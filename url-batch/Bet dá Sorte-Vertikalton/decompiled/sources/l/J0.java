package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0159o;
import k.MenuC0157m;

/* loaded from: classes.dex */
public final class J0 extends E0 implements F0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2860D;

    /* renamed from: C, reason: collision with root package name */
    public C.h f2861C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2860D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.F0
    public final void f(MenuC0157m menuC0157m, C0159o c0159o) {
        C.h hVar = this.f2861C;
        if (hVar != null) {
            hVar.f(menuC0157m, c0159o);
        }
    }

    @Override // l.E0
    public final C0234r0 p(Context context, boolean z2) {
        I0 i02 = new I0(context, z2);
        i02.setHoverListener(this);
        return i02;
    }

    @Override // l.F0
    public final void u(MenuC0157m menuC0157m, C0159o c0159o) {
        C.h hVar = this.f2861C;
        if (hVar != null) {
            hVar.u(menuC0157m, c0159o);
        }
    }
}
