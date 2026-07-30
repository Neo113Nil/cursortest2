package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class d92 implements sp2 {
    public final long OPXfSBeufaJ8;
    public final sp2 rtx2ld2ELZv4;

    public d92(sp2 sp2Var, long j) {
        this.rtx2ld2ELZv4 = sp2Var;
        this.OPXfSBeufaJ8 = j;
    }

    @Override // defpackage.sp2
    public final boolean PxuCJdSBwIXG() {
        return this.rtx2ld2ELZv4.PxuCJdSBwIXG();
    }

    @Override // defpackage.sp2
    public final o8 QrzZRwfaDlRX(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        long j2 = this.OPXfSBeufaJ8;
        return j < j2 ? o8Var : this.rtx2ld2ELZv4.QrzZRwfaDlRX(j - j2, o8Var, o8Var2, o8Var3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d92)) {
            return false;
        }
        d92 d92Var = (d92) obj;
        return d92Var.OPXfSBeufaJ8 == this.OPXfSBeufaJ8 && cs0.wdg6QnbFHrFF(d92Var.rtx2ld2ELZv4, this.rtx2ld2ELZv4);
    }

    public final int hashCode() {
        return Long.hashCode(this.OPXfSBeufaJ8) + (this.rtx2ld2ELZv4.hashCode() * 31);
    }

    @Override // defpackage.sp2
    public final long lS5Rgt96tfkO(o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return this.rtx2ld2ELZv4.lS5Rgt96tfkO(o8Var, o8Var2, o8Var3) + this.OPXfSBeufaJ8;
    }

    @Override // defpackage.sp2
    public final o8 x50lh2ztY7Y5(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        long j2 = this.OPXfSBeufaJ8;
        return j < j2 ? o8Var3 : this.rtx2ld2ELZv4.x50lh2ztY7Y5(j - j2, o8Var, o8Var2, o8Var3);
    }
}
