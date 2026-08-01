package k0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class e1 extends d1 {
    public e1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // k0.i1
    public m1 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return m1.g(null, consumeDisplayCutout);
    }

    @Override // k0.i1
    public h e() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override // k0.c1, k0.i1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Objects.equals(this.c, e1Var.c) && Objects.equals(this.g, e1Var.g) && c1.z(this.h, e1Var.h);
    }

    @Override // k0.i1
    public int hashCode() {
        return this.c.hashCode();
    }
}
