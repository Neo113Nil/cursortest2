package U0;

import G1.AbstractC0001b;
import K.Q;
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
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0223a0;
import u0.C0372k;

/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1170a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f1171b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f1172c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f1173e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f1174f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f1175g;
    public final o h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f1176j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1177k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1178l;

    /* renamed from: m, reason: collision with root package name */
    public int f1179m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f1180n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f1181o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1182p;

    /* renamed from: q, reason: collision with root package name */
    public final C0223a0 f1183q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1184r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f1185s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f1186t;

    /* renamed from: u, reason: collision with root package name */
    public P.b f1187u;

    /* renamed from: v, reason: collision with root package name */
    public final l f1188v;

    public p(TextInputLayout textInputLayout, C0372k c0372k) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f1176j = new LinkedHashSet();
        this.f1188v = new l(this);
        m mVar = new m(this);
        this.f1186t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1170a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1171b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f1172c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f1175g = a3;
        this.h = new o(this, c0372k);
        C0223a0 c0223a0 = new C0223a0(getContext(), null);
        this.f1183q = c0223a0;
        TypedArray typedArray = (TypedArray) c0372k.f4191b;
        if (typedArray.hasValue(38)) {
            this.d = H1.l.C(getContext(), c0372k, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f1173e = L0.k.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0372k.d(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = Q.f578a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f1177k = H1.l.C(getContext(), c0372k, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1178l = L0.k.g(typedArray.getInt(33, -1), null);
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
                this.f1177k = H1.l.C(getContext(), c0372k, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f1178l = L0.k.g(typedArray.getInt(55, -1), null);
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
        if (dimensionPixelSize != this.f1179m) {
            this.f1179m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType q2 = H1.d.q(typedArray.getInt(31, -1));
            this.f1180n = q2;
            a3.setScaleType(q2);
            a2.setScaleType(q2);
        }
        c0223a0.setVisibility(8);
        c0223a0.setId(R.id.textinput_suffix_text);
        c0223a0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0223a0.setAccessibilityLiveRegion(1);
        c0223a0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0223a0.setTextColor(c0372k.c(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f1182p = TextUtils.isEmpty(text3) ? null : text3;
        c0223a0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0223a0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f2394e0.add(mVar);
        if (textInputLayout.d != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (H1.l.O(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q fVar;
        int i = this.i;
        o oVar = this.h;
        SparseArray sparseArray = oVar.f1167a;
        q qVar = (q) sparseArray.get(i);
        if (qVar == null) {
            p pVar = oVar.f1168b;
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
                    throw new IllegalArgumentException(AbstractC0001b.f("Invalid end icon mode: ", i));
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
            CheckableImageButton checkableImageButton = this.f1175g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = Q.f578a;
        return this.f1183q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f1171b.getVisibility() == 0 && this.f1175g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f1172c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        q b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f1175g;
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
            H1.d.c0(this.f1170a, checkableImageButton, this.f1177k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        q b2 = b();
        P.b bVar = this.f1187u;
        AccessibilityManager accessibilityManager = this.f1186t;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(bVar));
        }
        this.f1187u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f1176j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        q b3 = b();
        int i2 = this.h.f1169c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable j2 = i2 != 0 ? AbstractC0091d.j(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f1175g;
        checkableImageButton.setImageDrawable(j2);
        TextInputLayout textInputLayout = this.f1170a;
        if (j2 != null) {
            H1.d.c(textInputLayout, checkableImageButton, this.f1177k, this.f1178l);
            H1.d.c0(textInputLayout, checkableImageButton, this.f1177k);
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
        this.f1187u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = Q.f578a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new L.b(this.f1187u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f1181o;
        checkableImageButton.setOnClickListener(f2);
        H1.d.l0(checkableImageButton, onLongClickListener);
        EditText editText = this.f1185s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        H1.d.c(textInputLayout, checkableImageButton, this.f1177k, this.f1178l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f1175g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f1170a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1172c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        H1.d.c(this.f1170a, checkableImageButton, this.d, this.f1173e);
    }

    public final void j(q qVar) {
        if (this.f1185s == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f1185s.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f1175g.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.f1171b.setVisibility((this.f1175g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f1182p == null || this.f1184r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f1172c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1170a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2401j.f1212q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f1170a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = Q.f578a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = Q.f578a;
        this.f1183q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0223a0 c0223a0 = this.f1183q;
        int visibility = c0223a0.getVisibility();
        int i = (this.f1182p == null || this.f1184r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0223a0.setVisibility(i);
        this.f1170a.q();
    }
}
