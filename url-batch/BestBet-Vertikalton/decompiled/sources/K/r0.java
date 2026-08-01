package K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class r0 extends q0 {
    public r0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
    }

    @Override // K.u0
    public w0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f648c.consumeDisplayCutout();
        return w0.g(null, consumeDisplayCutout);
    }

    @Override // K.u0
    public C0013i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f648c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0013i(displayCutout);
    }

    @Override // K.p0, K.u0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Objects.equals(this.f648c, r0Var.f648c) && Objects.equals(this.f651g, r0Var.f651g);
    }

    @Override // K.u0
    public int hashCode() {
        return this.f648c.hashCode();
    }
}
