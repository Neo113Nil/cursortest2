package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yp0 extends ns2 implements Runnable, lf1, View.OnAttachStateChangeListener {
    public rt2 cpQdD2nAriOS;
    public boolean dgRBjINgWbAK;
    public final xt2 wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public yp0(xt2 xt2Var) {
        super(!xt2Var.RfyTYNmI9Srp ? 1 : 0);
        this.wdg6QnbFHrFF = xt2Var;
    }

    @Override // defpackage.lf1
    public final rt2 PxuCJdSBwIXG(View view, rt2 rt2Var) {
        this.cpQdD2nAriOS = rt2Var;
        xt2 xt2Var = this.wdg6QnbFHrFF;
        kp2 kp2Var = xt2Var.BRwzKIf41E4i;
        ot2 ot2Var = rt2Var.PxuCJdSBwIXG;
        kp2Var.a92UlCVFR9N8(ni0.wLFCmsViZrNT(ot2Var.rtx2ld2ELZv4(8)));
        if (this.dgRBjINgWbAK) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.x50lh2ztY7Y5) {
            xt2Var.XL4ISE6Oc65B.a92UlCVFR9N8(ni0.wLFCmsViZrNT(ot2Var.rtx2ld2ELZv4(8)));
            xt2.PxuCJdSBwIXG(xt2Var, rt2Var);
        }
        return xt2Var.RfyTYNmI9Srp ? rt2.lS5Rgt96tfkO : rt2Var;
    }

    @Override // defpackage.ns2
    public final void TSizfFm2Yiuu(xs2 xs2Var) {
        this.dgRBjINgWbAK = true;
        this.x50lh2ztY7Y5 = true;
    }

    @Override // defpackage.ns2
    public final rt2 Y1f8riQaR6yg(rt2 rt2Var, List list) {
        xt2 xt2Var = this.wdg6QnbFHrFF;
        xt2.PxuCJdSBwIXG(xt2Var, rt2Var);
        return xt2Var.RfyTYNmI9Srp ? rt2.lS5Rgt96tfkO : rt2Var;
    }

    @Override // defpackage.ns2
    public final cr1 e9gEMXR7LXtO(xs2 xs2Var, cr1 cr1Var) {
        this.dgRBjINgWbAK = false;
        return cr1Var;
    }

    @Override // defpackage.ns2
    public final void lS5Rgt96tfkO(xs2 xs2Var) {
        this.dgRBjINgWbAK = false;
        this.x50lh2ztY7Y5 = false;
        rt2 rt2Var = this.cpQdD2nAriOS;
        if (xs2Var.PxuCJdSBwIXG.lS5Rgt96tfkO() > 0 && rt2Var != null) {
            ot2 ot2Var = rt2Var.PxuCJdSBwIXG;
            xt2 xt2Var = this.wdg6QnbFHrFF;
            xt2Var.XL4ISE6Oc65B.a92UlCVFR9N8(ni0.wLFCmsViZrNT(ot2Var.rtx2ld2ELZv4(8)));
            xt2Var.BRwzKIf41E4i.a92UlCVFR9N8(ni0.wLFCmsViZrNT(ot2Var.rtx2ld2ELZv4(8)));
            xt2.PxuCJdSBwIXG(xt2Var, rt2Var);
        }
        this.cpQdD2nAriOS = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.dgRBjINgWbAK) {
            this.dgRBjINgWbAK = false;
            this.x50lh2ztY7Y5 = false;
            rt2 rt2Var = this.cpQdD2nAriOS;
            if (rt2Var != null) {
                xt2 xt2Var = this.wdg6QnbFHrFF;
                xt2Var.XL4ISE6Oc65B.a92UlCVFR9N8(ni0.wLFCmsViZrNT(rt2Var.PxuCJdSBwIXG.rtx2ld2ELZv4(8)));
                xt2.PxuCJdSBwIXG(xt2Var, rt2Var);
                this.cpQdD2nAriOS = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
