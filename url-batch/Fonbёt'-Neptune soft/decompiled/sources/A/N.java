package A;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class N extends M {
    public N(T t2, WindowInsets windowInsets) {
        super(t2, windowInsets);
    }

    @Override // A.S
    public T a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f17c.consumeDisplayCutout();
        return T.a(consumeDisplayCutout, null);
    }

    @Override // A.S
    public C0005f e() {
        DisplayCutout displayCutout;
        displayCutout = this.f17c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0005f(displayCutout);
    }

    @Override // A.L, A.S
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n2 = (N) obj;
        return Objects.equals(this.f17c, n2.f17c) && Objects.equals(this.f19e, n2.f19e);
    }

    @Override // A.S
    public int hashCode() {
        return this.f17c.hashCode();
    }
}
