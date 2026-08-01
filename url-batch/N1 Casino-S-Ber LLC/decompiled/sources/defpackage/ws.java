package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ws implements wv {
    public final /* synthetic */ int f;
    public final /* synthetic */ View g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public ws(View view, int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = view;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    @Override // defpackage.wv
    public final rb0 m(View view, rb0 rb0Var) {
        to h = rb0Var.a.h(519);
        View view2 = this.g;
        int i = this.f;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.h + h.a, this.i + h.b, this.j + h.c, view2.getPaddingBottom());
        return rb0Var;
    }
}
