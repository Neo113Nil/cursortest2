package l;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class K extends H implements I {
    public static final Method z;

    /* renamed from: y, reason: collision with root package name */
    public V0.j f10796y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.I
    public final void a(k.i iVar, k.j jVar) {
        V0.j jVar2 = this.f10796y;
        if (jVar2 != null) {
            jVar2.a(iVar, jVar);
        }
    }

    @Override // l.I
    public final void l(k.i iVar, k.j jVar) {
        V0.j jVar2 = this.f10796y;
        if (jVar2 != null) {
            jVar2.l(iVar, jVar);
        }
    }
}
