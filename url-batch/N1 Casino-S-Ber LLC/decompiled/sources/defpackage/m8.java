package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class m8 extends g4 {
    @Override // defpackage.g4, defpackage.qf
    public final Dialog J() {
        Context h = h();
        int i = this.d0;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = h.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        l8 l8Var = new l8(h, i);
        l8Var.p = true;
        l8Var.q = true;
        l8Var.v = new j8(l8Var);
        l8Var.f().g(1);
        TypedArray obtainStyledAttributes = l8Var.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        l8Var.t = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return l8Var;
    }

    public final void L() {
        Dialog dialog = this.j0;
        if (dialog instanceof l8) {
            l8 l8Var = (l8) dialog;
            if (l8Var.l == null) {
                l8Var.h();
            }
            boolean z = l8Var.l.J;
        }
        I(false, false);
    }
}
