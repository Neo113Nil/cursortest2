package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jq0 implements kq0 {
    public final int OPXfSBeufaJ8;
    public final long rtx2ld2ELZv4;

    public jq0(int i, long j) {
        this.rtx2ld2ELZv4 = j;
        this.OPXfSBeufaJ8 = i;
    }

    @Override // defpackage.kq0
    public final gq0 toInstant() {
        fq0 fq0Var = gq0.Companion;
        fq0Var.getClass();
        gq0 gq0Var = gq0.wdg6QnbFHrFF;
        long j = gq0Var.rtx2ld2ELZv4;
        long j2 = this.rtx2ld2ELZv4;
        if (j2 >= j) {
            fq0Var.getClass();
            gq0 gq0Var2 = gq0.dgRBjINgWbAK;
            if (j2 <= gq0Var2.rtx2ld2ELZv4) {
                fq0Var.getClass();
                long j3 = this.OPXfSBeufaJ8;
                long j4 = j3 / 1000000000;
                if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
                    j4--;
                }
                long j5 = j2 + j4;
                if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                    fq0Var.getClass();
                    return j2 > 0 ? gq0Var2 : gq0Var;
                }
                if (j5 < -31557014167219200L) {
                    return gq0Var;
                }
                if (j5 > 31556889864403199L) {
                    return gq0Var2;
                }
                long j6 = j3 % 1000000000;
                return new gq0((int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)), j5);
            }
        }
        throw new iq0("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
