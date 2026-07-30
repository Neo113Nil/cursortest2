package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vo2 implements nx0, Serializable {
    public Object OPXfSBeufaJ8;
    public ae0 rtx2ld2ELZv4;

    @Override // defpackage.nx0
    public final Object getValue() {
        if (this.OPXfSBeufaJ8 == jx1.pnx5pC0XzaCw) {
            ae0 ae0Var = this.rtx2ld2ELZv4;
            ae0Var.getClass();
            this.OPXfSBeufaJ8 = ae0Var.PxuCJdSBwIXG();
            this.rtx2ld2ELZv4 = null;
        }
        return this.OPXfSBeufaJ8;
    }

    public final String toString() {
        return this.OPXfSBeufaJ8 != jx1.pnx5pC0XzaCw ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
