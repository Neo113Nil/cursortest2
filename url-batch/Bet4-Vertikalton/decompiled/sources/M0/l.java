package M0;

import K.C0001a0;
import K.C0003b0;
import K.T;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.playbag.tripgear.R;
import java.util.WeakHashMap;
import q0.AbstractC0289a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f585e;

    /* renamed from: f, reason: collision with root package name */
    public final int f586f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f587g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0028a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0029b f588j;

    /* renamed from: k, reason: collision with root package name */
    public final k f589k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f590l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f591m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f592n;

    /* renamed from: o, reason: collision with root package name */
    public long f593o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f594p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f595q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f596r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0028a(i, this);
        this.f588j = new ViewOnFocusChangeListenerC0029b(this, i);
        this.f589k = new k(this);
        this.f593o = Long.MAX_VALUE;
        this.f586f = w1.d.g0(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f585e = w1.d.g0(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f587g = w1.d.h0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0289a.f3498a);
    }

    @Override // M0.r
    public final void a() {
        if (this.f594p.isTouchExplorationEnabled() && w1.d.S(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new D0.p(3, this));
    }

    @Override // M0.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // M0.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // M0.r
    public final View.OnFocusChangeListener e() {
        return this.f588j;
    }

    @Override // M0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // M0.r
    public final k h() {
        return this.f589k;
    }

    @Override // M0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // M0.r
    public final boolean j() {
        return this.f590l;
    }

    @Override // M0.r
    public final boolean l() {
        return this.f592n;
    }

    @Override // M0.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: M0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = l.this;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f593o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f591m = false;
                    }
                    lVar.u();
                    lVar.f591m = true;
                    lVar.f593o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: M0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f591m = true;
                lVar.f593o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f623a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!w1.d.S(editText) && this.f594p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = T.f423a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // M0.r
    public final void n(L.j jVar) {
        if (!w1.d.S(this.h)) {
            jVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f544a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // M0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f594p.isEnabled() || w1.d.S(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f592n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f591m = true;
            this.f593o = System.currentTimeMillis();
        }
    }

    @Override // M0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1530C0, 1.0f);
        TimeInterpolator timeInterpolator = this.f587g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f586f);
        ofFloat.addUpdateListener(new C0001a0(this));
        this.f596r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1530C0);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f585e);
        ofFloat2.addUpdateListener(new C0001a0(this));
        this.f595q = ofFloat2;
        ofFloat2.addListener(new C0003b0(1, this));
        this.f594p = (AccessibilityManager) this.f625c.getSystemService("accessibility");
    }

    @Override // M0.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f592n != z2) {
            this.f592n = z2;
            this.f596r.cancel();
            this.f595q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f593o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f591m = false;
        }
        if (this.f591m) {
            this.f591m = false;
            return;
        }
        t(!this.f592n);
        if (!this.f592n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
