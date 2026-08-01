package o2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.oriondriftchasers.arordrft.R;
import n0.o0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f2893e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2894f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2895g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f2896h;
    public final com.google.android.material.datepicker.n i;

    /* renamed from: j, reason: collision with root package name */
    public final a f2897j;

    /* renamed from: k, reason: collision with root package name */
    public final j f2898k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2899l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2900m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2901n;

    /* renamed from: o, reason: collision with root package name */
    public long f2902o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2903p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f2904q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f2905r;

    /* JADX WARN: Type inference failed for: r0v2, types: [o2.j] */
    public k(o oVar) {
        super(oVar);
        this.i = new com.google.android.material.datepicker.n(2, this);
        this.f2897j = new a(this, 1);
        this.f2898k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o2.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                k kVar = k.this;
                AutoCompleteTextView autoCompleteTextView = kVar.f2896h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                kVar.d.setImportantForAccessibility(z3 ? 2 : 1);
            }
        };
        this.f2902o = Long.MAX_VALUE;
        this.f2894f = a.y.R(oVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f2893e = a.y.R(oVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f2895g = a.y.S(oVar.getContext(), R.attr.motionEasingLinearInterpolator, o1.a.f2864a);
    }

    @Override // o2.p
    public final void a() {
        if (this.f2903p.isTouchExplorationEnabled() && this.f2896h.getInputType() != 0 && !this.d.hasFocus()) {
            this.f2896h.dismissDropDown();
        }
        this.f2896h.post(new a.j(8, this));
    }

    @Override // o2.p
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // o2.p
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // o2.p
    public final View.OnFocusChangeListener e() {
        return this.f2897j;
    }

    @Override // o2.p
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // o2.p
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f2898k;
    }

    @Override // o2.p
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // o2.p
    public final boolean k() {
        return this.f2901n;
    }

    @Override // o2.p
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f2896h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: o2.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    k kVar = k.this;
                    long j4 = uptimeMillis - kVar.f2902o;
                    if (j4 < 0 || j4 > 300) {
                        kVar.f2900m = false;
                    }
                    kVar.t();
                    kVar.f2900m = true;
                    kVar.f2902o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f2896h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o2.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f2900m = true;
                kVar.f2902o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.f2896h.setThreshold(0);
        TextInputLayout textInputLayout = this.f2931a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f2903p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // o2.p
    public final void m(o0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2861a;
        if (this.f2896h.getInputType() == 0) {
            eVar.i(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 ? accessibilityNodeInfo.isShowingHintText() : eVar.e(4)) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // o2.p
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f2903p.isEnabled() && this.f2896h.getInputType() == 0) {
            boolean z3 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f2901n && !this.f2896h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z3) {
                t();
                this.f2900m = true;
                this.f2902o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // o2.p
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2895g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f2894f);
        int i = 1;
        ofFloat.addUpdateListener(new o0(i, this));
        this.f2905r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f2893e);
        ofFloat2.addUpdateListener(new o0(i, this));
        this.f2904q = ofFloat2;
        ofFloat2.addListener(new j1.k(4, this));
        this.f2903p = (AccessibilityManager) this.f2933c.getSystemService("accessibility");
    }

    @Override // o2.p
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f2896h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f2896h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z3) {
        if (this.f2901n != z3) {
            this.f2901n = z3;
            this.f2905r.cancel();
            this.f2904q.start();
        }
    }

    public final void t() {
        if (this.f2896h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f2902o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.f2900m = false;
        }
        if (this.f2900m) {
            this.f2900m = false;
            return;
        }
        s(!this.f2901n);
        if (!this.f2901n) {
            this.f2896h.dismissDropDown();
        } else {
            this.f2896h.requestFocus();
            this.f2896h.showDropDown();
        }
    }
}
