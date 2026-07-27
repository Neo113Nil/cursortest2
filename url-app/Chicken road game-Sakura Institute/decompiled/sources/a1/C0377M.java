package a1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: a1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0377M extends C0376L {
    public C0377M(C0383T c0383t, WindowInsets windowInsets) {
        super(c0383t, windowInsets);
    }

    @Override // a1.C0380P
    public C0383T a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f4858c.consumeDisplayCutout();
        return C0383T.b(null, consumeDisplayCutout);
    }

    @Override // a1.C0380P
    public C0390e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f4858c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0390e(displayCutout);
    }

    @Override // a1.AbstractC0375K, a1.C0380P
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0377M)) {
            return false;
        }
        C0377M c0377m = (C0377M) obj;
        return Objects.equals(this.f4858c, c0377m.f4858c) && Objects.equals(this.f4862g, c0377m.f4862g);
    }

    @Override // a1.C0380P
    public int hashCode() {
        return this.f4858c.hashCode();
    }
}
