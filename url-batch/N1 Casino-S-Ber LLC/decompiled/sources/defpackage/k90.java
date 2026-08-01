package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class k90 extends nd {
    public im a;
    public int b = 0;

    public k90() {
    }

    @Override // defpackage.nd
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.a == null) {
            im imVar = new im();
            imVar.d = view;
            this.a = imVar;
        }
        im imVar2 = this.a;
        View view2 = (View) imVar2.d;
        imVar2.a = view2.getTop();
        imVar2.b = view2.getLeft();
        this.a.b();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        im imVar3 = this.a;
        if (imVar3.c != i2) {
            imVar3.c = i2;
            imVar3.b();
        }
        this.b = 0;
        return true;
    }

    public final int w() {
        im imVar = this.a;
        if (imVar != null) {
            return imVar.c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(view, i);
    }

    public k90(int i) {
    }
}
