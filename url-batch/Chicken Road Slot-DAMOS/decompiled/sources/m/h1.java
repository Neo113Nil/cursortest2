package m;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h1 extends c1 implements d1 {
    public static final Method N;
    public l.d M;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                N = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.d1
    public final void e(l.i iVar, l.j jVar) {
        l.d dVar = this.M;
        if (dVar != null) {
            dVar.e(iVar, jVar);
        }
    }

    @Override // m.d1
    public final void g(l.i iVar, MenuItem menuItem) {
        l.d dVar = this.M;
        if (dVar != null) {
            dVar.g(iVar, menuItem);
        }
    }
}
