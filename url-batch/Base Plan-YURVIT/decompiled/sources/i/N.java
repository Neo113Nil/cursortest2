package i;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import h.MenuC0143j;
import h.MenuItemC0144k;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class N extends K implements L {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2159D;

    /* renamed from: C, reason: collision with root package name */
    public B0.E f2160C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2159D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // i.L
    public final void l(MenuC0143j menuC0143j, MenuItem menuItem) {
        B0.E e2 = this.f2160C;
        if (e2 != null) {
            e2.l(menuC0143j, menuItem);
        }
    }

    @Override // i.L
    public final void p(MenuC0143j menuC0143j, MenuItemC0144k menuItemC0144k) {
        B0.E e2 = this.f2160C;
        if (e2 != null) {
            e2.p(menuC0143j, menuItemC0144k);
        }
    }
}
