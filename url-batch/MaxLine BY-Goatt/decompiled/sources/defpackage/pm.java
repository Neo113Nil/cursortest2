package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pm extends r30 {
    public yc2 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ qm o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(qm qmVar, r30 r30Var) {
        super(r30Var);
        this.o = qmVar;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.i(this);
    }
}
