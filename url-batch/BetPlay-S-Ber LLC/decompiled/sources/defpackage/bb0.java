package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bb0 implements View.OnApplyWindowInsetsListener {
    public final za0 a;
    public ac0 b;

    public bb0(View view, za0 za0Var) {
        ac0 ac0Var;
        this.a = za0Var;
        WeakHashMap weakHashMap = e90.a;
        ac0 a = x80.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            ac0Var = (i >= 36 ? new nb0(a) : i >= 35 ? new mb0(a) : i >= 34 ? new lb0(a) : i >= 31 ? new kb0(a) : i >= 30 ? new jb0(a) : i >= 29 ? new ib0(a) : new hb0(a)).b();
        } else {
            ac0Var = null;
        }
        this.b = ac0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = ac0.g(view, windowInsets);
            return cb0.j(view, windowInsets);
        }
        ac0 g = ac0.g(view, windowInsets);
        xb0 xb0Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = e90.a;
            this.b = x80.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return cb0.j(view, windowInsets);
        }
        za0 k = cb0.k(view);
        if (k != null && Objects.equals(k.mDispachedInsets, g)) {
            return cb0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        ac0 ac0Var = this.b;
        int i = 1;
        while (i <= 512) {
            ip h = xb0Var.h(i);
            ip h2 = ac0Var.a.h(i);
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
            return cb0.j(view, windowInsets);
        }
        ac0 ac0Var2 = this.b;
        gb0 gb0Var = new gb0(i12, (i10 & 8) != 0 ? cb0.e : (i11 & 8) != 0 ? cb0.f : (i10 & 519) != 0 ? cb0.g : (i11 & 519) != 0 ? cb0.h : null, (i12 & 8) != 0 ? 160L : 250L);
        gb0Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(gb0Var.a.b());
        ip h3 = xb0Var.h(i12);
        ip h4 = ac0Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        ya0 ya0Var = new ya0(ip.c(min, min2, min3, Math.min(i17, i18)), ip.c(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        cb0.g(view, gb0Var, g, false);
        duration.addUpdateListener(new ab0(gb0Var, g, ac0Var2, i12, view));
        duration.addListener(new rn(gb0Var, view, 3));
        uw.a(view, new j9(view, gb0Var, ya0Var, duration));
        this.b = g;
        return cb0.j(view, windowInsets);
    }
}
