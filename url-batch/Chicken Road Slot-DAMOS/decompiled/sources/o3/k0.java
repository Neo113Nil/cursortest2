package o3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.appsflyer.R;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.i f7412a;

    /* renamed from: b, reason: collision with root package name */
    public k1 f7413b;

    public k0(View view, androidx.datastore.preferences.protobuf.i iVar) {
        k1 k1Var;
        this.f7412a = iVar;
        Field field = c0.f7378a;
        k1 a9 = x.a(view);
        if (a9 != null) {
            int i3 = Build.VERSION.SDK_INT;
            k1Var = (i3 >= 36 ? new x0(a9) : i3 >= 35 ? new w0(a9) : i3 >= 34 ? new v0(a9) : i3 >= 31 ? new u0(a9) : i3 >= 30 ? new t0(a9) : i3 >= 29 ? new s0(a9) : new r0(a9)).b();
        } else {
            k1Var = null;
        }
        this.f7413b = k1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z10;
        if (!view.isLaidOut()) {
            this.f7413b = k1.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        k1 c10 = k1.c(windowInsets, view);
        h1 h1Var = c10.f7415a;
        if (this.f7413b == null) {
            Field field = c0.f7378a;
            this.f7413b = x.a(view);
        }
        if (this.f7413b == null) {
            this.f7413b = c10;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            androidx.datastore.preferences.protobuf.i j = l0.j(view);
            if (j == null || !Objects.equals((k1) j.f560e, c10)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                k1 k1Var = this.f7413b;
                int i3 = 1;
                while (i3 <= 512) {
                    h3.b i10 = h1Var.i(i3);
                    h3.b i11 = k1Var.f7415a.i(i3);
                    int i12 = i10.f4443a;
                    int i13 = i10.f4446d;
                    int i14 = i10.f4445c;
                    int i15 = i10.f4444b;
                    int i16 = i11.f4443a;
                    int i17 = i11.f4446d;
                    int[] iArr4 = iArr2;
                    int i18 = i11.f4445c;
                    int i19 = i11.f4444b;
                    if (i12 > i16 || i15 > i19 || i14 > i18 || i13 > i17) {
                        iArr = iArr3;
                        z10 = true;
                    } else {
                        iArr = iArr3;
                        z10 = false;
                    }
                    if (z10 != (i12 < i16 || i15 < i19 || i14 < i18 || i13 < i17)) {
                        if (z10) {
                            iArr4[0] = iArr4[0] | i3;
                        } else {
                            iArr[0] = iArr[0] | i3;
                        }
                    }
                    i3 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i20 = iArr2[0];
                int i21 = iArr3[0];
                int i22 = i20 | i21;
                if (i22 != 0) {
                    k1 k1Var2 = this.f7413b;
                    q0 q0Var = new q0(i22, (i20 & 8) != 0 ? l0.f7417e : (i21 & 8) != 0 ? l0.f7418f : (i20 & 519) != 0 ? l0.g : (i21 & 519) != 0 ? l0.f7419h : null, (i22 & 8) != 0 ? 160L : 250L);
                    q0Var.f7435a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(q0Var.f7435a.b());
                    h3.b i23 = h1Var.i(i22);
                    h3.b i24 = k1Var2.f7415a.i(i22);
                    int min = Math.min(i23.f4443a, i24.f4443a);
                    int i25 = i23.f4444b;
                    int i26 = i24.f4444b;
                    int min2 = Math.min(i25, i26);
                    int i27 = i23.f4445c;
                    int i28 = i24.f4445c;
                    int min3 = Math.min(i27, i28);
                    int i29 = i23.f4446d;
                    int i30 = i24.f4446d;
                    c6.e eVar = new c6.e(9, h3.b.b(min, min2, min3, Math.min(i29, i30)), h3.b.b(Math.max(i23.f4443a, i24.f4443a), Math.max(i25, i26), Math.max(i27, i28), Math.max(i29, i30)));
                    l0.g(view, q0Var, c10, false);
                    duration.addUpdateListener(new i0(q0Var, c10, k1Var2, i22, view));
                    duration.addListener(new j0(view, q0Var));
                    d6.t tVar = new d6.t(view, q0Var, eVar, duration, 2, false);
                    if (view != null) {
                        j jVar = new j(view, tVar);
                        view.getViewTreeObserver().addOnPreDrawListener(jVar);
                        view.addOnAttachStateChangeListener(jVar);
                    } else {
                        a2.r.j("view == null");
                    }
                    this.f7413b = c10;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                    return windowInsets;
                }
                this.f7413b = c10;
                if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
