package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class sa0 implements View.OnApplyWindowInsetsListener {
    public final vd a;
    public rb0 b;

    public sa0(View view, vd vdVar) {
        rb0 rb0Var;
        this.a = vdVar;
        WeakHashMap weakHashMap = x80.a;
        rb0 a = q80.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            rb0Var = (i >= 36 ? new eb0(a) : i >= 35 ? new db0(a) : i >= 34 ? new cb0(a) : i >= 31 ? new bb0(a) : i >= 30 ? new ab0(a) : i >= 29 ? new za0(a) : new ya0(a)).b();
        } else {
            rb0Var = null;
        }
        this.b = rb0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = rb0.g(view, windowInsets);
            return ta0.j(view, windowInsets);
        }
        rb0 g = rb0.g(view, windowInsets);
        ob0 ob0Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = x80.a;
            this.b = q80.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return ta0.j(view, windowInsets);
        }
        vd k = ta0.k(view);
        if (k != null && Objects.equals((rb0) k.a, g)) {
            return ta0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        rb0 rb0Var = this.b;
        int i = 1;
        while (i <= 512) {
            to h = ob0Var.h(i);
            to h2 = rb0Var.a.h(i);
            int i2 = h.a;
            int i3 = h.d;
            int i4 = h.c;
            int i5 = h.b;
            int i6 = h2.a;
            int i7 = h2.d;
            int i8 = h2.c;
            int i9 = h2.b;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = g;
            return ta0.j(view, windowInsets);
        }
        rb0 rb0Var2 = this.b;
        xa0 xa0Var = new xa0(i12, (i10 & 8) != 0 ? ta0.e : (i11 & 8) != 0 ? ta0.f : (i10 & 519) != 0 ? ta0.g : (i11 & 519) != 0 ? ta0.h : null, (i12 & 8) != 0 ? 160L : 250L);
        xa0Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(xa0Var.a.b());
        to h3 = ob0Var.h(i12);
        to h4 = rb0Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        q4 q4Var = new q4(to.c(min, min2, min3, Math.min(i17, i18)), to.c(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), 29);
        ta0.g(view, xa0Var, g, false);
        duration.addUpdateListener(new ra0(xa0Var, g, rb0Var2, i12, view));
        duration.addListener(new cn(xa0Var, view, 3));
        iw.a(view, new o9(view, xa0Var, q4Var, duration));
        this.b = g;
        return ta0.j(view, windowInsets);
    }
}
