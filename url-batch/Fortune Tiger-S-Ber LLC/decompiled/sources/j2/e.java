package j2;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f2303e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2304f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f2305i;

    /* renamed from: j, reason: collision with root package name */
    public final a f2306j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2307k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2308l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f2309m;

    public e(r rVar) {
        super(rVar);
        this.f2306j = new a(this, 0);
        this.f2307k = new b(this, 0);
        this.f2303e = k3.m.Q(rVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f2304f = k3.m.Q(rVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = k3.m.R(rVar.getContext(), R.attr.motionEasingLinearInterpolator, m1.a.f2905a);
        this.h = k3.m.R(rVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, m1.a.f2907d);
    }

    @Override // j2.s
    public final void a() {
        if (this.f2356b.f2349u != null) {
            return;
        }
        s(t());
    }

    @Override // j2.s
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // j2.s
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // j2.s
    public final View.OnFocusChangeListener e() {
        return this.f2307k;
    }

    @Override // j2.s
    public final View.OnClickListener f() {
        return this.f2306j;
    }

    @Override // j2.s
    public final View.OnFocusChangeListener g() {
        return this.f2307k;
    }

    @Override // j2.s
    public final void l(EditText editText) {
        this.f2305i = editText;
        this.f2355a.setEndIconVisible(t());
    }

    @Override // j2.s
    public final void o(boolean z3) {
        if (this.f2356b.f2349u == null) {
            return;
        }
        s(z3);
    }

    @Override // j2.s
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f2304f);
        final int i4 = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f2299b;

            {
                this.f2299b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        e eVar = this.f2299b;
                        eVar.getClass();
                        eVar.f2357d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f2299b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f2357d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i5 = this.f2303e;
        ofFloat2.setDuration(i5);
        final int i6 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f2299b;

            {
                this.f2299b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        e eVar = this.f2299b;
                        eVar.getClass();
                        eVar.f2357d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f2299b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f2357d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2308l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f2308l.addListener(new d(this, i6));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i5);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f2299b;

            {
                this.f2299b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        e eVar = this.f2299b;
                        eVar.getClass();
                        eVar.f2357d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f2299b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f2357d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f2309m = ofFloat3;
        ofFloat3.addListener(new d(this, i4));
    }

    @Override // j2.s
    public final void r() {
        EditText editText = this.f2305i;
        if (editText != null) {
            editText.post(new a2.r(7, this));
        }
    }

    public final void s(boolean z3) {
        boolean z4 = this.f2356b.d() == z3;
        if (z3 && !this.f2308l.isRunning()) {
            this.f2309m.cancel();
            this.f2308l.start();
            if (z4) {
                this.f2308l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f2308l.cancel();
        this.f2309m.start();
        if (z4) {
            this.f2309m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f2305i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f2357d.hasFocus()) && ((this.f2305i.getText().length() > 0) || (this.f2356b.f2349u != null));
    }
}
