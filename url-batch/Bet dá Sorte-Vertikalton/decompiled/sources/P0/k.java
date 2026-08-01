package P0;

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
import com.glasspulse.glasspulse.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import t0.AbstractC0299a;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f609e;

    /* renamed from: f, reason: collision with root package name */
    public final int f610f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f611g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0025a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f612j;

    /* renamed from: k, reason: collision with root package name */
    public final P.b f613k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f614l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f615m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f616n;

    /* renamed from: o, reason: collision with root package name */
    public long f617o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f618p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f619q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f620r;

    public k(p pVar) {
        super(pVar);
        this.i = new ViewOnClickListenerC0025a(1, this);
        this.f612j = new ViewOnFocusChangeListenerC0026b(this, 1);
        this.f613k = new P.b(this);
        this.f617o = Long.MAX_VALUE;
        this.f610f = u1.l.f0(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f609e = u1.l.f0(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f611g = u1.l.g0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0299a.f3822a);
    }

    @Override // P0.q
    public final void a() {
        if (this.f618p.isTouchExplorationEnabled() && u1.l.M(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new G0.o(3, this));
    }

    @Override // P0.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // P0.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // P0.q
    public final View.OnFocusChangeListener e() {
        return this.f612j;
    }

    @Override // P0.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // P0.q
    public final P.b h() {
        return this.f613k;
    }

    @Override // P0.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // P0.q
    public final boolean j() {
        return this.f614l;
    }

    @Override // P0.q
    public final boolean l() {
        return this.f616n;
    }

    @Override // P0.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: P0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = k.this;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f617o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f615m = false;
                    }
                    kVar.u();
                    kVar.f615m = true;
                    kVar.f617o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: P0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f615m = true;
                kVar.f617o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f647a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!u1.l.M(editText) && this.f618p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f351a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // P0.q
    public final void n(L.j jVar) {
        boolean M2 = u1.l.M(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f464a;
        if (!M2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // P0.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f618p.isEnabled() || u1.l.M(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f616n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f615m = true;
            this.f617o = System.currentTimeMillis();
        }
    }

    @Override // P0.q
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f611g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f610f);
        ofFloat.addUpdateListener(new X(this));
        this.f620r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f609e);
        ofFloat2.addUpdateListener(new X(this));
        this.f619q = ofFloat2;
        ofFloat2.addListener(new Y(1, this));
        this.f618p = (AccessibilityManager) this.f649c.getSystemService("accessibility");
    }

    @Override // P0.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f616n != z2) {
            this.f616n = z2;
            this.f620r.cancel();
            this.f619q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f617o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f615m = false;
        }
        if (this.f615m) {
            this.f615m = false;
            return;
        }
        t(!this.f616n);
        if (!this.f616n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
