package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ra0 extends tg0 implements xr {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra0(Object obj, dg dgVar, int i) {
        super(dgVar);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        sk0 sk0Var = sk0.a;
        ah ahVar = (ah) obj;
        dg dgVar = (dg) obj2;
        switch (i) {
        }
        return ((ra0) i(dgVar, ahVar)).l(sk0Var);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new ra0((na0) obj2, dgVar, 0);
            case 1:
                return new ra0((na0) obj2, dgVar, 1);
            default:
                return new ra0((id) obj2, dgVar, 2);
        }
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        Object obj2;
        int i = this.j;
        sk0 sk0Var = sk0.a;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                bh bhVar = bh.COROUTINE_SUSPENDED;
                int i2 = this.k;
                if (i2 == 0) {
                    mv.O(obj);
                    this.k = 1;
                    return na0.i((na0) obj3, this) == bhVar ? bhVar : sk0Var;
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
                    this.k = 1;
                    return na0.i((na0) obj3, this) == bhVar2 ? bhVar2 : sk0Var;
                }
                if (i3 == 1) {
                    mv.O(obj);
                    return sk0Var;
                }
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                Object obj4 = bh.COROUTINE_SUSPENDED;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        mv.O(obj);
                        return obj;
                    }
                    s9.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mv.O(obj);
                id idVar = (id) obj3;
                this.k = 1;
                while (true) {
                    Object obj5 = mw.f.get(idVar);
                    if (obj5 instanceof wu) {
                        if (idVar.O(obj5) >= 0) {
                            jw jwVar = new jw(n9.z(this), idVar);
                            nk v = jwVar.v();
                            if (v != null && !(ka.l.get(jwVar) instanceof w30)) {
                                v.a();
                                ka.m.set(jwVar, v30.f);
                            }
                            jwVar.w(new ok(bi.H(idVar, true, new jb(3, jwVar))));
                            Object u = jwVar.u();
                            bh bhVar3 = bh.COROUTINE_SUSPENDED;
                            obj2 = u;
                        }
                    } else {
                        if (obj5 instanceof ld) {
                            throw ((ld) obj5).a;
                        }
                        obj2 = n9.T(obj5);
                    }
                }
                Object obj6 = obj2;
                bh bhVar4 = bh.COROUTINE_SUSPENDED;
                return obj6 == obj4 ? obj4 : obj6;
        }
    }
}
