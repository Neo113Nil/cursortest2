package n0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final b1.b f2843a;

    /* renamed from: b, reason: collision with root package name */
    public v1 f2844b;

    public w0(View view, b1.b bVar) {
        v1 v1Var;
        this.f2843a = bVar;
        WeakHashMap weakHashMap = p0.f2816a;
        v1 a5 = i0.a(view);
        if (a5 != null) {
            int i = Build.VERSION.SDK_INT;
            v1Var = (i >= 36 ? new i1(a5) : i >= 35 ? new h1(a5) : i >= 34 ? new g1(a5) : i >= 31 ? new f1(a5) : i >= 30 ? new e1(a5) : i >= 29 ? new d1(a5) : new c1(a5)).b();
        } else {
            v1Var = null;
        }
        this.f2844b = v1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z4;
        if (!view.isLaidOut()) {
            this.f2844b = v1.g(view, windowInsets);
            return x0.j(view, windowInsets);
        }
        v1 g3 = v1.g(view, windowInsets);
        s1 s1Var = g3.f2842a;
        if (this.f2844b == null) {
            WeakHashMap weakHashMap = p0.f2816a;
            this.f2844b = i0.a(view);
        }
        if (this.f2844b == null) {
            this.f2844b = g3;
            return x0.j(view, windowInsets);
        }
        b1.b k4 = x0.k(view);
        if (k4 != null && Objects.equals((v1) k4.f825a, g3)) {
            return x0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        v1 v1Var = this.f2844b;
        int i = 1;
        while (i <= 512) {
            f0.c h = s1Var.h(i);
            f0.c h5 = v1Var.f2842a.h(i);
            int i4 = h.f1415a;
            int i5 = h.d;
            int i6 = h.f1417c;
            int i7 = h.f1416b;
            int i8 = h5.f1415a;
            int i9 = h5.d;
            int i10 = h5.f1417c;
            int i11 = h5.f1416b;
            if (i4 > i8 || i7 > i11 || i6 > i10 || i5 > i9) {
                iArr = iArr2;
                z4 = true;
            } else {
                iArr = iArr2;
                z4 = false;
            }
            if (z4 != (i4 < i8 || i7 < i11 || i6 < i10 || i5 < i9)) {
                if (z4) {
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
            this.f2844b = g3;
            return x0.j(view, windowInsets);
        }
        v1 v1Var2 = this.f2844b;
        b1 b1Var = new b1(i14, (i12 & 8) != 0 ? x0.f2848e : (i13 & 8) != 0 ? x0.f2849f : (i12 & 519) != 0 ? x0.f2850g : (i13 & 519) != 0 ? x0.h : null, (i14 & 8) != 0 ? 160L : 250L);
        b1Var.f2759a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(b1Var.f2759a.b());
        f0.c h6 = s1Var.h(i14);
        f0.c h7 = v1Var2.f2842a.h(i14);
        int min = Math.min(h6.f1415a, h7.f1415a);
        int i15 = h6.f1416b;
        int i16 = h7.f1416b;
        int min2 = Math.min(i15, i16);
        int i17 = h6.f1417c;
        int i18 = h7.f1417c;
        int min3 = Math.min(i17, i18);
        int i19 = h6.d;
        int i20 = h7.d;
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(f0.c.c(min, min2, min3, Math.min(i19, i20)), f0.c.c(Math.max(h6.f1415a, h7.f1415a), Math.max(i15, i16), Math.max(i17, i18), Math.max(i19, i20)), 13);
        x0.g(view, b1Var, g3, false);
        duration.addUpdateListener(new v0(b1Var, g3, v1Var2, i14, view));
        duration.addListener(new k1.j(view, b1Var));
        r.a(view, new k.e(view, b1Var, qVar, duration));
        this.f2844b = g3;
        return x0.j(view, windowInsets);
    }
}
