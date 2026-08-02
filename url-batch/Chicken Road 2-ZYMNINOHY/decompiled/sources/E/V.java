package E;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class V extends U {
    public V(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
    }

    @Override // E.a0
    public e0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f390c.consumeDisplayCutout();
        return e0.a(null, consumeDisplayCutout);
    }

    @Override // E.a0
    public C0004e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f390c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0004e(displayCutout);
    }

    @Override // E.T, E.a0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v = (V) obj;
        return Objects.equals(this.f390c, v.f390c) && Objects.equals(this.f394g, v.f394g) && T.x(this.f395h, v.f395h);
    }

    @Override // E.a0
    public int hashCode() {
        return this.f390c.hashCode();
    }
}
