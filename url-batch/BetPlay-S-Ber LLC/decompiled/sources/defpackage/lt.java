package defpackage;

import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class lt implements dw {
    public final /* synthetic */ int f;
    public final /* synthetic */ View g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public lt(View view, int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = view;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    @Override // defpackage.dw
    public final ac0 onApplyWindowInsets(View view, ac0 ac0Var) {
        ip h = ac0Var.a.h(519);
        View view2 = this.g;
        int i = this.f;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.h + h.a, this.i + h.b, this.j + h.c, view2.getPaddingBottom());
        return ac0Var;
    }
}
