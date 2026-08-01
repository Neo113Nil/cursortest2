package Q0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.winpower.neonfit.R;
import com.winpower.neonfit.data.UserPreferences;
import u0.AbstractC0389a;

/* renamed from: Q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034e extends r {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1012f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1013g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f1014h;
    public EditText i;
    public final ViewOnClickListenerC0030a j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0031b f1015k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1016l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1017m;

    public C0034e(q qVar) {
        super(qVar);
        this.j = new ViewOnClickListenerC0030a(0, this);
        this.f1015k = new ViewOnFocusChangeListenerC0031b(this, 0);
        this.e = H1.l.T(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f1012f = H1.l.T(qVar.getContext(), R.attr.motionDurationShort3, UserPreferences.DEFAULT_PROTEIN_GOAL);
        this.f1013g = H1.l.U(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0389a.f4369a);
        this.f1014h = H1.l.U(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0389a.f4372d);
    }

    @Override // Q0.r
    public final void a() {
        if (this.f1063b.f1055p != null) {
            return;
        }
        t(u());
    }

    @Override // Q0.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // Q0.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // Q0.r
    public final View.OnFocusChangeListener e() {
        return this.f1015k;
    }

    @Override // Q0.r
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // Q0.r
    public final View.OnFocusChangeListener g() {
        return this.f1015k;
    }

    @Override // Q0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f1062a.setEndIconVisible(u());
    }

    @Override // Q0.r
    public final void p(boolean z2) {
        if (this.f1063b.f1055p == null) {
            return;
        }
        t(z2);
    }

    @Override // Q0.r
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f1014h);
        ofFloat.setDuration(this.f1012f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Q0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0034e f1009b;

            {
                this.f1009b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0034e c0034e = this.f1009b;
                        c0034e.getClass();
                        c0034e.f1065d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0034e c0034e2 = this.f1009b;
                        c0034e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0034e2.f1065d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1013g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Q0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0034e f1009b;

            {
                this.f1009b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0034e c0034e = this.f1009b;
                        c0034e.getClass();
                        c0034e.f1065d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0034e c0034e2 = this.f1009b;
                        c0034e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0034e2.f1065d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1016l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1016l.addListener(new C0033d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Q0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0034e f1009b;

            {
                this.f1009b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0034e c0034e = this.f1009b;
                        c0034e.getClass();
                        c0034e.f1065d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0034e c0034e2 = this.f1009b;
                        c0034e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0034e2.f1065d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f1017m = ofFloat3;
        ofFloat3.addListener(new C0033d(this, i));
    }

    @Override // Q0.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new A0.b(4, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f1063b.d() == z2;
        if (z2 && !this.f1016l.isRunning()) {
            this.f1017m.cancel();
            this.f1016l.start();
            if (z3) {
                this.f1016l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f1016l.cancel();
        this.f1017m.start();
        if (z3) {
            this.f1017m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.f1065d.hasFocus()) && this.i.getText().length() > 0;
    }
}
