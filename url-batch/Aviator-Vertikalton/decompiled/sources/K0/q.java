package K0;

import K.X;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.fortuneink.neonpad.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0257e0;

/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f572a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f573b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f574c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f575d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f576e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f577f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f578g;
    public final p h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f579j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f580k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f581l;

    /* renamed from: m, reason: collision with root package name */
    public int f582m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f583n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f584o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f585p;

    /* renamed from: q, reason: collision with root package name */
    public final C0257e0 f586q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f587r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f588s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f589t;

    /* renamed from: u, reason: collision with root package name */
    public k f590u;

    /* renamed from: v, reason: collision with root package name */
    public final m f591v;

    public q(TextInputLayout textInputLayout, T.r rVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f579j = new LinkedHashSet();
        this.f591v = new m(this);
        n nVar = new n(this);
        this.f589t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f572a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f573b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f574c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f578g = a3;
        this.h = new p(this, rVar);
        C0257e0 c0257e0 = new C0257e0(getContext(), null);
        this.f586q = c0257e0;
        TypedArray typedArray = (TypedArray) rVar.f811c;
        if (typedArray.hasValue(38)) {
            this.f575d = q1.d.x(getContext(), rVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f576e = B0.o.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(rVar.h(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = X.f418a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f580k = q1.d.x(getContext(), rVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f581l = B0.o.g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a3.getContentDescription() != (text = typedArray.getText(27))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f580k = q1.d.x(getContext(), rVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f581l = B0.o.g(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f582m) {
            this.f582m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType n2 = q1.l.n(typedArray.getInt(31, -1));
            this.f583n = n2;
            a3.setScaleType(n2);
            a2.setScaleType(n2);
        }
        c0257e0.setVisibility(8);
        c0257e0.setId(R.id.textinput_suffix_text);
        c0257e0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0257e0.setAccessibilityLiveRegion(1);
        c0257e0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0257e0.setTextColor(rVar.g(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f585p = TextUtils.isEmpty(text3) ? null : text3;
        c0257e0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0257e0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f2011e0.add(nVar);
        if (textInputLayout.f2008d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (q1.d.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r c0035f;
        int i = this.i;
        p pVar = this.h;
        SparseArray sparseArray = pVar.f568a;
        r rVar = (r) sparseArray.get(i);
        if (rVar == null) {
            q qVar = pVar.f569b;
            if (i == -1) {
                c0035f = new C0035f(qVar, 0);
            } else if (i == 0) {
                c0035f = new C0035f(qVar, 1);
            } else if (i == 1) {
                rVar = new y(qVar, pVar.f571d);
                sparseArray.append(i, rVar);
            } else if (i == 2) {
                c0035f = new C0034e(qVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(X0.e.d("Invalid end icon mode: ", i));
                }
                c0035f = new l(qVar);
            }
            rVar = c0035f;
            sparseArray.append(i, rVar);
        }
        return rVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f578g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = X.f418a;
        return this.f586q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f573b.getVisibility() == 0 && this.f578g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f574c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f578g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.f1939d) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof l) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            q1.l.c0(this.f572a, checkableImageButton, this.f580k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        r b2 = b();
        k kVar = this.f590u;
        AccessibilityManager accessibilityManager = this.f589t;
        if (kVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
        }
        this.f590u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f579j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        r b3 = b();
        int i2 = this.h.f570c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable z2 = i2 != 0 ? q1.d.z(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f578g;
        checkableImageButton.setImageDrawable(z2);
        TextInputLayout textInputLayout = this.f572a;
        if (z2 != null) {
            q1.l.d(textInputLayout, checkableImageButton, this.f580k, this.f581l);
            q1.l.c0(textInputLayout, checkableImageButton, this.f580k);
        }
        int c2 = b3.c();
        CharSequence text = c2 != 0 ? getResources().getText(c2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b3.k());
        if (!b3.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b3.r();
        k h = b3.h();
        this.f590u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = X.f418a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new L.b(this.f590u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f584o;
        checkableImageButton.setOnClickListener(f2);
        q1.l.p0(checkableImageButton, onLongClickListener);
        EditText editText = this.f588s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        q1.l.d(textInputLayout, checkableImageButton, this.f580k, this.f581l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f578g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f572a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f574c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        q1.l.d(this.f572a, checkableImageButton, this.f575d, this.f576e);
    }

    public final void j(r rVar) {
        if (this.f588s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f588s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f578g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f573b.setVisibility((this.f578g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f585p == null || this.f587r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f574c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f572a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2017j.f618q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f572a;
        if (textInputLayout.f2008d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f2008d;
            WeakHashMap weakHashMap = X.f418a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2008d.getPaddingTop();
        int paddingBottom = textInputLayout.f2008d.getPaddingBottom();
        WeakHashMap weakHashMap2 = X.f418a;
        this.f586q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0257e0 c0257e0 = this.f586q;
        int visibility = c0257e0.getVisibility();
        int i = (this.f585p == null || this.f587r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0257e0.setVisibility(i);
        this.f572a.q();
    }
}
