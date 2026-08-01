package s2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.gdmhkmf.belbet.R;
import com.google.android.material.textfield.TextInputLayout;
import n0.s0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f3254e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3255f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3256g;
    public AutoCompleteTextView h;
    public final o1.e i;

    /* renamed from: j, reason: collision with root package name */
    public final a f3257j;

    /* renamed from: k, reason: collision with root package name */
    public final j f3258k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3259l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3260m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3261n;

    /* renamed from: o, reason: collision with root package name */
    public long f3262o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f3263p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f3264q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f3265r;

    /* JADX WARN: Type inference failed for: r0v2, types: [s2.j] */
    public k(p pVar) {
        super(pVar);
        this.i = new o1.e(3, this);
        this.f3257j = new a(this, 1);
        this.f3258k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: s2.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z4) {
                k kVar = k.this;
                AutoCompleteTextView autoCompleteTextView = kVar.h;
                if (autoCompleteTextView == null || s.a.r(autoCompleteTextView)) {
                    return;
                }
                kVar.d.setImportantForAccessibility(z4 ? 2 : 1);
            }
        };
        this.f3262o = Long.MAX_VALUE;
        this.f3255f = b4.l.V(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f3254e = b4.l.V(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f3256g = b4.l.W(pVar.getContext(), R.attr.motionEasingLinearInterpolator, r1.a.f3205a);
    }

    @Override // s2.q
    public final void a() {
        if (this.f3263p.isTouchExplorationEnabled() && s.a.r(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new a.j(10, this));
    }

    @Override // s2.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // s2.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // s2.q
    public final View.OnFocusChangeListener e() {
        return this.f3257j;
    }

    @Override // s2.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // s2.q
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f3258k;
    }

    @Override // s2.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // s2.q
    public final boolean k() {
        return this.f3261n;
    }

    @Override // s2.q
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: s2.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    k kVar = k.this;
                    long j2 = uptimeMillis - kVar.f3262o;
                    if (j2 < 0 || j2 > 300) {
                        kVar.f3260m = false;
                    }
                    kVar.t();
                    kVar.f3260m = true;
                    kVar.f3262o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: s2.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f3260m = true;
                kVar.f3262o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f3292a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f3263p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // s2.q
    public final void m(o0.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2882a;
        if (!s.a.r(this.h)) {
            gVar.h(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // s2.q
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.f3263p.isEnabled() || s.a.r(this.h)) {
            return;
        }
        boolean z4 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f3261n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z4) {
            t();
            this.f3260m = true;
            this.f3262o = SystemClock.uptimeMillis();
        }
    }

    @Override // s2.q
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3256g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f3255f);
        int i = 1;
        ofFloat.addUpdateListener(new s0(i, this));
        this.f3265r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f3254e);
        ofFloat2.addUpdateListener(new s0(i, this));
        this.f3264q = ofFloat2;
        ofFloat2.addListener(new g2.e(6, this));
        this.f3263p = (AccessibilityManager) this.f3294c.getSystemService("accessibility");
    }

    @Override // s2.q
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z4) {
        if (this.f3261n != z4) {
            this.f3261n = z4;
            this.f3265r.cancel();
            this.f3264q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f3262o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.f3260m = false;
        }
        if (this.f3260m) {
            this.f3260m = false;
            return;
        }
        s(!this.f3261n);
        if (!this.f3261n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
