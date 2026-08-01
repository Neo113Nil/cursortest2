package Q0;

import M.P;
import M.V;
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
import com.winpower.neonfit.R;
import java.util.WeakHashMap;
import u0.AbstractC0389a;

/* loaded from: classes.dex */
public final class l extends r {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1024f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1025g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f1026h;
    public final ViewOnClickListenerC0030a i;
    public final ViewOnFocusChangeListenerC0031b j;

    /* renamed from: k, reason: collision with root package name */
    public final k f1027k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1028l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1029m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1030n;

    /* renamed from: o, reason: collision with root package name */
    public long f1031o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1032p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1033q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1034r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0030a(i, this);
        this.j = new ViewOnFocusChangeListenerC0031b(this, i);
        this.f1027k = new k(this);
        this.f1031o = Long.MAX_VALUE;
        this.f1024f = H1.l.T(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = H1.l.T(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f1025g = H1.l.U(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0389a.f4369a);
    }

    @Override // Q0.r
    public final void a() {
        if (this.f1032p.isTouchExplorationEnabled() && H1.d.O(this.f1026h) && !this.f1065d.hasFocus()) {
            this.f1026h.dismissDropDown();
        }
        this.f1026h.post(new A0.b(5, this));
    }

    @Override // Q0.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // Q0.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // Q0.r
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // Q0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // Q0.r
    public final k h() {
        return this.f1027k;
    }

    @Override // Q0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // Q0.r
    public final boolean j() {
        return this.f1028l;
    }

    @Override // Q0.r
    public final boolean l() {
        return this.f1030n;
    }

    @Override // Q0.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1026h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: Q0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = l.this;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f1031o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f1029m = false;
                    }
                    lVar.u();
                    lVar.f1029m = true;
                    lVar.f1031o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f1026h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: Q0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f1029m = true;
                lVar.f1031o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.f1026h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1062a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!H1.d.O(editText) && this.f1032p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = P.f711a;
            this.f1065d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // Q0.r
    public final void n(N.i iVar) {
        boolean O2 = H1.d.O(this.f1026h);
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f878a;
        if (!O2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // Q0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1032p.isEnabled() || H1.d.O(this.f1026h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1030n && !this.f1026h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f1029m = true;
            this.f1031o = System.currentTimeMillis();
        }
    }

    @Override // Q0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1025g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1024f);
        ofFloat.addUpdateListener(new V(this));
        this.f1034r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new V(this));
        this.f1033q = ofFloat2;
        ofFloat2.addListener(new I0.i(3, this));
        this.f1032p = (AccessibilityManager) this.f1064c.getSystemService("accessibility");
    }

    @Override // Q0.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f1026h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1026h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f1030n != z2) {
            this.f1030n = z2;
            this.f1034r.cancel();
            this.f1033q.start();
        }
    }

    public final void u() {
        if (this.f1026h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1031o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1029m = false;
        }
        if (this.f1029m) {
            this.f1029m = false;
            return;
        }
        t(!this.f1030n);
        if (!this.f1030n) {
            this.f1026h.dismissDropDown();
        } else {
            this.f1026h.requestFocus();
            this.f1026h.showDropDown();
        }
    }
}
