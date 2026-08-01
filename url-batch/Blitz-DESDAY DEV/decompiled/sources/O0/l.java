package O0;

import M.Q;
import M.W;
import M.X;
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
import com.winfour.neondrop.R;
import java.util.WeakHashMap;
import r0.AbstractC0260a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f672e;

    /* renamed from: f, reason: collision with root package name */
    public final int f673f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f674g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0025a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f675j;

    /* renamed from: k, reason: collision with root package name */
    public final k f676k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f677l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f678m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f679n;

    /* renamed from: o, reason: collision with root package name */
    public long f680o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f681p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f682q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f683r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0025a(i, this);
        this.f675j = new ViewOnFocusChangeListenerC0026b(this, i);
        this.f676k = new k(this);
        this.f680o = Long.MAX_VALUE;
        this.f673f = z1.l.m0(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f672e = z1.l.m0(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f674g = z1.l.n0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0260a.f3420a);
    }

    @Override // O0.r
    public final void a() {
        if (this.f681p.isTouchExplorationEnabled() && z1.l.V(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new B.a(4, this));
    }

    @Override // O0.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // O0.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // O0.r
    public final View.OnFocusChangeListener e() {
        return this.f675j;
    }

    @Override // O0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // O0.r
    public final k h() {
        return this.f676k;
    }

    @Override // O0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // O0.r
    public final boolean j() {
        return this.f677l;
    }

    @Override // O0.r
    public final boolean l() {
        return this.f679n;
    }

    @Override // O0.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: O0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = l.this;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f680o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f678m = false;
                    }
                    lVar.u();
                    lVar.f678m = true;
                    lVar.f680o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: O0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f678m = true;
                lVar.f680o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f710a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!z1.l.V(editText) && this.f681p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = Q.f513a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // O0.r
    public final void n(N.j jVar) {
        boolean V2 = z1.l.V(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f631a;
        if (!V2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // O0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f681p.isEnabled() || z1.l.V(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f679n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f678m = true;
            this.f680o = System.currentTimeMillis();
        }
    }

    @Override // O0.r
    public final void r() {
        int i = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f674g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f673f);
        ofFloat.addUpdateListener(new W(i, this));
        this.f683r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f672e);
        ofFloat2.addUpdateListener(new W(i, this));
        this.f682q = ofFloat2;
        ofFloat2.addListener(new X(1, this));
        this.f681p = (AccessibilityManager) this.f712c.getSystemService("accessibility");
    }

    @Override // O0.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f679n != z2) {
            this.f679n = z2;
            this.f683r.cancel();
            this.f682q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f680o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f678m = false;
        }
        if (this.f678m) {
            this.f678m = false;
            return;
        }
        t(!this.f679n);
        if (!this.f679n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
