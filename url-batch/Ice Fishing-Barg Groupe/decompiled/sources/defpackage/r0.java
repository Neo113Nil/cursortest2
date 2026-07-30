package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r0 extends nb implements ma0 {
    public final g32 OPXfSBeufaJ8;
    public final d81 QrzZRwfaDlRX;
    public final Rect cpQdD2nAriOS = new Rect();
    public final st1 dgRBjINgWbAK;
    public boolean gPXPFXrUH4XX;
    public final AutofillId r3s1LDPKFs1S;
    public final i2 rtx2ld2ELZv4;
    public final r1 wdg6QnbFHrFF;
    public final String x50lh2ztY7Y5;

    public r0(i2 i2Var, g32 g32Var, r1 r1Var, st1 st1Var, String str) {
        this.rtx2ld2ELZv4 = i2Var;
        this.OPXfSBeufaJ8 = g32Var;
        this.wdg6QnbFHrFF = r1Var;
        this.dgRBjINgWbAK = st1Var;
        this.x50lh2ztY7Y5 = str;
        r1Var.setImportantForAutofill(1);
        HqMwxkFaipxD RfyTYNmI9Srp = ng0.RfyTYNmI9Srp(r1Var);
        AutofillId e9gEMXR7LXtO = RfyTYNmI9Srp != null ? Nlhe969cAGO8.e9gEMXR7LXtO(RfyTYNmI9Srp.PxuCJdSBwIXG) : null;
        if (e9gEMXR7LXtO == null) {
            throw o0.a92UlCVFR9N8("Required value was null.");
        }
        this.r3s1LDPKFs1S = e9gEMXR7LXtO;
        this.QrzZRwfaDlRX = new d81();
    }

    @Override // defpackage.ma0
    public final void TSizfFm2Yiuu(ab0 ab0Var, ab0 ab0Var2) {
        vw0 zf8DYfih6EZu;
        z22 S2OOm9zPNm0h;
        vw0 zf8DYfih6EZu2;
        z22 S2OOm9zPNm0h2;
        if (ab0Var != null && (zf8DYfih6EZu2 = zv.zf8DYfih6EZu(ab0Var)) != null && (S2OOm9zPNm0h2 = zf8DYfih6EZu2.S2OOm9zPNm0h()) != null) {
            v81 v81Var = S2OOm9zPNm0h2.rtx2ld2ELZv4;
            if (v81Var.lS5Rgt96tfkO(y22.RAsUl2FVSrh6) || v81Var.lS5Rgt96tfkO(y22.rtx2ld2ELZv4)) {
                ((AutofillManager) this.rtx2ld2ELZv4.OPXfSBeufaJ8).notifyViewExited(this.wdg6QnbFHrFF, zf8DYfih6EZu2.OPXfSBeufaJ8);
            }
        }
        if (ab0Var2 == null || (zf8DYfih6EZu = zv.zf8DYfih6EZu(ab0Var2)) == null || (S2OOm9zPNm0h = zf8DYfih6EZu.S2OOm9zPNm0h()) == null) {
            return;
        }
        v81 v81Var2 = S2OOm9zPNm0h.rtx2ld2ELZv4;
        if (v81Var2.lS5Rgt96tfkO(y22.RAsUl2FVSrh6) || v81Var2.lS5Rgt96tfkO(y22.rtx2ld2ELZv4)) {
            int i = zf8DYfih6EZu.OPXfSBeufaJ8;
            this.dgRBjINgWbAK.lS5Rgt96tfkO.RAsUl2FVSrh6(i, new p0(this, i));
        }
    }
}
