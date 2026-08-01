package n0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class m1 extends l1 {
    public m1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
    }

    @Override // n0.s1
    public v1 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f2797c.consumeDisplayCutout();
        return v1.g(null, consumeDisplayCutout);
    }

    @Override // n0.k1, n0.s1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Objects.equals(this.f2797c, m1Var.f2797c) && Objects.equals(this.f2800g, m1Var.f2800g) && k1.J(this.h, m1Var.h);
    }

    @Override // n0.s1
    public i g() {
        DisplayCutout displayCutout;
        displayCutout = this.f2797c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // n0.s1
    public int hashCode() {
        return this.f2797c.hashCode();
    }
}
