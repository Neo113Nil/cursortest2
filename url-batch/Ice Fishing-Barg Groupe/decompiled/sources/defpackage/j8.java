package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j8 implements i92 {
    public final mj1 OPXfSBeufaJ8;
    public boolean cpQdD2nAriOS;
    public long dgRBjINgWbAK;
    public final lm2 rtx2ld2ELZv4;
    public o8 wdg6QnbFHrFF;
    public long x50lh2ztY7Y5;

    public j8(lm2 lm2Var, Object obj, o8 o8Var, long j, long j2, boolean z) {
        o8 o8Var2;
        this.rtx2ld2ELZv4 = lm2Var;
        this.OPXfSBeufaJ8 = sj0.tmVwIGCQF4zR(obj);
        if (o8Var != null) {
            o8Var2 = mm2.aF05bpZJlKEP(o8Var);
        } else {
            o8Var2 = (o8) lm2Var.PxuCJdSBwIXG.OPXfSBeufaJ8(obj);
            o8Var2.Y1f8riQaR6yg();
        }
        this.wdg6QnbFHrFF = o8Var2;
        this.dgRBjINgWbAK = j;
        this.x50lh2ztY7Y5 = j2;
        this.cpQdD2nAriOS = z;
    }

    @Override // defpackage.i92
    public final Object getValue() {
        return this.OPXfSBeufaJ8.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.OPXfSBeufaJ8.getValue() + ", velocity=" + this.rtx2ld2ELZv4.lS5Rgt96tfkO.OPXfSBeufaJ8(this.wdg6QnbFHrFF) + ", isRunning=" + this.cpQdD2nAriOS + ", lastFrameTimeNanos=" + this.dgRBjINgWbAK + ", finishedTimeNanos=" + this.x50lh2ztY7Y5 + ')';
    }

    public /* synthetic */ j8(lm2 lm2Var, Object obj, o8 o8Var, int i) {
        this(lm2Var, obj, (i & 4) != 0 ? null : o8Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
