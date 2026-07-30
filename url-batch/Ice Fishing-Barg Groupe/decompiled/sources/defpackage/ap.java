package defpackage;

import com.ice.fishing.grenza.MainActivity;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ap extends RfyTYNmI9Srp {
    public static final zo Companion = new zo();
    public final mj1 BRwzKIf41E4i;
    public boolean XL4ISE6Oc65B;

    public ap(MainActivity mainActivity) {
        super(mainActivity);
        this.BRwzKIf41E4i = sj0.tmVwIGCQF4zR(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ap.class.getName();
    }

    @Override // defpackage.RfyTYNmI9Srp
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.XL4ISE6Oc65B;
    }

    @Override // defpackage.RfyTYNmI9Srp
    public final void lS5Rgt96tfkO(int i, hp hpVar) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(420213850);
        int i2 = (tf0Var.rtx2ld2ELZv4(this) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            pe0 pe0Var = (pe0) this.BRwzKIf41E4i.getValue();
            if (pe0Var == null) {
                tf0Var.IXK6ba3ucyzm(-1238823553);
            } else {
                tf0Var.IXK6ba3ucyzm(98585282);
                pe0Var.rtx2ld2ELZv4(tf0Var, 0);
            }
            tf0Var.gPXPFXrUH4XX(false);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new XL4ISE6Oc65B(this, i, 3);
        }
    }

    public final void setContent(pe0 pe0Var) {
        this.XL4ISE6Oc65B = true;
        this.BRwzKIf41E4i.setValue(pe0Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            e9gEMXR7LXtO();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
