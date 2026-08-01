package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sv extends tg0 implements xr {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ uv l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv(uv uvVar, dg dgVar, int i) {
        super(dgVar);
        this.j = i;
        this.l = uvVar;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        sk0 sk0Var = sk0.a;
        ah ahVar = (ah) obj;
        dg dgVar = (dg) obj2;
        switch (i) {
        }
        return ((sv) i(dgVar, ahVar)).l(sk0Var);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        int i = this.j;
        uv uvVar = this.l;
        switch (i) {
            case 0:
                return new sv(uvVar, dgVar, 0);
            case 1:
                return new sv(uvVar, dgVar, 1);
            default:
                return new sv(uvVar, dgVar, 2);
        }
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        int i = this.j;
        sk0 sk0Var = sk0.a;
        uv uvVar = this.l;
        switch (i) {
            case 0:
                bh bhVar = bh.COROUTINE_SUSPENDED;
                int i2 = this.k;
                if (i2 == 0) {
                    mv.O(obj);
                    bk0 bk0Var = uvVar.c;
                    this.k = 1;
                    return bk0Var.f(this) == bhVar ? bhVar : sk0Var;
                }
                if (i2 == 1) {
                    mv.O(obj);
                    return sk0Var;
                }
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                bh bhVar2 = bh.COROUTINE_SUSPENDED;
                int i3 = this.k;
                if (i3 == 0) {
                    mv.O(obj);
                    bk0 bk0Var2 = uvVar.c;
                    this.k = 1;
                    return bk0Var2.f(this) == bhVar2 ? bhVar2 : sk0Var;
                }
                if (i3 == 1) {
                    mv.O(obj);
                    return sk0Var;
                }
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                bh bhVar3 = bh.COROUTINE_SUSPENDED;
                int i4 = this.k;
                if (i4 == 0) {
                    mv.O(obj);
                    this.k = 1;
                    return uvVar.c(this) == bhVar3 ? bhVar3 : sk0Var;
                }
                if (i4 == 1) {
                    mv.O(obj);
                    return sk0Var;
                }
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
