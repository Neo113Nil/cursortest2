package n;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import m.C0231o;
import m.MenuC0229m;

/* loaded from: classes.dex */
public final class N0 extends I0 implements J0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f3500D;

    /* renamed from: C, reason: collision with root package name */
    public C1.d f3501C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3500D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // n.J0
    public final void j(MenuC0229m menuC0229m, C0231o c0231o) {
        C1.d dVar = this.f3501C;
        if (dVar != null) {
            dVar.j(menuC0229m, c0231o);
        }
    }

    @Override // n.J0
    public final void n(MenuC0229m menuC0229m, C0231o c0231o) {
        C1.d dVar = this.f3501C;
        if (dVar != null) {
            dVar.n(menuC0229m, c0231o);
        }
    }

    @Override // n.I0
    public final C0305v0 q(Context context, boolean z2) {
        M0 m02 = new M0(context, z2);
        m02.setHoverListener(this);
        return m02;
    }
}
