package K0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.fortuneink.neonpad.R;
import com.google.android.material.internal.CheckableImageButton;
import o0.AbstractC0305a;

/* renamed from: K0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f538e;

    /* renamed from: f, reason: collision with root package name */
    public final int f539f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f540g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0030a f541j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0031b f542k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f543l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f544m;

    public C0034e(q qVar) {
        super(qVar);
        this.f541j = new ViewOnClickListenerC0030a(0, this);
        this.f542k = new ViewOnFocusChangeListenerC0031b(this, 0);
        this.f538e = q1.l.f0(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f539f = q1.l.f0(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f540g = q1.l.g0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0305a.f3712a);
        this.h = q1.l.g0(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0305a.f3715d);
    }

    @Override // K0.r
    public final void a() {
        if (this.f593b.f585p != null) {
            return;
        }
        t(u());
    }

    @Override // K0.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // K0.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // K0.r
    public final View.OnFocusChangeListener e() {
        return this.f542k;
    }

    @Override // K0.r
    public final View.OnClickListener f() {
        return this.f541j;
    }

    @Override // K0.r
    public final View.OnFocusChangeListener g() {
        return this.f542k;
    }

    @Override // K0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f592a.setEndIconVisible(u());
    }

    @Override // K0.r
    public final void p(boolean z2) {
        if (this.f593b.f585p == null) {
            return;
        }
        t(z2);
    }

    @Override // K0.r
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f539f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0034e f535b;

            {
                this.f535b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0034e c0034e = this.f535b;
                        c0034e.getClass();
                        c0034e.f595d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0034e c0034e2 = this.f535b;
                        c0034e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0034e2.f595d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f540g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f538e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0034e f535b;

            {
                this.f535b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0034e c0034e = this.f535b;
                        c0034e.getClass();
                        c0034e.f595d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0034e c0034e2 = this.f535b;
                        c0034e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0034e2.f595d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f543l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f543l.addListener(new C0033d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0034e f535b;

            {
                this.f535b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0034e c0034e = this.f535b;
                        c0034e.getClass();
                        c0034e.f595d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0034e c0034e2 = this.f535b;
                        c0034e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0034e2.f595d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f544m = ofFloat3;
        ofFloat3.addListener(new C0033d(this, i));
    }

    @Override // K0.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new B0.q(2, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f593b.d() == z2;
        if (z2 && !this.f543l.isRunning()) {
            this.f544m.cancel();
            this.f543l.start();
            if (z3) {
                this.f543l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f543l.cancel();
        this.f544m.start();
        if (z3) {
            this.f544m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.f595d.hasFocus()) && this.i.getText().length() > 0;
    }
}
