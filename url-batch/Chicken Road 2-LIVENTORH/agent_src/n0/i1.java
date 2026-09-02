package n0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class i1 extends h1 {
    public i1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
    }

    @Override // n0.n1
    public q1 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f2739c.consumeDisplayCutout();
        return q1.g(null, consumeDisplayCutout);
    }

    @Override // n0.n1
    public h e() {
        DisplayCutout displayCutout;
        displayCutout = this.f2739c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override // n0.g1, n0.n1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Objects.equals(this.f2739c, i1Var.f2739c) && Objects.equals(this.f2742g, i1Var.f2742g) && g1.z(this.f2743h, i1Var.f2743h);
    }

    @Override // n0.n1
    public int hashCode() {
        return this.f2739c.hashCode();
    }
}
