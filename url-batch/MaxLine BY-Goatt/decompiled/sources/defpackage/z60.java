package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z60 extends r30 {
    public Object m;
    public i70 n;
    public dx o;
    public /* synthetic */ Object p;
    public final /* synthetic */ i70 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(i70 i70Var, r30 r30Var) {
        super(r30Var);
        this.q = i70Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return i70.c(this.q, null, this);
    }
}
