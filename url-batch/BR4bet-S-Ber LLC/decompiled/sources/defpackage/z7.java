package defpackage;

import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class z7 implements zy {
    public final /* synthetic */ f8 f;

    public /* synthetic */ z7(f8 f8Var) {
        this.f = f8Var;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f.a(0);
    }

    @Override // defpackage.zy
    public ye0 l(View view, ye0 ye0Var) {
        int a = ye0Var.a();
        f8 f8Var = this.f;
        f8Var.m = a;
        f8Var.n = ye0Var.b();
        f8Var.o = ye0Var.c();
        f8Var.f();
        return ye0Var;
    }
}
