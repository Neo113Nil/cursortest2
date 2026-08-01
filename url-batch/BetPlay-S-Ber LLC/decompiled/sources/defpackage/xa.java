package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.awerser.monnit.betplay.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xa extends di {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final m2 j;
    public final ua k;
    public AnimatorSet l;
    public ValueAnimator m;

    public xa(ci ciVar) {
        super(ciVar);
        this.j = new m2(1, this);
        this.k = new ua(this, 0);
        this.e = vw.d0(ciVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = vw.d0(ciVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = vw.e0(ciVar.getContext(), R.attr.motionEasingLinearInterpolator, o3.a);
        this.h = vw.e0(ciVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, o3.d);
    }

    @Override // defpackage.di
    public final void a() {
        if (this.b.u != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.di
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.di
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.di
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.di
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.di
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.di
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.di
    public final void o(boolean z) {
        if (this.b.u == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.di
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: va
            public final /* synthetic */ xa b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                xa xaVar = this.b;
                switch (i2) {
                    case 0:
                        xaVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = xaVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: va
            public final /* synthetic */ xa b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                xa xaVar = this.b;
                switch (i22) {
                    case 0:
                        xaVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = xaVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new wa(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: va
            public final /* synthetic */ xa b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                xa xaVar = this.b;
                switch (i22) {
                    case 0:
                        xaVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = xaVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new wa(this, i));
    }

    @Override // defpackage.di
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new q1(3, this));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.d.hasFocus()) && ((this.i.getText().length() > 0) || (this.b.u != null));
    }
}
