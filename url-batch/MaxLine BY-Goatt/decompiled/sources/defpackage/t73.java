package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class t73 extends s73 {
    public t73(c83 c83Var, WindowInsets windowInsets) {
        super(c83Var, windowInsets);
    }

    @Override // defpackage.z73
    public c83 a() {
        return c83.c(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.r73, defpackage.z73
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t73)) {
            return false;
        }
        t73 t73Var = (t73) obj;
        return Objects.equals(this.c, t73Var.c) && Objects.equals(this.g, t73Var.g) && r73.L(this.h, t73Var.h);
    }

    @Override // defpackage.z73
    public wb0 g() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new wb0(displayCutout);
    }

    @Override // defpackage.z73
    public int hashCode() {
        return this.c.hashCode();
    }
}
