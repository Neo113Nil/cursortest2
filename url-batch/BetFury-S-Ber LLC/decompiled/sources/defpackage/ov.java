package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ov extends eg {
    public int i;
    public final /* synthetic */ xr j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(dg dgVar, qg qgVar, xr xrVar, Object obj) {
        super(dgVar, qgVar);
        this.j = xrVar;
        this.k = obj;
        dgVar.getClass();
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        int i = this.i;
        if (i != 0) {
            if (i != 1) {
                s9.u("This coroutine had already completed");
                return null;
            }
            this.i = 2;
            mv.O(obj);
            return obj;
        }
        this.i = 1;
        mv.O(obj);
        xr xrVar = this.j;
        xrVar.getClass();
        gk0.b(xrVar);
        return xrVar.g(this.k, this);
    }
}
