package N0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.winfour.winrandom.R;
import r0.AbstractC0292a;

/* renamed from: N0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f643e;

    /* renamed from: f, reason: collision with root package name */
    public final int f644f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f645g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f646h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0028a f647j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0029b f648k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f649l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f650m;

    public C0032e(q qVar) {
        super(qVar);
        this.f647j = new ViewOnClickListenerC0028a(0, this);
        this.f648k = new ViewOnFocusChangeListenerC0029b(this, 0);
        this.f643e = A1.m.Z(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f644f = A1.m.Z(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f645g = A1.m.a0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0292a.f3566a);
        this.f646h = A1.m.a0(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0292a.d);
    }

    @Override // N0.r
    public final void a() {
        if (this.f699b.f691p != null) {
            return;
        }
        t(u());
    }

    @Override // N0.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // N0.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // N0.r
    public final View.OnFocusChangeListener e() {
        return this.f648k;
    }

    @Override // N0.r
    public final View.OnClickListener f() {
        return this.f647j;
    }

    @Override // N0.r
    public final View.OnFocusChangeListener g() {
        return this.f648k;
    }

    @Override // N0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f698a.setEndIconVisible(u());
    }

    @Override // N0.r
    public final void p(boolean z2) {
        if (this.f699b.f691p == null) {
            return;
        }
        t(z2);
    }

    @Override // N0.r
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f646h);
        ofFloat.setDuration(this.f644f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f640b;

            {
                this.f640b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0032e c0032e = this.f640b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f640b;
                        c0032e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0032e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f645g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f643e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f640b;

            {
                this.f640b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0032e c0032e = this.f640b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f640b;
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
        this.f649l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f649l.addListener(new C0031d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.A0);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0032e f640b;

            {
                this.f640b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0032e c0032e = this.f640b;
                        c0032e.getClass();
                        c0032e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0032e c0032e2 = this.f640b;
                        c0032e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0032e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f650m = ofFloat3;
        ofFloat3.addListener(new C0031d(this, i));
    }

    @Override // N0.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new A.a(3, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f699b.d() == z2;
        if (z2 && !this.f649l.isRunning()) {
            this.f650m.cancel();
            this.f649l.start();
            if (z3) {
                this.f649l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f649l.cancel();
        this.f650m.start();
        if (z3) {
            this.f650m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
