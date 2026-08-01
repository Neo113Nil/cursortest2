package O0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.winfour.neondrop.R;
import r0.AbstractC0260a;

/* renamed from: O0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e extends r {

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

    public C0029e(q qVar) {
        super(qVar);
        this.f661j = new ViewOnClickListenerC0025a(0, this);
        this.f662k = new ViewOnFocusChangeListenerC0026b(this, 0);
        this.f658e = z1.l.m0(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f659f = z1.l.m0(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f660g = z1.l.n0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0260a.f3420a);
        this.h = z1.l.n0(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0260a.d);
    }

    @Override // O0.r
    public final void a() {
        if (this.f711b.f703p != null) {
            return;
        }
        t(u());
    }

    @Override // O0.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // O0.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // O0.r
    public final View.OnFocusChangeListener e() {
        return this.f662k;
    }

    @Override // O0.r
    public final View.OnClickListener f() {
        return this.f661j;
    }

    @Override // O0.r
    public final View.OnFocusChangeListener g() {
        return this.f662k;
    }

    @Override // O0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f710a.setEndIconVisible(u());
    }

    @Override // O0.r
    public final void p(boolean z2) {
        if (this.f711b.f703p == null) {
            return;
        }
        t(z2);
    }

    @Override // O0.r
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f659f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: O0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f655b;

            {
                this.f655b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0029e c0029e = this.f655b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f655b;
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
        TimeInterpolator timeInterpolator = this.f660g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f658e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: O0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f655b;

            {
                this.f655b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f655b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f655b;
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
        this.f663l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f663l.addListener(new C0028d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: O0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f655b;

            {
                this.f655b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f655b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f655b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f664m = ofFloat3;
        ofFloat3.addListener(new C0028d(this, i));
    }

    @Override // O0.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new B.a(3, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f711b.d() == z2;
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
