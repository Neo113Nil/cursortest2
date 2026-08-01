package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import l.C0171o;
import l.MenuC0169m;

/* loaded from: classes.dex */
public final class O0 extends J0 implements K0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2972D;

    /* renamed from: C, reason: collision with root package name */
    public D.g f2973C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2972D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.K0
    public final void d(MenuC0169m menuC0169m, C0171o c0171o) {
        D.g gVar = this.f2973C;
        if (gVar != null) {
            gVar.d(menuC0169m, c0171o);
        }
    }

    @Override // m.K0
    public final void h(MenuC0169m menuC0169m, C0171o c0171o) {
        D.g gVar = this.f2973C;
        if (gVar != null) {
            gVar.h(menuC0169m, c0171o);
        }
    }

    @Override // m.J0
    public final C0246w0 q(Context context, boolean z2) {
        N0 n02 = new N0(context, z2);
        n02.setHoverListener(this);
        return n02;
    }
}
