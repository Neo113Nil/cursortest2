package k5;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import w5.h;
import w5.j;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4184b;

    public /* synthetic */ b(int i, Object obj) {
        this.f4183a = i;
        this.f4184b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4183a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j jVar = ((BottomSheetBehavior) this.f4184b).i;
                if (jVar != null) {
                    h hVar = jVar.f8105e;
                    if (hVar.f8095j != floatValue) {
                        hVar.f8095j = floatValue;
                        jVar.i = true;
                        jVar.f8109j = true;
                        jVar.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                w4.j jVar2 = (w4.j) this.f4184b;
                jVar2.f7932b.setAlpha(floatValue2);
                jVar2.f7933c.setAlpha(floatValue2);
                jVar2.f7943n.invalidate();
                break;
            default:
                ((TextInputLayout) this.f4184b).f2010z0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
