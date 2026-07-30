package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ta extends r30 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ua n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(ua uaVar, r30 r30Var) {
        super(r30Var);
        this.n = uaVar;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        this.n.a(null, this);
        return b50.m;
    }
}
