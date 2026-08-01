package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ka0 extends tg0 implements xr {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ma0 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ String[] n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(ma0 ma0Var, boolean z, String[] strArr, dg dgVar) {
        super(dgVar);
        this.l = ma0Var;
        this.m = z;
        this.n = strArr;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        return ((ka0) i((dg) obj2, (ej0) obj)).l(sk0.a);
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        ka0 ka0Var = new ka0(this.l, this.m, this.n, dgVar);
        ka0Var.k = obj;
        return ka0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b1, code lost:
    
        if (defpackage.mc0.e(r1, "VACUUM", r8) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (defpackage.mc0.e(r1, "PRAGMA wal_checkpoint(FULL)", r8) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r1.a(r9, r4, r8) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r9.c(r8) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    @Override // defpackage.f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        ej0 ej0Var;
        bh bhVar = bh.COROUTINE_SUSPENDED;
        int i = this.j;
        ma0 ma0Var = this.l;
        switch (i) {
            case 0:
                mv.O(obj);
                ej0 ej0Var2 = (ej0) this.k;
                this.k = ej0Var2;
                this.j = 1;
                Object c = ej0Var2.c(this);
                if (c != bhVar) {
                    ej0Var = ej0Var2;
                    obj = c;
                    if (!((Boolean) obj).booleanValue()) {
                        uv invalidationTracker = ma0Var.getInvalidationTracker();
                        this.k = ej0Var;
                        this.j = 2;
                        break;
                    }
                    dj0 dj0Var = dj0.IMMEDIATE;
                    ja0 ja0Var = new ja0(this.m, this.n, null);
                    this.k = ej0Var;
                    this.j = 3;
                    break;
                }
                return bhVar;
            case 1:
                ej0Var = (ej0) this.k;
                mv.O(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
                dj0 dj0Var2 = dj0.IMMEDIATE;
                ja0 ja0Var2 = new ja0(this.m, this.n, null);
                this.k = ej0Var;
                this.j = 3;
                break;
            case 2:
                ej0Var = (ej0) this.k;
                mv.O(obj);
                dj0 dj0Var22 = dj0.IMMEDIATE;
                ja0 ja0Var22 = new ja0(this.m, this.n, null);
                this.k = ej0Var;
                this.j = 3;
                break;
            case 3:
                ej0Var = (ej0) this.k;
                mv.O(obj);
                this.k = ej0Var;
                this.j = 4;
                obj = ej0Var.c(this);
                break;
            case 4:
                ej0Var = (ej0) this.k;
                mv.O(obj);
                if (!((Boolean) obj).booleanValue()) {
                    this.k = ej0Var;
                    this.j = 5;
                    break;
                }
                return sk0.a;
            case 5:
                ej0Var = (ej0) this.k;
                mv.O(obj);
                this.k = null;
                this.j = 6;
                break;
            case 6:
                mv.O(obj);
                uv invalidationTracker2 = ma0Var.getInvalidationTracker();
                invalidationTracker2.c.e(invalidationTracker2.f, invalidationTracker2.g);
                return sk0.a;
            default:
                s9.u("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
