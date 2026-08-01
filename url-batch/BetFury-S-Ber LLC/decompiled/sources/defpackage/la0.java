package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class la0 extends tg0 implements xr {
    public int j;
    public final /* synthetic */ ma0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ String[] m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la0(ma0 ma0Var, boolean z, String[] strArr, dg dgVar) {
        super(dgVar);
        this.k = ma0Var;
        this.l = z;
        this.m = strArr;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        return ((la0) i((dg) obj2, (ah) obj)).l(sk0.a);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        return new la0(this.k, this.l, this.m, dgVar);
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        ea0 ea0Var;
        bh bhVar = bh.COROUTINE_SUSPENDED;
        int i = this.j;
        if (i == 0) {
            mv.O(obj);
            ma0 ma0Var = this.k;
            ea0Var = ma0Var.connectionManager;
            if (ea0Var == null) {
                mv.P("connectionManager");
                throw null;
            }
            ka0 ka0Var = new ka0(ma0Var, this.l, this.m, null);
            this.j = 1;
            if (ea0Var.f.u(false, ka0Var, this) == bhVar) {
                return bhVar;
            }
        } else {
            if (i != 1) {
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mv.O(obj);
        }
        return sk0.a;
    }
}
