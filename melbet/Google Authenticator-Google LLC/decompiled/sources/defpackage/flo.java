package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flo extends acs {
    @Override // defpackage.acs
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = flp.h;
        return ((flp) obj).b() * 10000.0f;
    }

    @Override // defpackage.acs
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        flp flpVar = (flp) obj;
        int i = flp.h;
        flpVar.d(f / 10000.0f);
        if (flpVar.j.c(true)) {
            if (flpVar.d == null) {
                Context context = flpVar.i;
                TimeInterpolator timeInterpolator = fes.a;
                flpVar.f = fny.p(context, R.attr.motionEasingStandardInterpolator, timeInterpolator);
                flpVar.g = fny.p(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
                flpVar.d = new ValueAnimator();
                flpVar.d.setDuration(500L);
                flpVar.d.setFloatValues(0.0f, 1.0f);
                flpVar.d.setInterpolator(null);
                flpVar.d.addUpdateListener(new mu(flpVar, 11, null));
            }
            float a = flpVar.a((int) f);
            if (a == flpVar.c) {
                if (flpVar.d.isRunning()) {
                    return;
                }
                flpVar.c(a);
                return;
            }
            if (flpVar.d.isRunning()) {
                flpVar.d.cancel();
            }
            flpVar.c = a;
            if (a == 1.0f) {
                flpVar.e = flpVar.f;
                flpVar.d.start();
            } else {
                flpVar.e = flpVar.g;
                flpVar.d.reverse();
            }
        }
    }
}
