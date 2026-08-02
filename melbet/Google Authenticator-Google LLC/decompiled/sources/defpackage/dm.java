package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dm extends yw {
    final /* synthetic */ dy a;

    public dm(dy dyVar) {
        this.a = dyVar;
    }

    @Override // defpackage.yw, defpackage.yv
    public final void a() {
        dy dyVar = this.a;
        dyVar.s.setAlpha(1.0f);
        dyVar.M.P(null);
        dyVar.M = null;
    }

    @Override // defpackage.yw, defpackage.yv
    public final void b() {
        dy dyVar = this.a;
        dyVar.s.setVisibility(0);
        if (dyVar.s.getParent() instanceof View) {
            View view = (View) dyVar.s.getParent();
            int i = yq.a;
            view.requestApplyInsets();
        }
    }
}
