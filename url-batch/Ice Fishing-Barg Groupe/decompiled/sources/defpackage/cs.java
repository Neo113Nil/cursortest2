package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cs {
    public final kf PxuCJdSBwIXG;
    public final bi lS5Rgt96tfkO;

    public cs(kf kfVar, bi biVar) {
        this.PxuCJdSBwIXG = kfVar;
        this.lS5Rgt96tfkO = biVar;
    }

    public final String toString() {
        bi biVar = this.lS5Rgt96tfkO;
        mu muVar = (mu) biVar.x50lh2ztY7Y5.S2OOm9zPNm0h(mu.wdg6QnbFHrFF);
        String str = muVar != null ? muVar.OPXfSBeufaJ8 : null;
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        ov2.RfyTYNmI9Srp(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        sb.append(str != null ? o0.x50lh2ztY7Y5("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.PxuCJdSBwIXG.PxuCJdSBwIXG());
        sb.append(", continuation=");
        sb.append(biVar);
        sb.append(')');
        return sb.toString();
    }
}
