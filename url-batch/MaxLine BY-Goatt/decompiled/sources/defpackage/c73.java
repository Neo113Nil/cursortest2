package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c73 implements View.OnApplyWindowInsetsListener {
    public final iv a;
    public c83 b;

    public c73(View view, iv ivVar) {
        c83 c83Var;
        this.a = ivVar;
        WeakHashMap weakHashMap = e53.a;
        c83 a = y43.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            c83Var = (i >= 36 ? new p73(a) : i >= 35 ? new o73(a) : i >= 34 ? new n73(a) : i >= 31 ? new m73(a) : i >= 30 ? new l73(a) : i >= 29 ? new k73(a) : new j73(a)).b();
        } else {
            c83Var = null;
        }
        this.b = c83Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = c83.c(view, windowInsets);
            return d73.j(view, windowInsets);
        }
        c83 c = c83.c(view, windowInsets);
        z73 z73Var = c.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = e53.a;
            this.b = y43.a(view);
        }
        if (this.b == null) {
            this.b = c;
            return d73.j(view, windowInsets);
        }
        iv k = d73.k(view);
        if (k != null && Objects.equals((c83) k.n, c)) {
            return d73.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        c83 c83Var = this.b;
        int i = 1;
        while (i <= 512) {
            z21 h = z73Var.h(i);
            z21 h2 = c83Var.a.h(i);
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
            this.b = c;
            return d73.j(view, windowInsets);
        }
        c83 c83Var2 = this.b;
        i73 i73Var = new i73(i12, (i10 & 8) != 0 ? d73.e : (i11 & 8) != 0 ? d73.f : (i10 & 519) != 0 ? d73.g : (i11 & 519) != 0 ? d73.h : null, (i12 & 8) != 0 ? 160L : 250L);
        i73Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i73Var.a.b());
        z21 h3 = z73Var.h(i12);
        z21 h4 = c83Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        tt1 tt1Var = new tt1(16, z21.b(min, min2, min3, Math.min(i17, i18)), z21.b(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        d73.g(view, i73Var, c, false);
        duration.addUpdateListener(new a73(i73Var, c, c83Var2, i12, view));
        duration.addListener(new b73(i73Var, view));
        gv1.a(view, new ys(view, i73Var, tt1Var, duration, 2, false));
        this.b = c;
        return d73.j(view, windowInsets);
    }
}
