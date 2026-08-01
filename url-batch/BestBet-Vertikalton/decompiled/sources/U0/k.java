package U0;

import K.Q;
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
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import y0.AbstractC0395a;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f1151e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1152f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1153g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0031a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0032b f1154j;

    /* renamed from: k, reason: collision with root package name */
    public final P.b f1155k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1156l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1157m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1158n;

    /* renamed from: o, reason: collision with root package name */
    public long f1159o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1160p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1161q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1162r;

    public k(p pVar) {
        super(pVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0031a(i, this);
        this.f1154j = new ViewOnFocusChangeListenerC0032b(this, i);
        this.f1155k = new P.b(this);
        this.f1159o = Long.MAX_VALUE;
        this.f1152f = H1.l.b0(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f1151e = H1.l.b0(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f1153g = H1.l.c0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0395a.f4570a);
    }

    @Override // U0.q
    public final void a() {
        if (this.f1160p.isTouchExplorationEnabled() && H1.l.N(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new E0.b(5, this));
    }

    @Override // U0.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // U0.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // U0.q
    public final View.OnFocusChangeListener e() {
        return this.f1154j;
    }

    @Override // U0.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // U0.q
    public final P.b h() {
        return this.f1155k;
    }

    @Override // U0.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // U0.q
    public final boolean j() {
        return this.f1156l;
    }

    @Override // U0.q
    public final boolean l() {
        return this.f1158n;
    }

    @Override // U0.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: U0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = k.this;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f1159o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f1157m = false;
                    }
                    kVar.u();
                    kVar.f1157m = true;
                    kVar.f1159o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: U0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f1157m = true;
                kVar.f1159o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1189a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!H1.l.N(editText) && this.f1160p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = Q.f578a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // U0.q
    public final void n(L.j jVar) {
        if (!H1.l.N(this.h)) {
            jVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f696a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // U0.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1160p.isEnabled() || H1.l.N(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1158n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f1157m = true;
            this.f1159o = System.currentTimeMillis();
        }
    }

    @Override // U0.q
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1937A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f1153g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1152f);
        ofFloat.addUpdateListener(new Y(this));
        this.f1162r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1937A0);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f1151e);
        ofFloat2.addUpdateListener(new Y(this));
        this.f1161q = ofFloat2;
        ofFloat2.addListener(new A0.a(2, this));
        this.f1160p = (AccessibilityManager) this.f1191c.getSystemService("accessibility");
    }

    @Override // U0.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f1158n != z2) {
            this.f1158n = z2;
            this.f1162r.cancel();
            this.f1161q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1159o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1157m = false;
        }
        if (this.f1157m) {
            this.f1157m = false;
            return;
        }
        t(!this.f1158n);
        if (!this.f1158n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
