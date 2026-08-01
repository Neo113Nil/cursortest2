package N0;

import L.C0001a0;
import L.C0003b0;
import L.T;
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
import com.winfour.winrandom.R;
import java.util.WeakHashMap;
import r0.AbstractC0292a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f659f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f660g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f661h;
    public final ViewOnClickListenerC0028a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0029b f662j;

    /* renamed from: k, reason: collision with root package name */
    public final k f663k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f664l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f665m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f666n;

    /* renamed from: o, reason: collision with root package name */
    public long f667o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f668p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f669q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f670r;

    public l(q qVar) {
        super(qVar);
        this.i = new ViewOnClickListenerC0028a(1, this);
        this.f662j = new ViewOnFocusChangeListenerC0029b(this, 1);
        this.f663k = new k(this);
        this.f667o = Long.MAX_VALUE;
        this.f659f = A1.m.Z(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f658e = A1.m.Z(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f660g = A1.m.a0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0292a.f3566a);
    }

    @Override // N0.r
    public final void a() {
        if (this.f668p.isTouchExplorationEnabled() && A1.m.I(this.f661h) && !this.d.hasFocus()) {
            this.f661h.dismissDropDown();
        }
        this.f661h.post(new A.a(4, this));
    }

    @Override // N0.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // N0.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // N0.r
    public final View.OnFocusChangeListener e() {
        return this.f662j;
    }

    @Override // N0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // N0.r
    public final k h() {
        return this.f663k;
    }

    @Override // N0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // N0.r
    public final boolean j() {
        return this.f664l;
    }

    @Override // N0.r
    public final boolean l() {
        return this.f666n;
    }

    @Override // N0.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f661h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: N0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = l.this;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f667o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f665m = false;
                    }
                    lVar.u();
                    lVar.f665m = true;
                    lVar.f667o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f661h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: N0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f665m = true;
                lVar.f667o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.f661h.setThreshold(0);
        TextInputLayout textInputLayout = this.f698a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!A1.m.I(editText) && this.f668p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = T.f490a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // N0.r
    public final void n(M.j jVar) {
        if (!A1.m.I(this.f661h)) {
            jVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f615a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // N0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f668p.isEnabled() || A1.m.I(this.f661h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f666n && !this.f661h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f665m = true;
            this.f667o = System.currentTimeMillis();
        }
    }

    @Override // N0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f660g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f659f);
        ofFloat.addUpdateListener(new C0001a0(this));
        this.f670r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.A0);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f658e);
        ofFloat2.addUpdateListener(new C0001a0(this));
        this.f669q = ofFloat2;
        ofFloat2.addListener(new C0003b0(1, this));
        this.f668p = (AccessibilityManager) this.f700c.getSystemService("accessibility");
    }

    @Override // N0.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f661h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f661h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f666n != z2) {
            this.f666n = z2;
            this.f670r.cancel();
            this.f669q.start();
        }
    }

    public final void u() {
        if (this.f661h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f667o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f665m = false;
        }
        if (this.f665m) {
            this.f665m = false;
            return;
        }
        t(!this.f666n);
        if (!this.f666n) {
            this.f661h.dismissDropDown();
        } else {
            this.f661h.requestFocus();
            this.f661h.showDropDown();
        }
    }
}
