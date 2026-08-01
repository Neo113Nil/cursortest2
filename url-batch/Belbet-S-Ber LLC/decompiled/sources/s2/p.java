package s2;

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
import com.gdmhkmf.belbet.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.z0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p extends LinearLayout {
    public final m A;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f3273f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f3274g;
    public final CheckableImageButton h;
    public ColorStateList i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f3275j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnLongClickListener f3276k;

    /* renamed from: l, reason: collision with root package name */
    public final CheckableImageButton f3277l;

    /* renamed from: m, reason: collision with root package name */
    public final o f3278m;

    /* renamed from: n, reason: collision with root package name */
    public int f3279n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f3280o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f3281p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f3282q;

    /* renamed from: r, reason: collision with root package name */
    public int f3283r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView.ScaleType f3284s;

    /* renamed from: t, reason: collision with root package name */
    public View.OnLongClickListener f3285t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f3286u;

    /* renamed from: v, reason: collision with root package name */
    public final z0 f3287v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3288w;

    /* renamed from: x, reason: collision with root package name */
    public EditText f3289x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f3290y;

    /* renamed from: z, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f3291z;

    public p(TextInputLayout textInputLayout, androidx.emoji2.text.t tVar) {
        super(textInputLayout.getContext());
        this.f3279n = 0;
        this.f3280o = new LinkedHashSet();
        this.A = new m(this);
        n nVar = new n(this);
        this.f3290y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3273f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3274g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a5 = a(this, from, R.id.text_input_error_icon);
        this.h = a5;
        CheckableImageButton a6 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f3277l = a6;
        this.f3278m = new o(this, tVar);
        z0 z0Var = new z0(getContext(), null);
        this.f3287v = z0Var;
        TypedArray typedArray = (TypedArray) tVar.f473b;
        if (typedArray.hasValue(38)) {
            this.i = b4.l.s(getContext(), tVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f3275j = i2.o.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(tVar.d(37));
        }
        a5.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a5.setImportantForAccessibility(2);
        a5.setClickable(false);
        a5.setPressable(false);
        a5.setCheckable(false);
        a5.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f3281p = b4.l.s(getContext(), tVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f3282q = i2.o.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            a6.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f3281p = b4.l.s(getContext(), tVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f3282q = i2.o.f(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3283r) {
            this.f3283r = dimensionPixelSize;
            a6.setMinimumWidth(dimensionPixelSize);
            a6.setMinimumHeight(dimensionPixelSize);
            a5.setMinimumWidth(dimensionPixelSize);
            a5.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType g3 = r1.b.g(typedArray.getInt(31, -1));
            this.f3284s = g3;
            a6.setScaleType(g3);
            a5.setScaleType(g3);
        }
        z0Var.setVisibility(8);
        z0Var.setId(R.id.textinput_suffix_text);
        z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        z0Var.setAccessibilityLiveRegion(1);
        z0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            z0Var.setTextColor(tVar.c(74));
        }
        CharSequence text = typedArray.getText(72);
        this.f3286u = TextUtils.isEmpty(text) ? null : text;
        z0Var.setText(text);
        o();
        frameLayout.addView(a6);
        addView(z0Var);
        addView(frameLayout);
        addView(a5);
        final int i = 0;
        a5.setOnFocusableChangedListener(new i2.b(this) { // from class: s2.l

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ p f3267g;

            {
                this.f3267g = this;
            }

            @Override // i2.b
            public final void a() {
                switch (i) {
                    case 0:
                        CheckableImageButton checkableImageButton = this.f3267g.h;
                        r1.b.E(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = this.f3267g.f3277l;
                        r1.b.E(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        final int i4 = 1;
        a6.setOnFocusableChangedListener(new i2.b(this) { // from class: s2.l

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ p f3267g;

            {
                this.f3267g = this;
            }

            @Override // i2.b
            public final void a() {
                switch (i4) {
                    case 0:
                        CheckableImageButton checkableImageButton = this.f3267g.h;
                        r1.b.E(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = this.f3267g.f3277l;
                        r1.b.E(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.f1212k0.add(nVar);
        if (textInputLayout.f1209j != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new p0(3, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (b4.l.K(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q eVar;
        int i = this.f3279n;
        o oVar = this.f3278m;
        SparseArray sparseArray = oVar.f3270a;
        q qVar = (q) sparseArray.get(i);
        if (qVar != null) {
            return qVar;
        }
        p pVar = oVar.f3271b;
        if (i == -1) {
            eVar = new e(pVar, 0);
        } else if (i == 0) {
            eVar = new e(pVar, 1);
        } else if (i == 1) {
            eVar = new v(pVar, oVar.d);
        } else if (i == 2) {
            eVar = new d(pVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(a4.b.f("Invalid end icon mode: ", i));
            }
            eVar = new k(pVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f3277l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f3287v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f3274g.getVisibility() == 0 && this.f3277l.getVisibility() == 0;
    }

    public final boolean e() {
        return this.h.getVisibility() == 0;
    }

    public final void f(boolean z4) {
        boolean z5;
        boolean isActivated;
        boolean z6;
        q b2 = b();
        boolean j2 = b2.j();
        CheckableImageButton checkableImageButton = this.f3277l;
        boolean z7 = true;
        if (!j2 || (z6 = checkableImageButton.i) == b2.k()) {
            z5 = false;
        } else {
            checkableImageButton.setChecked(!z6);
            z5 = true;
        }
        if (!(b2 instanceof k) || (isActivated = checkableImageButton.isActivated()) == ((k) b2).f3259l) {
            z7 = z5;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z4 || z7) {
            r1.b.x(this.f3273f, checkableImageButton, this.f3281p);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3277l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            r1.b.E(checkableImageButton, charSequence);
        }
    }

    public final void h(int i) {
        if (this.f3279n == i) {
            return;
        }
        q b2 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f3291z;
        AccessibilityManager accessibilityManager = this.f3290y;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f3291z = null;
        b2.r();
        this.f3279n = i;
        Iterator it = this.f3280o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        i(i != 0);
        q b5 = b();
        int i4 = this.f3278m.f3272c;
        if (i4 == 0) {
            i4 = b5.d();
        }
        Drawable y4 = i4 != 0 ? b4.d.y(getContext(), i4) : null;
        CheckableImageButton checkableImageButton = this.f3277l;
        checkableImageButton.setImageDrawable(y4);
        TextInputLayout textInputLayout = this.f3273f;
        if (y4 != null) {
            r1.b.a(textInputLayout, checkableImageButton, this.f3281p, this.f3282q);
            r1.b.x(textInputLayout, checkableImageButton, this.f3281p);
        }
        checkableImageButton.setCheckable(b5.j());
        if (!b5.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b5.q();
        AccessibilityManager.TouchExplorationStateChangeListener h = b5.h();
        this.f3291z = h;
        if (h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f3291z);
        }
        View.OnClickListener f5 = b5.f();
        View.OnLongClickListener onLongClickListener = this.f3285t;
        checkableImageButton.setOnClickListener(f5);
        r1.b.A(checkableImageButton, onLongClickListener);
        int c5 = b5.c();
        g(c5 != 0 ? getResources().getText(c5) : null);
        EditText editText = this.f3289x;
        if (editText != null) {
            b5.l(editText);
            k(b5);
        }
        r1.b.a(textInputLayout, checkableImageButton, this.f3281p, this.f3282q);
        f(true);
    }

    public final void i(boolean z4) {
        EditText editText;
        if (d() != z4) {
            CheckableImageButton checkableImageButton = this.f3277l;
            if (!z4 && checkableImageButton.hasFocus() && (editText = this.f3289x) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            l();
            n();
            this.f3273f.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(drawable);
        m();
        r1.b.a(this.f3273f, checkableImageButton, this.i, this.f3275j);
    }

    public final void k(q qVar) {
        if (this.f3289x == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f3289x.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f3277l.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void l() {
        this.f3274g.setVisibility((this.f3277l.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f3286u == null || this.f3288w) ? 8 : false)) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f3273f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1221p.f3312q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.f3279n != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.f3273f;
        if (textInputLayout.f1209j == null) {
            return;
        }
        this.f3287v.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f1209j.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f1209j.getPaddingEnd(), textInputLayout.f1209j.getPaddingBottom());
    }

    public final void o() {
        z0 z0Var = this.f3287v;
        int visibility = z0Var.getVisibility();
        int i = (this.f3286u == null || this.f3288w) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        z0Var.setVisibility(i);
        this.f3273f.s();
    }
}
