package L0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.playgen.securelock.R;
import p0.AbstractC0281a;

/* renamed from: L0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f507e;

    /* renamed from: f, reason: collision with root package name */
    public final int f508f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f509g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f510j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f511k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f512l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f513m;

    public C0029e(q qVar) {
        super(qVar);
        this.f510j = new ViewOnClickListenerC0025a(0, this);
        this.f511k = new ViewOnFocusChangeListenerC0026b(this, 0);
        this.f507e = u1.l.U(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f508f = u1.l.U(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f509g = u1.l.V(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0281a.f3380a);
        this.h = u1.l.V(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0281a.d);
    }

    @Override // L0.r
    public final void a() {
        if (this.f561b.f553p != null) {
            return;
        }
        t(u());
    }

    @Override // L0.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // L0.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // L0.r
    public final View.OnFocusChangeListener e() {
        return this.f511k;
    }

    @Override // L0.r
    public final View.OnClickListener f() {
        return this.f510j;
    }

    @Override // L0.r
    public final View.OnFocusChangeListener g() {
        return this.f511k;
    }

    @Override // L0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f560a.setEndIconVisible(u());
    }

    @Override // L0.r
    public final void p(boolean z2) {
        if (this.f561b.f553p == null) {
            return;
        }
        t(z2);
    }

    @Override // L0.r
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f508f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f504b;

            {
                this.f504b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0029e c0029e = this.f504b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f504b;
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
        TimeInterpolator timeInterpolator = this.f509g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f507e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f504b;

            {
                this.f504b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f504b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f504b;
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
        this.f512l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f512l.addListener(new C0028d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f504b;

            {
                this.f504b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f504b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f504b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f513m = ofFloat3;
        ofFloat3.addListener(new C0028d(this, i));
    }

    @Override // L0.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new C0.p(2, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f561b.d() == z2;
        if (z2 && !this.f512l.isRunning()) {
            this.f513m.cancel();
            this.f512l.start();
            if (z3) {
                this.f512l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f512l.cancel();
        this.f513m.start();
        if (z3) {
            this.f513m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
