package I;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class k0 extends j0 {
    public k0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    @Override // I.r0
    public v0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f1202c.consumeDisplayCutout();
        return v0.c(consumeDisplayCutout, null);
    }

    @Override // I.i0, I.r0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Objects.equals(this.f1202c, k0Var.f1202c) && Objects.equals(this.f1206g, k0Var.f1206g) && i0.L(this.f1207h, k0Var.f1207h);
    }

    @Override // I.r0
    public C0112h g() {
        DisplayCutout displayCutout;
        displayCutout = this.f1202c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0112h(displayCutout);
    }

    @Override // I.r0
    public int hashCode() {
        return this.f1202c.hashCode();
    }
}
