package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class je extends tg0 implements xr {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je(Object obj, Object obj2, dg dgVar, int i) {
        super(dgVar);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        sk0 sk0Var = sk0.a;
        ah ahVar = (ah) obj;
        dg dgVar = (dg) obj2;
        switch (i) {
        }
        return ((je) i(dgVar, ahVar)).l(sk0Var);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                return new je((xr) obj3, (e60) obj2, dgVar, 0);
            case 1:
                return new je((xr) obj3, (a90) obj2, dgVar, 1);
            case 2:
                return new je((ma0) obj3, (h) obj2, dgVar, 2);
            default:
                return new je((bk0) obj3, (ir) obj2, dgVar, 3);
        }
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                bh bhVar = bh.COROUTINE_SUSPENDED;
                int i2 = this.k;
                if (i2 == 0) {
                    mv.O(obj);
                    this.k = 1;
                    Object g = ((xr) obj2).g((e60) obj3, this);
                    return g == bhVar ? bhVar : g;
                }
                if (i2 == 1) {
                    mv.O(obj);
                    return obj;
                }
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                bh bhVar2 = bh.COROUTINE_SUSPENDED;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        mv.O(obj);
                        return obj;
                    }
                    s9.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mv.O(obj);
                Object obj4 = ((a90) obj3).f;
                this.k = 1;
                Object g2 = ((xr) obj2).g(obj4, this);
                return g2 == bhVar2 ? bhVar2 : g2;
            case 2:
                ma0 ma0Var = (ma0) obj2;
                bh bhVar3 = bh.COROUTINE_SUSPENDED;
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
                rh rhVar = new rh((ma0Var.inCompatibilityMode$room_runtime_release() && ma0Var.inTransaction()) ? false : true, ma0Var, null, (h) obj3);
                this.k = 1;
                Object useConnection$room_runtime_release = ma0Var.useConnection$room_runtime_release(false, rhVar, this);
                return useConnection$room_runtime_release == bhVar3 ? bhVar3 : useConnection$room_runtime_release;
            default:
                ir irVar = (ir) obj3;
                bh bhVar4 = bh.COROUTINE_SUSPENDED;
                int i5 = this.k;
                try {
                    if (i5 == 0) {
                        mv.O(obj);
                        this.k = 1;
                        obj = bk0.b((bk0) obj2, this);
                        if (obj == bhVar4) {
                            return bhVar4;
                        }
                    } else {
                        if (i5 != 1) {
                            s9.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mv.O(obj);
                    }
                    irVar.a();
                    return sk0.a;
                } catch (Throwable th) {
                    irVar.a();
                    throw th;
                }
        }
    }
}
