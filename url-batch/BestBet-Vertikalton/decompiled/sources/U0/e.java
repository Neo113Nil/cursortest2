package U0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import com.google.android.material.internal.CheckableImageButton;
import y0.AbstractC0395a;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f1138e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1139f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1140g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0031a f1141j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0032b f1142k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1143l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1144m;

    public e(p pVar) {
        super(pVar);
        this.f1141j = new ViewOnClickListenerC0031a(0, this);
        this.f1142k = new ViewOnFocusChangeListenerC0032b(this, 0);
        this.f1138e = H1.l.b0(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f1139f = H1.l.b0(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f1140g = H1.l.c0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0395a.f4570a);
        this.h = H1.l.c0(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0395a.d);
    }

    @Override // U0.q
    public final void a() {
        if (this.f1190b.f1182p != null) {
            return;
        }
        t(u());
    }

    @Override // U0.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // U0.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // U0.q
    public final View.OnFocusChangeListener e() {
        return this.f1142k;
    }

    @Override // U0.q
    public final View.OnClickListener f() {
        return this.f1141j;
    }

    @Override // U0.q
    public final View.OnFocusChangeListener g() {
        return this.f1142k;
    }

    @Override // U0.q
    public final void m(EditText editText) {
        this.i = editText;
        this.f1189a.setEndIconVisible(u());
    }

    @Override // U0.q
    public final void p(boolean z2) {
        if (this.f1190b.f1182p == null) {
            return;
        }
        t(z2);
    }

    @Override // U0.q
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f1139f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: U0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1135b;

            {
                this.f1135b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        e eVar = this.f1135b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f1135b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.f1937A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f1140g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f1138e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: U0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1135b;

            {
                this.f1135b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f1135b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f1135b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1143l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1143l.addListener(new d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1937A0);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: U0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1135b;

            {
                this.f1135b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f1135b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f1135b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f1144m = ofFloat3;
        ofFloat3.addListener(new d(this, i));
    }

    @Override // U0.q
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new E0.b(4, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f1190b.d() == z2;
        if (z2 && !this.f1143l.isRunning()) {
            this.f1144m.cancel();
            this.f1143l.start();
            if (z3) {
                this.f1143l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f1143l.cancel();
        this.f1144m.start();
        if (z3) {
            this.f1144m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
