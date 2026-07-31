package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: b, reason: collision with root package name */
    public static final Y f271b;

    /* renamed from: a, reason: collision with root package name */
    public final W f272a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f271b = V.f268q;
        } else {
            f271b = W.f269b;
        }
    }

    public Y(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f272a = new V(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f272a = new T(this, windowInsets);
        } else if (i7 >= 28) {
            this.f272a = new S(this, windowInsets);
        } else {
            this.f272a = new Q(this, windowInsets);
        }
    }

    public static w.c a(w.c cVar, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, cVar.f6127a - i7);
        int max2 = Math.max(0, cVar.f6128b - i8);
        int max3 = Math.max(0, cVar.f6129c - i9);
        int max4 = Math.max(0, cVar.f6130d - i10);
        return (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) ? cVar : w.c.a(max, max2, max3, max4);
    }

    public static Y c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        Y y = new Y(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = D.f240a;
            Y a7 = AbstractC0109w.a(view);
            W w5 = y.f272a;
            w5.p(a7);
            w5.d(view.getRootView());
        }
        return y;
    }

    public final WindowInsets b() {
        W w5 = this.f272a;
        if (w5 instanceof P) {
            return ((P) w5).f259c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            return Objects.equals(this.f272a, ((Y) obj).f272a);
        }
        return false;
    }

    public final int hashCode() {
        W w5 = this.f272a;
        if (w5 == null) {
            return 0;
        }
        return w5.hashCode();
    }

    public Y() {
        this.f272a = new W(this);
    }
}
