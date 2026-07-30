package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ht2 extends gt2 {
    public wp0 XL4ISE6Oc65B;

    public ht2(rt2 rt2Var, WindowInsets windowInsets) {
        super(rt2Var, windowInsets);
        this.XL4ISE6Oc65B = null;
    }

    @Override // defpackage.ot2
    public rt2 TSizfFm2Yiuu() {
        return rt2.TSizfFm2Yiuu(this.TSizfFm2Yiuu.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.ot2
    public boolean XL4ISE6Oc65B() {
        return this.TSizfFm2Yiuu.isConsumed();
    }

    @Override // defpackage.ot2
    public void ZbWwgt3aGe7A(wp0 wp0Var) {
        this.XL4ISE6Oc65B = wp0Var;
    }

    @Override // defpackage.ot2
    public final wp0 dgRBjINgWbAK() {
        if (this.XL4ISE6Oc65B == null) {
            WindowInsets windowInsets = this.TSizfFm2Yiuu;
            this.XL4ISE6Oc65B = wp0.TSizfFm2Yiuu(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.XL4ISE6Oc65B;
    }

    @Override // defpackage.ot2
    public rt2 lS5Rgt96tfkO() {
        return rt2.TSizfFm2Yiuu(this.TSizfFm2Yiuu.consumeStableInsets(), null);
    }
}
