package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w82 implements e80 {
    public final float PxuCJdSBwIXG;
    public final Object TSizfFm2Yiuu;
    public final float lS5Rgt96tfkO;

    public w82(float f, float f2, Object obj) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = obj;
    }

    @Override // defpackage.i8
    public final sp2 PxuCJdSBwIXG(lm2 lm2Var) {
        Object obj = this.TSizfFm2Yiuu;
        return new b42(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, obj == null ? null : (o8) lm2Var.PxuCJdSBwIXG.OPXfSBeufaJ8(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w82) {
            w82 w82Var = (w82) obj;
            if (w82Var.PxuCJdSBwIXG == this.PxuCJdSBwIXG && w82Var.lS5Rgt96tfkO == this.lS5Rgt96tfkO && cs0.wdg6QnbFHrFF(w82Var.TSizfFm2Yiuu, this.TSizfFm2Yiuu)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.TSizfFm2Yiuu;
        return Float.hashCode(this.lS5Rgt96tfkO) + o0.PxuCJdSBwIXG(this.PxuCJdSBwIXG, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ w82(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
