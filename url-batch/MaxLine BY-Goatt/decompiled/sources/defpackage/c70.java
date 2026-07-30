package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c70 extends r30 {
    public i70 m;
    public qo2 n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ i70 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(i70 i70Var, o30 o30Var) {
        super(o30Var);
        this.q = i70Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return i70.e(this.q, false, this);
    }
}
