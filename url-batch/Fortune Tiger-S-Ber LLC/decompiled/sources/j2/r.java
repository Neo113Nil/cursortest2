package j2;

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
import androidx.fragment.app.p0;
import androidx.fragment.app.w0;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r extends LinearLayout {
    public final o A;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f2336f;
    public final FrameLayout g;
    public final CheckableImageButton h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f2337i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f2338j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnLongClickListener f2339k;

    /* renamed from: l, reason: collision with root package name */
    public final CheckableImageButton f2340l;

    /* renamed from: m, reason: collision with root package name */
    public final q f2341m;

    /* renamed from: n, reason: collision with root package name */
    public int f2342n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f2343o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f2344p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f2345q;

    /* renamed from: r, reason: collision with root package name */
    public int f2346r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView.ScaleType f2347s;

    /* renamed from: t, reason: collision with root package name */
    public View.OnLongClickListener f2348t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f2349u;

    /* renamed from: v, reason: collision with root package name */
    public final z0 f2350v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2351w;

    /* renamed from: x, reason: collision with root package name */
    public EditText f2352x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f2353y;

    /* renamed from: z, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f2354z;

    public r(TextInputLayout textInputLayout, androidx.emoji2.text.s sVar) {
        super(textInputLayout.getContext());
        this.f2342n = 0;
        this.f2343o = new LinkedHashSet();
        this.A = new o(this);
        p pVar = new p(this);
        this.f2353y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2336f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a4 = a(this, from, R.id.text_input_error_icon);
        this.h = a4;
        CheckableImageButton a5 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f2340l = a5;
        this.f2341m = new q(this, sVar);
        z0 z0Var = new z0(getContext(), null);
        this.f2350v = z0Var;
        TypedArray typedArray = (TypedArray) sVar.c;
        if (typedArray.hasValue(38)) {
            this.f2337i = k3.m.v(getContext(), sVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f2338j = a2.p.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(sVar.i(37));
        }
        a4.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a4.setImportantForAccessibility(2);
        a4.setClickable(false);
        a4.setPressable(false);
        a4.setCheckable(false);
        a4.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f2344p = k3.m.v(getContext(), sVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f2345q = a2.p.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            a5.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f2344p = k3.m.v(getContext(), sVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f2345q = a2.p.f(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2346r) {
            this.f2346r = dimensionPixelSize;
            a5.setMinimumWidth(dimensionPixelSize);
            a5.setMinimumHeight(dimensionPixelSize);
            a4.setMinimumWidth(dimensionPixelSize);
            a4.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType o4 = k3.d.o(typedArray.getInt(31, -1));
            this.f2347s = o4;
            a5.setScaleType(o4);
            a4.setScaleType(o4);
        }
        z0Var.setVisibility(8);
        z0Var.setId(R.id.textinput_suffix_text);
        z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        z0Var.setAccessibilityLiveRegion(1);
        z0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            z0Var.setTextColor(sVar.h(74));
        }
        CharSequence text = typedArray.getText(72);
        this.f2349u = TextUtils.isEmpty(text) ? null : text;
        z0Var.setText(text);
        o();
        frameLayout.addView(a5);
        addView(z0Var);
        addView(frameLayout);
        addView(a4);
        final int i4 = 0;
        a4.setOnFocusableChangedListener(new a2.b(this) { // from class: j2.n
            public final /* synthetic */ r g;

            {
                this.g = this;
            }

            @Override // a2.b
            public final void a() {
                switch (i4) {
                    case 0:
                        CheckableImageButton checkableImageButton = this.g.h;
                        k3.d.k0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = this.g.f2340l;
                        k3.d.k0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        final int i5 = 1;
        a5.setOnFocusableChangedListener(new a2.b(this) { // from class: j2.n
            public final /* synthetic */ r g;

            {
                this.g = this;
            }

            @Override // a2.b
            public final void a() {
                switch (i5) {
                    case 0:
                        CheckableImageButton checkableImageButton = this.g.h;
                        k3.d.k0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = this.g.f2340l;
                        k3.d.k0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.f1405k0.add(pVar);
        if (textInputLayout.f1402j != null) {
            pVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new p0(3, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i4) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i4);
        if (k3.m.E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final s b() {
        s fVar;
        int i4 = this.f2342n;
        q qVar = this.f2341m;
        SparseArray sparseArray = qVar.f2333a;
        s sVar = (s) sparseArray.get(i4);
        if (sVar != null) {
            return sVar;
        }
        r rVar = qVar.f2334b;
        if (i4 == -1) {
            fVar = new f(rVar, 0);
        } else if (i4 == 0) {
            fVar = new f(rVar, 1);
        } else if (i4 == 1) {
            fVar = new y(rVar, qVar.f2335d);
        } else if (i4 == 2) {
            fVar = new e(rVar);
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException(w0.e("Invalid end icon mode: ", i4));
            }
            fVar = new m(rVar);
        }
        sparseArray.append(i4, fVar);
        return fVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f2340l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f2350v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.g.getVisibility() == 0 && this.f2340l.getVisibility() == 0;
    }

    public final boolean e() {
        return this.h.getVisibility() == 0;
    }

    public final void f(boolean z3) {
        boolean z4;
        boolean isActivated;
        boolean z5;
        s b2 = b();
        boolean j4 = b2.j();
        CheckableImageButton checkableImageButton = this.f2340l;
        boolean z6 = true;
        if (!j4 || (z5 = checkableImageButton.f1364i) == b2.k()) {
            z4 = false;
        } else {
            checkableImageButton.setChecked(!z5);
            z4 = true;
        }
        if (!(b2 instanceof m) || (isActivated = checkableImageButton.isActivated()) == ((m) b2).f2323l) {
            z6 = z4;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z3 || z6) {
            k3.d.W(this.f2336f, checkableImageButton, this.f2344p);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2340l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            k3.d.k0(checkableImageButton, charSequence);
        }
    }

    public final void h(int i4) {
        if (this.f2342n == i4) {
            return;
        }
        s b2 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f2354z;
        AccessibilityManager accessibilityManager = this.f2353y;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f2354z = null;
        b2.r();
        this.f2342n = i4;
        Iterator it = this.f2343o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        i(i4 != 0);
        s b4 = b();
        int i5 = this.f2341m.c;
        if (i5 == 0) {
            i5 = b4.d();
        }
        Drawable w3 = i5 != 0 ? k3.m.w(getContext(), i5) : null;
        CheckableImageButton checkableImageButton = this.f2340l;
        checkableImageButton.setImageDrawable(w3);
        TextInputLayout textInputLayout = this.f2336f;
        if (w3 != null) {
            k3.d.b(textInputLayout, checkableImageButton, this.f2344p, this.f2345q);
            k3.d.W(textInputLayout, checkableImageButton, this.f2344p);
        }
        checkableImageButton.setCheckable(b4.j());
        if (!b4.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i4);
        }
        b4.q();
        AccessibilityManager.TouchExplorationStateChangeListener h = b4.h();
        this.f2354z = h;
        if (h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f2354z);
        }
        View.OnClickListener f4 = b4.f();
        View.OnLongClickListener onLongClickListener = this.f2348t;
        checkableImageButton.setOnClickListener(f4);
        k3.d.e0(checkableImageButton, onLongClickListener);
        int c = b4.c();
        g(c != 0 ? getResources().getText(c) : null);
        EditText editText = this.f2352x;
        if (editText != null) {
            b4.l(editText);
            k(b4);
        }
        k3.d.b(textInputLayout, checkableImageButton, this.f2344p, this.f2345q);
        f(true);
    }

    public final void i(boolean z3) {
        EditText editText;
        if (d() != z3) {
            CheckableImageButton checkableImageButton = this.f2340l;
            if (!z3 && checkableImageButton.hasFocus() && (editText = this.f2352x) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            l();
            n();
            this.f2336f.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(drawable);
        m();
        k3.d.b(this.f2336f, checkableImageButton, this.f2337i, this.f2338j);
    }

    public final void k(s sVar) {
        if (this.f2352x == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f2352x.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f2340l.setOnFocusChangeListener(sVar.g());
        }
    }

    public final void l() {
        this.g.setVisibility((this.f2340l.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f2349u == null || this.f2351w) ? 8 : false)) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2336f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1414p.f2375q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.f2342n != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.f2336f;
        if (textInputLayout.f1402j == null) {
            return;
        }
        this.f2350v.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f1402j.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f1402j.getPaddingEnd(), textInputLayout.f1402j.getPaddingBottom());
    }

    public final void o() {
        z0 z0Var = this.f2350v;
        int visibility = z0Var.getVisibility();
        int i4 = (this.f2349u == null || this.f2351w) ? 8 : 0;
        if (visibility != i4) {
            b().o(i4 == 0);
        }
        l();
        z0Var.setVisibility(i4);
        this.f2336f.s();
    }
}
