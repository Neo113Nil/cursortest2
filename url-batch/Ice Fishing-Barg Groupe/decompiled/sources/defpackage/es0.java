package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class es0 extends ct {
    public final /* synthetic */ bt cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final /* synthetic */ pe0 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(bt btVar, hu huVar, pe0 pe0Var, bt btVar2) {
        super(btVar, huVar);
        this.x50lh2ztY7Y5 = pe0Var;
        this.cpQdD2nAriOS = btVar2;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.dgRBjINgWbAK;
        if (i != 0) {
            if (i != 1) {
                u9.rtx2ld2ELZv4("This coroutine had already completed");
                return null;
            }
            this.dgRBjINgWbAK = 2;
            ng0.tmVwIGCQF4zR(obj);
            return obj;
        }
        this.dgRBjINgWbAK = 1;
        ng0.tmVwIGCQF4zR(obj);
        pe0 pe0Var = this.x50lh2ztY7Y5;
        pe0Var.getClass();
        mm2.S9EYkSpbGuxq(2, pe0Var);
        return pe0Var.rtx2ld2ELZv4(this.cpQdD2nAriOS, this);
    }
}
