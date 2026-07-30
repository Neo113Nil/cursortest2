package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x7 extends ow0 {
    public d91 S2OOm9zPNm0h;
    public cl2 VhhvGxCb8gfr;
    public y7 ZbWwgt3aGe7A;
    public long pnx5pC0XzaCw;

    @Override // defpackage.m61
    public final void HGgCfDnf0ga9() {
        this.pnx5pC0XzaCw = -9223372034707292160L;
    }

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        long j2;
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(j);
        if (l51Var.VhhvGxCb8gfr()) {
            j2 = (e9gEMXR7LXtO.rtx2ld2ELZv4 << 32) | (e9gEMXR7LXtO.OPXfSBeufaJ8 & 4294967295L);
        } else {
            cl2 cl2Var = this.VhhvGxCb8gfr;
            int i = e9gEMXR7LXtO.rtx2ld2ELZv4;
            if (cl2Var == null) {
                j2 = (i << 32) | (e9gEMXR7LXtO.OPXfSBeufaJ8 & 4294967295L);
                this.pnx5pC0XzaCw = j2;
            } else {
                long j3 = (e9gEMXR7LXtO.OPXfSBeufaJ8 & 4294967295L) | (i << 32);
                bl2 PxuCJdSBwIXG = cl2Var.PxuCJdSBwIXG(new w7(this, j3, 0), new w7(this, j3, 1));
                this.ZbWwgt3aGe7A.getClass();
                j2 = ((ir0) PxuCJdSBwIXG.getValue()).PxuCJdSBwIXG;
                this.pnx5pC0XzaCw = ((ir0) PxuCJdSBwIXG.getValue()).PxuCJdSBwIXG;
            }
        }
        return l51Var.jJwa0q7P5wHq((int) (j2 >> 32), (int) (4294967295L & j2), q50.rtx2ld2ELZv4, new v7(this, e9gEMXR7LXtO, j2));
    }
}
