package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y23 extends r30 {
    public z23 m;
    public tt0 n;
    public Function0 o;
    public float p;
    public /* synthetic */ Object q;
    public final /* synthetic */ z23 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y23(z23 z23Var, r30 r30Var) {
        super(r30Var);
        this.r = z23Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
