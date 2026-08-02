package k;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: k.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188L extends AbstractC1185I implements InterfaceC1186J {
    public static final Method z;

    /* renamed from: y, reason: collision with root package name */
    public e0.t f13944y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.InterfaceC1186J
    public final void j(j.j jVar, j.k kVar) {
        e0.t tVar = this.f13944y;
        if (tVar != null) {
            tVar.j(jVar, kVar);
        }
    }

    @Override // k.InterfaceC1186J
    public final void n(j.j jVar, MenuItem menuItem) {
        e0.t tVar = this.f13944y;
        if (tVar != null) {
            tVar.n(jVar, menuItem);
        }
    }
}
