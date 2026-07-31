package z5;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f9186e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9187f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f9188g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f9189h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final a f9190j;

    /* renamed from: k, reason: collision with root package name */
    public final b f9191k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f9192l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f9193m;

    public e(o oVar) {
        super(oVar);
        this.f9190j = new a(this, 0);
        this.f9191k = new b(this, 0);
        this.f9186e = r2.r.Q(oVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f9187f = r2.r.Q(oVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f9188g = r2.r.R(oVar.getContext(), R.attr.motionEasingLinearInterpolator, g5.a.f3031a);
        this.f9189h = r2.r.R(oVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, g5.a.f3034d);
    }

    @Override // z5.p
    public final void a() {
        if (this.f9239b.f9231s != null) {
            return;
        }
        s(t());
    }

    @Override // z5.p
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // z5.p
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // z5.p
    public final View.OnFocusChangeListener e() {
        return this.f9191k;
    }

    @Override // z5.p
    public final View.OnClickListener f() {
        return this.f9190j;
    }

    @Override // z5.p
    public final View.OnFocusChangeListener g() {
        return this.f9191k;
    }

    @Override // z5.p
    public final void l(EditText editText) {
        this.i = editText;
        this.f9238a.setEndIconVisible(t());
    }

    @Override // z5.p
    public final void o(boolean z3) {
        if (this.f9239b.f9231s == null) {
            return;
        }
        s(z3);
    }

    @Override // z5.p
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f9189h);
        ofFloat.setDuration(this.f9187f);
        ofFloat.addUpdateListener(new c(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f9188g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i = this.f9186e;
        ofFloat2.setDuration(i);
        ofFloat2.addUpdateListener(new c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9192l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f9192l.addListener(new d(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i);
        ofFloat3.addUpdateListener(new c(this, 0));
        this.f9193m = ofFloat3;
        ofFloat3.addListener(new d(this, 1));
    }

    @Override // z5.p
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new a1.a(14, this));
        }
    }

    public final void s(boolean z3) {
        boolean z7 = this.f9239b.d() == z3;
        if (z3 && !this.f9192l.isRunning()) {
            this.f9193m.cancel();
            this.f9192l.start();
            if (z7) {
                this.f9192l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f9192l.cancel();
        this.f9193m.start();
        if (z7) {
            this.f9193m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f9241d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
