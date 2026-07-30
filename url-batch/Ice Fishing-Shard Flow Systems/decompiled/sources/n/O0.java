package n;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class O0 extends I0 implements J0 {

    /* renamed from: K, reason: collision with root package name */
    public static final Method f6687K;

    /* renamed from: J, reason: collision with root package name */
    public l4.b f6688J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f6687K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // n.J0
    public final void f(m.m mVar, m.o oVar) {
        l4.b bVar = this.f6688J;
        if (bVar != null) {
            bVar.f(mVar, oVar);
        }
    }

    @Override // n.J0
    public final void n(m.m mVar, MenuItem menuItem) {
        l4.b bVar = this.f6688J;
        if (bVar != null) {
            bVar.n(mVar, menuItem);
        }
    }

    @Override // n.I0
    public final C0742w0 q(Context context, boolean z7) {
        N0 n02 = new N0(context, z7);
        n02.setHoverListener(this);
        return n02;
    }
}
