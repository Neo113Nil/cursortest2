package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class bp1 extends ap1 {
    public bp1(ip1 ip1Var, WindowInsets windowInsets) {
        super(ip1Var, windowInsets);
    }

    @Override // defpackage.fp1
    public ip1 a() {
        return ip1.c(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.zo1, defpackage.fp1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp1)) {
            return false;
        }
        bp1 bp1Var = (bp1) obj;
        return Objects.equals(this.c, bp1Var.c) && Objects.equals(this.g, bp1Var.g) && zo1.A(this.h, bp1Var.h);
    }

    @Override // defpackage.fp1
    public ms f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ms(displayCutout);
    }

    @Override // defpackage.fp1
    public int hashCode() {
        return this.c.hashCode();
    }

    public bp1(ip1 ip1Var, bp1 bp1Var) {
        super(ip1Var, bp1Var);
    }
}
