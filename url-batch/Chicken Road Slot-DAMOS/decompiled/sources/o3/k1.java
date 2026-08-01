package o3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f7414b;

    /* renamed from: a, reason: collision with root package name */
    public final h1 f7415a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            f7414b = f1.f7393x;
        } else if (i3 >= 30) {
            f7414b = d1.f7386w;
        } else {
            f7414b = h1.f7397b;
        }
    }

    public k1(k1 k1Var) {
        if (k1Var == null) {
            this.f7415a = new h1(this);
            return;
        }
        h1 h1Var = k1Var.f7415a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35 && (h1Var instanceof g1)) {
            this.f7415a = new g1(this, (g1) h1Var);
        } else if (i3 >= 34 && (h1Var instanceof f1)) {
            this.f7415a = new f1(this, (f1) h1Var);
        } else if (i3 >= 31 && (h1Var instanceof e1)) {
            this.f7415a = new e1(this, (e1) h1Var);
        } else if (i3 >= 30 && (h1Var instanceof d1)) {
            this.f7415a = new d1(this, (d1) h1Var);
        } else if (i3 >= 29 && (h1Var instanceof c1)) {
            this.f7415a = new c1(this, (c1) h1Var);
        } else if (i3 >= 28 && (h1Var instanceof b1)) {
            this.f7415a = new b1(this, (b1) h1Var);
        } else if (h1Var instanceof a1) {
            this.f7415a = new a1(this, (a1) h1Var);
        } else if (h1Var instanceof z0) {
            this.f7415a = new z0(this, (z0) h1Var);
        } else {
            this.f7415a = new h1(this);
        }
        h1Var.e(this);
    }

    public static h3.b a(h3.b bVar, int i3, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.f4443a - i3);
        int max2 = Math.max(0, bVar.f4444b - i10);
        int max3 = Math.max(0, bVar.f4445c - i11);
        int max4 = Math.max(0, bVar.f4446d - i12);
        return (max == i3 && max2 == i10 && max3 == i11 && max4 == i12) ? bVar : h3.b.b(max, max2, max3, max4);
    }

    public static k1 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        k1 k1Var = new k1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = c0.f7378a;
            k1 a9 = x.a(view);
            h1 h1Var = k1Var.f7415a;
            h1Var.y(a9);
            View rootView = view.getRootView();
            h1Var.d(rootView);
            h1Var.p(rootView);
            h1Var.q();
            h1Var.A(view.getWindowSystemUiVisibility());
        }
        return k1Var;
    }

    public final WindowInsets b() {
        h1 h1Var = this.f7415a;
        if (h1Var instanceof z0) {
            return ((z0) h1Var).f7460c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            return Objects.equals(this.f7415a, ((k1) obj).f7415a);
        }
        return false;
    }

    public final int hashCode() {
        h1 h1Var = this.f7415a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public k1(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            this.f7415a = new g1(this, windowInsets);
            return;
        }
        if (i3 >= 34) {
            this.f7415a = new f1(this, windowInsets);
            return;
        }
        if (i3 >= 31) {
            this.f7415a = new e1(this, windowInsets);
            return;
        }
        if (i3 >= 30) {
            this.f7415a = new d1(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f7415a = new c1(this, windowInsets);
        } else if (i3 >= 28) {
            this.f7415a = new b1(this, windowInsets);
        } else {
            this.f7415a = new a1(this, windowInsets);
        }
    }
}
