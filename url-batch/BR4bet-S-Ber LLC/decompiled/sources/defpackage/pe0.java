package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class pe0 extends oe0 {
    public pe0(ye0 ye0Var, WindowInsets windowInsets) {
        super(ye0Var, windowInsets);
    }

    @Override // defpackage.ve0
    public ye0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return ye0.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.ne0, defpackage.ve0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe0)) {
            return false;
        }
        pe0 pe0Var = (pe0) obj;
        return Objects.equals(this.c, pe0Var.c) && Objects.equals(this.g, pe0Var.g) && ne0.J(this.h, pe0Var.h);
    }

    @Override // defpackage.ve0
    public ai g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ai(displayCutout);
    }

    @Override // defpackage.ve0
    public int hashCode() {
        return this.c.hashCode();
    }
}
