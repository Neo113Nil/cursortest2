package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i3 extends fc implements a10 {
    public final nq0 d;
    public final o81 e;
    public final d4 g;
    public final u11 h;
    public final String i;
    public final AutofillId j;
    public final fn0 k;
    public boolean l;

    public i3(nq0 nq0Var, o81 o81Var, d4 d4Var, u11 u11Var, String str) {
        this.d = nq0Var;
        this.e = o81Var;
        this.g = d4Var;
        this.h = u11Var;
        this.i = str;
        new Rect();
        d4Var.setImportantForAutofill(1);
        AutofillId autofillId = d4Var.getAutofillId();
        if (autofillId == null) {
            throw qy0.g("Required value was null.");
        }
        this.j = autofillId;
        this.k = new fn0();
    }

    @Override // defpackage.a10
    public final void d(o10 o10Var, o10 o10Var2) {
        jd0 I;
        h81 v;
        jd0 I2;
        h81 v2;
        if (o10Var != null && (I2 = op.I(o10Var)) != null && (v2 = I2.v()) != null) {
            vn0 vn0Var = v2.d;
            if (vn0Var.b(g81.g) || vn0Var.b(g81.h)) {
                ((AutofillManager) this.d.e).notifyViewExited(this.g, I2.e);
            }
        }
        if (o10Var2 == null || (I = op.I(o10Var2)) == null || (v = I.v()) == null) {
            return;
        }
        vn0 vn0Var2 = v.d;
        if (vn0Var2.b(g81.g) || vn0Var2.b(g81.h)) {
            int i = I.e;
            this.h.a.g(i, new h3(this, i));
        }
    }
}
