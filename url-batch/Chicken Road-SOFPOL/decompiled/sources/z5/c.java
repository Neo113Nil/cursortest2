package z5;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9183b;

    public /* synthetic */ c(p pVar, int i) {
        this.f9182a = i;
        this.f9183b = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9182a) {
            case 0:
                e eVar = (e) this.f9183b;
                eVar.getClass();
                eVar.f9241d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                e eVar2 = (e) this.f9183b;
                eVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = eVar2.f9241d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                break;
            default:
                k kVar = (k) this.f9183b;
                kVar.getClass();
                kVar.f9241d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
