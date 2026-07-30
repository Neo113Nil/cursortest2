package b3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class n0 extends m0 {
    public n0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    @Override // b3.q0
    public t0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f1349c.consumeDisplayCutout();
        return t0.b(null, consumeDisplayCutout);
    }

    @Override // b3.q0
    public e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f1349c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new e(displayCutout);
    }

    @Override // b3.l0, b3.q0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Objects.equals(this.f1349c, n0Var.f1349c) && Objects.equals(this.f1353g, n0Var.f1353g);
    }

    @Override // b3.q0
    public int hashCode() {
        return this.f1349c.hashCode();
    }
}
