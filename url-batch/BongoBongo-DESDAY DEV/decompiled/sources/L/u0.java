package L;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class u0 extends t0 {
    public u0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
    }

    @Override // L.x0
    public z0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f570c.consumeDisplayCutout();
        return z0.g(null, consumeDisplayCutout);
    }

    @Override // L.x0
    public C0012j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f570c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0012j(displayCutout);
    }

    @Override // L.s0, L.x0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Objects.equals(this.f570c, u0Var.f570c) && Objects.equals(this.f573g, u0Var.f573g);
    }

    @Override // L.x0
    public int hashCode() {
        return this.f570c.hashCode();
    }
}
