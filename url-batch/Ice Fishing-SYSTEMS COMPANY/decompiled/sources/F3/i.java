package F3;

import X0.EnumC0407a;
import android.animation.ValueAnimator;
import android.view.View;
import f1.C4491b;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1036n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1037u;

    public /* synthetic */ i(int i, Object obj) {
        this.f1036n = i;
        this.f1037u = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1036n) {
            case 0:
                m mVar = (m) this.f1037u;
                mVar.getClass();
                mVar.f1087d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                X0.v vVar = (X0.v) this.f1037u;
                EnumC0407a enumC0407a = vVar.f3751r0;
                if (enumC0407a == null) {
                    enumC0407a = EnumC0407a.f3647n;
                }
                if (enumC0407a != EnumC0407a.f3648u) {
                    C4491b c4491b = vVar.f3729H;
                    if (c4491b != null) {
                        c4491b.r(vVar.f3754u.h());
                        break;
                    }
                } else {
                    vVar.invalidateSelf();
                    break;
                }
                break;
            default:
                com.onesignal.inAppMessages.internal.display.impl.j.animateViewColor$lambda$0((View) this.f1037u, valueAnimator);
                break;
        }
    }
}
