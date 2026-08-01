package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0162o;
import k.MenuC0160m;

/* loaded from: classes.dex */
public final class K0 extends F0 implements G0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2881D;

    /* renamed from: C, reason: collision with root package name */
    public C.g f2882C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2881D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.G0
    public final void g(MenuC0160m menuC0160m, C0162o c0162o) {
        C.g gVar = this.f2882C;
        if (gVar != null) {
            gVar.g(menuC0160m, c0162o);
        }
    }

    @Override // l.F0
    public final C0242s0 p(Context context, boolean z2) {
        J0 j02 = new J0(context, z2);
        j02.setHoverListener(this);
        return j02;
    }

    @Override // l.G0
    public final void u(MenuC0160m menuC0160m, C0162o c0162o) {
        C.g gVar = this.f2882C;
        if (gVar != null) {
            gVar.u(menuC0160m, c0162o);
        }
    }
}
