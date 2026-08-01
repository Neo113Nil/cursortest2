package o3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b1 extends a1 {
    public b1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override // o3.h1
    public k1 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f7460c.consumeDisplayCutout();
        return k1.c(consumeDisplayCutout, null);
    }

    @Override // o3.z0, o3.h1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Objects.equals(this.f7460c, b1Var.f7460c) && Objects.equals(this.g, b1Var.g) && z0.M(this.f7464h, b1Var.f7464h);
    }

    @Override // o3.h1
    public d h() {
        DisplayCutout displayCutout;
        displayCutout = this.f7460c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new d(displayCutout);
    }

    @Override // o3.h1
    public int hashCode() {
        return this.f7460c.hashCode();
    }

    public b1(k1 k1Var, b1 b1Var) {
        super(k1Var, b1Var);
    }
}
