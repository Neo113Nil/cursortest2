package c1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class N extends M {
    public N(U u3, WindowInsets windowInsets) {
        super(u3, windowInsets);
    }

    @Override // c1.Q
    public U a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f5576c.consumeDisplayCutout();
        return U.b(null, consumeDisplayCutout);
    }

    @Override // c1.Q
    public C0381e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f5576c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0381e(displayCutout);
    }

    @Override // c1.L, c1.Q
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return Objects.equals(this.f5576c, n3.f5576c) && Objects.equals(this.f5580g, n3.f5580g);
    }

    @Override // c1.Q
    public int hashCode() {
        return this.f5576c.hashCode();
    }
}
