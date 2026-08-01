package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class nv extends y90 {
    public int g;
    public final /* synthetic */ xr h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(xr xrVar, Object obj, dg dgVar) {
        super(dgVar);
        this.h = xrVar;
        this.i = obj;
        dgVar.getClass();
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                s9.u("This coroutine had already completed");
                return null;
            }
            this.g = 2;
            mv.O(obj);
            return obj;
        }
        this.g = 1;
        mv.O(obj);
        xr xrVar = this.h;
        xrVar.getClass();
        gk0.b(xrVar);
        return xrVar.g(this.i, this);
    }
}
