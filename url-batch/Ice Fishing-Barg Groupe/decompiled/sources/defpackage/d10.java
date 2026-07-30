package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class d10 implements jr1 {
    public static final Object TSizfFm2Yiuu = new Object();
    public volatile jr1 PxuCJdSBwIXG;
    public volatile Object lS5Rgt96tfkO;

    public static jr1 PxuCJdSBwIXG(jr1 jr1Var) {
        if (jr1Var instanceof d10) {
            return jr1Var;
        }
        d10 d10Var = new d10();
        d10Var.lS5Rgt96tfkO = TSizfFm2Yiuu;
        d10Var.PxuCJdSBwIXG = jr1Var;
        return d10Var;
    }

    @Override // defpackage.jr1
    public final Object get() {
        Object obj;
        Object obj2 = this.lS5Rgt96tfkO;
        Object obj3 = TSizfFm2Yiuu;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.lS5Rgt96tfkO;
            if (obj == obj3) {
                obj = this.PxuCJdSBwIXG.get();
                Object obj4 = this.lS5Rgt96tfkO;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.lS5Rgt96tfkO = obj;
                this.PxuCJdSBwIXG = null;
            }
        }
        return obj;
    }
}
