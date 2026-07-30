package defpackage;

import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class xf2 implements le0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ xf2(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = 8;
        int i2 = 9;
        bt btVar = null;
        char c = 1;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ki0.S2OOm9zPNm0h((k30) obj, (th0) this.OPXfSBeufaJ8, ((sf2) this.wdg6QnbFHrFF).PxuCJdSBwIXG());
                return no2.PxuCJdSBwIXG;
            case 1:
                return new gc(7, (d91) this.OPXfSBeufaJ8, (e81) this.wdg6QnbFHrFF);
            case 2:
                ae0 ae0Var = (ae0) this.OPXfSBeufaJ8;
                ae0 ae0Var2 = (ae0) this.wdg6QnbFHrFF;
                df2 df2Var = (df2) obj;
                ae0Var.PxuCJdSBwIXG();
                if (ae0Var2 != null ? ((Boolean) ae0Var2.PxuCJdSBwIXG()).booleanValue() : true) {
                    df2Var.close();
                }
                return no2.PxuCJdSBwIXG;
            case 3:
                fx1.KUoIVIumpKat((ru) this.OPXfSBeufaJ8, null, new rb1((gl2) this.wdg6QnbFHrFF, null), 1);
                return new e5(3);
            case 4:
                gl2 gl2Var = (gl2) this.OPXfSBeufaJ8;
                fl2 fl2Var = (fl2) this.wdg6QnbFHrFF;
                gl2Var.OPXfSBeufaJ8.add(fl2Var);
                return new gc(10, gl2Var, fl2Var);
            case 5:
                x12 x12Var = (x12) this.OPXfSBeufaJ8;
                x12Var.ZbWwgt3aGe7A(new f82(new xf2(i, Thread.currentThread(), (ru) this.wdg6QnbFHrFF)));
                return new x2(i2, x12Var);
            case 6:
                gl2 gl2Var2 = (gl2) this.OPXfSBeufaJ8;
                gl2 gl2Var3 = (gl2) this.wdg6QnbFHrFF;
                gl2Var2.wdg6QnbFHrFF.add(gl2Var3);
                return new gc(i, gl2Var2, gl2Var3);
            case 7:
                return new gc(i2, (gl2) this.OPXfSBeufaJ8, (cl2) this.wdg6QnbFHrFF);
            case 8:
                Object obj2 = this.OPXfSBeufaJ8;
                ru ruVar = (ru) this.wdg6QnbFHrFF;
                ae0 ae0Var3 = (ae0) obj;
                if (obj2 == Thread.currentThread()) {
                    ae0Var3.PxuCJdSBwIXG();
                } else {
                    fx1.KUoIVIumpKat(ruVar, null, new c0(ae0Var3, btVar, c == true ? 1 : 0), 3);
                }
                return no2.PxuCJdSBwIXG;
            case 9:
                cr1 cr1Var = (cr1) this.OPXfSBeufaJ8;
                zm2 zm2Var = (zm2) this.wdg6QnbFHrFF;
                cn2 cn2Var = (cn2) obj;
                synchronized (((ib0) cr1Var.OPXfSBeufaJ8)) {
                    try {
                        boolean TSizfFm2Yiuu = cn2Var.TSizfFm2Yiuu();
                        b41 b41Var = (b41) cr1Var.wdg6QnbFHrFF;
                        if (TSizfFm2Yiuu) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return no2.PxuCJdSBwIXG;
            case 10:
                bp2 bp2Var = (bp2) this.OPXfSBeufaJ8;
                le0 le0Var = (le0) this.wdg6QnbFHrFF;
                ((Long) obj).getClass();
                float f = bp2Var.e9gEMXR7LXtO;
                bp2Var.e9gEMXR7LXtO = 0.0f;
                le0Var.OPXfSBeufaJ8(Float.valueOf(f));
                return no2.PxuCJdSBwIXG;
            default:
                xt2 xt2Var = (xt2) this.OPXfSBeufaJ8;
                View view = (View) this.wdg6QnbFHrFF;
                yp0 yp0Var = xt2Var.S9EYkSpbGuxq;
                if (xt2Var.EcgxDIVH5in8 == 0) {
                    int i3 = rq2.PxuCJdSBwIXG;
                    mq2.lS5Rgt96tfkO(view, yp0Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(yp0Var);
                    rq2.PxuCJdSBwIXG(view, yp0Var);
                }
                xt2Var.EcgxDIVH5in8++;
                return new gc(11, xt2Var, view);
        }
    }
}
