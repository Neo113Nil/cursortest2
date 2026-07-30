package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qc2 implements nx0, Serializable {
    public volatile Object OPXfSBeufaJ8;
    public ae0 rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public qc2(ae0 ae0Var) {
        ae0Var.getClass();
        this.rtx2ld2ELZv4 = ae0Var;
        this.OPXfSBeufaJ8 = jx1.pnx5pC0XzaCw;
        this.wdg6QnbFHrFF = this;
    }

    @Override // defpackage.nx0
    public final Object getValue() {
        Object obj;
        Object obj2 = this.OPXfSBeufaJ8;
        jx1 jx1Var = jx1.pnx5pC0XzaCw;
        if (obj2 != jx1Var) {
            return obj2;
        }
        synchronized (this.wdg6QnbFHrFF) {
            obj = this.OPXfSBeufaJ8;
            if (obj == jx1Var) {
                ae0 ae0Var = this.rtx2ld2ELZv4;
                ae0Var.getClass();
                obj = ae0Var.PxuCJdSBwIXG();
                this.OPXfSBeufaJ8 = obj;
                this.rtx2ld2ELZv4 = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.OPXfSBeufaJ8 != jx1.pnx5pC0XzaCw ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
