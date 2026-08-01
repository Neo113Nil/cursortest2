package M0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.playbag.tripgear.R;
import q0.AbstractC0289a;

/* renamed from: M0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f571e;

    /* renamed from: f, reason: collision with root package name */
    public final int f572f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f573g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0028a f574j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0029b f575k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f576l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f577m;

    public C0032e(q qVar) {
        super(qVar);
        this.f574j = new ViewOnClickListenerC0028a(0, this);
        this.f575k = new ViewOnFocusChangeListenerC0029b(this, 0);
        this.f571e = w1.d.g0(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f572f = w1.d.g0(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f573g = w1.d.h0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0289a.f3498a);
        this.h = w1.d.h0(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0289a.d);
    }

    @Override // M0.r
    public final void a() {
        if (this.f624b.f616p != null) {
            return;
        }
        t(u());
    }

    @Override // M0.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // M0.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // M0.r
    public final View.OnFocusChangeListener e() {
        return this.f575k;
    }

    @Override // M0.r
    public final View.OnClickListener f() {
        return this.f574j;
    }

    @Override // M0.r
    public final View.OnFocusChangeListener g() {
        return this.f575k;
    }

    @Override // M0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f623a.setEndIconVisible(u());
    }

    @Override // M0.r
    public final void p(boolean z2) {
        if (this.f624b.f616p == null) {
            return;
        }
        t(z2);
    }

    @Override // M0.r
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f572f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f568b;

            {
                this.f568b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0032e c0032e = this.f568b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f568b;
                        c0032e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0032e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.f1530C0, 1.0f);
        TimeInterpolator timeInterpolator = this.f573g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f571e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f568b;

            {
                this.f568b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0032e c0032e = this.f568b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f568b;
                        c0032e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0032e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f576l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f576l.addListener(new C0031d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1530C0);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f568b;

            {
                this.f568b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0032e c0032e = this.f568b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f568b;
                        c0032e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0032e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f577m = ofFloat3;
        ofFloat3.addListener(new C0031d(this, i));
    }

    @Override // M0.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new D0.p(2, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f624b.d() == z2;
        if (z2 && !this.f576l.isRunning()) {
            this.f577m.cancel();
            this.f576l.start();
            if (z3) {
                this.f576l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f576l.cancel();
        this.f577m.start();
        if (z3) {
            this.f577m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
