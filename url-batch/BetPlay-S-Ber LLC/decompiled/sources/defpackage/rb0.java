package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class rb0 extends qb0 {
    public rb0(ac0 ac0Var, WindowInsets windowInsets) {
        super(ac0Var, windowInsets);
    }

    @Override // defpackage.xb0
    public ac0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return ac0.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.pb0, defpackage.xb0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        return Objects.equals(this.c, rb0Var.c) && Objects.equals(this.g, rb0Var.g) && pb0.J(this.h, rb0Var.h);
    }

    @Override // defpackage.xb0
    public sf g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new sf(displayCutout);
    }

    @Override // defpackage.xb0
    public int hashCode() {
        return this.c.hashCode();
    }
}
