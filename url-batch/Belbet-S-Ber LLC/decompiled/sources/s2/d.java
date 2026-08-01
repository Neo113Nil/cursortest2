package s2;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.gdmhkmf.belbet.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f3242e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3243f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3244g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final o1.e f3245j;

    /* renamed from: k, reason: collision with root package name */
    public final a f3246k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f3247l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f3248m;

    public d(p pVar) {
        super(pVar);
        this.f3245j = new o1.e(2, this);
        this.f3246k = new a(this, 0);
        this.f3242e = b4.l.V(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f3243f = b4.l.V(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f3244g = b4.l.W(pVar.getContext(), R.attr.motionEasingLinearInterpolator, r1.a.f3205a);
        this.h = b4.l.W(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, r1.a.d);
    }

    @Override // s2.q
    public final void a() {
        if (this.f3293b.f3286u != null) {
            return;
        }
        s(t());
    }

    @Override // s2.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // s2.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // s2.q
    public final View.OnFocusChangeListener e() {
        return this.f3246k;
    }

    @Override // s2.q
    public final View.OnClickListener f() {
        return this.f3245j;
    }

    @Override // s2.q
    public final View.OnFocusChangeListener g() {
        return this.f3246k;
    }

    @Override // s2.q
    public final void l(EditText editText) {
        this.i = editText;
        this.f3292a.setEndIconVisible(t());
    }

    @Override // s2.q
    public final void o(boolean z4) {
        if (this.f3293b.f3286u == null) {
            return;
        }
        s(z4);
    }

    @Override // s2.q
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f3243f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3239b;

            {
                this.f3239b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        d dVar = this.f3239b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f3239b;
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
        TimeInterpolator timeInterpolator = this.f3244g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i4 = this.f3242e;
        ofFloat2.setDuration(i4);
        final int i5 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3239b;

            {
                this.f3239b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        d dVar = this.f3239b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f3239b;
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
        this.f3247l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f3247l.addListener(new c(this, i5));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i4);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3239b;

            {
                this.f3239b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        d dVar = this.f3239b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f3239b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f3248m = ofFloat3;
        ofFloat3.addListener(new c(this, i));
    }

    @Override // s2.q
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new a.j(9, this));
        }
    }

    public final void s(boolean z4) {
        boolean z5 = this.f3293b.d() == z4;
        if (z4 && !this.f3247l.isRunning()) {
            this.f3248m.cancel();
            this.f3247l.start();
            if (z5) {
                this.f3247l.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f3247l.cancel();
        this.f3248m.start();
        if (z5) {
            this.f3248m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.d.hasFocus()) && ((this.i.getText().length() > 0) || (this.f3293b.f3286u != null));
    }
}
