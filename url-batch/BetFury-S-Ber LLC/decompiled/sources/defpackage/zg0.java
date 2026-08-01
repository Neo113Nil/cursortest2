package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zg0 {
    public final xg0 a;
    public final ArrayList b = new ArrayList();
    public fv c;
    public fv d;
    public int e;

    public zg0(ViewGroup viewGroup) {
        View view;
        fv fvVar = fv.e;
        this.c = fvVar;
        this.d = fvVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        xg0 xg0Var = new xg0(this, viewGroup.getContext(), viewGroup);
        this.a = xg0Var;
        xg0Var.setVisibility(8);
        xg0Var.setWillNotDraw(true);
        cv cvVar = new cv(this);
        WeakHashMap weakHashMap = hm0.a;
        zl0.c(xg0Var, cvVar);
        hm0.o(xg0Var, new yg0(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView(xg0Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new zp(viewGroup, xg0Var));
        }
    }
}
