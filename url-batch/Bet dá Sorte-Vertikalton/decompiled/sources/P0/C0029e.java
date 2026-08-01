package P0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.glasspulse.glasspulse.R;
import com.google.android.material.internal.CheckableImageButton;
import t0.AbstractC0299a;

/* renamed from: P0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f596e;

    /* renamed from: f, reason: collision with root package name */
    public final int f597f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f598g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f599j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f600k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f601l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f602m;

    public C0029e(p pVar) {
        super(pVar);
        this.f599j = new ViewOnClickListenerC0025a(0, this);
        this.f600k = new ViewOnFocusChangeListenerC0026b(this, 0);
        this.f596e = u1.l.f0(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f597f = u1.l.f0(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f598g = u1.l.g0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0299a.f3822a);
        this.h = u1.l.g0(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0299a.d);
    }

    @Override // P0.q
    public final void a() {
        if (this.f648b.f640p != null) {
            return;
        }
        t(u());
    }

    @Override // P0.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // P0.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // P0.q
    public final View.OnFocusChangeListener e() {
        return this.f600k;
    }

    @Override // P0.q
    public final View.OnClickListener f() {
        return this.f599j;
    }

    @Override // P0.q
    public final View.OnFocusChangeListener g() {
        return this.f600k;
    }

    @Override // P0.q
    public final void m(EditText editText) {
        this.i = editText;
        this.f647a.setEndIconVisible(u());
    }

    @Override // P0.q
    public final void p(boolean z2) {
        if (this.f648b.f640p == null) {
            return;
        }
        t(z2);
    }

    @Override // P0.q
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f597f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f593b;

            {
                this.f593b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0029e c0029e = this.f593b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f593b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f598g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f596e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f593b;

            {
                this.f593b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f593b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f593b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f601l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f601l.addListener(new C0028d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f593b;

            {
                this.f593b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f593b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f593b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f602m = ofFloat3;
        ofFloat3.addListener(new C0028d(this, i));
    }

    @Override // P0.q
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new G0.o(2, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f648b.d() == z2;
        if (z2 && !this.f601l.isRunning()) {
            this.f602m.cancel();
            this.f601l.start();
            if (z3) {
                this.f601l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f601l.cancel();
        this.f602m.start();
        if (z3) {
            this.f602m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
