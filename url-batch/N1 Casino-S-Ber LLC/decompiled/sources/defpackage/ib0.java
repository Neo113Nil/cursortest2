package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ib0 extends hb0 {
    public ib0(rb0 rb0Var, WindowInsets windowInsets) {
        super(rb0Var, windowInsets);
    }

    @Override // defpackage.ob0
    public rb0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return rb0.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.gb0, defpackage.ob0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        return Objects.equals(this.c, ib0Var.c) && Objects.equals(this.g, ib0Var.g) && gb0.J(this.h, ib0Var.h);
    }

    @Override // defpackage.ob0
    public ag g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ag(displayCutout);
    }

    @Override // defpackage.ob0
    public int hashCode() {
        return this.c.hashCode();
    }
}
