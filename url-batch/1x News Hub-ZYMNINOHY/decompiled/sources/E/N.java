package E;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class N extends M {
    public N(W w3, WindowInsets windowInsets) {
        super(w3, windowInsets);
    }

    @Override // E.T
    public W a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f258c.consumeDisplayCutout();
        return W.b(consumeDisplayCutout, null);
    }

    @Override // E.T
    public C0004e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f258c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0004e(displayCutout);
    }

    @Override // E.L, E.T
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return Objects.equals(this.f258c, n3.f258c) && Objects.equals(this.f261g, n3.f261g) && L.z(this.f262h, n3.f262h);
    }

    @Override // E.T
    public int hashCode() {
        return this.f258c.hashCode();
    }
}
