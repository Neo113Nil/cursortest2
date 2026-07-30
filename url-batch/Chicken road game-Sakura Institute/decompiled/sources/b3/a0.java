package b3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final q.a0 f1306a;

    /* renamed from: b, reason: collision with root package name */
    public t0 f1307b;

    public a0(View view, q.a0 a0Var) {
        t0 t0Var;
        this.f1306a = a0Var;
        int i7 = s.f1365a;
        t0 a3 = m.a(view);
        if (a3 != null) {
            int i8 = Build.VERSION.SDK_INT;
            t0Var = (i8 >= 30 ? new j0(a3) : i8 >= 29 ? new i0(a3) : new h0(a3)).b();
        } else {
            t0Var = null;
        }
        this.f1307b = t0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f1307b = t0.b(view, windowInsets);
            return b0.h(view, windowInsets);
        }
        t0 b9 = t0.b(view, windowInsets);
        q0 q0Var = b9.f1367a;
        if (this.f1307b == null) {
            int i7 = s.f1365a;
            this.f1307b = m.a(view);
        }
        if (this.f1307b == null) {
            this.f1307b = b9;
            return b0.h(view, windowInsets);
        }
        q.a0 i8 = b0.i(view);
        if (i8 != null && Objects.equals(i8.f7247f, windowInsets)) {
            return b0.h(view, windowInsets);
        }
        t0 t0Var = this.f1307b;
        int i9 = 0;
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if (!q0Var.f(i10).equals(t0Var.f1367a.f(i10))) {
                i9 |= i10;
            }
        }
        if (i9 == 0) {
            return b0.h(view, windowInsets);
        }
        t0 t0Var2 = this.f1307b;
        f0 f0Var = new f0(i9, (i9 & 8) != 0 ? q0Var.f(8).f9105d > t0Var2.f1367a.f(8).f9105d ? b0.f1311d : b0.f1312e : b0.f1313f, 160L);
        f0Var.f1322a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(f0Var.f1322a.a());
        v2.c f9 = q0Var.f(i9);
        v2.c f10 = t0Var2.f1367a.f(i9);
        int min = Math.min(f9.f9102a, f10.f9102a);
        int i11 = f9.f9103b;
        int i12 = f10.f9103b;
        int min2 = Math.min(i11, i12);
        int i13 = f9.f9104c;
        int i14 = f10.f9104c;
        int min3 = Math.min(i13, i14);
        int i15 = f9.f9105d;
        int i16 = i9;
        int i17 = f10.f9105d;
        androidx.room.c cVar = new androidx.room.c(v2.c.b(min, min2, min3, Math.min(i15, i17)), 1, v2.c.b(Math.max(f9.f9102a, f10.f9102a), Math.max(i11, i12), Math.max(i13, i14), Math.max(i15, i17)));
        b0.e(view, windowInsets, false);
        duration.addUpdateListener(new x(f0Var, b9, t0Var2, i16, view));
        duration.addListener(new y(view, f0Var));
        z zVar = new z(view, f0Var, cVar, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        g gVar = new g(view, zVar);
        view.getViewTreeObserver().addOnPreDrawListener(gVar);
        view.addOnAttachStateChangeListener(gVar);
        this.f1307b = b9;
        return b0.h(view, windowInsets);
    }
}
