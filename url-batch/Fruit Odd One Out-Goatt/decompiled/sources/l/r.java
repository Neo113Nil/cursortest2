package l;

import android.os.Build;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final p f759a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = o.f756q;
        } else {
            int i3 = p.f757b;
        }
    }

    public r(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f759a = new o(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f759a = new n(this, windowInsets);
        } else if (i2 >= 28) {
            this.f759a = new l(this, windowInsets);
        } else {
            this.f759a = new k(this, windowInsets);
        }
    }

    public static r a(WindowInsets windowInsets) {
        windowInsets.getClass();
        return new r(windowInsets);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return Objects.equals(this.f759a, ((r) obj).f759a);
        }
        return false;
    }

    public final int hashCode() {
        p pVar = this.f759a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public r() {
        this.f759a = new p(this);
    }
}
