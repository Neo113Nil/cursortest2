package R0;

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
import com.clutchquizarena.app.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import v0.AbstractC0372a;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f671e;

    /* renamed from: f, reason: collision with root package name */
    public final int f672f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f673g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0025a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f674j;

    /* renamed from: k, reason: collision with root package name */
    public final P.b f675k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f676l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f677m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f678n;

    /* renamed from: o, reason: collision with root package name */
    public long f679o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f680p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f681q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f682r;

    public k(p pVar) {
        super(pVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0025a(i, this);
        this.f674j = new ViewOnFocusChangeListenerC0026b(this, i);
        this.f675k = new P.b(this);
        this.f679o = Long.MAX_VALUE;
        this.f672f = A.c.w0(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f671e = A.c.w0(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f673g = A.c.x0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0372a.f3981a);
    }

    @Override // R0.q
    public final void a() {
        if (this.f680p.isTouchExplorationEnabled() && A.c.b0(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new B0.b(4, this));
    }

    @Override // R0.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // R0.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // R0.q
    public final View.OnFocusChangeListener e() {
        return this.f674j;
    }

    @Override // R0.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // R0.q
    public final P.b h() {
        return this.f675k;
    }

    @Override // R0.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // R0.q
    public final boolean j() {
        return this.f676l;
    }

    @Override // R0.q
    public final boolean l() {
        return this.f678n;
    }

    @Override // R0.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: R0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = k.this;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f679o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f677m = false;
                    }
                    kVar.u();
                    kVar.f677m = true;
                    kVar.f679o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: R0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f677m = true;
                kVar.f679o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f709a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!A.c.b0(editText) && this.f680p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f365a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // R0.q
    public final void n(L.k kVar) {
        boolean b02 = A.c.b0(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f477a;
        if (!b02) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // R0.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f680p.isEnabled() || A.c.b0(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f678n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f677m = true;
            this.f679o = System.currentTimeMillis();
        }
    }

    @Override // R0.q
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f673g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f672f);
        ofFloat.addUpdateListener(new X(this));
        this.f682r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f671e);
        ofFloat2.addUpdateListener(new X(this));
        this.f681q = ofFloat2;
        ofFloat2.addListener(new Y(1, this));
        this.f680p = (AccessibilityManager) this.f711c.getSystemService("accessibility");
    }

    @Override // R0.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f678n != z2) {
            this.f678n = z2;
            this.f682r.cancel();
            this.f681q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f679o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f677m = false;
        }
        if (this.f677m) {
            this.f677m = false;
            return;
        }
        t(!this.f678n);
        if (!this.f678n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
