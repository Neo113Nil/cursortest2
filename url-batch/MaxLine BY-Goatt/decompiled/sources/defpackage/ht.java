package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ht extends jt {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(ht.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final gt p;
    public final boolean q;

    public /* synthetic */ ht(gt gtVar, boolean z) {
        this(gtVar, z, h.m, -3, hq.m);
    }

    @Override // defpackage.jt, defpackage.xm0
    public final Object a(ym0 ym0Var, o30 o30Var) {
        if (this.n != -3) {
            Object a = super.a(ym0Var, o30Var);
            return a == b50.m ? a : Unit.a;
        }
        boolean z = this.q;
        if (!z || r.getAndSet(this, 1) == 0) {
            Object k = s03.k(ym0Var, this.p, z, o30Var);
            return k == b50.m ? k : Unit.a;
        }
        lh.g("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    @Override // defpackage.jt
    public final String c() {
        return "channel=" + this.p;
    }

    @Override // defpackage.jt
    public final Object d(e52 e52Var, v vVar) {
        Object k = s03.k(new vi2(e52Var), this.p, this.q, vVar);
        return k == b50.m ? k : Unit.a;
    }

    @Override // defpackage.jt
    public final jt e(CoroutineContext coroutineContext, int i, hq hqVar) {
        return new ht(this.p, this.q, coroutineContext, i, hqVar);
    }

    @Override // defpackage.jt
    public final xm0 f() {
        return new ht(this.p, this.q);
    }

    @Override // defpackage.jt
    public final gt g(a50 a50Var) {
        if (!this.q || r.getAndSet(this, 1) == 0) {
            return this.n == -3 ? this.p : super.g(a50Var);
        }
        lh.g("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public ht(gt gtVar, boolean z, CoroutineContext coroutineContext, int i, hq hqVar) {
        super(coroutineContext, i, hqVar);
        this.p = gtVar;
        this.q = z;
        this.consumed$volatile = 0;
    }
}
