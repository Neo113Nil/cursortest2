package k0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f2770a;

    /* renamed from: b, reason: collision with root package name */
    public m1 f2771b;

    public q0(View view, o0 o0Var) {
        m1 m1Var;
        this.f2770a = o0Var;
        WeakHashMap weakHashMap = j0.f2752a;
        m1 a4 = c0.a(view);
        if (a4 != null) {
            int i4 = Build.VERSION.SDK_INT;
            m1Var = (i4 >= 34 ? new a1(a4) : i4 >= 30 ? new z0(a4) : i4 >= 29 ? new y0(a4) : new x0(a4)).b();
        } else {
            m1Var = null;
        }
        this.f2771b = m1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z3;
        if (!view.isLaidOut()) {
            this.f2771b = m1.g(view, windowInsets);
            return r0.j(view, windowInsets);
        }
        m1 g = m1.g(view, windowInsets);
        i1 i1Var = g.f2760a;
        if (this.f2771b == null) {
            WeakHashMap weakHashMap = j0.f2752a;
            this.f2771b = c0.a(view);
        }
        if (this.f2771b == null) {
            this.f2771b = g;
            return r0.j(view, windowInsets);
        }
        o0 k4 = r0.k(view);
        if (k4 != null && Objects.equals((m1) k4.f2763a, g)) {
            return r0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        m1 m1Var = this.f2771b;
        int i4 = 1;
        while (i4 <= 512) {
            c0.c f4 = i1Var.f(i4);
            c0.c f5 = m1Var.f2760a.f(i4);
            int i5 = f4.f978a;
            int i6 = f4.f980d;
            int i7 = f4.c;
            int i8 = f4.f979b;
            int i9 = f5.f978a;
            int i10 = f5.f980d;
            int i11 = f5.c;
            int i12 = f5.f979b;
            if (i5 > i9 || i8 > i12 || i7 > i11 || i6 > i10) {
                iArr = iArr2;
                z3 = true;
            } else {
                iArr = iArr2;
                z3 = false;
            }
            if (z3 != (i5 < i9 || i8 < i12 || i7 < i11 || i6 < i10)) {
                if (z3) {
                    iArr[0] = iArr[0] | i4;
                } else {
                    iArr3[0] = iArr3[0] | i4;
                }
            }
            i4 <<= 1;
            iArr2 = iArr;
        }
        int i13 = iArr2[0];
        int i14 = iArr3[0];
        int i15 = i13 | i14;
        if (i15 == 0) {
            this.f2771b = g;
            return r0.j(view, windowInsets);
        }
        m1 m1Var2 = this.f2771b;
        w0 w0Var = new w0(i15, (i13 & 8) != 0 ? r0.f2773e : (i14 & 8) != 0 ? r0.f2774f : (i13 & 519) != 0 ? r0.g : (i14 & 519) != 0 ? r0.h : null, (i15 & 8) != 0 ? 160L : 250L);
        w0Var.f2788a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.f2788a.b());
        c0.c f6 = i1Var.f(i15);
        c0.c f7 = m1Var2.f2760a.f(i15);
        int min = Math.min(f6.f978a, f7.f978a);
        int i16 = f6.f979b;
        int i17 = f7.f979b;
        int min2 = Math.min(i16, i17);
        int i18 = f6.c;
        int i19 = f7.c;
        int min3 = Math.min(i18, i19);
        int i20 = f6.f980d;
        int i21 = f7.f980d;
        a2.s sVar = new a2.s(c0.c.c(min, min2, min3, Math.min(i20, i21)), c0.c.c(Math.max(f6.f978a, f7.f978a), Math.max(i16, i17), Math.max(i18, i19), Math.max(i20, i21)), 15);
        r0.g(view, w0Var, g, false);
        duration.addUpdateListener(new p0(w0Var, g, m1Var2, i15, view));
        duration.addListener(new f1.j(view, w0Var));
        o.a(view, new j.e(view, w0Var, sVar, duration));
        this.f2771b = g;
        return r0.j(view, windowInsets);
    }
}
