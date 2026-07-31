package com.startapp.sdk.ads.list3d;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.s6;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f92a;

    public c(List3DView list3DView) {
        this.f92a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        List3DView list3DView = this.f92a;
        if (list3DView.l == null) {
            return;
        }
        boolean z = false;
        View childAt = list3DView.getChildAt(0);
        if (childAt != null) {
            List3DView list3DView2 = this.f92a;
            int a2 = List3DView.a(childAt);
            List3DView list3DView3 = this.f92a;
            list3DView2.e = a2 - list3DView3.g;
            s6 s6Var = list3DView3.l;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = s6Var.e;
            if (j != 0) {
                int i = (int) (currentAnimationTimeMillis - j);
                if (i > 50) {
                    i = 50;
                }
                ag agVar = (ag) s6Var;
                float f2 = agVar.b;
                float f3 = agVar.f417a;
                float f4 = agVar.c;
                if (f3 <= f4) {
                    f4 = agVar.d;
                    if (f3 >= f4) {
                        f = 0.0f;
                        float f5 = (f * agVar.g) + f2;
                        agVar.f417a = ((i * f5) / 1000.0f) + f3;
                        agVar.b = f5 * agVar.f;
                    }
                }
                f = f4 - f3;
                float f52 = (f * agVar.g) + f2;
                agVar.f417a = ((i * f52) / 1000.0f) + f3;
                agVar.b = f52 * agVar.f;
            }
            s6Var.e = currentAnimationTimeMillis;
            List3DView list3DView4 = this.f92a;
            list3DView4.b(((int) list3DView4.l.f417a) - list3DView4.e);
        }
        s6 s6Var2 = this.f92a.l;
        boolean z2 = Math.abs(s6Var2.b) < 0.5f;
        float f6 = s6Var2.f417a;
        if (f6 - 0.4f < s6Var2.c && f6 + 0.4f > s6Var2.d) {
            z = true;
        }
        if (z2 && z) {
            return;
        }
        this.f92a.postDelayed(this, 16L);
    }
}
