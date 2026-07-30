package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import g1.C4524d;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class G0 extends B0 implements C0 {

    /* renamed from: W, reason: collision with root package name */
    public static final Method f39273W;

    /* renamed from: V, reason: collision with root package name */
    public C4524d f39274V;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f39273W = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.C0
    public final void h(l.l lVar, l.n nVar) {
        C4524d c4524d = this.f39274V;
        if (c4524d != null) {
            c4524d.h(lVar, nVar);
        }
    }

    @Override // m.B0
    public final C4754p0 m(Context context, boolean z8) {
        F0 f02 = new F0(context, z8);
        f02.setHoverListener(this);
        return f02;
    }

    @Override // m.C0
    public final void v(l.l lVar, l.n nVar) {
        C4524d c4524d = this.f39274V;
        if (c4524d != null) {
            c4524d.v(lVar, nVar);
        }
    }
}
