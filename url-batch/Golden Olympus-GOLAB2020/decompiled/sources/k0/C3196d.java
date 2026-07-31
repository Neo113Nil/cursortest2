package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1281a0;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3196d extends N {

    /* renamed from: k0.d$a */
    class a extends AbstractC3205m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f40922a;

        a(View view) {
            this.f40922a = view;
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            AbstractC3188A.g(this.f40922a, 1.0f);
            AbstractC3188A.a(this.f40922a);
            abstractC3204l.removeListener(this);
        }
    }

    /* renamed from: k0.d$b */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f40924a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f40925b = false;

        b(View view) {
            this.f40924a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3188A.g(this.f40924a, 1.0f);
            if (this.f40925b) {
                this.f40924a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC1281a0.P(this.f40924a) && this.f40924a.getLayerType() == 0) {
                this.f40925b = true;
                this.f40924a.setLayerType(2, null);
            }
        }
    }

    public C3196d(int i4) {
        setMode(i4);
    }

    private Animator o(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        AbstractC3188A.g(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC3188A.f40870b, f5);
        ofFloat.addListener(new b(view));
        addListener(new a(view));
        return ofFloat;
    }

    private static float p(s sVar, float f4) {
        Float f5;
        return (sVar == null || (f5 = (Float) sVar.f40979a.get("android:fade:transitionAlpha")) == null) ? f4 : f5.floatValue();
    }

    @Override // k0.N, k0.AbstractC3204l
    public void captureStartValues(s sVar) {
        super.captureStartValues(sVar);
        sVar.f40979a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC3188A.c(sVar.f40980b)));
    }

    @Override // k0.N
    public Animator onAppear(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float p4 = p(sVar, 0.0f);
        return o(view, p4 != 1.0f ? p4 : 0.0f, 1.0f);
    }

    @Override // k0.N
    public Animator onDisappear(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        AbstractC3188A.e(view);
        return o(view, p(sVar, 1.0f), 0.0f);
    }

    public C3196d() {
    }
}
