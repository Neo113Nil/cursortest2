package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s51 extends r30 {
    public z51 m;
    public a61 n;
    public List o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ z51 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(z51 z51Var, r30 r30Var) {
        super(r30Var);
        this.r = z51Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return z51.b(this.r, null, null, this);
    }
}
