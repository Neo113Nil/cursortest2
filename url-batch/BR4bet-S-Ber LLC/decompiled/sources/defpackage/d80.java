package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class d80 {
    public final b80 a;
    public final ArrayList b = new ArrayList();
    public er c;
    public er d;
    public int e;

    public d80(ViewGroup viewGroup) {
        View view;
        er erVar = er.e;
        this.c = erVar;
        this.d = erVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        b80 b80Var = new b80(this, viewGroup.getContext(), viewGroup);
        this.a = b80Var;
        b80Var.setVisibility(8);
        b80Var.setWillNotDraw(true);
        c2 c2Var = new c2(6, this);
        WeakHashMap weakHashMap = ic0.a;
        ac0.c(b80Var, c2Var);
        ic0.o(b80Var, new c80(this));
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
            viewGroup.addView(b80Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new tm(viewGroup, b80Var));
        }
    }
}
