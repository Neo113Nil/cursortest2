package M0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.winworm.neongrid.R;
import q0.AbstractC0292a;

/* renamed from: M0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f588e;

    /* renamed from: f, reason: collision with root package name */
    public final int f589f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f590g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0028a f591j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0029b f592k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f593l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f594m;

    public C0032e(q qVar) {
        super(qVar);
        this.f591j = new ViewOnClickListenerC0028a(0, this);
        this.f592k = new ViewOnFocusChangeListenerC0029b(this, 0);
        this.f588e = z1.d.h0(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f589f = z1.d.h0(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f590g = z1.d.i0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0292a.f3384a);
        this.h = z1.d.i0(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0292a.d);
    }

    @Override // M0.r
    public final void a() {
        if (this.f641b.f633p != null) {
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
        return this.f592k;
    }

    @Override // M0.r
    public final View.OnClickListener f() {
        return this.f591j;
    }

    @Override // M0.r
    public final View.OnFocusChangeListener g() {
        return this.f592k;
    }

    @Override // M0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f640a.setEndIconVisible(u());
    }

    @Override // M0.r
    public final void p(boolean z2) {
        if (this.f641b.f633p == null) {
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
        ofFloat.setDuration(this.f589f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f585b;

            {
                this.f585b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0032e c0032e = this.f585b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f585b;
                        c0032e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0032e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.f1559A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f590g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f588e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f585b;

            {
                this.f585b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0032e c0032e = this.f585b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f585b;
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
        this.f593l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f593l.addListener(new C0031d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1559A0);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f585b;

            {
                this.f585b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0032e c0032e = this.f585b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f585b;
                        c0032e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0032e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f594m = ofFloat3;
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
        boolean z3 = this.f641b.d() == z2;
        if (z2 && !this.f593l.isRunning()) {
            this.f594m.cancel();
            this.f593l.start();
            if (z3) {
                this.f593l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f593l.cancel();
        this.f594m.start();
        if (z3) {
            this.f594m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
