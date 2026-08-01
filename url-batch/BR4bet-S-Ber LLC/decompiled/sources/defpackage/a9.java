package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class a9 extends q4 {
    @Override // defpackage.q4, defpackage.ph
    public final Dialog J() {
        Context h = h();
        int i = this.d0;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = h.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        z8 z8Var = new z8(h, i);
        z8Var.p = true;
        z8Var.q = true;
        z8Var.v = new x8(z8Var);
        z8Var.f().f(1);
        TypedArray obtainStyledAttributes = z8Var.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        z8Var.t = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z8Var;
    }

    public final void L() {
        Dialog dialog = this.j0;
        if (dialog instanceof z8) {
            z8 z8Var = (z8) dialog;
            if (z8Var.l == null) {
                z8Var.h();
            }
            boolean z = z8Var.l.J;
        }
        I(false, false);
    }
}
