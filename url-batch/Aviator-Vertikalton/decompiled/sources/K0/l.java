package K0;

import K.C0005c0;
import K.C0007d0;
import K.X;
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
import com.fortuneink.neonpad.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o0.AbstractC0305a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f552e;

    /* renamed from: f, reason: collision with root package name */
    public final int f553f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f554g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0030a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0031b f555j;

    /* renamed from: k, reason: collision with root package name */
    public final k f556k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f557l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f558m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f559n;

    /* renamed from: o, reason: collision with root package name */
    public long f560o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f561p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f562q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f563r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0030a(i, this);
        this.f555j = new ViewOnFocusChangeListenerC0031b(this, i);
        this.f556k = new k(this);
        this.f560o = Long.MAX_VALUE;
        this.f553f = q1.l.f0(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f552e = q1.l.f0(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f554g = q1.l.g0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0305a.f3712a);
    }

    @Override // K0.r
    public final void a() {
        if (this.f561p.isTouchExplorationEnabled() && q1.d.J(this.h) && !this.f595d.hasFocus()) {
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
        return this.f555j;
    }

    @Override // K0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // K0.r
    public final k h() {
        return this.f556k;
    }

    @Override // K0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // K0.r
    public final boolean j() {
        return this.f557l;
    }

    @Override // K0.r
    public final boolean l() {
        return this.f559n;
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
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f560o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f558m = false;
                    }
                    lVar.u();
                    lVar.f558m = true;
                    lVar.f560o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: K0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f558m = true;
                lVar.f560o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f592a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!q1.d.J(editText) && this.f561p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = X.f418a;
            this.f595d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // K0.r
    public final void n(L.j jVar) {
        boolean J2 = q1.d.J(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f665a;
        if (!J2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // K0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f561p.isEnabled() || q1.d.J(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f559n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f558m = true;
            this.f560o = System.currentTimeMillis();
        }
    }

    @Override // K0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f554g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f553f);
        ofFloat.addUpdateListener(new C0005c0(this));
        this.f563r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f552e);
        ofFloat2.addUpdateListener(new C0005c0(this));
        this.f562q = ofFloat2;
        ofFloat2.addListener(new C0007d0(1, this));
        this.f561p = (AccessibilityManager) this.f594c.getSystemService("accessibility");
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
        if (this.f559n != z2) {
            this.f559n = z2;
            this.f563r.cancel();
            this.f562q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f560o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f558m = false;
        }
        if (this.f558m) {
            this.f558m = false;
            return;
        }
        t(!this.f559n);
        if (!this.f559n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
