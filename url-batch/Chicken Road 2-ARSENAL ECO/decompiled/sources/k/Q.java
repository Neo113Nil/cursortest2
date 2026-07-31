package k;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Q extends N implements O {

    /* renamed from: E, reason: collision with root package name */
    public static final Method f4960E;

    /* renamed from: D, reason: collision with root package name */
    public V5.g f4961D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f4960E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.O
    public final void c(j.j jVar, MenuItem menuItem) {
        V5.g gVar = this.f4961D;
        if (gVar != null) {
            gVar.c(jVar, menuItem);
        }
    }

    @Override // k.O
    public final void g(j.j jVar, j.k kVar) {
        V5.g gVar = this.f4961D;
        if (gVar != null) {
            gVar.g(jVar, kVar);
        }
    }
}
