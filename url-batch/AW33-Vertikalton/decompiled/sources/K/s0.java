package K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class s0 extends r0 {
    public s0(x0 x0Var, WindowInsets windowInsets) {
        super(x0Var, windowInsets);
    }

    @Override // K.v0
    public x0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f452c.consumeDisplayCutout();
        return x0.g(null, consumeDisplayCutout);
    }

    @Override // K.v0
    public C0010j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f452c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0010j(displayCutout);
    }

    @Override // K.q0, K.v0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Objects.equals(this.f452c, s0Var.f452c) && Objects.equals(this.f455g, s0Var.f455g);
    }

    @Override // K.v0
    public int hashCode() {
        return this.f452c.hashCode();
    }
}
