package R0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.clutchquizarena.app.R;
import com.google.android.material.internal.CheckableImageButton;
import v0.AbstractC0372a;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f659f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f660g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f661j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f662k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f663l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f664m;

    public e(p pVar) {
        super(pVar);
        this.f661j = new ViewOnClickListenerC0025a(0, this);
        this.f662k = new ViewOnFocusChangeListenerC0026b(this, 0);
        this.f658e = A.c.w0(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f659f = A.c.w0(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f660g = A.c.x0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0372a.f3981a);
        this.h = A.c.x0(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0372a.d);
    }

    @Override // R0.q
    public final void a() {
        if (this.f710b.f702p != null) {
            return;
        }
        t(u());
    }

    @Override // R0.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // R0.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // R0.q
    public final View.OnFocusChangeListener e() {
        return this.f662k;
    }

    @Override // R0.q
    public final View.OnClickListener f() {
        return this.f661j;
    }

    @Override // R0.q
    public final View.OnFocusChangeListener g() {
        return this.f662k;
    }

    @Override // R0.q
    public final void m(EditText editText) {
        this.i = editText;
        this.f709a.setEndIconVisible(u());
    }

    @Override // R0.q
    public final void p(boolean z2) {
        if (this.f710b.f702p == null) {
            return;
        }
        t(z2);
    }

    @Override // R0.q
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f659f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f655b;

            {
                this.f655b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        e eVar = this.f655b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f655b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f660g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f658e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f655b;

            {
                this.f655b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f655b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f655b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f663l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f663l.addListener(new C0028d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f655b;

            {
                this.f655b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f655b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f655b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f664m = ofFloat3;
        ofFloat3.addListener(new C0028d(this, i));
    }

    @Override // R0.q
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new B0.b(3, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f710b.d() == z2;
        if (z2 && !this.f663l.isRunning()) {
            this.f664m.cancel();
            this.f663l.start();
            if (z3) {
                this.f663l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f663l.cancel();
        this.f664m.start();
        if (z3) {
            this.f664m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
