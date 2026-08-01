package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ia extends aa0 {
    public boolean a = false;
    public final ViewGroup b;

    public ia(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.aa0, defpackage.x90
    public final void b() {
        xf.L(this.b, false);
    }

    @Override // defpackage.aa0, defpackage.x90
    public final void c() {
        xf.L(this.b, true);
    }

    @Override // defpackage.x90
    public final void d(z90 z90Var) {
        if (!this.a) {
            xf.L(this.b, false);
        }
        z90Var.x(this);
    }

    @Override // defpackage.aa0, defpackage.x90
    public final void f(z90 z90Var) {
        xf.L(this.b, false);
        this.a = true;
    }
}
