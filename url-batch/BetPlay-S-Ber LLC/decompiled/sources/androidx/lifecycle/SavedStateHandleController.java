package androidx.lifecycle;

import defpackage.gq;
import defpackage.iq;
import defpackage.lq;
import defpackage.nq;
import defpackage.o8;
import defpackage.q10;
import defpackage.v10;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements lq {
    public final String a;
    public final q10 b;
    public boolean c;

    public SavedStateHandleController(String str, q10 q10Var) {
        this.a = str;
        this.b = q10Var;
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        if (gqVar == gq.ON_DESTROY) {
            this.c = false;
            nqVar.getLifecycle().b(this);
        }
    }

    public final void c(iq iqVar, v10 v10Var) {
        v10Var.getClass();
        iqVar.getClass();
        if (this.c) {
            o8.t("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        iqVar.a(this);
        v10Var.c(this.a, this.b.e);
    }
}
