package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x70 extends m61 implements kw0 {
    public float S2OOm9zPNm0h;
    public c00 VhhvGxCb8gfr;

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        int wdg6QnbFHrFF;
        int rtx2ld2ELZv4;
        int i;
        int i2;
        if (!rr.Y1f8riQaR6yg(j) || this.VhhvGxCb8gfr == c00.rtx2ld2ELZv4) {
            wdg6QnbFHrFF = rr.wdg6QnbFHrFF(j);
            rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(j);
        } else {
            int round = Math.round(rr.rtx2ld2ELZv4(j) * this.S2OOm9zPNm0h);
            int wdg6QnbFHrFF2 = rr.wdg6QnbFHrFF(j);
            wdg6QnbFHrFF = rr.rtx2ld2ELZv4(j);
            if (round < wdg6QnbFHrFF2) {
                round = wdg6QnbFHrFF2;
            }
            if (round <= wdg6QnbFHrFF) {
                wdg6QnbFHrFF = round;
            }
            rtx2ld2ELZv4 = wdg6QnbFHrFF;
        }
        if (!rr.TSizfFm2Yiuu(j) || this.VhhvGxCb8gfr == c00.OPXfSBeufaJ8) {
            int OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(j);
            int RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
            i = OPXfSBeufaJ8;
            i2 = RAsUl2FVSrh6;
        } else {
            int round2 = Math.round(rr.RAsUl2FVSrh6(j) * this.S2OOm9zPNm0h);
            int OPXfSBeufaJ82 = rr.OPXfSBeufaJ8(j);
            i = rr.RAsUl2FVSrh6(j);
            if (round2 < OPXfSBeufaJ82) {
                round2 = OPXfSBeufaJ82;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(sr.PxuCJdSBwIXG(wdg6QnbFHrFF, rtx2ld2ELZv4, i, i2));
        return l51Var.jJwa0q7P5wHq(e9gEMXR7LXtO.rtx2ld2ELZv4, e9gEMXR7LXtO.OPXfSBeufaJ8, q50.rtx2ld2ELZv4, new pa(e9gEMXR7LXtO, 1));
    }
}
