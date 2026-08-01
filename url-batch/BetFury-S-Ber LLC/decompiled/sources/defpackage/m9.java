package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class m9 extends y4 {
    @Override // defpackage.y4, defpackage.vj
    public final Dialog J() {
        Context h = h();
        int i = this.d0;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = h.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        l9 l9Var = new l9(h, i);
        l9Var.p = true;
        l9Var.q = true;
        l9Var.v = new j9(l9Var);
        l9Var.f().h(1);
        TypedArray obtainStyledAttributes = l9Var.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        l9Var.t = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return l9Var;
    }
}
