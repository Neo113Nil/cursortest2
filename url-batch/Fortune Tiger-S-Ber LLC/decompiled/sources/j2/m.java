package j2;

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
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f2318e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2319f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;

    /* renamed from: i, reason: collision with root package name */
    public final a f2320i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2321j;

    /* renamed from: k, reason: collision with root package name */
    public final l f2322k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2323l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2324m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2325n;

    /* renamed from: o, reason: collision with root package name */
    public long f2326o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2327p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f2328q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f2329r;

    /* JADX WARN: Type inference failed for: r0v2, types: [j2.l] */
    public m(r rVar) {
        super(rVar);
        this.f2320i = new a(this, 1);
        this.f2321j = new b(this, 1);
        this.f2322k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: j2.l
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                m mVar = m.this;
                AutoCompleteTextView autoCompleteTextView = mVar.h;
                if (autoCompleteTextView == null || k3.m.C(autoCompleteTextView)) {
                    return;
                }
                mVar.f2357d.setImportantForAccessibility(z3 ? 2 : 1);
            }
        };
        this.f2326o = Long.MAX_VALUE;
        this.f2319f = k3.m.Q(rVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f2318e = k3.m.Q(rVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = k3.m.R(rVar.getContext(), R.attr.motionEasingLinearInterpolator, m1.a.f2905a);
    }

    @Override // j2.s
    public final void a() {
        if (this.f2327p.isTouchExplorationEnabled() && k3.m.C(this.h) && !this.f2357d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new a2.r(8, this));
    }

    @Override // j2.s
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // j2.s
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // j2.s
    public final View.OnFocusChangeListener e() {
        return this.f2321j;
    }

    @Override // j2.s
    public final View.OnClickListener f() {
        return this.f2320i;
    }

    @Override // j2.s
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f2322k;
    }

    @Override // j2.s
    public final boolean i(int i4) {
        return i4 != 0;
    }

    @Override // j2.s
    public final boolean k() {
        return this.f2325n;
    }

    @Override // j2.s
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: j2.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    m mVar = m.this;
                    long j4 = uptimeMillis - mVar.f2326o;
                    if (j4 < 0 || j4 > 300) {
                        mVar.f2324m = false;
                    }
                    mVar.t();
                    mVar.f2324m = true;
                    mVar.f2326o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: j2.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                m mVar = m.this;
                mVar.f2324m = true;
                mVar.f2326o = SystemClock.uptimeMillis();
                mVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f2355a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f2327p.isTouchExplorationEnabled()) {
            this.f2357d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // j2.s
    public final void m(l0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
        if (!k3.m.C(this.h)) {
            eVar.g(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // j2.s
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.f2327p.isEnabled() || k3.m.C(this.h)) {
            return;
        }
        boolean z3 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f2325n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z3) {
            t();
            this.f2324m = true;
            this.f2326o = SystemClock.uptimeMillis();
        }
    }

    @Override // j2.s
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f2319f);
        ofFloat.addUpdateListener(new i(this));
        this.f2329r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f2318e);
        ofFloat2.addUpdateListener(new i(this));
        this.f2328q = ofFloat2;
        ofFloat2.addListener(new f1.k(2, this));
        this.f2327p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // j2.s
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z3) {
        if (this.f2325n != z3) {
            this.f2325n = z3;
            this.f2329r.cancel();
            this.f2328q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f2326o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.f2324m = false;
        }
        if (this.f2324m) {
            this.f2324m = false;
            return;
        }
        s(!this.f2325n);
        if (!this.f2325n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
