package z5;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f9198e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9199f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f9200g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f9201h;
    public final a i;

    /* renamed from: j, reason: collision with root package name */
    public final b f9202j;

    /* renamed from: k, reason: collision with root package name */
    public final x1.v f9203k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9204l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9205m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9206n;

    /* renamed from: o, reason: collision with root package name */
    public long f9207o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f9208p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f9209q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f9210r;

    public k(o oVar) {
        super(oVar);
        int i = 1;
        this.i = new a(this, i);
        this.f9202j = new b(this, i);
        this.f9203k = new x1.v(i, this);
        this.f9207o = Long.MAX_VALUE;
        this.f9199f = r2.r.Q(oVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f9198e = r2.r.Q(oVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f9200g = r2.r.R(oVar.getContext(), R.attr.motionEasingLinearInterpolator, g5.a.f3031a);
    }

    @Override // z5.p
    public final void a() {
        if (this.f9208p.isTouchExplorationEnabled() && this.f9201h.getInputType() != 0 && !this.f9241d.hasFocus()) {
            this.f9201h.dismissDropDown();
        }
        this.f9201h.post(new a1.a(15, this));
    }

    @Override // z5.p
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // z5.p
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // z5.p
    public final View.OnFocusChangeListener e() {
        return this.f9202j;
    }

    @Override // z5.p
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // z5.p
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f9203k;
    }

    @Override // z5.p
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // z5.p
    public final boolean k() {
        return this.f9206n;
    }

    @Override // z5.p
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f9201h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: z5.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    k kVar = k.this;
                    long j7 = uptimeMillis - kVar.f9207o;
                    if (j7 < 0 || j7 > 300) {
                        kVar.f9205m = false;
                    }
                    kVar.t();
                    kVar.f9205m = true;
                    kVar.f9207o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f9201h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: z5.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f9205m = true;
                kVar.f9207o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.f9201h.setThreshold(0);
        TextInputLayout textInputLayout = this.f9238a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f9208p.isTouchExplorationEnabled()) {
            this.f9241d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // z5.p
    public final void m(r3.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
        if (this.f9201h.getInputType() == 0) {
            fVar.i(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 ? accessibilityNodeInfo.isShowingHintText() : fVar.e(4)) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // z5.p
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f9208p.isEnabled() && this.f9201h.getInputType() == 0) {
            boolean z3 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f9206n && !this.f9201h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z3) {
                t();
                this.f9205m = true;
                this.f9207o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // z5.p
    public final void q() {
        int i = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f9200g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f9199f);
        ofFloat.addUpdateListener(new c(this, i));
        this.f9210r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f9198e);
        ofFloat2.addUpdateListener(new c(this, i));
        this.f9209q = ofFloat2;
        ofFloat2.addListener(new c5.k(4, this));
        this.f9208p = (AccessibilityManager) this.f9240c.getSystemService("accessibility");
    }

    @Override // z5.p
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f9201h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f9201h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z3) {
        if (this.f9206n != z3) {
            this.f9206n = z3;
            this.f9210r.cancel();
            this.f9209q.start();
        }
    }

    public final void t() {
        if (this.f9201h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f9207o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.f9205m = false;
        }
        if (this.f9205m) {
            this.f9205m = false;
            return;
        }
        s(!this.f9206n);
        if (!this.f9206n) {
            this.f9201h.dismissDropDown();
        } else {
            this.f9201h.requestFocus();
            this.f9201h.showDropDown();
        }
    }
}
