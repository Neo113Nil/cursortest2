package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t51 extends r30 {
    public z51 m;
    public List n;
    public Iterator o;
    public long p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ z51 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(z51 z51Var, r30 r30Var) {
        super(r30Var);
        this.s = z51Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return z51.c(this.s, 0L, null, this);
    }
}
