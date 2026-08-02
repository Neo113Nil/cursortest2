package l;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.MenuC1065j;
import k.MenuItemC1066k;

/* loaded from: classes.dex */
public final class N extends K implements L {
    public static final Method z;

    /* renamed from: y, reason: collision with root package name */
    public b0.s f9755y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.L
    public final void a(MenuC1065j menuC1065j, MenuItemC1066k menuItemC1066k) {
        b0.s sVar = this.f9755y;
        if (sVar != null) {
            sVar.a(menuC1065j, menuItemC1066k);
        }
    }

    @Override // l.L
    public final void b(MenuC1065j menuC1065j, MenuItemC1066k menuItemC1066k) {
        b0.s sVar = this.f9755y;
        if (sVar != null) {
            sVar.b(menuC1065j, menuItemC1066k);
        }
    }
}
