package androidx.lifecycle;

import defpackage.gq;
import defpackage.lq;
import defpackage.nq;
import defpackage.o8;
import defpackage.r10;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements lq {
    public final r10 a;

    public SavedStateHandleAttacher(r10 r10Var) {
        this.a = r10Var;
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        if (gqVar != gq.ON_CREATE) {
            o8.s(gqVar, "Next event must be ON_CREATE, it was ");
        } else {
            nqVar.getLifecycle().b(this);
            this.a.b();
        }
    }
}
