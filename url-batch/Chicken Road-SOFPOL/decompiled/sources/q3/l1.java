package q3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f6126b;

    /* renamed from: a, reason: collision with root package name */
    public final i1 f6127a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f6126b = h1.f6110s;
        } else if (i >= 30) {
            f6126b = f1.f6100r;
        } else {
            f6126b = i1.f6111b;
        }
    }

    public l1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f6127a = new h1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f6127a = new g1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f6127a = new f1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f6127a = new e1(this, windowInsets);
        } else if (i >= 28) {
            this.f6127a = new d1(this, windowInsets);
        } else {
            this.f6127a = new c1(this, windowInsets);
        }
    }

    public static i3.c b(i3.c cVar, int i, int i8, int i9, int i10) {
        int max = Math.max(0, cVar.f3421a - i);
        int max2 = Math.max(0, cVar.f3422b - i8);
        int max3 = Math.max(0, cVar.f3423c - i9);
        int max4 = Math.max(0, cVar.f3424d - i10);
        return (max == i && max2 == i8 && max3 == i9 && max4 == i10) ? cVar : i3.c.b(max, max2, max3, max4);
    }

    public static l1 d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l1 l1Var = new l1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = k0.f6120a;
            l1 a8 = d0.a(view);
            i1 i1Var = l1Var.f6127a;
            i1Var.r(a8);
            i1Var.d(view.getRootView());
            i1Var.t(view.getWindowSystemUiVisibility());
        }
        return l1Var;
    }

    public final int a() {
        return this.f6127a.k().f3422b;
    }

    public final WindowInsets c() {
        i1 i1Var = this.f6127a;
        if (i1Var instanceof b1) {
            return ((b1) i1Var).f6085c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l1) {
            return Objects.equals(this.f6127a, ((l1) obj).f6127a);
        }
        return false;
    }

    public final int hashCode() {
        i1 i1Var = this.f6127a;
        if (i1Var == null) {
            return 0;
        }
        return i1Var.hashCode();
    }

    public l1() {
        this.f6127a = new i1(this);
    }
}
