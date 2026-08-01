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
import com.neonpulse.gridlogic.R;
import java.util.WeakHashMap;
import p0.AbstractC0280a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f574e;

    /* renamed from: f, reason: collision with root package name */
    public final int f575f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f576g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0025a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f577j;

    /* renamed from: k, reason: collision with root package name */
    public final k f578k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f579l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f580m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f581n;

    /* renamed from: o, reason: collision with root package name */
    public long f582o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f583p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f584q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f585r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0025a(i, this);
        this.f577j = new ViewOnFocusChangeListenerC0026b(this, i);
        this.f578k = new k(this);
        this.f582o = Long.MAX_VALUE;
        this.f575f = x1.d.Z(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f574e = x1.d.Z(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f576g = x1.d.a0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0280a.f3286a);
    }

    @Override // L0.r
    public final void a() {
        if (this.f583p.isTouchExplorationEnabled() && x1.d.I(this.h) && !this.d.hasFocus()) {
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
        return this.f577j;
    }

    @Override // L0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // L0.r
    public final k h() {
        return this.f578k;
    }

    @Override // L0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // L0.r
    public final boolean j() {
        return this.f579l;
    }

    @Override // L0.r
    public final boolean l() {
        return this.f581n;
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
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f582o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f580m = false;
                    }
                    lVar.u();
                    lVar.f580m = true;
                    lVar.f582o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: L0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f580m = true;
                lVar.f582o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f612a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!x1.d.I(editText) && this.f583p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f422a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // L0.r
    public final void n(L.j jVar) {
        boolean I2 = x1.d.I(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f541a;
        if (!I2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // L0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f583p.isEnabled() || x1.d.I(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f581n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f580m = true;
            this.f582o = System.currentTimeMillis();
        }
    }

    @Override // L0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f576g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f575f);
        ofFloat.addUpdateListener(new X(this));
        this.f585r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f574e);
        ofFloat2.addUpdateListener(new X(this));
        this.f584q = ofFloat2;
        ofFloat2.addListener(new Y(1, this));
        this.f583p = (AccessibilityManager) this.f614c.getSystemService("accessibility");
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
        if (this.f581n != z2) {
            this.f581n = z2;
            this.f585r.cancel();
            this.f584q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f582o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f580m = false;
        }
        if (this.f580m) {
            this.f580m = false;
            return;
        }
        t(!this.f581n);
        if (!this.f581n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
