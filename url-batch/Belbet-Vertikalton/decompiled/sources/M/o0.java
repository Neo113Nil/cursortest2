package M;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class o0 extends n0 {
    public o0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    @Override // M.r0
    public t0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f776c.consumeDisplayCutout();
        return t0.g(null, consumeDisplayCutout);
    }

    @Override // M.r0
    public C0013i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f776c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0013i(displayCutout);
    }

    @Override // M.m0, M.r0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Objects.equals(this.f776c, o0Var.f776c) && Objects.equals(this.f779g, o0Var.f779g);
    }

    @Override // M.r0
    public int hashCode() {
        return this.f776c.hashCode();
    }
}
