package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w00 extends lq {
    public final hq B;

    public w00(int i, hq hqVar) {
        super(i);
        this.B = hqVar;
        if (hqVar == hq.m) {
            b71.p(d82.a(lq.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        lh.c(in1.l(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.lq
    public final boolean B() {
        return this.B == hq.n;
    }

    public final Object Q(Object obj, boolean z) {
        if (this.B != hq.o) {
            return M(obj);
        }
        Object d = super.d(obj);
        return (!(d instanceof rt) || (d instanceof qt)) ? d : Unit.a;
    }

    @Override // defpackage.lq, defpackage.ui2
    public final Object a(o30 o30Var, Object obj) {
        if (Q(obj, true) instanceof qt) {
            throw u();
        }
        return Unit.a;
    }

    @Override // defpackage.lq, defpackage.ui2
    public final Object d(Object obj) {
        return Q(obj, false);
    }
}
