package L0;

import K.S;
import K.X;
import K.Y;
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
import com.visualfortune.eyerest.R;
import java.util.WeakHashMap;
import p0.AbstractC0278a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f510e;

    /* renamed from: f, reason: collision with root package name */
    public final int f511f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f512g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0025a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f513j;

    /* renamed from: k, reason: collision with root package name */
    public final k f514k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f515l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f516m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f517n;

    /* renamed from: o, reason: collision with root package name */
    public long f518o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f519p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f520q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f521r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0025a(i, this);
        this.f513j = new ViewOnFocusChangeListenerC0026b(this, i);
        this.f514k = new k(this);
        this.f518o = Long.MAX_VALUE;
        this.f511f = s1.l.U(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f510e = s1.l.U(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f512g = s1.l.V(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0278a.f3455a);
    }

    @Override // L0.r
    public final void a() {
        if (this.f519p.isTouchExplorationEnabled() && s1.l.H(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new C0.p(3, this));
    }

    @Override // L0.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // L0.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // L0.r
    public final View.OnFocusChangeListener e() {
        return this.f513j;
    }

    @Override // L0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // L0.r
    public final k h() {
        return this.f514k;
    }

    @Override // L0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // L0.r
    public final boolean j() {
        return this.f515l;
    }

    @Override // L0.r
    public final boolean l() {
        return this.f517n;
    }

    @Override // L0.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: L0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = l.this;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f518o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f516m = false;
                    }
                    lVar.u();
                    lVar.f516m = true;
                    lVar.f518o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: L0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f516m = true;
                lVar.f518o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f548a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!s1.l.H(editText) && this.f519p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f362a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // L0.r
    public final void n(L.j jVar) {
        boolean H2 = s1.l.H(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f477a;
        if (!H2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // L0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f519p.isEnabled() || s1.l.H(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f517n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f516m = true;
            this.f518o = System.currentTimeMillis();
        }
    }

    @Override // L0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f512g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f511f);
        ofFloat.addUpdateListener(new X(this));
        this.f521r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f510e);
        ofFloat2.addUpdateListener(new X(this));
        this.f520q = ofFloat2;
        ofFloat2.addListener(new Y(1, this));
        this.f519p = (AccessibilityManager) this.f550c.getSystemService("accessibility");
    }

    @Override // L0.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f517n != z2) {
            this.f517n = z2;
            this.f521r.cancel();
            this.f520q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f518o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f516m = false;
        }
        if (this.f516m) {
            this.f516m = false;
            return;
        }
        t(!this.f517n);
        if (!this.f517n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
