package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class a50 {
    public final y40 a;
    public final ArrayList b = new ArrayList();
    public to c;
    public to d;
    public int e;

    public a50(ViewGroup viewGroup) {
        View view;
        to toVar = to.e;
        this.c = toVar;
        this.d = toVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        y40 y40Var = new y40(this, viewGroup.getContext(), viewGroup);
        this.a = y40Var;
        y40Var.setVisibility(8);
        y40Var.setWillNotDraw(true);
        l40 l40Var = new l40(7, this);
        WeakHashMap weakHashMap = x80.a;
        p80.c(y40Var, l40Var);
        x80.o(y40Var, new z40(this));
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
            viewGroup.addView(y40Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new qk(viewGroup, y40Var));
        }
    }
}
