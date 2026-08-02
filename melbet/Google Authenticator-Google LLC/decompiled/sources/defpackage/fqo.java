package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqo extends fqt {
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View.OnClickListener l;
    private final View.OnFocusChangeListener m;
    private final AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;

    public fqo(fqs fqsVar) {
        super(fqsVar);
        this.l = new cx(this, 15, null);
        this.m = new fql(this, 0);
        this.n = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: fqm
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                fqo fqoVar = fqo.this;
                AutoCompleteTextView autoCompleteTextView = fqoVar.a;
                if (autoCompleteTextView == null || fhq.t(autoCompleteTextView)) {
                    return;
                }
                fqoVar.h.setImportantForAccessibility(true == z ? 2 : 1);
            }
        };
        this.p = Long.MAX_VALUE;
        this.j = fny.i(fqsVar.getContext(), R.attr.motionDurationShort3, 67);
        this.i = fny.i(fqsVar.getContext(), R.attr.motionDurationShort3, 50);
        this.k = fny.p(fqsVar.getContext(), R.attr.motionEasingLinearInterpolator, fes.a);
    }

    private final ValueAnimator z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.k);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fqj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                fqo.this.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    @Override // defpackage.fqt
    public final AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.fqt
    public final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.fqt
    public final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.fqt
    public final View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.fqt
    public final View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.fqt
    public final void g(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.a = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new drk(this, 4));
        this.a.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: fqk
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                fqo fqoVar = fqo.this;
                fqoVar.n();
                fqoVar.k(false);
            }
        });
        this.a.setThreshold(0);
        TextInputLayout textInputLayout = this.e;
        textInputLayout.b.n(null);
        if (!fhq.t(editText) && this.q.isTouchExplorationEnabled()) {
            this.h.setImportantForAccessibility(2);
        }
        textInputLayout.j(true);
    }

    @Override // defpackage.fqt
    public final void i() {
        this.d = z(this.j, 0.0f, 1.0f);
        ValueAnimator z = z(this.i, 1.0f, 0.0f);
        this.r = z;
        z.addListener(new fqn(this));
        this.q = (AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.fqt
    public final void j() {
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.cancel();
            this.r.start();
        }
    }

    @Override // defpackage.fqt
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && fhq.t(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new fnh(this, 8));
    }

    public final void m() {
        if (this.a == null) {
            return;
        }
        if (p()) {
            this.c = false;
        }
        if (this.c) {
            this.c = false;
            return;
        }
        k(!this.o);
        boolean z = this.o;
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.a.showDropDown();
        }
    }

    public final void n() {
        this.c = true;
        this.p = SystemClock.uptimeMillis();
    }

    @Override // defpackage.fqt
    public final boolean o(int i) {
        return i != 0;
    }

    public final boolean p() {
        long uptimeMillis = SystemClock.uptimeMillis() - this.p;
        return uptimeMillis < 0 || uptimeMillis > 300;
    }

    @Override // defpackage.fqt
    public final boolean q() {
        return true;
    }

    @Override // defpackage.fqt
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.fqt
    public final boolean s() {
        return true;
    }

    @Override // defpackage.fqt
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.fqt
    public final boolean u() {
        return true;
    }

    @Override // defpackage.fqt
    public final void v(aah aahVar) {
        boolean isShowingHintText;
        if (!fhq.t(this.a)) {
            aahVar.o(Spinner.class.getName());
        }
        isShowingHintText = aahVar.a.isShowingHintText();
        if (isShowingHintText) {
            aahVar.x(null);
        }
    }

    @Override // defpackage.fqt
    public final void w(AccessibilityEvent accessibilityEvent) {
        if (!this.q.isEnabled() || fhq.t(this.a)) {
            return;
        }
        boolean z = false;
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.o && !this.a.isPopupShowing()) {
            z = true;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            m();
            n();
        }
    }
}
