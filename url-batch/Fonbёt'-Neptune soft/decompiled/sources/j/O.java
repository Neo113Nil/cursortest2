package j;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import i.MenuC0211i;
import i.MenuItemC0212j;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class O extends L implements M {

    /* renamed from: E, reason: collision with root package name */
    public static final Method f2901E;

    /* renamed from: D, reason: collision with root package name */
    public B.m f2902D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2901E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // j.M
    public final void e(MenuC0211i menuC0211i, MenuItemC0212j menuItemC0212j) {
        B.m mVar = this.f2902D;
        if (mVar != null) {
            mVar.e(menuC0211i, menuItemC0212j);
        }
    }

    @Override // j.M
    public final void g(MenuC0211i menuC0211i, MenuItemC0212j menuItemC0212j) {
        B.m mVar = this.f2902D;
        if (mVar != null) {
            mVar.g(menuC0211i, menuItemC0212j);
        }
    }
}
