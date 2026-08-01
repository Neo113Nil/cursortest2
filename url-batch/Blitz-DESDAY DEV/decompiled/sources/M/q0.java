package M;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class q0 extends p0 {
    public q0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    @Override // M.t0
    public v0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f578c.consumeDisplayCutout();
        return v0.g(null, consumeDisplayCutout);
    }

    @Override // M.t0
    public C0009j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f578c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0009j(displayCutout);
    }

    @Override // M.o0, M.t0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Objects.equals(this.f578c, q0Var.f578c) && Objects.equals(this.f581g, q0Var.f581g);
    }

    @Override // M.t0
    public int hashCode() {
        return this.f578c.hashCode();
    }
}
