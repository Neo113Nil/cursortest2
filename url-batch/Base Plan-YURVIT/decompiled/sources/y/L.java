package y;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class L extends J {
    public L(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
    }

    @Override // y.O
    public Q a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f3118c.consumeDisplayCutout();
        return Q.a(consumeDisplayCutout, null);
    }

    @Override // y.O
    public C0261e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f3118c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0261e(displayCutout);
    }

    @Override // y.I, y.O
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l2 = (L) obj;
        return Objects.equals(this.f3118c, l2.f3118c) && Objects.equals(this.f3122g, l2.f3122g);
    }

    @Override // y.O
    public int hashCode() {
        return this.f3118c.hashCode();
    }
}
