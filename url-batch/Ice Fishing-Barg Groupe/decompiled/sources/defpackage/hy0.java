package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hy0 implements i92 {
    private static final gy0 Companion = new gy0();
    public int OPXfSBeufaJ8;
    public final mj1 rtx2ld2ELZv4;

    public hy0(int i) {
        Companion.getClass();
        int i2 = (i / 30) * 30;
        this.rtx2ld2ELZv4 = new mj1(ng0.nLZGh9p8gVSu(Math.max(i2 - 100, 0), i2 + 130), jx1.S2OOm9zPNm0h);
        this.OPXfSBeufaJ8 = i;
    }

    public final void PxuCJdSBwIXG(int i) {
        if (i != this.OPXfSBeufaJ8) {
            this.OPXfSBeufaJ8 = i;
            Companion.getClass();
            int i2 = (i / 30) * 30;
            this.rtx2ld2ELZv4.setValue(ng0.nLZGh9p8gVSu(Math.max(i2 - 100, 0), i2 + 130));
        }
    }

    @Override // defpackage.i92
    public final Object getValue() {
        return (br0) this.rtx2ld2ELZv4.getValue();
    }
}
