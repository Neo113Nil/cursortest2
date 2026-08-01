package L0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.visualfortune.eyerest.R;
import p0.AbstractC0278a;

/* renamed from: L0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f496e;

    /* renamed from: f, reason: collision with root package name */
    public final int f497f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f498g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f499j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f500k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f501l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f502m;

    public C0029e(q qVar) {
        super(qVar);
        this.f499j = new ViewOnClickListenerC0025a(0, this);
        this.f500k = new ViewOnFocusChangeListenerC0026b(this, 0);
        this.f496e = s1.l.U(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f497f = s1.l.U(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f498g = s1.l.V(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0278a.f3455a);
        this.h = s1.l.V(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0278a.d);
    }

    @Override // L0.r
    public final void a() {
        if (this.f549b.f541p != null) {
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
        return this.f500k;
    }

    @Override // L0.r
    public final View.OnClickListener f() {
        return this.f499j;
    }

    @Override // L0.r
    public final View.OnFocusChangeListener g() {
        return this.f500k;
    }

    @Override // L0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f548a.setEndIconVisible(u());
    }

    @Override // L0.r
    public final void p(boolean z2) {
        if (this.f549b.f541p == null) {
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
        ofFloat.setDuration(this.f497f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f493b;

            {
                this.f493b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0029e c0029e = this.f493b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f493b;
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
        TimeInterpolator timeInterpolator = this.f498g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f496e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f493b;

            {
                this.f493b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f493b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f493b;
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
        this.f501l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f501l.addListener(new C0028d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f493b;

            {
                this.f493b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f493b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f493b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f502m = ofFloat3;
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
        boolean z3 = this.f549b.d() == z2;
        if (z2 && !this.f501l.isRunning()) {
            this.f502m.cancel();
            this.f501l.start();
            if (z3) {
                this.f501l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f501l.cancel();
        this.f502m.start();
        if (z3) {
            this.f502m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
