package a1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class L extends K {
    public L(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
    }

    @Override // a1.O
    public Q a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f3530c.consumeDisplayCutout();
        return Q.b(null, consumeDisplayCutout);
    }

    @Override // a1.O
    public C0167e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f3530c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0167e(displayCutout);
    }

    @Override // a1.J, a1.O
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l3 = (L) obj;
        return Objects.equals(this.f3530c, l3.f3530c) && Objects.equals(this.f3534g, l3.f3534g);
    }

    @Override // a1.O
    public int hashCode() {
        return this.f3530c.hashCode();
    }
}
