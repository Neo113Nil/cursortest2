package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class y8 extends u8 {
    public final Boolean a;
    public final ye0 b;
    public Window c;
    public boolean d;

    public y8(View view, ye0 ye0Var) {
        this.b = ye0Var;
        dw dwVar = BottomSheetBehavior.C(view).j;
        ColorStateList backgroundTintList = dwVar != null ? dwVar.g.c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(xf.y(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList q = xf.q(view.getBackground());
        Integer valueOf = q != null ? Integer.valueOf(q.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(xf.y(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.u8
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.u8
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.u8
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        ye0 ye0Var = this.b;
        if (top < ye0Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                ky kyVar = new ky(window.getDecorView(), 14);
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new cf0(window, kyVar) : i >= 30 ? new bf0(window, kyVar) : new ze0(window, kyVar)).H(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), ye0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                ky kyVar2 = new ky(window2.getDecorView(), 14);
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new cf0(window2, kyVar2) : i2 >= 30 ? new bf0(window2, kyVar2) : new ze0(window2, kyVar2)).H(z);
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
            ky kyVar = new ky(window.getDecorView(), 14);
            int i = Build.VERSION.SDK_INT;
            this.d = (i >= 35 ? new cf0(window, kyVar) : i >= 30 ? new bf0(window, kyVar) : new ze0(window, kyVar)).w();
        }
    }
}
