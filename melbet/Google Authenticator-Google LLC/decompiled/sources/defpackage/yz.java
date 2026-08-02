package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zz a;
    final /* synthetic */ zz b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ brn e;

    public yz(brn brnVar, zz zzVar, zz zzVar2, int i, View view) {
        this.e = brnVar;
        this.a = zzVar;
        this.b = zzVar2;
        this.c = i;
        this.d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        brn brnVar = this.e;
        brnVar.L(valueAnimator.getAnimatedFraction());
        float I = brnVar.I();
        Interpolator interpolator = zc.a;
        int i = Build.VERSION.SDK_INT;
        zz zzVar = this.a;
        zn zmVar = i >= 36 ? new zm(zzVar) : Build.VERSION.SDK_INT >= 35 ? new zl(zzVar) : Build.VERSION.SDK_INT >= 34 ? new zk(zzVar) : Build.VERSION.SDK_INT >= 31 ? new zj(zzVar) : Build.VERSION.SDK_INT >= 30 ? new zi(zzVar) : Build.VERSION.SDK_INT >= 29 ? new zh(zzVar) : new zg(zzVar);
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((this.c & i2) == 0) {
                zmVar.g(i2, zzVar.f(i2));
            } else {
                zz zzVar2 = this.b;
                vb f = zzVar.f(i2);
                vb f2 = zzVar2.f(i2);
                float f3 = 1.0f - I;
                zmVar.g(i2, zz.j(f, (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d), (int) (((f.e - f2.e) * f3) + 0.5d)));
            }
        }
        zc.c(this.d, zmVar.a(), Collections.singletonList(brnVar));
    }
}
