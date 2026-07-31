package q3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class d1 extends c1 {
    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override // q3.i1
    public l1 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f6085c.consumeDisplayCutout();
        return l1.d(null, consumeDisplayCutout);
    }

    @Override // q3.i1
    public j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f6085c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // q3.b1, q3.i1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Objects.equals(this.f6085c, d1Var.f6085c) && Objects.equals(this.f6089g, d1Var.f6089g) && b1.B(this.f6090h, d1Var.f6090h);
    }

    @Override // q3.i1
    public int hashCode() {
        return this.f6085c.hashCode();
    }
}
