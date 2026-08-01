package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class eo0 implements View.OnApplyWindowInsetsListener {
    public final co0 a;
    public dp0 b;

    public eo0(View view, co0 co0Var) {
        dp0 dp0Var;
        this.a = co0Var;
        WeakHashMap weakHashMap = hm0.a;
        dp0 a = am0.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            dp0Var = (i >= 36 ? new qo0(a) : i >= 35 ? new po0(a) : i >= 34 ? new oo0(a) : i >= 31 ? new no0(a) : i >= 30 ? new mo0(a) : i >= 29 ? new lo0(a) : new ko0(a)).b();
        } else {
            dp0Var = null;
        }
        this.b = dp0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = dp0.g(view, windowInsets);
            return fo0.j(view, windowInsets);
        }
        dp0 g = dp0.g(view, windowInsets);
        ap0 ap0Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = hm0.a;
            this.b = am0.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return fo0.j(view, windowInsets);
        }
        co0 k = fo0.k(view);
        if (k != null && Objects.equals(k.a, g)) {
            return fo0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        dp0 dp0Var = this.b;
        int i = 1;
        while (i <= 512) {
            fv h = ap0Var.h(i);
            fv h2 = dp0Var.a.h(i);
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
            return fo0.j(view, windowInsets);
        }
        dp0 dp0Var2 = this.b;
        jo0 jo0Var = new jo0(i12, (i10 & 8) != 0 ? fo0.e : (i11 & 8) != 0 ? fo0.f : (i10 & 519) != 0 ? fo0.g : (i11 & 519) != 0 ? fo0.h : null, (i12 & 8) != 0 ? 160L : 250L);
        jo0Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(jo0Var.a.b());
        fv h3 = ap0Var.h(i12);
        fv h4 = dp0Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        int i19 = 3;
        tl0 tl0Var = new tl0(fv.c(min, min2, min3, Math.min(i17, i18)), fv.c(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), i19);
        fo0.g(view, jo0Var, g, false);
        duration.addUpdateListener(new do0(jo0Var, g, dp0Var2, i12, view));
        duration.addListener(new ft(jo0Var, view, i19));
        c50.a(view, new ua(view, jo0Var, tl0Var, duration));
        this.b = g;
        return fo0.j(view, windowInsets);
    }
}
