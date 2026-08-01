package defpackage;

import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xv implements zy {
    public final /* synthetic */ int f;
    public final /* synthetic */ View g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public xv(View view, int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = view;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    @Override // defpackage.zy
    public final ye0 l(View view, ye0 ye0Var) {
        er h = ye0Var.a.h(519);
        View view2 = this.g;
        int i = this.f;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.h + h.a, this.i + h.b, this.j + h.c, view2.getPaddingBottom());
        return ye0Var;
    }
}
