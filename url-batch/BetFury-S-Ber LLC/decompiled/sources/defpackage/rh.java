package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rh extends tg0 implements xr {
    public dj0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ ma0 n;
    public final /* synthetic */ h o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(boolean z, ma0 ma0Var, dg dgVar, h hVar) {
        super(dgVar);
        this.m = z;
        this.n = ma0Var;
        this.o = hVar;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        return ((rh) i((dg) obj2, (ej0) obj)).l(sk0.a);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        rh rhVar = new rh(this.m, this.n, dgVar, this.o);
        rhVar.l = obj;
        return rhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r11 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a6  */
    @Override // defpackage.f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        dj0 dj0Var;
        ej0 ej0Var;
        dj0 dj0Var2;
        ej0 ej0Var2;
        ej0 ej0Var3;
        Object obj2;
        bh bhVar = bh.COROUTINE_SUSPENDED;
        int i = this.k;
        h hVar = this.o;
        dg dgVar = null;
        ma0 ma0Var = this.n;
        if (i == 0) {
            mv.O(obj);
            ej0 ej0Var4 = (ej0) this.l;
            if (!this.m) {
                ej0Var4.getClass();
                return hVar.h(((h70) ej0Var4).b());
            }
            dj0Var = dj0.IMMEDIATE;
            this.l = ej0Var4;
            this.j = dj0Var;
            this.k = 1;
            Object c = ej0Var4.c(this);
            if (c != bhVar) {
                ej0Var = ej0Var4;
                obj = c;
            }
            return bhVar;
        }
        if (i == 1) {
            dj0Var = this.j;
            ej0Var = (ej0) this.l;
            mv.O(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.l;
                    mv.O(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        uv invalidationTracker = ma0Var.getInvalidationTracker();
                        invalidationTracker.c.e(invalidationTracker.f, invalidationTracker.g);
                    }
                    return obj2;
                }
                ej0Var2 = (ej0) this.l;
                mv.O(obj);
                this.l = obj;
                this.k = 4;
                Object c2 = ej0Var2.c(this);
                if (c2 != bhVar) {
                    Object obj3 = obj;
                    obj = c2;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return bhVar;
            }
            dj0Var = this.j;
            ej0Var3 = (ej0) this.l;
            mv.O(obj);
            dj0Var2 = dj0Var;
            ej0Var2 = ej0Var3;
            qh qhVar = new qh(dgVar, hVar, 0);
            this.l = ej0Var2;
            this.j = null;
            this.k = 3;
            obj = ej0Var2.a(dj0Var2, qhVar, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            uv invalidationTracker2 = ma0Var.getInvalidationTracker();
            this.l = ej0Var;
            this.j = dj0Var;
            this.k = 2;
            if (invalidationTracker2.c(this) != bhVar) {
                ej0Var3 = ej0Var;
                dj0Var2 = dj0Var;
                ej0Var2 = ej0Var3;
                qh qhVar2 = new qh(dgVar, hVar, 0);
                this.l = ej0Var2;
                this.j = null;
                this.k = 3;
                obj = ej0Var2.a(dj0Var2, qhVar2, this);
            }
            return bhVar;
        }
        dj0Var2 = dj0Var;
        ej0Var2 = ej0Var;
        qh qhVar22 = new qh(dgVar, hVar, 0);
        this.l = ej0Var2;
        this.j = null;
        this.k = 3;
        obj = ej0Var2.a(dj0Var2, qhVar22, this);
    }
}
