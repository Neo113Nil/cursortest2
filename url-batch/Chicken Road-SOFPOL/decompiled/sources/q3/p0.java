package q3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.j f6140a;

    /* renamed from: b, reason: collision with root package name */
    public l1 f6141b;

    public p0(View view, androidx.datastore.preferences.protobuf.j jVar) {
        l1 l1Var;
        this.f6140a = jVar;
        Field field = k0.f6120a;
        l1 a8 = d0.a(view);
        if (a8 != null) {
            int i = Build.VERSION.SDK_INT;
            l1Var = (i >= 34 ? new z0(a8) : i >= 31 ? new y0(a8) : i >= 30 ? new x0(a8) : i >= 29 ? new w0(a8) : new v0(a8)).b();
        } else {
            l1Var = null;
        }
        this.f6141b = l1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z3;
        if (!view.isLaidOut()) {
            this.f6141b = l1.d(view, windowInsets);
            return q0.j(view, windowInsets);
        }
        l1 d8 = l1.d(view, windowInsets);
        i1 i1Var = d8.f6127a;
        if (this.f6141b == null) {
            Field field = k0.f6120a;
            this.f6141b = d0.a(view);
        }
        if (this.f6141b == null) {
            this.f6141b = d8;
            return q0.j(view, windowInsets);
        }
        androidx.datastore.preferences.protobuf.j k3 = q0.k(view);
        if (k3 != null && Objects.equals((l1) k3.f707e, d8)) {
            return q0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        l1 l1Var = this.f6141b;
        int i = 1;
        while (i <= 512) {
            i3.c f6 = i1Var.f(i);
            i3.c f8 = l1Var.f6127a.f(i);
            int i8 = f6.f3421a;
            int i9 = f6.f3424d;
            int i10 = f6.f3423c;
            int i11 = f6.f3422b;
            int i12 = f8.f3421a;
            int i13 = f8.f3424d;
            int i14 = f8.f3423c;
            int i15 = f8.f3422b;
            if (i8 > i12 || i11 > i15 || i10 > i14 || i9 > i13) {
                iArr = iArr2;
                z3 = true;
            } else {
                iArr = iArr2;
                z3 = false;
            }
            if (z3 != (i8 < i12 || i11 < i15 || i10 < i14 || i9 < i13)) {
                if (z3) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i16 = iArr2[0];
        int i17 = iArr3[0];
        int i18 = i16 | i17;
        if (i18 == 0) {
            this.f6141b = d8;
            return q0.j(view, windowInsets);
        }
        l1 l1Var2 = this.f6141b;
        u0 u0Var = new u0(i18, (i16 & 8) != 0 ? q0.f6142e : (i17 & 8) != 0 ? q0.f6143f : (i16 & 519) != 0 ? q0.f6144g : (i17 & 519) != 0 ? q0.f6145h : null, (i18 & 8) != 0 ? 160L : 250L);
        u0Var.f6160a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(u0Var.f6160a.b());
        i3.c f9 = i1Var.f(i18);
        i3.c f10 = l1Var2.f6127a.f(i18);
        int min = Math.min(f9.f3421a, f10.f3421a);
        int i19 = f9.f3422b;
        int i20 = f10.f3422b;
        int min2 = Math.min(i19, i20);
        int i21 = f9.f3423c;
        int i22 = f10.f3423c;
        int min3 = Math.min(i21, i22);
        int i23 = f9.f3424d;
        int i24 = f10.f3424d;
        a0.a0 a0Var = new a0.a0(17, i3.c.b(min, min2, min3, Math.min(i23, i24)), i3.c.b(Math.max(f9.f3421a, f10.f3421a), Math.max(i19, i20), Math.max(i21, i22), Math.max(i23, i24)));
        q0.g(view, u0Var, d8, false);
        duration.addUpdateListener(new o0(u0Var, d8, l1Var2, i18, view));
        duration.addListener(new c5.j(view, u0Var));
        k.d dVar = new k.d(view, u0Var, a0Var, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        r rVar = new r(view, dVar);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        this.f6141b = d8;
        return q0.j(view, windowInsets);
    }
}
