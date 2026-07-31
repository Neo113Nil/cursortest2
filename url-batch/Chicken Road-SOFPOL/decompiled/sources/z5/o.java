package z5;

import a0.g1;
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
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.snovikpovik.vuevnxsj.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f9217d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f9218e;

    /* renamed from: f, reason: collision with root package name */
    public final CheckableImageButton f9219f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9220g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9221h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public final CheckableImageButton f9222j;

    /* renamed from: k, reason: collision with root package name */
    public final n f9223k;

    /* renamed from: l, reason: collision with root package name */
    public int f9224l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f9225m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f9226n;

    /* renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f9227o;

    /* renamed from: p, reason: collision with root package name */
    public int f9228p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView.ScaleType f9229q;

    /* renamed from: r, reason: collision with root package name */
    public View.OnLongClickListener f9230r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f9231s;

    /* renamed from: t, reason: collision with root package name */
    public final j0 f9232t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9233u;

    /* renamed from: v, reason: collision with root package name */
    public EditText f9234v;

    /* renamed from: w, reason: collision with root package name */
    public final AccessibilityManager f9235w;

    /* renamed from: x, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f9236x;

    /* renamed from: y, reason: collision with root package name */
    public final l f9237y;

    public o(TextInputLayout textInputLayout, g1 g1Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f9224l = 0;
        this.f9225m = new LinkedHashSet();
        this.f9237y = new l(this);
        m mVar = new m(this);
        this.f9235w = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f9217d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f9218e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a8 = a(this, from, R.id.text_input_error_icon);
        this.f9219f = a8;
        CheckableImageButton a9 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f9222j = a9;
        this.f9223k = new n(this, g1Var);
        j0 j0Var = new j0(getContext(), null);
        this.f9232t = j0Var;
        TypedArray typedArray = (TypedArray) g1Var.f85c;
        if (typedArray.hasValue(38)) {
            this.f9220g = r2.o.B(getContext(), g1Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f9221h = r5.k.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(g1Var.q(37));
        }
        a8.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a8.setImportantForAccessibility(2);
        a8.setClickable(false);
        a8.setPressable(false);
        a8.setCheckable(false);
        a8.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f9226n = r2.o.B(getContext(), g1Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f9227o = r5.k.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a9.getContentDescription() != (text = typedArray.getText(27))) {
                a9.setContentDescription(text);
            }
            a9.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f9226n = r2.o.B(getContext(), g1Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f9227o = r5.k.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a9.getContentDescription() != text2) {
                a9.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f9228p) {
            this.f9228p = dimensionPixelSize;
            a9.setMinimumWidth(dimensionPixelSize);
            a9.setMinimumHeight(dimensionPixelSize);
            a8.setMinimumWidth(dimensionPixelSize);
            a8.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType s5 = r2.r.s(typedArray.getInt(31, -1));
            this.f9229q = s5;
            a9.setScaleType(s5);
            a8.setScaleType(s5);
        }
        j0Var.setVisibility(8);
        j0Var.setId(R.id.textinput_suffix_text);
        j0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        j0Var.setAccessibilityLiveRegion(1);
        j0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            j0Var.setTextColor(g1Var.p(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.f9231s = TextUtils.isEmpty(text3) ? null : text3;
        j0Var.setText(text3);
        n();
        frameLayout.addView(a9);
        addView(j0Var);
        addView(frameLayout);
        addView(a8);
        textInputLayout.f1976i0.add(mVar);
        if (textInputLayout.f1974h != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new f1.e(8, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (r2.o.U(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final p b() {
        p fVar;
        int i = this.f9224l;
        n nVar = this.f9223k;
        SparseArray sparseArray = nVar.f9213a;
        p pVar = (p) sparseArray.get(i);
        if (pVar != null) {
            return pVar;
        }
        o oVar = nVar.f9214b;
        if (i == -1) {
            fVar = new f(oVar, 0);
        } else if (i == 0) {
            fVar = new f(oVar, 1);
        } else if (i == 1) {
            fVar = new s(oVar, nVar.f9216d);
        } else if (i == 2) {
            fVar = new e(oVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(a0.q.h("Invalid end icon mode: ", i));
            }
            fVar = new k(oVar);
        }
        sparseArray.append(i, fVar);
        return fVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f9222j;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f9232t.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f9218e.getVisibility() == 0 && this.f9222j.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f9219f.getVisibility() == 0;
    }

    public final void f(boolean z3) {
        boolean z7;
        boolean isActivated;
        boolean z8;
        p b8 = b();
        boolean j7 = b8.j();
        CheckableImageButton checkableImageButton = this.f9222j;
        boolean z9 = true;
        if (!j7 || (z8 = checkableImageButton.f1930g) == b8.k()) {
            z7 = false;
        } else {
            checkableImageButton.setChecked(!z8);
            z7 = true;
        }
        if (!(b8 instanceof k) || (isActivated = checkableImageButton.isActivated()) == ((k) b8).f9204l) {
            z9 = z7;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z3 || z9) {
            r2.r.O(this.f9217d, checkableImageButton, this.f9226n);
        }
    }

    public final void g(int i) {
        if (this.f9224l == i) {
            return;
        }
        p b8 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f9236x;
        AccessibilityManager accessibilityManager = this.f9235w;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f9236x = null;
        b8.r();
        this.f9224l = i;
        Iterator it = this.f9225m.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        p b9 = b();
        int i8 = this.f9223k.f9215c;
        if (i8 == 0) {
            i8 = b9.d();
        }
        Drawable D = i8 != 0 ? h0.a.D(getContext(), i8) : null;
        CheckableImageButton checkableImageButton = this.f9222j;
        checkableImageButton.setImageDrawable(D);
        TextInputLayout textInputLayout = this.f9217d;
        if (D != null) {
            r2.r.g(textInputLayout, checkableImageButton, this.f9226n, this.f9227o);
            r2.r.O(textInputLayout, checkableImageButton, this.f9226n);
        }
        int c8 = b9.c();
        CharSequence text = c8 != 0 ? getResources().getText(c8) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b9.j());
        if (!b9.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b9.q();
        AccessibilityManager.TouchExplorationStateChangeListener h8 = b9.h();
        this.f9236x = h8;
        if (h8 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f9236x);
        }
        View.OnClickListener f6 = b9.f();
        View.OnLongClickListener onLongClickListener = this.f9230r;
        checkableImageButton.setOnClickListener(f6);
        r2.r.W(checkableImageButton, onLongClickListener);
        EditText editText = this.f9234v;
        if (editText != null) {
            b9.l(editText);
            j(b9);
        }
        r2.r.g(textInputLayout, checkableImageButton, this.f9226n, this.f9227o);
        f(true);
    }

    public final void h(boolean z3) {
        if (d() != z3) {
            this.f9222j.setVisibility(z3 ? 0 : 8);
            k();
            m();
            this.f9217d.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f9219f;
        checkableImageButton.setImageDrawable(drawable);
        l();
        r2.r.g(this.f9217d, checkableImageButton, this.f9220g, this.f9221h);
    }

    public final void j(p pVar) {
        if (this.f9234v == null) {
            return;
        }
        if (pVar.e() != null) {
            this.f9234v.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.f9222j.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void k() {
        this.f9218e.setVisibility((this.f9222j.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f9231s == null || this.f9233u) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f9219f;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f9217d;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1985n.f9258q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.f9224l != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f9217d;
        if (textInputLayout.f1974h == null) {
            return;
        }
        this.f9232t.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f1974h.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f1974h.getPaddingEnd(), textInputLayout.f1974h.getPaddingBottom());
    }

    public final void n() {
        j0 j0Var = this.f9232t;
        int visibility = j0Var.getVisibility();
        int i = (this.f9231s == null || this.f9233u) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        j0Var.setVisibility(i);
        this.f9217d.s();
    }
}
