package n0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final a1.b f2782a;

    /* renamed from: b, reason: collision with root package name */
    public q1 f2783b;

    public t0(View view, a1.b bVar) {
        q1 q1Var;
        this.f2782a = bVar;
        WeakHashMap weakHashMap = l0.f2757a;
        q1 a2 = e0.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            q1Var = (i >= 34 ? new e1(a2) : i >= 31 ? new d1(a2) : i >= 30 ? new c1(a2) : i >= 29 ? new b1(a2) : new z0(a2)).b();
        } else {
            q1Var = null;
        }
        this.f2783b = q1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z3;
        if (!view.isLaidOut()) {
            this.f2783b = q1.g(view, windowInsets);
            return u0.j(view, windowInsets);
        }
        q1 g4 = q1.g(view, windowInsets);
        n1 n1Var = g4.f2775a;
        if (this.f2783b == null) {
            WeakHashMap weakHashMap = l0.f2757a;
            this.f2783b = e0.a(view);
        }
        if (this.f2783b == null) {
            this.f2783b = g4;
            return u0.j(view, windowInsets);
        }
        a1.b k4 = u0.k(view);
        if (k4 != null && Objects.equals((q1) k4.f106a, g4)) {
            return u0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        q1 q1Var = this.f2783b;
        int i = 1;
        while (i <= 512) {
            f0.c f2 = n1Var.f(i);
            f0.c f4 = q1Var.f2775a.f(i);
            int i4 = f2.f1266a;
            int i5 = f2.d;
            int i6 = f2.f1268c;
            int i7 = f2.f1267b;
            int i8 = f4.f1266a;
            int i9 = f4.d;
            int i10 = f4.f1268c;
            int i11 = f4.f1267b;
            if (i4 > i8 || i7 > i11 || i6 > i10 || i5 > i9) {
                iArr = iArr2;
                z3 = true;
            } else {
                iArr = iArr2;
                z3 = false;
            }
            if (z3 != (i4 < i8 || i7 < i11 || i6 < i10 || i5 < i9)) {
                if (z3) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i12 = iArr2[0];
        int i13 = iArr3[0];
        int i14 = i12 | i13;
        if (i14 == 0) {
            this.f2783b = g4;
            return u0.j(view, windowInsets);
        }
        q1 q1Var2 = this.f2783b;
        y0 y0Var = new y0(i14, (i12 & 8) != 0 ? u0.f2784e : (i13 & 8) != 0 ? u0.f2785f : (i12 & 519) != 0 ? u0.f2786g : (i13 & 519) != 0 ? u0.f2787h : null, (i14 & 8) != 0 ? 160L : 250L);
        y0Var.f2803a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(y0Var.f2803a.b());
        f0.c f5 = n1Var.f(i14);
        f0.c f6 = q1Var2.f2775a.f(i14);
        int min = Math.min(f5.f1266a, f6.f1266a);
        int i15 = f5.f1267b;
        int i16 = f6.f1267b;
        int min2 = Math.min(i15, i16);
        int i17 = f5.f1268c;
        int i18 = f6.f1268c;
        int min3 = Math.min(i17, i18);
        int i19 = f5.d;
        int i20 = f6.d;
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(f0.c.c(min, min2, min3, Math.min(i19, i20)), f0.c.c(Math.max(f5.f1266a, f6.f1266a), Math.max(i15, i16), Math.max(i17, i18), Math.max(i19, i20)), 13);
        u0.g(view, y0Var, g4, false);
        duration.addUpdateListener(new s0(y0Var, g4, q1Var2, i14, view));
        duration.addListener(new j1.j(view, y0Var));
        p.a(view, new k.e(view, y0Var, qVar, duration));
        this.f2783b = g4;
        return u0.j(view, windowInsets);
    }
}
