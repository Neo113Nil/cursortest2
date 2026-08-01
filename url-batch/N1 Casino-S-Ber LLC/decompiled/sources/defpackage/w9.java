package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class w9 extends t60 {
    public boolean a = false;
    public final ViewGroup b;

    public w9(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.t60, defpackage.p60
    public final void b() {
        c90.b(this.b, false);
    }

    @Override // defpackage.t60, defpackage.p60
    public final void c() {
        c90.b(this.b, true);
    }

    @Override // defpackage.p60
    public final void d(s60 s60Var) {
        if (!this.a) {
            c90.b(this.b, false);
        }
        s60Var.x(this);
    }

    @Override // defpackage.t60, defpackage.p60
    public final void f(s60 s60Var) {
        c90.b(this.b, false);
        this.a = true;
    }
}
