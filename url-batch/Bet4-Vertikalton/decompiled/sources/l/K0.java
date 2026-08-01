package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0166o;
import k.MenuC0164m;

/* loaded from: classes.dex */
public final class K0 extends F0 implements G0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2820D;

    /* renamed from: C, reason: collision with root package name */
    public C.g f2821C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2820D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.G0
    public final void e(MenuC0164m menuC0164m, C0166o c0166o) {
        C.g gVar = this.f2821C;
        if (gVar != null) {
            gVar.e(menuC0164m, c0166o);
        }
    }

    @Override // l.F0
    public final C0233s0 p(Context context, boolean z2) {
        J0 j02 = new J0(context, z2);
        j02.setHoverListener(this);
        return j02;
    }

    @Override // l.G0
    public final void s(MenuC0164m menuC0164m, C0166o c0166o) {
        C.g gVar = this.f2821C;
        if (gVar != null) {
            gVar.s(menuC0164m, c0166o);
        }
    }
}
