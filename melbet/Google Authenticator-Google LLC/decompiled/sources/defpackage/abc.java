package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abc {
    public final View a;
    public final ArrayList b = new ArrayList();
    public vb c;
    public vb d;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    public abc(ViewGroup viewGroup) {
        vb vbVar = vb.a;
        this.c = vbVar;
        this.d = vbVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        aaz aazVar = new aaz(this, viewGroup.getContext(), viewGroup);
        this.a = aazVar;
        aazVar.setVisibility(8);
        aazVar.setWillNotDraw(true);
        View view = null;
        tu tuVar = new tu(this, 2, 0 == true ? 1 : 0);
        int i = yq.a;
        yi.c(aazVar, tuVar);
        brn.K(aazVar, new aba(this));
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                view = childAt;
                break;
            }
        }
        if (view == null) {
            viewGroup.addView(aazVar, 0);
        } else {
            view.addOnAttachStateChangeListener(new abb(viewGroup, aazVar, 0));
        }
    }

    public static final vb a(zz zzVar) {
        return vb.c(zzVar.f(519), zzVar.f(64));
    }
}
