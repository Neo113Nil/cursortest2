package androidx.lifecycle;

import defpackage.gq;
import defpackage.iq;
import defpackage.lq;
import defpackage.nq;
import defpackage.v10;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements lq {
    public final /* synthetic */ iq a;
    public final /* synthetic */ v10 b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(iq iqVar, v10 v10Var) {
        this.a = iqVar;
        this.b = v10Var;
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        if (gqVar == gq.ON_START) {
            this.a.b(this);
            this.b.d();
        }
    }
}
