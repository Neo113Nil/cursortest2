package E;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class W extends V {
    public W(b0 b0Var, WindowInsets windowInsets) {
        super(b0Var, windowInsets);
    }

    @Override // E.Z
    public b0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f585c.consumeDisplayCutout();
        return b0.a(consumeDisplayCutout, null);
    }

    @Override // E.Z
    public C0031f e() {
        DisplayCutout displayCutout;
        displayCutout = this.f585c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0031f(displayCutout);
    }

    @Override // E.U, E.Z
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w3 = (W) obj;
        return Objects.equals(this.f585c, w3.f585c) && Objects.equals(this.f589g, w3.f589g);
    }

    @Override // E.Z
    public int hashCode() {
        return this.f585c.hashCode();
    }
}
