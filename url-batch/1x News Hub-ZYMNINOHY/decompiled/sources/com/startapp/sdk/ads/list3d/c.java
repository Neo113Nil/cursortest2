package com.startapp.sdk.ads.list3d;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.t6;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f3118a;

    public c(List3DView list3DView) {
        this.f3118a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        List3DView list3DView = this.f3118a;
        if (list3DView.f3105l == null) {
            return;
        }
        boolean z = false;
        View childAt = list3DView.getChildAt(0);
        if (childAt != null) {
            List3DView list3DView2 = this.f3118a;
            list3DView2.getClass();
            int a3 = List3DView.a(childAt);
            List3DView list3DView3 = this.f3118a;
            list3DView2.f3099e = a3 - list3DView3.f3100g;
            t6 t6Var = list3DView3.f3105l;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j3 = t6Var.f4458e;
            if (j3 != 0) {
                int i3 = (int) (currentAnimationTimeMillis - j3);
                if (i3 > 50) {
                    i3 = 50;
                }
                rg rgVar = (rg) t6Var;
                float f3 = rgVar.f4455b;
                float f4 = rgVar.f4454a;
                float f5 = rgVar.f4456c;
                if (f4 <= f5) {
                    f5 = rgVar.f4457d;
                    if (f4 >= f5) {
                        f = 0.0f;
                        float f6 = (f * rgVar.f4399g) + f3;
                        rgVar.f4454a = ((i3 * f6) / 1000.0f) + f4;
                        rgVar.f4455b = f6 * rgVar.f;
                    }
                }
                f = f5 - f4;
                float f62 = (f * rgVar.f4399g) + f3;
                rgVar.f4454a = ((i3 * f62) / 1000.0f) + f4;
                rgVar.f4455b = f62 * rgVar.f;
            }
            t6Var.f4458e = currentAnimationTimeMillis;
            List3DView list3DView4 = this.f3118a;
            list3DView4.b(((int) list3DView4.f3105l.f4454a) - list3DView4.f3099e);
        }
        t6 t6Var2 = this.f3118a.f3105l;
        boolean z2 = Math.abs(t6Var2.f4455b) < 0.5f;
        float f7 = t6Var2.f4454a;
        if (f7 - 0.4f < t6Var2.f4456c && f7 + 0.4f > t6Var2.f4457d) {
            z = true;
        }
        if (z2 && z) {
            return;
        }
        this.f3118a.postDelayed(this, 16L);
    }
}
