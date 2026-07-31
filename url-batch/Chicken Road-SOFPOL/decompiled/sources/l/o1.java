package l;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o1 extends j1 implements k1 {
    public static final Method C;
    public b1.b B;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                C = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.k1
    public final void b(k.i iVar, k.j jVar) {
        b1.b bVar = this.B;
        if (bVar != null) {
            bVar.b(iVar, jVar);
        }
    }

    @Override // l.k1
    public final void e(k.i iVar, MenuItem menuItem) {
        b1.b bVar = this.B;
        if (bVar != null) {
            bVar.e(iVar, menuItem);
        }
    }
}
