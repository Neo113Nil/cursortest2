package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.aat;
import defpackage.aow;
import defpackage.api;
import defpackage.byo;
import defpackage.fes;
import defpackage.fhq;
import defpackage.fik;
import defpackage.fip;
import defpackage.fiq;
import defpackage.fjq;
import defpackage.fjr;
import defpackage.fjw;
import defpackage.fmk;
import defpackage.fmo;
import defpackage.fnh;
import defpackage.fnw;
import defpackage.fny;
import defpackage.fnz;
import defpackage.fob;
import defpackage.fog;
import defpackage.fpa;
import defpackage.fqg;
import defpackage.fqh;
import defpackage.fqi;
import defpackage.fqs;
import defpackage.fqv;
import defpackage.fqy;
import defpackage.fra;
import defpackage.frb;
import defpackage.frc;
import defpackage.frd;
import defpackage.fre;
import defpackage.frg;
import defpackage.frj;
import defpackage.gbw;
import defpackage.hx;
import defpackage.jl;
import defpackage.kee;
import defpackage.va;
import defpackage.wl;
import defpackage.wn;
import defpackage.yq;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int s = 0;
    private static final int[][] t = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private int B;
    private int C;
    private ColorStateList D;
    private int E;
    private aow F;
    private aow G;
    private ColorStateList H;
    private ColorStateList I;
    private ColorStateList J;
    private ColorStateList K;
    private boolean L;
    private CharSequence M;
    private fob N;
    private fob O;
    private StateListDrawable P;
    private boolean Q;
    private fob R;
    private fob S;
    private fog T;
    private boolean U;
    private final int V;
    private int W;
    public final frb a;
    private ValueAnimator aA;
    private boolean aB;
    private boolean aC;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private final Rect af;
    private final Rect ag;
    private final RectF ah;
    private Drawable ai;
    private int aj;
    private Drawable ak;
    private int al;
    private Drawable am;
    private ColorStateList an;
    private ColorStateList ao;
    private int ap;
    private int aq;
    private int ar;
    private ColorStateList as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private boolean ay;
    private boolean az;
    public final fqs b;
    public EditText c;
    public final fqv d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public TextView k;
    public boolean l;
    public int m;
    public final LinkedHashSet n;
    public int o;
    public boolean p;
    public final fip q;
    public boolean r;
    private final FrameLayout u;
    private final int v;
    private CharSequence w;
    private int x;
    private int y;
    private int z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x042a  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, com.google.android.apps.authenticator2.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        int i2;
        int i3;
        ColorStateList r;
        CharSequence l;
        CharSequence l2;
        boolean o;
        int e;
        int e2;
        boolean z;
        int e3;
        ColorStateList i4;
        ColorStateList i5;
        ColorStateList i6;
        ColorStateList r2;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        fqv fqvVar = new fqv(this);
        this.d = fqvVar;
        this.af = new Rect();
        this.ag = new Rect();
        this.ah = new RectF();
        this.n = new LinkedHashSet();
        fip fipVar = new fip(this);
        this.q = fipVar;
        this.aC = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.u = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = fes.a;
        fipVar.E = timeInterpolator;
        fipVar.i(false);
        fipVar.D = timeInterpolator;
        fipVar.i(false);
        fipVar.m(8388659);
        byo c = fjw.c(context2, attributeSet, fra.c, i, com.google.android.apps.authenticator2.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        frb frbVar = new frb(this, c);
        this.a = frbVar;
        this.L = c.o(48, true);
        n(c.l(4));
        this.az = c.o(47, true);
        this.ay = c.o(42, true);
        if (c.p(6)) {
            q(c.e(6, -1));
        } else if (c.p(3)) {
            r(c.d(3, -1));
        }
        if (c.p(5)) {
            o(c.e(5, -1));
        } else if (c.p(2)) {
            p(c.d(2, -1));
        }
        this.T = new fog(fog.k(context2, attributeSet, i, com.google.android.apps.authenticator2.R.style.Widget_Design_TextInputLayout));
        this.V = context2.getResources().getDimensionPixelOffset(com.google.android.apps.authenticator2.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.W = c.c(9, 0);
        this.v = getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.ab = c.d(16, context2.getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.ac = c.d(17, context2.getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.aa = this.ab;
        float r3 = c.r(13);
        float r4 = c.r(12);
        float r5 = c.r(10);
        float r6 = c.r(11);
        gbw gbwVar = new gbw(this.T);
        if (r3 >= 0.0f) {
            gbwVar.i(r3);
        }
        if (r4 >= 0.0f) {
            gbwVar.j(r4);
        }
        if (r5 >= 0.0f) {
            gbwVar.h(r5);
        }
        if (r6 >= 0.0f) {
            gbwVar.g(r6);
        }
        this.T = new fog(gbwVar);
        ColorStateList r7 = fny.r(context2, c, 7);
        if (r7 != null) {
            i2 = -16842910;
            int defaultColor = r7.getDefaultColor();
            this.at = defaultColor;
            this.ae = defaultColor;
            if (r7.isStateful()) {
                this.au = r7.getColorForState(new int[]{-16842910}, -1);
                this.av = r7.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.aw = r7.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
                if (c.p(1)) {
                    ColorStateList i7 = c.i(1);
                    this.ao = i7;
                    this.an = i7;
                }
                r = fny.r(context2, c, 14);
                this.ar = c.q(14);
                this.ap = context2.getColor(com.google.android.apps.authenticator2.R.color.mtrl_textinput_default_box_stroke_color);
                this.ax = context2.getColor(com.google.android.apps.authenticator2.R.color.mtrl_textinput_disabled_color);
                this.aq = context2.getColor(com.google.android.apps.authenticator2.R.color.mtrl_textinput_hovered_box_stroke_color);
                if (r != null) {
                    if (r.isStateful()) {
                        this.ap = r.getDefaultColor();
                        this.ax = r.getColorForState(new int[]{i2}, -1);
                        this.aq = r.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
                        this.ar = r.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                    } else if (this.ar != r.getDefaultColor()) {
                        this.ar = r.getDefaultColor();
                    }
                    A();
                }
                if (c.p(15) && this.as != (r2 = fny.r(context2, c, 15))) {
                    this.as = r2;
                    A();
                }
                ?? r22 = 0;
                if (c.h(50, -1) != -1) {
                    fmo fmoVar = new fmo(fipVar.a.getContext(), c.h(50, 0));
                    ColorStateList colorStateList = fmoVar.k;
                    if (colorStateList != null) {
                        fipVar.i = colorStateList;
                    }
                    float f = fmoVar.l;
                    if (f != 0.0f) {
                        fipVar.g = f;
                    }
                    ColorStateList colorStateList2 = fmoVar.a;
                    if (colorStateList2 != null) {
                        fipVar.I = colorStateList2;
                    }
                    fipVar.G = fmoVar.f;
                    fipVar.H = fmoVar.g;
                    fipVar.F = fmoVar.h;
                    fipVar.J = fmoVar.j;
                    fmk fmkVar = fipVar.p;
                    if (fmkVar != null) {
                        fmkVar.c();
                    }
                    fipVar.p = new fmk(new kee(fipVar), fmoVar.a());
                    fmoVar.b(fipVar.a.getContext(), fipVar.p);
                    r22 = 0;
                    r22 = 0;
                    fipVar.i(false);
                    this.ao = fipVar.i;
                    if (this.c != null) {
                        y(false, false);
                        W();
                    }
                }
                this.J = c.i(24);
                this.K = c.i(25);
                int h = c.h(40, r22);
                CharSequence l3 = c.l(35);
                int e4 = c.e(34, 1);
                boolean o2 = c.o(36, r22);
                int h2 = c.h(45, r22);
                boolean o3 = c.o(44, r22);
                l = c.l(43);
                int h3 = c.h(58, r22);
                l2 = c.l(57);
                o = c.o(18, r22);
                e = c.e(19, -1);
                if (this.f != e) {
                    if (e > 0) {
                        this.f = e;
                    } else {
                        this.f = -1;
                    }
                    if (this.e) {
                        T();
                    }
                }
                this.C = c.h(22, 0);
                this.B = c.h(20, 0);
                e2 = c.e(8, 0);
                if (e2 != this.m) {
                    this.m = e2;
                    if (this.c != null) {
                        P();
                    }
                }
                fqvVar.g(l3);
                fqvVar.f(e4);
                fqvVar.j(h2);
                fqvVar.h(h);
                if (this.k != null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                    this.k = appCompatTextView;
                    appCompatTextView.setId(com.google.android.apps.authenticator2.R.id.textinput_placeholder);
                    this.k.setImportantForAccessibility(1);
                    this.k.setAccessibilityLiveRegion(1);
                    aow J = J();
                    this.F = J;
                    z = o2;
                    J.b = 67L;
                    this.G = J();
                    s(this.E);
                    t(this.D);
                    yq.l(this.k, new frd());
                } else {
                    z = o2;
                }
                if (TextUtils.isEmpty(l2)) {
                    if (!this.j) {
                        S(true);
                    }
                    this.i = l2;
                } else {
                    S(false);
                }
                X();
                s(h3);
                if (c.p(41)) {
                    fqvVar.i(c.i(41));
                }
                if (c.p(46)) {
                    fqvVar.k(c.i(46));
                }
                if (c.p(51) && this.ao != (i6 = c.i(51))) {
                    if (this.an == null) {
                        fipVar.l(i6);
                    }
                    this.ao = i6;
                    if (this.c != null) {
                        y(false, false);
                    }
                }
                if (c.p(23) && this.H != (i5 = c.i(23))) {
                    this.H = i5;
                    U();
                }
                if (c.p(21) && this.I != (i4 = c.i(21))) {
                    this.I = i4;
                    U();
                }
                if (c.p(59)) {
                    t(c.i(59));
                }
                fqs fqsVar = new fqs(this, c);
                this.b = fqsVar;
                boolean o4 = c.o(0, true);
                e3 = c.e(49, 1);
                if (e3 != fipVar.R) {
                    fipVar.R = e3;
                    fipVar.i(false);
                }
                if (e3 != fipVar.Q) {
                    fipVar.Q = e3;
                    fipVar.i(false);
                }
                requestLayout();
                c.n();
                setImportantForAccessibility(2);
                setImportantForAutofill(1);
                frameLayout.addView(frbVar);
                frameLayout.addView(fqsVar);
                addView(frameLayout);
                setEnabled(o4);
                m(o3);
                l(z);
                if (this.e != o) {
                    if (o) {
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext());
                        this.h = appCompatTextView2;
                        appCompatTextView2.setId(com.google.android.apps.authenticator2.R.id.textinput_counter);
                        this.h.setMaxLines(1);
                        fqvVar.a(this.h, 2);
                        ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.google.android.apps.authenticator2.R.dimen.mtrl_textinput_counter_margin_start));
                        U();
                        T();
                    } else {
                        fqvVar.e(this.h, 2);
                        this.h = null;
                    }
                    this.e = o;
                }
                if (!TextUtils.isEmpty(l)) {
                    if (B()) {
                        m(false);
                        return;
                    }
                    return;
                }
                if (!B()) {
                    m(true);
                }
                fqvVar.c();
                fqvVar.m = l;
                fqvVar.o.setText(l);
                int i8 = fqvVar.d;
                if (i8 != 2) {
                    fqvVar.e = 2;
                }
                fqvVar.l(i8, fqvVar.e, fqvVar.m(fqvVar.o, l));
                return;
            }
            this.av = this.at;
            ColorStateList d = aat.d(context2, com.google.android.apps.authenticator2.R.color.mtrl_filled_background_color);
            this.au = d.getColorForState(new int[]{-16842910}, -1);
            i3 = d.getColorForState(new int[]{R.attr.state_hovered}, -1);
        } else {
            i2 = -16842910;
            i3 = 0;
            this.ae = 0;
            this.at = 0;
            this.au = 0;
            this.av = 0;
        }
        this.aw = i3;
        if (c.p(1)) {
        }
        r = fny.r(context2, c, 14);
        this.ar = c.q(14);
        this.ap = context2.getColor(com.google.android.apps.authenticator2.R.color.mtrl_textinput_default_box_stroke_color);
        this.ax = context2.getColor(com.google.android.apps.authenticator2.R.color.mtrl_textinput_disabled_color);
        this.aq = context2.getColor(com.google.android.apps.authenticator2.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (r != null) {
        }
        if (c.p(15)) {
            this.as = r2;
            A();
        }
        ?? r222 = 0;
        if (c.h(50, -1) != -1) {
        }
        this.J = c.i(24);
        this.K = c.i(25);
        int h4 = c.h(40, r222);
        CharSequence l32 = c.l(35);
        int e42 = c.e(34, 1);
        boolean o22 = c.o(36, r222);
        int h22 = c.h(45, r222);
        boolean o32 = c.o(44, r222);
        l = c.l(43);
        int h32 = c.h(58, r222);
        l2 = c.l(57);
        o = c.o(18, r222);
        e = c.e(19, -1);
        if (this.f != e) {
        }
        this.C = c.h(22, 0);
        this.B = c.h(20, 0);
        e2 = c.e(8, 0);
        if (e2 != this.m) {
        }
        fqvVar.g(l32);
        fqvVar.f(e42);
        fqvVar.j(h22);
        fqvVar.h(h4);
        if (this.k != null) {
        }
        if (TextUtils.isEmpty(l2)) {
        }
        X();
        s(h32);
        if (c.p(41)) {
        }
        if (c.p(46)) {
        }
        if (c.p(51)) {
            if (this.an == null) {
            }
            this.ao = i6;
            if (this.c != null) {
            }
        }
        if (c.p(23)) {
            this.H = i5;
            U();
        }
        if (c.p(21)) {
            this.I = i4;
            U();
        }
        if (c.p(59)) {
        }
        fqs fqsVar2 = new fqs(this, c);
        this.b = fqsVar2;
        boolean o42 = c.o(0, true);
        e3 = c.e(49, 1);
        if (e3 != fipVar.R) {
        }
        if (e3 != fipVar.Q) {
        }
        requestLayout();
        c.n();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(frbVar);
        frameLayout.addView(fqsVar2);
        addView(frameLayout);
        setEnabled(o42);
        m(o32);
        l(z);
        if (this.e != o) {
        }
        if (!TextUtils.isEmpty(l)) {
        }
    }

    private final int E() {
        if (this.L) {
            int i = this.m;
            if (i == 0) {
                return (int) this.q.b();
            }
            if (i == 2) {
                boolean ab = ab();
                fip fipVar = this.q;
                return ab ? (int) (fipVar.b() / 2.0f) : Math.max(0, (int) (fipVar.b() - (fipVar.a() / 2.0f)));
            }
        }
        return 0;
    }

    private final int F(int i, boolean z) {
        int a;
        if (z) {
            if (h() != null) {
                a = this.b.a();
            }
            a = this.c.getCompoundPaddingLeft();
        } else {
            if (g() != null) {
                a = this.a.a();
            }
            a = this.c.getCompoundPaddingLeft();
        }
        return i + a;
    }

    private final int G(int i, boolean z) {
        int a;
        if (z) {
            if (g() != null) {
                a = this.a.a();
            }
            a = this.c.getCompoundPaddingRight();
        } else {
            if (h() != null) {
                a = this.b.a();
            }
            a = this.c.getCompoundPaddingRight();
        }
        return i - a;
    }

    private final Rect H(Rect rect) {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.ag;
        boolean i = fik.i(this);
        rect2.bottom = rect.bottom;
        int i2 = this.m;
        if (i2 == 1) {
            rect2.left = F(rect.left, i);
            rect2.top = rect.top + this.W;
            rect2.right = G(rect.right, i);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = F(rect.left, i);
            rect2.top = getPaddingTop();
            rect2.right = G(rect.right, i);
            return rect2;
        }
        rect2.left = rect.left + this.c.getPaddingLeft();
        rect2.top = rect.top - E();
        rect2.right = rect.right - this.c.getPaddingRight();
        return rect2;
    }

    private final Drawable I() {
        fob fobVar = this.O;
        if (fobVar != null) {
            return fobVar;
        }
        fob K = K(true);
        this.O = K;
        return K;
    }

    private final aow J() {
        aow aowVar = new aow();
        aowVar.c = fny.i(getContext(), com.google.android.apps.authenticator2.R.attr.motionDurationShort2, 87);
        aowVar.d = fny.p(getContext(), com.google.android.apps.authenticator2.R.attr.motionEasingLinearInterpolator, fes.a);
        return aowVar;
    }

    private final fob K(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.apps.authenticator2.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.c;
        float dimensionPixelOffset2 = editText instanceof fqy ? ((fqy) editText).c : getResources().getDimensionPixelOffset(com.google.android.apps.authenticator2.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        float f = true != z ? 0.0f : dimensionPixelOffset;
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.apps.authenticator2.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        gbw gbwVar = new gbw((byte[]) null);
        gbwVar.i(f);
        gbwVar.j(f);
        gbwVar.g(dimensionPixelOffset);
        gbwVar.h(dimensionPixelOffset);
        fog fogVar = new fog(gbwVar);
        EditText editText2 = this.c;
        fob E = fob.E(getContext(), dimensionPixelOffset2, editText2 instanceof fqy ? ((fqy) editText2).d : null);
        E.bz(fogVar);
        fnz fnzVar = E.p;
        if (fnzVar.i == null) {
            fnzVar.i = new Rect();
        }
        E.p.i.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        E.invalidateSelf();
        return E;
    }

    private final void L() {
        if (this.c == null || this.m != 1) {
            return;
        }
        if (!ab()) {
            EditText editText = this.c;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.q.b() + this.v), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            return;
        }
        if (fny.h(getContext())) {
            EditText editText2 = this.c;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.material_filled_edittext_font_2_0_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (fny.g(getContext())) {
            EditText editText3 = this.c;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.material_filled_edittext_font_1_3_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private final void M() {
        fob fobVar = this.N;
        if (fobVar == null) {
            return;
        }
        fog F = fobVar.F();
        fog fogVar = this.T;
        if (F != fogVar) {
            this.N.bz(fogVar);
        }
        if (this.m == 2 && Z()) {
            this.N.R(this.aa, this.ad);
        }
        int i = this.ae;
        if (this.m == 1) {
            i = va.b(this.ae, fhq.d(getContext(), com.google.android.apps.authenticator2.R.attr.colorSurface, 0));
        }
        this.ae = i;
        this.N.M(ColorStateList.valueOf(i));
        fob fobVar2 = this.R;
        if (fobVar2 != null && this.S != null) {
            if (Z()) {
                fobVar2.M(this.c.isFocused() ? ColorStateList.valueOf(this.ap) : ColorStateList.valueOf(this.ad));
                this.S.M(ColorStateList.valueOf(this.ad));
            }
            invalidate();
        }
        x();
    }

    private final void N() {
        if (aa()) {
            ((fqi) this.N).a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void O() {
        TextView textView = this.k;
        if (textView == null || !this.j) {
            return;
        }
        textView.setText((CharSequence) null);
        api.b(this.u, this.G);
        this.k.setVisibility(4);
    }

    private final void P() {
        int i = this.m;
        if (i == 0) {
            this.N = null;
            this.R = null;
            this.S = null;
        } else if (i == 1) {
            this.N = new fob(this.T);
            this.R = new fob();
            this.S = new fob();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(i + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.L || (this.N instanceof fqi)) {
                this.N = new fob(this.T);
            } else {
                fog fogVar = this.T;
                int i2 = fqi.b;
                if (fogVar == null) {
                    fogVar = new fog();
                }
                this.N = new fqh(new fqg(fogVar, new RectF()));
            }
            this.R = null;
            this.S = null;
        }
        x();
        A();
        if (this.m == 1) {
            if (fny.h(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (fny.g(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.apps.authenticator2.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        L();
        if (this.m != 0) {
            W();
        }
        EditText editText = this.c;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.m;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(I());
                    return;
                }
                if (i3 == 1) {
                    if (this.P == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.P = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, I());
                        this.P.addState(new int[0], K(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.P);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Q() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        int i2;
        if (!aa()) {
            return;
        }
        RectF rectF = this.ah;
        fip fipVar = this.q;
        int width = this.c.getWidth();
        int gravity = this.c.getGravity();
        boolean q = fipVar.q(fipVar.q);
        fipVar.s = q;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                if (q) {
                    i2 = fipVar.d.left;
                    f3 = i2;
                } else {
                    f = fipVar.d.right;
                    f2 = fipVar.M;
                }
            } else if (q) {
                f = fipVar.d.right;
                f2 = fipVar.M;
            } else {
                i2 = fipVar.d.left;
                f3 = i2;
            }
            Rect rect = fipVar.d;
            rectF.left = Math.max(f3, rect.left);
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (fipVar.s) {
                        f4 = rectF.left;
                        f5 = fipVar.M;
                    } else {
                        i = rect.right;
                        f6 = i;
                    }
                } else if (fipVar.s) {
                    i = rect.right;
                    f6 = i;
                } else {
                    f4 = rectF.left;
                    f5 = fipVar.M;
                }
                rectF.right = Math.min(f6, rect.right);
                rectF.bottom = rect.top + fipVar.b();
                if (fipVar.L != null && !fipVar.u()) {
                    float lineWidth = fipVar.L.getLineWidth(r2.getLineCount() - 1) * (fipVar.g / fipVar.f);
                    if (fipVar.s) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                    return;
                }
                float f7 = rectF.left;
                float f8 = this.V;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.aa);
                rectF.top = 0.0f;
                ((fqi) this.N).a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f4 = width / 2.0f;
            f5 = fipVar.M / 2.0f;
            f6 = f4 + f5;
            rectF.right = Math.min(f6, rect.right);
            rectF.bottom = rect.top + fipVar.b();
            if (fipVar.L != null) {
                float lineWidth2 = fipVar.L.getLineWidth(r2.getLineCount() - 1) * (fipVar.g / fipVar.f);
                if (fipVar.s) {
                }
            }
            if (rectF.width() <= 0.0f) {
                return;
            } else {
                return;
            }
        }
        f = width / 2.0f;
        f2 = fipVar.M / 2.0f;
        f3 = f - f2;
        Rect rect2 = fipVar.d;
        rectF.left = Math.max(f3, rect2.left);
        rectF.top = rect2.top;
        if (gravity == 17) {
        }
        f4 = width / 2.0f;
        f5 = fipVar.M / 2.0f;
        f6 = f4 + f5;
        rectF.right = Math.min(f6, rect2.right);
        rectF.bottom = rect2.top + fipVar.b();
        if (fipVar.L != null) {
        }
        if (rectF.width() <= 0.0f) {
        }
    }

    private static void R(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                R((ViewGroup) childAt, z);
            }
        }
    }

    private final void S(boolean z) {
        if (this.j == z) {
            return;
        }
        TextView textView = this.k;
        if (!z) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.k = null;
        } else if (textView != null) {
            this.u.addView(textView);
            this.k.setVisibility(0);
        }
        this.j = z;
    }

    private final void T() {
        if (this.h != null) {
            EditText editText = this.c;
            v(editText == null ? null : editText.getText());
        }
    }

    private final void U() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.h;
        if (textView != null) {
            u(textView, this.g ? this.B : this.C);
            if (!this.g && (colorStateList2 = this.H) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (!this.g || (colorStateList = this.I) == null) {
                return;
            }
            this.h.setTextColor(colorStateList);
        }
    }

    private final void V() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.J;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue j = fny.j(context, com.google.android.apps.authenticator2.R.attr.colorControlActivated);
            if (j != null) {
                if (j.resourceId != 0) {
                    colorStateList2 = aat.d(context, j.resourceId);
                } else if (j.data != 0) {
                    colorStateList2 = ColorStateList.valueOf(j.data);
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.c;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.c.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((C() || (this.h != null && this.g)) && (colorStateList = this.K) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    private final void W() {
        if (this.m != 1) {
            FrameLayout frameLayout = this.u;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int E = E();
            if (E != layoutParams.topMargin) {
                layoutParams.topMargin = E;
                frameLayout.requestLayout();
            }
        }
    }

    private final void X() {
        EditText editText = this.c;
        z(editText == null ? null : editText.getText());
    }

    private final void Y(boolean z, boolean z2) {
        int defaultColor = this.as.getDefaultColor();
        int colorForState = this.as.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.as.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ad = defaultColor;
    }

    private final boolean Z() {
        return this.aa >= 0 && this.ad != 0;
    }

    private final boolean aa() {
        return this.L && !TextUtils.isEmpty(this.M) && (this.N instanceof fqi);
    }

    private final boolean ab() {
        return this.q.Q == 1;
    }

    private final boolean ac() {
        return this.m == 1 && this.c.getMinLines() <= 1;
    }

    static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final void A() {
        int i;
        TextView textView;
        int i2;
        EditText editText;
        EditText editText2;
        if (this.N == null || this.m == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.c) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.c) != null && editText.isHovered());
        if (!isEnabled()) {
            this.ad = this.ax;
        } else if (!C()) {
            if (!this.g || (textView = this.h) == null) {
                i = z ? this.ar : z2 ? this.aq : this.ap;
            } else if (this.as != null) {
                Y(z, z2);
            } else {
                i = textView.getCurrentTextColor();
            }
            this.ad = i;
        } else if (this.as != null) {
            Y(z, z2);
        } else {
            this.ad = b();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            V();
        }
        fqs fqsVar = this.b;
        fqsVar.p();
        TextInputLayout textInputLayout = fqsVar.a;
        fhq.o(textInputLayout, fqsVar.b, fqsVar.c);
        fqsVar.g();
        if (fqsVar.c().u()) {
            if (!textInputLayout.C() || fqsVar.b() == null) {
                fhq.n(textInputLayout, fqsVar.d, fqsVar.f, fqsVar.g);
            } else {
                Drawable mutate = fqsVar.b().mutate();
                mutate.setTint(textInputLayout.b());
                fqsVar.d.setImageDrawable(mutate);
            }
        }
        this.a.d();
        if (this.m == 2) {
            int i3 = this.aa;
            if (z && isEnabled()) {
                i2 = this.ac;
                this.aa = i2;
            } else {
                i2 = this.ab;
                this.aa = i2;
            }
            if (i2 != i3 && aa() && !this.p) {
                N();
                Q();
            }
        }
        if (this.m == 1) {
            if (isEnabled()) {
                this.ae = (!z2 || z) ? z ? this.av : this.at : this.aw;
            } else {
                this.ae = this.au;
            }
        }
        M();
        if (a() == 3) {
            EditText editText3 = this.c;
            if (!(editText3 instanceof AutoCompleteTextView) || fhq.t(editText3)) {
                d().setFocusable(true);
                d().setClickable(true);
            } else {
                d().setFocusable(false);
                d().setClickable(false);
            }
        }
    }

    public final boolean B() {
        return this.d.n;
    }

    public final boolean C() {
        fqv fqvVar = this.d;
        return (fqvVar.e != 1 || fqvVar.h == null || TextUtils.isEmpty(fqvVar.f)) ? false : true;
    }

    public final boolean D() {
        boolean z;
        if (this.c == null) {
            return false;
        }
        frb frbVar = this.a;
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((frbVar.c.getDrawable() != null || (g() != null && frbVar.a.getVisibility() == 0)) && frbVar.getMeasuredWidth() > 0) {
            int max = Math.max(0, frbVar.getMeasuredWidth() - this.c.getPaddingLeft());
            if (this.ai == null || this.aj != max) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ai = colorDrawable;
                this.aj = max;
                colorDrawable.setBounds(0, 0, max, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ai;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ai != null) {
                Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
                this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ai = null;
                z = true;
            }
            z = false;
        }
        fqs fqsVar = this.b;
        if ((fqsVar.t() || ((fqsVar.r() && fqsVar.s()) || fqsVar.h != null)) && fqsVar.getMeasuredWidth() > 0) {
            int measuredWidth = fqsVar.i.getMeasuredWidth() - this.c.getPaddingRight();
            if (fqsVar.t()) {
                checkableImageButton = fqsVar.b;
            } else if (fqsVar.r() && fqsVar.s()) {
                checkableImageButton = fqsVar.d;
            }
            if (checkableImageButton != null) {
                measuredWidth = measuredWidth + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            int max2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            Drawable drawable3 = this.ak;
            if (drawable3 != null && this.al != max2) {
                this.al = max2;
                drawable3.setBounds(0, 0, max2, 1);
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ak, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.ak = colorDrawable2;
                this.al = max2;
                colorDrawable2.setBounds(0, 0, max2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.ak;
            if (drawable4 != drawable5) {
                this.am = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ak != null) {
            Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ak) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.am, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.ak = null;
            return z2;
        }
        return z;
    }

    public final int a() {
        return this.b.e;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.u;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        W();
        EditText editText = (EditText) view;
        if (this.c != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        a();
        this.c = editText;
        int i2 = this.x;
        if (i2 != -1) {
            q(i2);
        } else {
            r(this.z);
        }
        int i3 = this.y;
        if (i3 != -1) {
            o(i3);
        } else {
            p(this.A);
        }
        this.Q = false;
        P();
        fre freVar = new fre(this);
        EditText editText2 = this.c;
        if (editText2 != null) {
            yq.l(editText2, freVar);
        }
        fip fipVar = this.q;
        Typeface typeface = this.c.getTypeface();
        boolean s2 = fipVar.s(typeface);
        if (fipVar.o != typeface) {
            fipVar.o = typeface;
            fipVar.n = fny.b(fipVar.a.getContext().getResources().getConfiguration(), typeface);
            Typeface typeface2 = fipVar.n;
            if (typeface2 == null) {
                typeface2 = fipVar.o;
            }
            fipVar.m = typeface2;
            z = true;
        } else {
            z = false;
        }
        if (s2 || z) {
            fipVar.i(false);
        }
        fipVar.o(this.c.getTextSize());
        float letterSpacing = this.c.getLetterSpacing();
        if (fipVar.K != letterSpacing) {
            fipVar.K = letterSpacing;
            fipVar.i(false);
        }
        int gravity = this.c.getGravity();
        fipVar.m((gravity & (-113)) | 48);
        fipVar.n(gravity);
        this.o = editText.getMinimumHeight();
        this.c.addTextChangedListener(new frc(this, editText));
        if (this.an == null) {
            this.an = this.c.getHintTextColors();
        }
        if (this.L) {
            if (TextUtils.isEmpty(this.M)) {
                CharSequence hint = this.c.getHint();
                this.w = hint;
                n(hint);
                this.c.setHint((CharSequence) null);
            }
            this.l = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            V();
        }
        if (this.h != null) {
            v(this.c.getText());
        }
        w();
        this.d.b();
        this.a.bringToFront();
        fqs fqsVar = this.b;
        fqsVar.bringToFront();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((kee) it.next()).g(this);
        }
        fqsVar.q();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        y(false, true);
    }

    public final int b() {
        TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final CheckableImageButton d() {
        return this.b.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        AutofillId autofillId;
        EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.w != null) {
            boolean z = this.l;
            this.l = false;
            CharSequence hint = editText.getHint();
            this.c.setHint(this.w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.l = z;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.u;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.c) {
                newChild.setHint(f());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.r = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        fob fobVar;
        super.draw(canvas);
        if (this.L) {
            fip fipVar = this.q;
            int save = canvas.save();
            if (fipVar.r != null) {
                RectF rectF = fipVar.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = fipVar.B;
                    textPaint.setTextSize(fipVar.u);
                    float f = fipVar.k;
                    float f2 = fipVar.l;
                    float f3 = fipVar.t;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (fipVar.t() && fipVar.u()) {
                        float lineStart = fipVar.k - fipVar.L.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (fipVar.O * f4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(fipVar.v, fipVar.w, fipVar.x, fhq.b(fipVar.y, textPaint.getAlpha()));
                        }
                        fipVar.L.draw(canvas);
                        textPaint.setAlpha((int) (fipVar.N * f4));
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(fipVar.v, fipVar.w, fipVar.x, fhq.b(fipVar.y, textPaint.getAlpha()));
                        }
                        int lineBaseline = fipVar.L.getLineBaseline(0);
                        CharSequence charSequence = fipVar.P;
                        float f5 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(fipVar.v, fipVar.w, fipVar.x, fipVar.y);
                        }
                        String trim = fipVar.P.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(fipVar.L.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                        canvas = canvas;
                    } else {
                        canvas.translate(f, f2);
                        fipVar.L.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.S == null || (fobVar = this.R) == null) {
            return;
        }
        fobVar.draw(canvas);
        if (this.c.isFocused()) {
            Rect bounds = this.S.getBounds();
            Rect bounds2 = this.R.getBounds();
            float f6 = this.q.b;
            int centerX = bounds2.centerX();
            bounds.left = fes.b(centerX, bounds2.left, f6);
            bounds.right = fes.b(centerX, bounds2.right, f6);
            this.S.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.aB) {
            return;
        }
        this.aB = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        fip fipVar = this.q;
        if (fipVar != null) {
            fipVar.z = drawableState;
            ColorStateList colorStateList2 = fipVar.i;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = fipVar.h) != null && colorStateList.isStateful())) {
                fipVar.i(false);
                z = true;
                if (this.c != null) {
                    y(isLaidOut() && isEnabled(), false);
                }
                w();
                A();
                if (z) {
                    invalidate();
                }
                this.aB = false;
            }
        }
        z = false;
        if (this.c != null) {
        }
        w();
        A();
        if (z) {
        }
        this.aB = false;
    }

    public final CharSequence e() {
        fqv fqvVar = this.d;
        if (fqvVar.g) {
            return fqvVar.f;
        }
        return null;
    }

    public final CharSequence f() {
        if (this.L) {
            return this.M;
        }
        return null;
    }

    public final CharSequence g() {
        return this.a.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.c;
        return editText != null ? editText.getBaseline() + getPaddingTop() + E() : super.getBaseline();
    }

    public final CharSequence h() {
        return this.b.h;
    }

    final void i(float f) {
        fip fipVar = this.q;
        if (fipVar.b == f) {
            return;
        }
        if (this.aA == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.aA = valueAnimator;
            valueAnimator.setInterpolator(fny.p(getContext(), com.google.android.apps.authenticator2.R.attr.motionEasingEmphasizedInterpolator, fes.b));
            this.aA.setDuration(fny.i(getContext(), com.google.android.apps.authenticator2.R.attr.motionDurationMedium4, 167));
            this.aA.addUpdateListener(new fpa(this, 6));
        }
        this.aA.setFloatValues(fipVar.b, f);
        this.aA.start();
    }

    public final void j(boolean z) {
        this.b.m(z);
    }

    public final void k(CharSequence charSequence) {
        fqv fqvVar = this.d;
        if (!fqvVar.g) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                l(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            fqvVar.d();
            return;
        }
        fqvVar.c();
        fqvVar.f = charSequence;
        fqvVar.h.setText(charSequence);
        int i = fqvVar.d;
        if (i != 1) {
            fqvVar.e = 1;
        }
        fqvVar.l(i, fqvVar.e, fqvVar.m(fqvVar.h, charSequence));
    }

    public final void l(boolean z) {
        fqv fqvVar = this.d;
        if (fqvVar.g == z) {
            return;
        }
        fqvVar.c();
        if (z) {
            fqvVar.h = new AppCompatTextView(fqvVar.a);
            fqvVar.h.setId(com.google.android.apps.authenticator2.R.id.textinput_error);
            fqvVar.h.setTextAlignment(5);
            fqvVar.h(fqvVar.k);
            fqvVar.i(fqvVar.l);
            fqvVar.g(fqvVar.i);
            fqvVar.f(fqvVar.j);
            fqvVar.h.setVisibility(4);
            fqvVar.a(fqvVar.h, 0);
        } else {
            fqvVar.d();
            fqvVar.e(fqvVar.h, 0);
            fqvVar.h = null;
            TextInputLayout textInputLayout = fqvVar.b;
            textInputLayout.w();
            textInputLayout.A();
        }
        fqvVar.g = z;
    }

    public final void m(boolean z) {
        fqv fqvVar = this.d;
        if (fqvVar.n == z) {
            return;
        }
        fqvVar.c();
        if (z) {
            fqvVar.o = new AppCompatTextView(fqvVar.a);
            fqvVar.o.setId(com.google.android.apps.authenticator2.R.id.textinput_helper_text);
            fqvVar.o.setTextAlignment(5);
            fqvVar.o.setVisibility(4);
            fqvVar.o.setImportantForAccessibility(2);
            fqvVar.j(fqvVar.p);
            fqvVar.k(fqvVar.q);
            fqvVar.a(fqvVar.o, 1);
        } else {
            fqvVar.c();
            int i = fqvVar.d;
            if (i == 2) {
                fqvVar.e = 0;
            }
            fqvVar.l(i, fqvVar.e, fqvVar.m(fqvVar.o, ""));
            fqvVar.e(fqvVar.o, 1);
            fqvVar.o = null;
            TextInputLayout textInputLayout = fqvVar.b;
            textInputLayout.w();
            textInputLayout.A();
        }
        fqvVar.n = z;
    }

    public final void n(CharSequence charSequence) {
        if (this.L) {
            if (!TextUtils.equals(charSequence, this.M)) {
                this.M = charSequence;
                fip fipVar = this.q;
                if (charSequence == null || !TextUtils.equals(fipVar.q, charSequence)) {
                    fipVar.q = charSequence;
                    fipVar.r = null;
                    fipVar.i(false);
                }
                if (!this.p) {
                    Q();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void o(int i) {
        this.y = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        fqs fqsVar = this.b;
        fqsVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.aC = false;
        if (this.c != null) {
            int max = Math.max(fqsVar.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < max) {
                this.c.setMinimumHeight(max);
                z = true;
            }
        }
        boolean D = D();
        if (z || D) {
            this.c.post(new fnh(this, 9));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float descent;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c;
        if (editText != null) {
            Rect rect = this.af;
            fiq.a(this, editText, rect);
            if (this.R != null) {
                this.R.setBounds(rect.left, rect.bottom - this.ab, rect.right, rect.bottom);
            }
            if (this.S != null) {
                this.S.setBounds(rect.left, rect.bottom - this.ac, rect.right, rect.bottom);
            }
            if (this.L) {
                fip fipVar = this.q;
                fipVar.o(this.c.getTextSize());
                int gravity = this.c.getGravity();
                fipVar.m((gravity & (-113)) | 48);
                fipVar.n(gravity);
                fipVar.k(H(rect));
                if (this.c == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.ag;
                if (ab()) {
                    descent = fipVar.c();
                } else {
                    TextPaint textPaint = fipVar.C;
                    fipVar.g(textPaint);
                    descent = fipVar.j * ((-textPaint.ascent()) + textPaint.descent());
                }
                rect2.left = rect.left + this.c.getCompoundPaddingLeft();
                if (ac()) {
                    compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                } else {
                    compoundPaddingTop = (rect.top + this.c.getCompoundPaddingTop()) - ((this.m != 0 || ab()) ? 0 : (int) (fipVar.c() / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.c.getCompoundPaddingRight();
                rect2.bottom = ac() ? (int) (rect2.top + descent) : rect.bottom - this.c.getCompoundPaddingBottom();
                int i5 = rect2.left;
                int i6 = rect2.top;
                int i7 = rect2.right;
                int i8 = rect2.bottom;
                Rect rect3 = fipVar.c;
                if (!fip.r(rect3, i5, i6, i7, i8) || !fipVar.U) {
                    rect3.set(i5, i6, i7, i8);
                    fipVar.A = true;
                    fipVar.U = true;
                }
                fipVar.i(false);
                if (!aa() || this.p) {
                    return;
                }
                Q();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        if (!this.aC) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aC = true;
        }
        if (this.k != null && (editText = this.c) != null) {
            this.k.setGravity(editText.getGravity());
            this.k.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.q();
        if (ab()) {
            return;
        }
        int measuredWidth = (this.c.getMeasuredWidth() - this.c.getCompoundPaddingLeft()) - this.c.getCompoundPaddingRight();
        fip fipVar = this.q;
        TextPaint textPaint = fipVar.C;
        fipVar.f(textPaint);
        float f = measuredWidth;
        fipVar.S = fipVar.e(fipVar.R, textPaint, fipVar.q, (fipVar.g / fipVar.f) * f, fipVar.s).getHeight();
        fipVar.g(textPaint);
        fipVar.T = fipVar.e(fipVar.Q, textPaint, fipVar.q, f, fipVar.s).getHeight();
        Rect rect = this.af;
        fiq.a(this, this.c, rect);
        fipVar.k(H(rect));
        W();
        L();
        if (this.c == null) {
            return;
        }
        int i3 = fipVar.T;
        float c = i3 != -1 ? i3 : fipVar.c();
        float f2 = 0.0f;
        if (this.i != null) {
            TextPaint textPaint2 = new TextPaint(129);
            textPaint2.set(this.k.getPaint());
            textPaint2.setTextSize(this.k.getTextSize());
            textPaint2.setTypeface(this.k.getTypeface());
            textPaint2.setLetterSpacing(this.k.getLetterSpacing());
            try {
                fjr fjrVar = new fjr(this.i, textPaint2, measuredWidth);
                fjrVar.e = getLayoutDirection() == 1;
                fjrVar.d = true;
                fjrVar.b(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier());
                fjrVar.g = new kee(this, null);
                f2 = fjrVar.a().getHeight() + (this.m == 1 ? fipVar.b() + this.W + this.v : 0.0f);
            } catch (fjq e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float max = Math.max(c, f2);
        if (this.c.getMeasuredHeight() < max) {
            this.c.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof frg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        frg frgVar = (frg) parcelable;
        super.onRestoreInstanceState(frgVar.d);
        k(frgVar.a);
        if (frgVar.b) {
            post(new fnh(this, 10, null));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.U) {
            fnw fnwVar = this.T.b;
            RectF rectF = this.ah;
            float a = fnwVar.a(rectF);
            float a2 = this.T.c.a(rectF);
            float a3 = this.T.e.a(rectF);
            float a4 = this.T.d.a(rectF);
            fog fogVar = this.T;
            fny fnyVar = fogVar.j;
            fny fnyVar2 = fogVar.k;
            fny fnyVar3 = fogVar.m;
            fny fnyVar4 = fogVar.l;
            gbw gbwVar = new gbw((byte[]) null);
            gbwVar.n(fnyVar2);
            gbwVar.o(fnyVar);
            gbwVar.l(fnyVar4);
            gbwVar.m(fnyVar3);
            gbwVar.i(a2);
            gbwVar.j(a);
            gbwVar.g(a4);
            gbwVar.h(a3);
            fog fogVar2 = new fog(gbwVar);
            this.U = z;
            fob fobVar = this.N;
            if (fobVar == null || fobVar.F() == fogVar2) {
                return;
            }
            this.T = fogVar2;
            M();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        frg frgVar = new frg(super.onSaveInstanceState());
        if (C()) {
            frgVar.a = e();
        }
        fqs fqsVar = this.b;
        boolean z = false;
        if (fqsVar.r() && fqsVar.d.a) {
            z = true;
        }
        frgVar.b = z;
        return frgVar;
    }

    public final void p(int i) {
        this.A = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public final void q(int i) {
        this.x = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public final void r(int i) {
        this.z = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public final void s(int i) {
        this.E = i;
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        R(this, z);
        super.setEnabled(z);
    }

    public final void t(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            TextView textView = this.k;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public final void u(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.google.android.apps.authenticator2.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(getContext().getColor(com.google.android.apps.authenticator2.R.color.design_error));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(Editable editable) {
        String str;
        int c = c(editable);
        boolean z = this.g;
        int i = this.f;
        String str2 = null;
        if (i == -1) {
            this.h.setText(String.valueOf(c));
            this.h.setContentDescription(null);
            this.g = false;
        } else {
            this.g = c > i;
            Context context = getContext();
            TextView textView = this.h;
            int i2 = this.f;
            int i3 = true != this.g ? com.google.android.apps.authenticator2.R.string.character_counter_content_description : com.google.android.apps.authenticator2.R.string.character_counter_overflowed_content_description;
            Integer valueOf = Integer.valueOf(c);
            textView.setContentDescription(context.getString(i3, valueOf, Integer.valueOf(i2)));
            if (z != this.g) {
                U();
            }
            String str3 = wl.a;
            wl wlVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? wl.d : wl.c;
            TextView textView2 = this.h;
            String string = getContext().getString(com.google.android.apps.authenticator2.R.string.character_counter_pattern, valueOf, Integer.valueOf(this.f));
            if (string != null) {
                boolean c2 = wlVar.h.c(string, string.length());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i4 = wlVar.f;
                boolean c3 = (c2 ? wn.b : wn.a).c(string, string.length());
                boolean z2 = wlVar.e;
                String str4 = "";
                if (!z2) {
                    if (c3 || wl.a(string) == 1) {
                        str = wl.a;
                        spannableStringBuilder.append((CharSequence) str);
                        if (c2 == z2) {
                            spannableStringBuilder.append(true != c2 ? (char) 8234 : (char) 8235);
                            spannableStringBuilder.append((CharSequence) string);
                            spannableStringBuilder.append((char) 8236);
                        } else {
                            spannableStringBuilder.append((CharSequence) string);
                        }
                        boolean c4 = (!c2 ? wn.b : wn.a).c(string, string.length());
                        if (!z2) {
                            if (c4 || wl.b(string) == 1) {
                                str4 = wl.a;
                                spannableStringBuilder.append((CharSequence) str4);
                                str2 = spannableStringBuilder.toString();
                            } else {
                                c4 = false;
                            }
                        }
                        if (z2 && (!c4 || wl.b(string) == -1)) {
                            str4 = wl.b;
                        }
                        spannableStringBuilder.append((CharSequence) str4);
                        str2 = spannableStringBuilder.toString();
                    } else {
                        c3 = false;
                    }
                }
                str = (!z2 || (c3 && wl.a(string) != -1)) ? "" : wl.b;
                spannableStringBuilder.append((CharSequence) str);
                if (c2 == z2) {
                }
                boolean c42 = (!c2 ? wn.b : wn.a).c(string, string.length());
                if (!z2) {
                }
                if (z2) {
                    str4 = wl.b;
                }
                spannableStringBuilder.append((CharSequence) str4);
                str2 = spannableStringBuilder.toString();
            }
            textView2.setText(str2);
        }
        if (this.c == null || z == this.g) {
            return;
        }
        y(false, false);
        A();
        w();
    }

    public final void w() {
        Drawable background;
        TextView textView;
        EditText editText = this.c;
        if (editText == null || this.m != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = jl.a;
        Drawable mutate = background.mutate();
        if (C()) {
            mutate.setColorFilter(hx.b(b(), PorterDuff.Mode.SRC_IN));
        } else if (this.g && (textView = this.h) != null) {
            mutate.setColorFilter(hx.b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.c.refreshDrawableState();
        }
    }

    public final void x() {
        Drawable drawable;
        EditText editText = this.c;
        if (editText == null || this.N == null) {
            return;
        }
        if ((this.Q || editText.getBackground() == null) && this.m != 0) {
            EditText editText2 = this.c;
            if (!(editText2 instanceof AutoCompleteTextView) || fhq.t(editText2)) {
                drawable = this.N;
            } else {
                int c = fhq.c(this.c, com.google.android.apps.authenticator2.R.attr.colorControlHighlight);
                int i = this.m;
                if (i == 2) {
                    Context context = getContext();
                    fob fobVar = this.N;
                    int[][] iArr = t;
                    int g = fhq.g(context, "TextInputLayout");
                    fob fobVar2 = new fob(fobVar.F());
                    int e = fhq.e(c, g, 0.1f);
                    fobVar2.M(new ColorStateList(iArr, new int[]{e, 0}));
                    fobVar2.setTint(g);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{e, g});
                    fob fobVar3 = new fob(fobVar.F());
                    fobVar3.setTint(-1);
                    drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fobVar2, fobVar3), fobVar});
                } else if (i == 1) {
                    fob fobVar4 = this.N;
                    int i2 = this.ae;
                    drawable = new RippleDrawable(new ColorStateList(t, new int[]{fhq.e(c, i2, 0.1f), i2}), fobVar4, fobVar4);
                } else {
                    drawable = null;
                }
            }
            this.c.setBackground(drawable);
            this.Q = true;
        }
    }

    public final void y(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.c;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.an;
        if (colorStateList2 != null) {
            this.q.j(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.an;
            int i = this.ax;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            this.q.j(ColorStateList.valueOf(i));
        } else if (C()) {
            fip fipVar = this.q;
            TextView textView2 = this.d.h;
            fipVar.j(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.g && (textView = this.h) != null) {
            this.q.j(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ao) != null) {
            this.q.l(colorStateList);
        }
        if (z3 || !this.ay || (isEnabled() && z4)) {
            if (z2 || this.p) {
                ValueAnimator valueAnimator = this.aA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aA.cancel();
                }
                if (z && this.az) {
                    i(1.0f);
                } else {
                    this.q.p(1.0f);
                }
                this.p = false;
                if (aa()) {
                    Q();
                }
                X();
                this.a.c(false);
                this.b.f(false);
                return;
            }
            return;
        }
        if (z2 || !this.p) {
            ValueAnimator valueAnimator2 = this.aA;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aA.cancel();
            }
            if (z && this.az) {
                i(0.0f);
            } else {
                this.q.p(0.0f);
            }
            if (aa() && !((fqi) this.N).a.w.isEmpty()) {
                N();
            }
            this.p = true;
            O();
            this.a.c(true);
            this.b.f(true);
        }
    }

    public final void z(Editable editable) {
        if (c(editable) != 0 || this.p) {
            O();
            return;
        }
        if (this.k == null || !this.j || TextUtils.isEmpty(this.i)) {
            return;
        }
        this.k.setText(this.i);
        api.b(this.u, this.F);
        this.k.setVisibility(0);
        this.k.bringToFront();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
