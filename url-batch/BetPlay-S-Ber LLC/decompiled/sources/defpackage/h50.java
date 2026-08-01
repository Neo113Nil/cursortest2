package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class h50 {
    public final e50 a;
    public final ArrayList b = new ArrayList();
    public ip c;
    public ip d;
    public int e;

    public h50(ViewGroup viewGroup) {
        View view;
        ip ipVar = ip.e;
        this.c = ipVar;
        this.d = ipVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        e50 e50Var = new e50(this, viewGroup.getContext(), viewGroup);
        this.a = e50Var;
        e50Var.setVisibility(8);
        e50Var.setWillNotDraw(true);
        u40 u40Var = new u40(9, this);
        WeakHashMap weakHashMap = e90.a;
        w80.c(e50Var, u40Var);
        e90.o(e50Var, new f50(this));
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
            viewGroup.addView(e50Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new g50(viewGroup, e50Var));
        }
    }
}
