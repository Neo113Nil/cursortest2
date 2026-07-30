package I;

import android.animation.ValueAnimator;
import android.view.View;
import i.C0511M;
import i.C0513O;

/* loaded from: classes.dex */
public final /* synthetic */ class W implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1160a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1161b;

    public /* synthetic */ W(View view) {
        this.f1161b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1160a) {
            case 0:
                ((View) ((C0513O) ((C0511M) this.f1161b).f5381e).f5392d.getParent()).invalidate();
                break;
            default:
                com.onesignal.inAppMessages.internal.display.impl.j.animateViewColor$lambda$0((View) this.f1161b, valueAnimator);
                break;
        }
    }

    public /* synthetic */ W(C0511M c0511m, View view) {
        this.f1161b = c0511m;
    }
}
