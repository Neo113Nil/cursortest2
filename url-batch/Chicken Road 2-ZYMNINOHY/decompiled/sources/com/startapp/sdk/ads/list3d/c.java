package com.startapp.sdk.ads.list3d;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.t6;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f6201a;

    public c(List3DView list3DView) {
        this.f6201a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f4;
        List3DView list3DView = this.f6201a;
        if (list3DView.f6189l == null) {
            return;
        }
        boolean z = false;
        View childAt = list3DView.getChildAt(0);
        if (childAt != null) {
            List3DView list3DView2 = this.f6201a;
            list3DView2.getClass();
            int a3 = List3DView.a(childAt);
            List3DView list3DView3 = this.f6201a;
            list3DView2.f6182e = a3 - list3DView3.f6184g;
            t6 t6Var = list3DView3.f6189l;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j4 = t6Var.f7595e;
            if (j4 != 0) {
                int i4 = (int) (currentAnimationTimeMillis - j4);
                if (i4 > 50) {
                    i4 = 50;
                }
                rg rgVar = (rg) t6Var;
                float f5 = rgVar.f7592b;
                float f6 = rgVar.f7591a;
                float f7 = rgVar.f7593c;
                if (f6 <= f7) {
                    f7 = rgVar.f7594d;
                    if (f6 >= f7) {
                        f4 = 0.0f;
                        float f8 = (f4 * rgVar.f7537g) + f5;
                        rgVar.f7591a = ((i4 * f8) / 1000.0f) + f6;
                        rgVar.f7592b = f8 * rgVar.f7536f;
                    }
                }
                f4 = f7 - f6;
                float f82 = (f4 * rgVar.f7537g) + f5;
                rgVar.f7591a = ((i4 * f82) / 1000.0f) + f6;
                rgVar.f7592b = f82 * rgVar.f7536f;
            }
            t6Var.f7595e = currentAnimationTimeMillis;
            List3DView list3DView4 = this.f6201a;
            list3DView4.b(((int) list3DView4.f6189l.f7591a) - list3DView4.f6182e);
        }
        t6 t6Var2 = this.f6201a.f6189l;
        boolean z4 = Math.abs(t6Var2.f7592b) < 0.5f;
        float f9 = t6Var2.f7591a;
        if (f9 - 0.4f < t6Var2.f7593c && f9 + 0.4f > t6Var2.f7594d) {
            z = true;
        }
        if (z4 && z) {
            return;
        }
        this.f6201a.postDelayed(this, 16L);
    }
}
