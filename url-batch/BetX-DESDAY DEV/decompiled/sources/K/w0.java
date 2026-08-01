package K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class w0 extends v0 {
    public w0(B0 b02, WindowInsets windowInsets) {
        super(b02, windowInsets);
    }

    @Override // K.z0
    public B0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f506c.consumeDisplayCutout();
        return B0.g(null, consumeDisplayCutout);
    }

    @Override // K.z0
    public C0014j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f506c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0014j(displayCutout);
    }

    @Override // K.u0, K.z0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Objects.equals(this.f506c, w0Var.f506c) && Objects.equals(this.f510g, w0Var.f510g);
    }

    @Override // K.z0
    public int hashCode() {
        return this.f506c.hashCode();
    }
}
