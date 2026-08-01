package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class n7 implements wv {
    public final /* synthetic */ s7 f;

    public /* synthetic */ n7(s7 s7Var) {
        this.f = s7Var;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f.a(0);
    }

    @Override // defpackage.wv
    public rb0 m(View view, rb0 rb0Var) {
        int a = rb0Var.a();
        s7 s7Var = this.f;
        s7Var.l = a;
        s7Var.m = rb0Var.b();
        s7Var.n = rb0Var.c();
        s7Var.e();
        return rb0Var;
    }
}
