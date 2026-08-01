package K0;

import K.T;
import K.Y;
import K.Z;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.quicktoss.winflip.R;
import java.util.WeakHashMap;
import o0.AbstractC0280a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f502e;

    /* renamed from: f, reason: collision with root package name */
    public final int f503f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f504g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0026a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0027b f505j;

    /* renamed from: k, reason: collision with root package name */
    public final k f506k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f507l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f508m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f509n;

    /* renamed from: o, reason: collision with root package name */
    public long f510o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f511p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f512q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f513r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0026a(i, this);
        this.f505j = new ViewOnFocusChangeListenerC0027b(this, i);
        this.f506k = new k(this);
        this.f510o = Long.MAX_VALUE;
        this.f503f = q1.l.Q(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f502e = q1.l.Q(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f504g = q1.l.R(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0280a.f3355a);
    }

    @Override // K0.r
    public final void a() {
        if (this.f511p.isTouchExplorationEnabled() && q1.l.D(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new B0.q(3, this));
    }

    @Override // K0.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // K0.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // K0.r
    public final View.OnFocusChangeListener e() {
        return this.f505j;
    }

    @Override // K0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // K0.r
    public final k h() {
        return this.f506k;
    }

    @Override // K0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // K0.r
    public final boolean j() {
        return this.f507l;
    }

    @Override // K0.r
    public final boolean l() {
        return this.f509n;
    }

    @Override // K0.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: K0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = l.this;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f510o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f508m = false;
                    }
                    lVar.u();
                    lVar.f508m = true;
                    lVar.f510o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: K0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f508m = true;
                lVar.f510o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f540a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!q1.l.D(editText) && this.f511p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = T.f381a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // K0.r
    public final void n(L.j jVar) {
        boolean D2 = q1.l.D(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f608a;
        if (!D2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // K0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f511p.isEnabled() || q1.l.D(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f509n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f508m = true;
            this.f510o = System.currentTimeMillis();
        }
    }

    @Override // K0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f504g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f503f);
        ofFloat.addUpdateListener(new Y(this));
        this.f513r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f502e);
        ofFloat2.addUpdateListener(new Y(this));
        this.f512q = ofFloat2;
        ofFloat2.addListener(new Z(1, this));
        this.f511p = (AccessibilityManager) this.f542c.getSystemService("accessibility");
    }

    @Override // K0.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f509n != z2) {
            this.f509n = z2;
            this.f513r.cancel();
            this.f512q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f510o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f508m = false;
        }
        if (this.f508m) {
            this.f508m = false;
            return;
        }
        t(!this.f509n);
        if (!this.f509n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
