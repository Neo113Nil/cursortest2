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
import com.winworm.neongrid.R;
import java.util.WeakHashMap;
import q0.AbstractC0292a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f602e;

    /* renamed from: f, reason: collision with root package name */
    public final int f603f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f604g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0028a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0029b f605j;

    /* renamed from: k, reason: collision with root package name */
    public final k f606k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f607l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f608m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f609n;

    /* renamed from: o, reason: collision with root package name */
    public long f610o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f611p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f612q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f613r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0028a(i, this);
        this.f605j = new ViewOnFocusChangeListenerC0029b(this, i);
        this.f606k = new k(this);
        this.f610o = Long.MAX_VALUE;
        this.f603f = z1.d.h0(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f602e = z1.d.h0(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f604g = z1.d.i0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0292a.f3384a);
    }

    @Override // M0.r
    public final void a() {
        if (this.f611p.isTouchExplorationEnabled() && z1.d.S(this.h) && !this.d.hasFocus()) {
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
        return this.f605j;
    }

    @Override // M0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // M0.r
    public final k h() {
        return this.f606k;
    }

    @Override // M0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // M0.r
    public final boolean j() {
        return this.f607l;
    }

    @Override // M0.r
    public final boolean l() {
        return this.f609n;
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
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f610o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f608m = false;
                    }
                    lVar.u();
                    lVar.f608m = true;
                    lVar.f610o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: M0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f608m = true;
                lVar.f610o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f640a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!z1.d.S(editText) && this.f611p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = T.f440a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // M0.r
    public final void n(L.j jVar) {
        if (!z1.d.S(this.h)) {
            jVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f561a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // M0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f611p.isEnabled() || z1.d.S(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f609n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f608m = true;
            this.f610o = System.currentTimeMillis();
        }
    }

    @Override // M0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1559A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f604g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f603f);
        ofFloat.addUpdateListener(new C0001a0(this));
        this.f613r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1559A0);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f602e);
        ofFloat2.addUpdateListener(new C0001a0(this));
        this.f612q = ofFloat2;
        ofFloat2.addListener(new C0003b0(1, this));
        this.f611p = (AccessibilityManager) this.f642c.getSystemService("accessibility");
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
        if (this.f609n != z2) {
            this.f609n = z2;
            this.f613r.cancel();
            this.f612q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f610o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f608m = false;
        }
        if (this.f608m) {
            this.f608m = false;
            return;
        }
        t(!this.f609n);
        if (!this.f609n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
