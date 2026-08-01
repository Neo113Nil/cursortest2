package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k9 extends g9 {
    public final Boolean a;
    public final dp0 b;
    public Window c;
    public boolean d;

    public k9(View view, dp0 dp0Var) {
        this.b = dp0Var;
        g10 g10Var = BottomSheetBehavior.C(view).j;
        ColorStateList backgroundTintList = g10Var != null ? g10Var.g.c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(bi.I(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList B = bi.B(view.getBackground());
        Integer valueOf = B != null ? Integer.valueOf(B.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(bi.I(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.g9
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.g9
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.g9
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        dp0 dp0Var = this.b;
        if (top < dp0Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                xy xyVar = new xy(window.getDecorView(), 17);
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new hp0(window, xyVar) : i >= 30 ? new gp0(window, xyVar) : new ep0(window, xyVar)).l(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), dp0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                xy xyVar2 = new xy(window2.getDecorView(), 17);
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new hp0(window2, xyVar2) : i2 >= 30 ? new gp0(window2, xyVar2) : new ep0(window2, xyVar2)).l(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            xy xyVar = new xy(window.getDecorView(), 17);
            int i = Build.VERSION.SDK_INT;
            this.d = (i >= 35 ? new hp0(window, xyVar) : i >= 30 ? new gp0(window, xyVar) : new ep0(window, xyVar)).g();
        }
    }
}
