package R0;

import K.C0012m;
import K.S;
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
import com.clutchquizarena.app.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0204b0;

/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f690a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f691b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f692c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f693e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f694f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f695g;
    public final o h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f696j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f697k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f698l;

    /* renamed from: m, reason: collision with root package name */
    public int f699m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f700n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f701o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f702p;

    /* renamed from: q, reason: collision with root package name */
    public final C0204b0 f703q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f704r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f705s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f706t;

    /* renamed from: u, reason: collision with root package name */
    public P.b f707u;

    /* renamed from: v, reason: collision with root package name */
    public final l f708v;

    public p(TextInputLayout textInputLayout, C0012m c0012m) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f696j = new LinkedHashSet();
        this.f708v = new l(this);
        m mVar = new m(this);
        this.f706t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f690a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f691b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f692c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f695g = a3;
        this.h = new o(this, c0012m);
        C0204b0 c0204b0 = new C0204b0(getContext(), null);
        this.f703q = c0204b0;
        TypedArray typedArray = (TypedArray) c0012m.f423c;
        if (typedArray.hasValue(38)) {
            this.d = A.c.G(getContext(), c0012m, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f693e = I0.k.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0012m.h(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = S.f365a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f697k = A.c.G(getContext(), c0012m, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f698l = I0.k.g(typedArray.getInt(33, -1), null);
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
                this.f697k = A.c.G(getContext(), c0012m, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f698l = I0.k.g(typedArray.getInt(55, -1), null);
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
        if (dimensionPixelSize != this.f699m) {
            this.f699m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType q2 = A.c.q(typedArray.getInt(31, -1));
            this.f700n = q2;
            a3.setScaleType(q2);
            a2.setScaleType(q2);
        }
        c0204b0.setVisibility(8);
        c0204b0.setId(R.id.textinput_suffix_text);
        c0204b0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0204b0.setAccessibilityLiveRegion(1);
        c0204b0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0204b0.setTextColor(c0012m.g(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f702p = TextUtils.isEmpty(text3) ? null : text3;
        c0204b0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0204b0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f1997e0.add(mVar);
        if (textInputLayout.d != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (A.c.d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q fVar;
        int i = this.i;
        o oVar = this.h;
        SparseArray sparseArray = oVar.f687a;
        q qVar = (q) sparseArray.get(i);
        if (qVar == null) {
            p pVar = oVar.f688b;
            if (i == -1) {
                fVar = new f(pVar, 0);
            } else if (i == 0) {
                fVar = new f(pVar, 1);
            } else if (i == 1) {
                qVar = new x(pVar, oVar.d);
                sparseArray.append(i, qVar);
            } else if (i == 2) {
                fVar = new e(pVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Invalid end icon mode: " + i);
                }
                fVar = new k(pVar);
            }
            qVar = fVar;
            sparseArray.append(i, qVar);
        }
        return qVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f695g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = S.f365a;
        return this.f703q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f691b.getVisibility() == 0 && this.f695g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f692c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        q b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f695g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.d) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof k) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            A.c.t0(this.f690a, checkableImageButton, this.f697k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        q b2 = b();
        P.b bVar = this.f707u;
        AccessibilityManager accessibilityManager = this.f706t;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(bVar));
        }
        this.f707u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f696j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        q b3 = b();
        int i2 = this.h.f689c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable t2 = i2 != 0 ? T.d.t(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f695g;
        checkableImageButton.setImageDrawable(t2);
        TextInputLayout textInputLayout = this.f690a;
        if (t2 != null) {
            A.c.d(textInputLayout, checkableImageButton, this.f697k, this.f698l);
            A.c.t0(textInputLayout, checkableImageButton, this.f697k);
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
        P.b h = b3.h();
        this.f707u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = S.f365a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new L.b(this.f707u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f701o;
        checkableImageButton.setOnClickListener(f2);
        A.c.C0(checkableImageButton, onLongClickListener);
        EditText editText = this.f705s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        A.c.d(textInputLayout, checkableImageButton, this.f697k, this.f698l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f695g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f690a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f692c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        A.c.d(this.f690a, checkableImageButton, this.d, this.f693e);
    }

    public final void j(q qVar) {
        if (this.f705s == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f705s.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f695g.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.f691b.setVisibility((this.f695g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f702p == null || this.f704r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f692c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f690a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2004j.f732q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f690a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = S.f365a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = S.f365a;
        this.f703q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0204b0 c0204b0 = this.f703q;
        int visibility = c0204b0.getVisibility();
        int i = (this.f702p == null || this.f704r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0204b0.setVisibility(i);
        this.f690a.q();
    }
}
