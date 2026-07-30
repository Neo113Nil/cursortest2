package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oy1 extends r30 {
    public ry1 m;
    public eo2 n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ry1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy1(ry1 ry1Var, r30 r30Var) {
        super(r30Var);
        this.q = ry1Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.f(0, null, this);
    }
}
