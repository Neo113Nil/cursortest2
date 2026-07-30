package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lm0 implements r9, up2 {
    public int OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public lm0(int i, int i2, z30 z30Var) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = new e0(new t80(i, i2, z30Var));
    }

    @Override // defpackage.r9
    public Object OPXfSBeufaJ8() {
        return ((r9) this.wdg6QnbFHrFF).OPXfSBeufaJ8();
    }

    @Override // defpackage.sp2
    public o8 QrzZRwfaDlRX(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return ((e0) this.wdg6QnbFHrFF).QrzZRwfaDlRX(j, o8Var, o8Var2, o8Var3);
    }

    @Override // defpackage.r9
    public void RfyTYNmI9Srp() {
        if (this.OPXfSBeufaJ8 <= 0) {
            mp.PxuCJdSBwIXG("OffsetApplier up called with no corresponding down");
        }
        this.OPXfSBeufaJ8--;
        ((r9) this.wdg6QnbFHrFF).RfyTYNmI9Srp();
    }

    @Override // defpackage.r9
    public void TSizfFm2Yiuu(int i, Object obj) {
        ((r9) this.wdg6QnbFHrFF).TSizfFm2Yiuu(i + (this.OPXfSBeufaJ8 == 0 ? this.rtx2ld2ELZv4 : 0), obj);
    }

    @Override // defpackage.r9
    public void Y1f8riQaR6yg(Object obj) {
        this.OPXfSBeufaJ8++;
        ((r9) this.wdg6QnbFHrFF).Y1f8riQaR6yg(obj);
    }

    @Override // defpackage.r9
    public void a92UlCVFR9N8(int i, Object obj) {
        ((r9) this.wdg6QnbFHrFF).a92UlCVFR9N8(i + (this.OPXfSBeufaJ8 == 0 ? this.rtx2ld2ELZv4 : 0), obj);
    }

    @Override // defpackage.r9
    public void cpQdD2nAriOS(pe0 pe0Var, Object obj) {
        ((r9) this.wdg6QnbFHrFF).cpQdD2nAriOS(pe0Var, obj);
    }

    @Override // defpackage.up2
    public int dgRBjINgWbAK() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.r9
    public void e9gEMXR7LXtO() {
        ((r9) this.wdg6QnbFHrFF).e9gEMXR7LXtO();
    }

    @Override // defpackage.up2
    public int r3s1LDPKFs1S() {
        return this.rtx2ld2ELZv4;
    }

    @Override // defpackage.r9
    public void rtx2ld2ELZv4(int i, int i2, int i3) {
        int i4 = this.OPXfSBeufaJ8 == 0 ? this.rtx2ld2ELZv4 : 0;
        ((r9) this.wdg6QnbFHrFF).rtx2ld2ELZv4(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.r9
    public void wdg6QnbFHrFF(int i, int i2) {
        ((r9) this.wdg6QnbFHrFF).wdg6QnbFHrFF(i + (this.OPXfSBeufaJ8 == 0 ? this.rtx2ld2ELZv4 : 0), i2);
    }

    @Override // defpackage.sp2
    public o8 x50lh2ztY7Y5(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return ((e0) this.wdg6QnbFHrFF).x50lh2ztY7Y5(j, o8Var, o8Var2, o8Var3);
    }

    public lm0() {
        this.wdg6QnbFHrFF = new lm0[256];
        this.rtx2ld2ELZv4 = 0;
        this.OPXfSBeufaJ8 = 0;
    }

    public lm0(int i, int i2) {
        this.wdg6QnbFHrFF = null;
        this.rtx2ld2ELZv4 = i;
        int i3 = i2 & 7;
        this.OPXfSBeufaJ8 = i3 == 0 ? 8 : i3;
    }

    public lm0(r9 r9Var, int i) {
        this.wdg6QnbFHrFF = r9Var;
        this.rtx2ld2ELZv4 = i;
    }
}
