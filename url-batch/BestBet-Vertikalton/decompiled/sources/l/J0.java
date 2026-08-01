package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0192p;
import k.MenuC0189m;

/* loaded from: classes.dex */
public final class J0 extends E0 implements F0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f3298D;

    /* renamed from: C, reason: collision with root package name */
    public A0.c f3299C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3298D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.F0
    public final void d(MenuC0189m menuC0189m, C0192p c0192p) {
        A0.c cVar = this.f3299C;
        if (cVar != null) {
            cVar.d(menuC0189m, c0192p);
        }
    }

    @Override // l.F0
    public final void n(MenuC0189m menuC0189m, C0192p c0192p) {
        A0.c cVar = this.f3299C;
        if (cVar != null) {
            cVar.n(menuC0189m, c0192p);
        }
    }

    @Override // l.E0
    public final C0257r0 q(Context context, boolean z2) {
        I0 i02 = new I0(context, z2);
        i02.setHoverListener(this);
        return i02;
    }
}
