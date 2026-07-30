package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q02 implements e12 {
    public static final p02 Companion = new p02();
    public static final cr1 wdg6QnbFHrFF = new cr1(5, new uz1(20, 0), new vz1(11));
    public final ty OPXfSBeufaJ8;
    public final hj1 PxuCJdSBwIXG;
    public float a92UlCVFR9N8;
    public final ty rtx2ld2ELZv4;
    public final hj1 lS5Rgt96tfkO = new hj1(0);
    public final hj1 TSizfFm2Yiuu = new hj1(0);
    public final e81 Y1f8riQaR6yg = new e81();
    public final hj1 e9gEMXR7LXtO = new hj1(Integer.MAX_VALUE);
    public final ax RAsUl2FVSrh6 = new ax(new xw1(2, this));

    public q02(int i) {
        this.PxuCJdSBwIXG = new hj1(i);
        final int i2 = 0;
        this.rtx2ld2ELZv4 = sj0.RfyTYNmI9Srp(new ae0(this) { // from class: o02
            public final /* synthetic */ q02 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i3 = i2;
                q02 q02Var = this.OPXfSBeufaJ8;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(q02Var.PxuCJdSBwIXG.rtx2ld2ELZv4() < q02Var.e9gEMXR7LXtO.rtx2ld2ELZv4());
                    default:
                        return Boolean.valueOf(q02Var.PxuCJdSBwIXG.rtx2ld2ELZv4() > 0);
                }
            }
        });
        final int i3 = 1;
        this.OPXfSBeufaJ8 = sj0.RfyTYNmI9Srp(new ae0(this) { // from class: o02
            public final /* synthetic */ q02 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i32 = i3;
                q02 q02Var = this.OPXfSBeufaJ8;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(q02Var.PxuCJdSBwIXG.rtx2ld2ELZv4() < q02Var.e9gEMXR7LXtO.rtx2ld2ELZv4());
                    default:
                        return Boolean.valueOf(q02Var.PxuCJdSBwIXG.rtx2ld2ELZv4() > 0);
                }
            }
        });
    }

    @Override // defpackage.e12
    public final boolean PxuCJdSBwIXG() {
        return ((Boolean) this.OPXfSBeufaJ8.getValue()).booleanValue();
    }

    @Override // defpackage.e12
    public final boolean TSizfFm2Yiuu() {
        return ((Boolean) this.rtx2ld2ELZv4.getValue()).booleanValue();
    }

    @Override // defpackage.e12
    public final Object Y1f8riQaR6yg(h91 h91Var, pe0 pe0Var, ct ctVar) {
        Object Y1f8riQaR6yg = this.RAsUl2FVSrh6.Y1f8riQaR6yg(h91Var, pe0Var, ctVar);
        return Y1f8riQaR6yg == su.rtx2ld2ELZv4 ? Y1f8riQaR6yg : no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.e12
    public final float e9gEMXR7LXtO(float f) {
        return this.RAsUl2FVSrh6.e9gEMXR7LXtO(f);
    }

    @Override // defpackage.e12
    public final boolean lS5Rgt96tfkO() {
        return this.RAsUl2FVSrh6.lS5Rgt96tfkO();
    }
}
