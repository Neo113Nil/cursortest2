package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qm {
    public final Object PxuCJdSBwIXG;
    public final qe0 TSizfFm2Yiuu;
    public final Object Y1f8riQaR6yg;
    public final Throwable e9gEMXR7LXtO;
    public final wh lS5Rgt96tfkO;

    public /* synthetic */ qm(Object obj, wh whVar, qe0 qe0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : whVar, (i & 4) != 0 ? null : qe0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static qm PxuCJdSBwIXG(qm qmVar, wh whVar, Throwable th, int i) {
        Object obj = qmVar.PxuCJdSBwIXG;
        if ((i & 2) != 0) {
            whVar = qmVar.lS5Rgt96tfkO;
        }
        wh whVar2 = whVar;
        qe0 qe0Var = qmVar.TSizfFm2Yiuu;
        Object obj2 = qmVar.Y1f8riQaR6yg;
        if ((i & 16) != 0) {
            th = qmVar.e9gEMXR7LXtO;
        }
        return new qm(obj, whVar2, qe0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm)) {
            return false;
        }
        qm qmVar = (qm) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, qmVar.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, qmVar.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, qmVar.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, qmVar.Y1f8riQaR6yg) && cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, qmVar.e9gEMXR7LXtO);
    }

    public final int hashCode() {
        Object obj = this.PxuCJdSBwIXG;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        wh whVar = this.lS5Rgt96tfkO;
        int hashCode2 = (hashCode + (whVar == null ? 0 : whVar.hashCode())) * 31;
        qe0 qe0Var = this.TSizfFm2Yiuu;
        int hashCode3 = (hashCode2 + (qe0Var == null ? 0 : qe0Var.hashCode())) * 31;
        Object obj2 = this.Y1f8riQaR6yg;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e9gEMXR7LXtO;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.PxuCJdSBwIXG + ", cancelHandler=" + this.lS5Rgt96tfkO + ", onCancellation=" + this.TSizfFm2Yiuu + ", idempotentResume=" + this.Y1f8riQaR6yg + ", cancelCause=" + this.e9gEMXR7LXtO + ')';
    }

    public qm(Object obj, wh whVar, qe0 qe0Var, Object obj2, Throwable th) {
        this.PxuCJdSBwIXG = obj;
        this.lS5Rgt96tfkO = whVar;
        this.TSizfFm2Yiuu = qe0Var;
        this.Y1f8riQaR6yg = obj2;
        this.e9gEMXR7LXtO = th;
    }
}
