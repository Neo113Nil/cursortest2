package androidx.activity;

import defpackage.d2;
import defpackage.d50;
import defpackage.gq;
import defpackage.lq;
import defpackage.nq;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements lq {
    public static final /* synthetic */ int a = 0;

    static {
        new d50(new d2(1));
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        if (gqVar == gq.ON_DESTROY) {
            throw null;
        }
    }
}
