package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ds0 extends rv1 {
    public int OPXfSBeufaJ8;
    public final /* synthetic */ bt dgRBjINgWbAK;
    public final /* synthetic */ pe0 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(bt btVar, bt btVar2, pe0 pe0Var) {
        super(btVar);
        this.wdg6QnbFHrFF = pe0Var;
        this.dgRBjINgWbAK = btVar2;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.OPXfSBeufaJ8;
        if (i != 0) {
            if (i != 1) {
                u9.rtx2ld2ELZv4("This coroutine had already completed");
                return null;
            }
            this.OPXfSBeufaJ8 = 2;
            ng0.tmVwIGCQF4zR(obj);
            return obj;
        }
        this.OPXfSBeufaJ8 = 1;
        ng0.tmVwIGCQF4zR(obj);
        pe0 pe0Var = this.wdg6QnbFHrFF;
        pe0Var.getClass();
        mm2.S9EYkSpbGuxq(2, pe0Var);
        return pe0Var.rtx2ld2ELZv4(this.dgRBjINgWbAK, this);
    }
}
