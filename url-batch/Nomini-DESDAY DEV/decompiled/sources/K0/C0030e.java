package K0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.pairspot.fortunetiles.R;
import o0.AbstractC0280a;

/* renamed from: K0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f488e;

    /* renamed from: f, reason: collision with root package name */
    public final int f489f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f490g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0026a f491j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0027b f492k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f493l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f494m;

    public C0030e(q qVar) {
        super(qVar);
        this.f491j = new ViewOnClickListenerC0026a(0, this);
        this.f492k = new ViewOnFocusChangeListenerC0027b(this, 0);
        this.f488e = q1.l.Q(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f489f = q1.l.Q(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f490g = q1.l.R(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0280a.f3332a);
        this.h = q1.l.R(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0280a.d);
    }

    @Override // K0.r
    public final void a() {
        if (this.f541b.f533p != null) {
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
        return this.f492k;
    }

    @Override // K0.r
    public final View.OnClickListener f() {
        return this.f491j;
    }

    @Override // K0.r
    public final View.OnFocusChangeListener g() {
        return this.f492k;
    }

    @Override // K0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f540a.setEndIconVisible(u());
    }

    @Override // K0.r
    public final void p(boolean z2) {
        if (this.f541b.f533p == null) {
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
        ofFloat.setDuration(this.f489f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0030e f485b;

            {
                this.f485b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0030e c0030e = this.f485b;
                        c0030e.getClass();
                        c0030e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0030e c0030e2 = this.f485b;
                        c0030e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0030e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f490g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f488e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0030e f485b;

            {
                this.f485b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0030e c0030e = this.f485b;
                        c0030e.getClass();
                        c0030e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0030e c0030e2 = this.f485b;
                        c0030e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0030e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f493l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f493l.addListener(new C0029d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0030e f485b;

            {
                this.f485b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0030e c0030e = this.f485b;
                        c0030e.getClass();
                        c0030e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0030e c0030e2 = this.f485b;
                        c0030e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0030e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f494m = ofFloat3;
        ofFloat3.addListener(new C0029d(this, i));
    }

    @Override // K0.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new B0.q(2, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f541b.d() == z2;
        if (z2 && !this.f493l.isRunning()) {
            this.f494m.cancel();
            this.f493l.start();
            if (z3) {
                this.f493l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f493l.cancel();
        this.f494m.start();
        if (z3) {
            this.f494m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
