package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxy implements View.OnLayoutChangeListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dxy(LinearLayout linearLayout, ViewGroup viewGroup, int i) {
        this.c = i;
        this.b = linearLayout;
        this.a = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.c;
        if (i9 == 0) {
            view.getClass();
            view.removeOnLayoutChangeListener(this);
            ((View) this.a).addOnLayoutChangeListener(new dxx(this.b, 0));
            return;
        }
        if (i9 == 1) {
            view.getClass();
            view.removeOnLayoutChangeListener(this);
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(200L);
            ((LinearLayout) this.b).setLayoutTransition(layoutTransition);
            LayoutTransition layoutTransition2 = new LayoutTransition();
            layoutTransition2.setDuration(200L);
            ((ViewGroup) this.a).setLayoutTransition(layoutTransition2);
            return;
        }
        if (i9 == 2) {
            view.getClass();
            view.removeOnLayoutChangeListener(this);
            ((View) this.a).addOnLayoutChangeListener(new dxx(this.b, 2));
            return;
        }
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        dyd dydVar = (dyd) this.a;
        iyi iyiVar = dydVar.u;
        FrameLayout frameLayout = dydVar.o;
        boolean z = ((dyd) this.b).m;
        dja.z(dydVar.b, dydVar.e, (View) iyiVar.b, z, frameLayout);
    }

    public dxy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
