package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqe extends fqt {
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    public fqe(fqs fqsVar) {
        super(fqsVar);
        this.j = new cx(this, 14, null);
        this.k = new fql(this, 1);
        this.b = fny.i(fqsVar.getContext(), R.attr.motionDurationShort3, 100);
        this.c = fny.i(fqsVar.getContext(), R.attr.motionDurationShort3, 150);
        this.d = fny.p(fqsVar.getContext(), R.attr.motionEasingLinearInterpolator, fes.a);
        this.i = fny.p(fqsVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, fes.d);
    }

    private final ValueAnimator m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.d);
        ofFloat.setDuration(this.b);
        ofFloat.addUpdateListener(new mu(this, 19, null));
        return ofFloat;
    }

    @Override // defpackage.fqt
    public final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.fqt
    public final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.fqt
    public final View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.fqt
    public final View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.fqt
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean s = this.f.s();
        AnimatorSet animatorSet = this.l;
        if (!z) {
            animatorSet.cancel();
            this.m.start();
            if (s) {
                return;
            }
            this.m.end();
            return;
        }
        if (animatorSet.isRunning()) {
            return;
        }
        this.m.cancel();
        this.l.start();
        if (s) {
            this.l.end();
        }
    }

    @Override // defpackage.fqt
    public final void g(EditText editText) {
        this.a = editText;
        this.e.j(k());
    }

    @Override // defpackage.fqt
    public final void h(boolean z) {
        if (this.f.h == null) {
            return;
        }
        f(z);
    }

    @Override // defpackage.fqt
    public final void i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.i);
        ofFloat.setDuration(this.c);
        ofFloat.addUpdateListener(new mu(this, 20, null));
        ValueAnimator m = m(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, m);
        this.l.addListener(new fqc(this));
        ValueAnimator m2 = m(1.0f, 0.0f);
        this.m = m2;
        m2.addListener(new fqd(this));
    }

    @Override // defpackage.fqt
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.post(new fnh(this, 7));
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText == null) {
            return false;
        }
        boolean z = editText.hasFocus() || this.h.hasFocus();
        int length = this.a.getText().length();
        CharSequence charSequence = this.f.h;
        if (z) {
            return length > 0 || charSequence != null;
        }
        return false;
    }

    @Override // defpackage.fqt
    public final void l() {
        if (this.f.h != null) {
            return;
        }
        f(k());
    }
}
