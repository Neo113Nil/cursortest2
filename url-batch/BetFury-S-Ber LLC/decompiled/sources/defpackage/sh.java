package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sh extends tg0 implements xr {
    public int j;
    public final /* synthetic */ ma0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ tr n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(dg dgVar, tr trVar, ma0 ma0Var, boolean z, boolean z2) {
        super(dgVar);
        this.k = ma0Var;
        this.l = z;
        this.m = z2;
        this.n = trVar;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        return ((sh) i((dg) obj2, (ah) obj)).l(sk0.a);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        return new sh(dgVar, this.n, this.k, this.l, this.m);
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        bh bhVar = bh.COROUTINE_SUSPENDED;
        int i = this.j;
        if (i != 0) {
            if (i == 1) {
                mv.O(obj);
                return obj;
            }
            s9.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mv.O(obj);
        tr trVar = this.n;
        ma0 ma0Var = this.k;
        boolean z = this.m;
        boolean z2 = this.l;
        uh uhVar = new uh(null, trVar, ma0Var, z, z2);
        this.j = 1;
        Object useConnection$room_runtime_release = ma0Var.useConnection$room_runtime_release(z2, uhVar, this);
        return useConnection$room_runtime_release == bhVar ? bhVar : useConnection$room_runtime_release;
    }
}
