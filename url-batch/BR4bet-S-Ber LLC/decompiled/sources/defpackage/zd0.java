package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zd0 implements View.OnApplyWindowInsetsListener {
    public final nf a;
    public ye0 b;

    public zd0(View view, nf nfVar) {
        ye0 ye0Var;
        this.a = nfVar;
        WeakHashMap weakHashMap = ic0.a;
        ye0 a = bc0.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            ye0Var = (i >= 36 ? new le0(a) : i >= 35 ? new ke0(a) : i >= 34 ? new je0(a) : i >= 31 ? new ie0(a) : i >= 30 ? new he0(a) : i >= 29 ? new ge0(a) : new fe0(a)).b();
        } else {
            ye0Var = null;
        }
        this.b = ye0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = ye0.g(view, windowInsets);
            return ae0.j(view, windowInsets);
        }
        ye0 g = ye0.g(view, windowInsets);
        ve0 ve0Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = ic0.a;
            this.b = bc0.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return ae0.j(view, windowInsets);
        }
        nf k = ae0.k(view);
        if (k != null && Objects.equals((ye0) k.a, g)) {
            return ae0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        ye0 ye0Var = this.b;
        int i = 1;
        while (i <= 512) {
            er h = ve0Var.h(i);
            er h2 = ye0Var.a.h(i);
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
            return ae0.j(view, windowInsets);
        }
        ye0 ye0Var2 = this.b;
        ee0 ee0Var = new ee0(i12, (i10 & 8) != 0 ? ae0.e : (i11 & 8) != 0 ? ae0.f : (i10 & 519) != 0 ? ae0.g : (i11 & 519) != 0 ? ae0.h : null, (i12 & 8) != 0 ? 160L : 250L);
        ee0Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ee0Var.a.b());
        er h3 = ve0Var.h(i12);
        er h4 = ye0Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        a5 a5Var = new a5(er.c(min, min2, min3, Math.min(i17, i18)), er.c(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), 27);
        ae0.g(view, ee0Var, g, false);
        duration.addUpdateListener(new yd0(ee0Var, g, ye0Var2, i12, view));
        duration.addListener(new op(ee0Var, view, 3));
        lz.a(view, new ba(view, ee0Var, a5Var, duration));
        this.b = g;
        return ae0.j(view, windowInsets);
    }
}
