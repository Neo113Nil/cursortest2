package defpackage;

import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class a10 implements q40 {
    public final /* synthetic */ int f;
    public final /* synthetic */ View g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public a10(View view, int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = view;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    @Override // defpackage.q40
    public final dp0 i(View view, dp0 dp0Var) {
        fv h = dp0Var.a.h(519);
        View view2 = this.g;
        int i = this.f;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.h + h.a, this.i + h.b, this.j + h.c, view2.getPaddingBottom());
        return dp0Var;
    }
}
