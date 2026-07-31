package D;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class S extends Q {
    public S(Y y, WindowInsets windowInsets) {
        super(y, windowInsets);
    }

    @Override // D.W
    public Y a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f259c.consumeDisplayCutout();
        return Y.c(consumeDisplayCutout, null);
    }

    @Override // D.W
    public C0092e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f259c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0092e(displayCutout);
    }

    @Override // D.P, D.W
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s6 = (S) obj;
        return Objects.equals(this.f259c, s6.f259c) && Objects.equals(this.f263g, s6.f263g);
    }

    @Override // D.W
    public int hashCode() {
        return this.f259c.hashCode();
    }
}
