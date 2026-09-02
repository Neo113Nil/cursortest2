package o2;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f2880e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2881f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2882g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f2883h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f2884j;

    /* renamed from: k, reason: collision with root package name */
    public final a f2885k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2886l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f2887m;

    public d(o oVar) {
        super(oVar);
        this.f2884j = new com.google.android.material.datepicker.n(1, this);
        this.f2885k = new a(this, 0);
        this.f2880e = a.y.R(oVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f2881f = a.y.R(oVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f2882g = a.y.S(oVar.getContext(), R.attr.motionEasingLinearInterpolator, o1.a.f2864a);
        this.f2883h = a.y.S(oVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, o1.a.d);
    }

    @Override // o2.p
    public final void a() {
        if (this.f2932b.f2925u != null) {
            return;
        }
        s(t());
    }

    @Override // o2.p
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // o2.p
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // o2.p
    public final View.OnFocusChangeListener e() {
        return this.f2885k;
    }

    @Override // o2.p
    public final View.OnClickListener f() {
        return this.f2884j;
    }

    @Override // o2.p
    public final View.OnFocusChangeListener g() {
        return this.f2885k;
    }

    @Override // o2.p
    public final void l(EditText editText) {
        this.i = editText;
        this.f2931a.setEndIconVisible(t());
    }

    @Override // o2.p
    public final void o(boolean z3) {
        if (this.f2932b.f2925u == null) {
            return;
        }
        s(z3);
    }

    @Override // o2.p
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f2883h);
        ofFloat.setDuration(this.f2881f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2877b;

            {
                this.f2877b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        d dVar = this.f2877b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f2877b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2882g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i4 = this.f2880e;
        ofFloat2.setDuration(i4);
        final int i5 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2877b;

            {
                this.f2877b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        d dVar = this.f2877b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f2877b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2886l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f2886l.addListener(new c(this, i5));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i4);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2877b;

            {
                this.f2877b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        d dVar = this.f2877b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f2877b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f2887m = ofFloat3;
        ofFloat3.addListener(new c(this, i));
    }

    @Override // o2.p
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new a.j(7, this));
        }
    }

    public final void s(boolean z3) {
        boolean z4 = this.f2932b.d() == z3;
        if (z3 && !this.f2886l.isRunning()) {
            this.f2887m.cancel();
            this.f2886l.start();
            if (z4) {
                this.f2886l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f2886l.cancel();
        this.f2887m.start();
        if (z4) {
            this.f2887m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
