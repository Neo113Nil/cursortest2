package l;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class k extends j {
    public k(q qVar, WindowInsets windowInsets) {
        super(qVar, windowInsets);
    }

    @Override // l.o
    public q a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f965c.consumeDisplayCutout();
        return q.a(null, consumeDisplayCutout);
    }

    @Override // l.o
    public b e() {
        DisplayCutout displayCutout;
        displayCutout = this.f965c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new b(displayCutout);
    }

    @Override // l.i, l.o
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f965c, kVar.f965c) && Objects.equals(this.f969g, kVar.f969g);
    }

    @Override // l.o
    public int hashCode() {
        return this.f965c.hashCode();
    }
}
