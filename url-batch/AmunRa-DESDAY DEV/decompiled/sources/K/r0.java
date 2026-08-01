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
        consumeDisplayCutout = this.f431c.consumeDisplayCutout();
        return w0.g(null, consumeDisplayCutout);
    }

    @Override // K.u0
    public C0009j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f431c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0009j(displayCutout);
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
        return Objects.equals(this.f431c, r0Var.f431c) && Objects.equals(this.f434g, r0Var.f434g);
    }

    @Override // K.u0
    public int hashCode() {
        return this.f431c.hashCode();
    }
}
