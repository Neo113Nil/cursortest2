package l;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class l extends k {
    public l(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
    }

    @Override // l.p
    public r a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f748c.consumeDisplayCutout();
        return r.a(consumeDisplayCutout);
    }

    @Override // l.p
    public b e() {
        DisplayCutout displayCutout;
        displayCutout = this.f748c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new b(displayCutout);
    }

    @Override // l.j, l.p
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f748c, lVar.f748c) && Objects.equals(this.f752g, lVar.f752g);
    }

    @Override // l.p
    public int hashCode() {
        return this.f748c.hashCode();
    }
}
