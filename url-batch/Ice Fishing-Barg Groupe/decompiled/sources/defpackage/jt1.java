package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jt1 implements r9 {
    public static final it1 Companion = new it1();
    public final Object wdg6QnbFHrFF;
    public final b81 rtx2ld2ELZv4 = new b81();
    public final p81 OPXfSBeufaJ8 = new p81();

    public jt1(Object obj) {
        this.wdg6QnbFHrFF = obj;
    }

    @Override // defpackage.r9
    public final Object OPXfSBeufaJ8() {
        return this.wdg6QnbFHrFF;
    }

    public final void PxuCJdSBwIXG(m9 m9Var, ju1 ju1Var) {
        Exception exc;
        b81 b81Var = this.rtx2ld2ELZv4;
        int i = b81Var.lS5Rgt96tfkO;
        p81 p81Var = new p81();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            p81 p81Var2 = this.OPXfSBeufaJ8;
            if (i2 >= i) {
                if (i3 != p81Var2.lS5Rgt96tfkO) {
                    mp.PxuCJdSBwIXG("Applier operation size mismatch");
                }
                p81Var2.Y1f8riQaR6yg();
                b81Var.lS5Rgt96tfkO = 0;
                m9Var.RAsUl2FVSrh6();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (b81Var.lS5Rgt96tfkO(i2)) {
                        case 0:
                            m9Var.RfyTYNmI9Srp();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            m9Var.Y1f8riQaR6yg(p81Var2.a92UlCVFR9N8(i3));
                            i3 = i5;
                            i2 = i4;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            m9Var.wdg6QnbFHrFF(b81Var.lS5Rgt96tfkO(i4), b81Var.lS5Rgt96tfkO(i6));
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    m9Var.rtx2ld2ELZv4(b81Var.lS5Rgt96tfkO(i4), b81Var.lS5Rgt96tfkO(i7), b81Var.lS5Rgt96tfkO(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                    break;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                                break;
                            }
                        case 4:
                            m9Var.lS5Rgt96tfkO();
                            i2 = i4;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            m9Var.TSizfFm2Yiuu(b81Var.lS5Rgt96tfkO(i4), p81Var2.a92UlCVFR9N8(i3));
                            i3 = i9;
                        case 6:
                            i2 += 2;
                            try {
                                b81Var.lS5Rgt96tfkO(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case 7:
                            int i11 = i3 + 1;
                            Object a92UlCVFR9N8 = p81Var2.a92UlCVFR9N8(i3);
                            a92UlCVFR9N8.getClass();
                            mm2.S9EYkSpbGuxq(2, a92UlCVFR9N8);
                            i3 += 2;
                            m9Var.cpQdD2nAriOS((pe0) a92UlCVFR9N8, p81Var2.a92UlCVFR9N8(i11));
                            i2 = i4;
                        case 8:
                            Object obj = m9Var.dgRBjINgWbAK;
                            if (obj instanceof io) {
                                io ioVar = (io) obj;
                                if (ju1Var.a92UlCVFR9N8.wdg6QnbFHrFF(ioVar)) {
                                    ioVar.lS5Rgt96tfkO();
                                }
                            }
                            p81Var.PxuCJdSBwIXG(obj);
                            m9Var.e9gEMXR7LXtO();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (Throwable th) {
                    m9Var.RAsUl2FVSrh6();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new ko(p81Var2, p81Var, b81Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.r9
    public final void RfyTYNmI9Srp() {
        this.rtx2ld2ELZv4.PxuCJdSBwIXG(0);
    }

    @Override // defpackage.r9
    public final void TSizfFm2Yiuu(int i, Object obj) {
        b81 b81Var = this.rtx2ld2ELZv4;
        b81Var.PxuCJdSBwIXG(5);
        b81Var.PxuCJdSBwIXG(i);
        this.OPXfSBeufaJ8.PxuCJdSBwIXG(obj);
    }

    @Override // defpackage.r9
    public final void Y1f8riQaR6yg(Object obj) {
        this.rtx2ld2ELZv4.PxuCJdSBwIXG(1);
        this.OPXfSBeufaJ8.PxuCJdSBwIXG(obj);
    }

    @Override // defpackage.r9
    public final void a92UlCVFR9N8(int i, Object obj) {
        b81 b81Var = this.rtx2ld2ELZv4;
        b81Var.PxuCJdSBwIXG(6);
        b81Var.PxuCJdSBwIXG(i);
        this.OPXfSBeufaJ8.PxuCJdSBwIXG(obj);
    }

    @Override // defpackage.r9
    public final void cpQdD2nAriOS(pe0 pe0Var, Object obj) {
        this.rtx2ld2ELZv4.PxuCJdSBwIXG(7);
        p81 p81Var = this.OPXfSBeufaJ8;
        p81Var.PxuCJdSBwIXG(pe0Var);
        p81Var.PxuCJdSBwIXG(obj);
    }

    @Override // defpackage.r9
    public final void e9gEMXR7LXtO() {
        this.rtx2ld2ELZv4.PxuCJdSBwIXG(8);
    }

    @Override // defpackage.r9
    public final void rtx2ld2ELZv4(int i, int i2, int i3) {
        b81 b81Var = this.rtx2ld2ELZv4;
        b81Var.PxuCJdSBwIXG(3);
        b81Var.PxuCJdSBwIXG(i);
        b81Var.PxuCJdSBwIXG(i2);
        b81Var.PxuCJdSBwIXG(i3);
    }

    @Override // defpackage.r9
    public final void wdg6QnbFHrFF(int i, int i2) {
        b81 b81Var = this.rtx2ld2ELZv4;
        b81Var.PxuCJdSBwIXG(2);
        b81Var.PxuCJdSBwIXG(i);
        b81Var.PxuCJdSBwIXG(i2);
    }
}
