package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ua extends li {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final qa j;
    public final ra k;
    public AnimatorSet l;
    public ValueAnimator m;

    public ua(ki kiVar) {
        super(kiVar);
        this.j = new qa(0, this);
        this.k = new ra(this, 0);
        this.e = o8.i0(kiVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = o8.i0(kiVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = o8.j0(kiVar.getContext(), R.attr.motionEasingLinearInterpolator, w2.a);
        this.h = o8.j0(kiVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, w2.d);
    }

    @Override // defpackage.li
    public final void a() {
        if (this.b.u != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.li
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.li
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.li
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.li
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.li
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.li
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.li
    public final void o(boolean z) {
        if (this.b.u == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.li
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sa
            public final /* synthetic */ ua b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                ua uaVar = this.b;
                switch (i2) {
                    case 0:
                        uaVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = uaVar.d;
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
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sa
            public final /* synthetic */ ua b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                ua uaVar = this.b;
                switch (i22) {
                    case 0:
                        uaVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = uaVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new ta(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sa
            public final /* synthetic */ ua b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                ua uaVar = this.b;
                switch (i22) {
                    case 0:
                        uaVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = uaVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new ta(this, i));
    }

    @Override // defpackage.li
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new m1(3, this));
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
