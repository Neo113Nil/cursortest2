package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j81 extends r41 {
    public final ol1 dgRBjINgWbAK;
    public Object x50lh2ztY7Y5;

    public j81(ol1 ol1Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.dgRBjINgWbAK = ol1Var;
        this.x50lh2ztY7Y5 = obj2;
    }

    @Override // defpackage.r41, java.util.Map.Entry
    public final Object getValue() {
        return this.x50lh2ztY7Y5;
    }

    @Override // defpackage.r41, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.x50lh2ztY7Y5;
        this.x50lh2ztY7Y5 = obj;
        ml1 ml1Var = (ml1) this.dgRBjINgWbAK.OPXfSBeufaJ8;
        gl1 gl1Var = ml1Var.dgRBjINgWbAK;
        Object obj3 = this.OPXfSBeufaJ8;
        if (!gl1Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ml1Var.wdg6QnbFHrFF;
        if (!z) {
            gl1Var.put(obj3, obj);
        } else {
            if (!z) {
                u9.RfyTYNmI9Srp();
                return null;
            }
            ul2 ul2Var = ml1Var.rtx2ld2ELZv4[ml1Var.OPXfSBeufaJ8];
            Object obj4 = ul2Var.rtx2ld2ELZv4[ul2Var.wdg6QnbFHrFF];
            gl1Var.put(obj3, obj);
            ml1Var.TSizfFm2Yiuu(obj4 != null ? obj4.hashCode() : 0, gl1Var.OPXfSBeufaJ8, obj4, 0);
        }
        ml1Var.r3s1LDPKFs1S = gl1Var.dgRBjINgWbAK;
        return obj2;
    }
}
