package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0169o;
import k.MenuC0167m;

/* loaded from: classes.dex */
public final class J0 extends E0 implements F0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2875D;

    /* renamed from: C, reason: collision with root package name */
    public A0.h f2876C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2875D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.F0
    public final void f(MenuC0167m menuC0167m, C0169o c0169o) {
        A0.h hVar = this.f2876C;
        if (hVar != null) {
            hVar.f(menuC0167m, c0169o);
        }
    }

    @Override // l.E0
    public final C0236r0 p(Context context, boolean z2) {
        I0 i02 = new I0(context, z2);
        i02.setHoverListener(this);
        return i02;
    }

    @Override // l.F0
    public final void s(MenuC0167m menuC0167m, C0169o c0169o) {
        A0.h hVar = this.f2876C;
        if (hVar != null) {
            hVar.s(menuC0167m, c0169o);
        }
    }
}
