package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class uo0 extends to0 {
    public uo0(dp0 dp0Var, WindowInsets windowInsets) {
        super(dp0Var, windowInsets);
    }

    @Override // defpackage.ap0
    public dp0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return dp0.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.so0, defpackage.ap0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo0)) {
            return false;
        }
        uo0 uo0Var = (uo0) obj;
        return Objects.equals(this.c, uo0Var.c) && Objects.equals(this.g, uo0Var.g) && so0.J(this.h, uo0Var.h);
    }

    @Override // defpackage.ap0
    public jk g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new jk(displayCutout);
    }

    @Override // defpackage.ap0
    public int hashCode() {
        return this.c.hashCode();
    }
}
