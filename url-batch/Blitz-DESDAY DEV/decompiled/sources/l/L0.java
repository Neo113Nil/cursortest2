package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class L0 extends G0 implements H0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2900D;

    /* renamed from: C, reason: collision with root package name */
    public E.g f2901C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2900D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.H0
    public final void e(k.m mVar, k.o oVar) {
        E.g gVar = this.f2901C;
        if (gVar != null) {
            gVar.e(mVar, oVar);
        }
    }

    @Override // l.G0
    public final C0213t0 p(Context context, boolean z2) {
        K0 k02 = new K0(context, z2);
        k02.setHoverListener(this);
        return k02;
    }

    @Override // l.H0
    public final void s(k.m mVar, k.o oVar) {
        E.g gVar = this.f2901C;
        if (gVar != null) {
            gVar.s(mVar, oVar);
        }
    }
}
