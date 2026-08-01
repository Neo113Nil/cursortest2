package L0;

import K.S;
import K.X;
import K.Y;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.playgen.securelock.R;
import java.util.WeakHashMap;
import p0.AbstractC0281a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f522e;

    /* renamed from: f, reason: collision with root package name */
    public final int f523f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f524g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0025a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f525j;

    /* renamed from: k, reason: collision with root package name */
    public final k f526k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f527l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f528m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f529n;

    /* renamed from: o, reason: collision with root package name */
    public long f530o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f531p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f532q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f533r;

    public l(q qVar) {
        super(qVar);
        this.i = new ViewOnClickListenerC0025a(1, this);
        this.f525j = new ViewOnFocusChangeListenerC0026b(this, 1);
        this.f526k = new k(this);
        this.f530o = Long.MAX_VALUE;
        this.f523f = u1.l.U(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f522e = u1.l.U(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f524g = u1.l.V(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0281a.f3380a);
    }

    @Override // L0.r
    public final void a() {
        if (this.f531p.isTouchExplorationEnabled() && u1.l.F(this.h) && !this.d.hasFocus()) {
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
        return this.f525j;
    }

    @Override // L0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // L0.r
    public final k h() {
        return this.f526k;
    }

    @Override // L0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // L0.r
    public final boolean j() {
        return this.f527l;
    }

    @Override // L0.r
    public final boolean l() {
        return this.f529n;
    }

    @Override // L0.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new i(0, this));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: L0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f528m = true;
                lVar.f530o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f560a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!u1.l.F(editText) && this.f531p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f369a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // L0.r
    public final void n(L.j jVar) {
        boolean F = u1.l.F(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f488a;
        if (!F) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // L0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f531p.isEnabled() || u1.l.F(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f529n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f528m = true;
            this.f530o = System.currentTimeMillis();
        }
    }

    @Override // L0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f524g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f523f);
        ofFloat.addUpdateListener(new X(this));
        this.f533r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f522e);
        ofFloat2.addUpdateListener(new X(this));
        this.f532q = ofFloat2;
        ofFloat2.addListener(new Y(1, this));
        this.f531p = (AccessibilityManager) this.f562c.getSystemService("accessibility");
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
        if (this.f529n != z2) {
            this.f529n = z2;
            this.f533r.cancel();
            this.f532q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f530o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f528m = false;
        }
        if (this.f528m) {
            this.f528m = false;
            return;
        }
        t(!this.f529n);
        if (!this.f529n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
