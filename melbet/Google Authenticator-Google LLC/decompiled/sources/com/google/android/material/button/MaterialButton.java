package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.Cfor;
import defpackage.a;
import defpackage.acu;
import defpackage.e;
import defpackage.evp;
import defpackage.fgg;
import defpackage.fgh;
import defpackage.fgi;
import defpackage.fgj;
import defpackage.fgk;
import defpackage.fgl;
import defpackage.fhq;
import defpackage.fjw;
import defpackage.fmq;
import defpackage.fny;
import defpackage.fob;
import defpackage.fof;
import defpackage.fog;
import defpackage.foy;
import defpackage.frj;
import defpackage.hs;
import defpackage.ht;
import defpackage.kee;
import defpackage.md;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialButton extends ht implements Checkable, Cfor {
    private static final int[] k = {R.attr.state_checkable};
    private static final int[] l = {R.attr.state_checked};
    private int A;
    private int B;
    private int C;
    private int D;
    public final fgj b;
    public ColorStateList c;
    public Drawable d;
    public int e;
    public float f;
    public boolean g;
    public int h;
    public boolean i;
    int j;
    private final LinkedHashSet m;
    private PorterDuff.Mode n;
    private PorterDuff.Mode o;
    private ColorStateList p;
    private Drawable q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(frj.b(context, attributeSet, i, com.google.android.apps.authenticator2.R.style.Widget_MaterialComponents_Button, new int[]{com.google.android.apps.authenticator2.R.attr.materialSizeOverlay}), attributeSet, i);
        Object[] objArr;
        FocusRingDrawable focusRingDrawable;
        this.m = new LinkedHashSet();
        this.y = false;
        this.z = false;
        this.B = Integer.MIN_VALUE;
        this.f = -2.1474836E9f;
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        Context context2 = getContext();
        TypedArray a = fjw.a(context2, attributeSet, fgl.a, i, com.google.android.apps.authenticator2.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.v = a.getDimensionPixelSize(13, 0);
        this.n = a.q(a.getInt(16, -1), PorterDuff.Mode.SRC_IN);
        this.c = fny.e(getContext(), a, 15);
        this.d = fny.f(getContext(), a, 11);
        this.e = a.getInteger(12, 1);
        this.s = a.getDimensionPixelSize(14, 0);
        this.o = a.q(a.getInt(22, -1), PorterDuff.Mode.SRC_IN);
        this.p = a.hasValue(21) ? fny.e(getContext(), a, 21) : this.c;
        this.A = a.getInteger(20, 3);
        Drawable f = fny.f(getContext(), a, 19);
        this.q = f;
        this.r = f == null;
        fof f2 = foy.f(context2, a, 23);
        f2 = f2 == null ? new fog(fog.k(context2, attributeSet, i, com.google.android.apps.authenticator2.R.style.Widget_MaterialComponents_Button)) : f2;
        boolean z = a.getBoolean(17, false);
        fgj fgjVar = new fgj(this, f2);
        this.b = fgjVar;
        fgjVar.d = a.getDimensionPixelOffset(2, 0);
        fgjVar.e = a.getDimensionPixelOffset(3, 0);
        fgjVar.f = a.getDimensionPixelOffset(4, 0);
        fgjVar.g = a.getDimensionPixelOffset(5, 0);
        if (a.hasValue(9)) {
            int dimensionPixelSize = a.getDimensionPixelSize(9, -1);
            fgjVar.h = dimensionPixelSize;
            fgjVar.c(fgjVar.b.c(dimensionPixelSize));
        }
        fgjVar.i = a.getDimensionPixelSize(26, 0);
        fgjVar.j = a.q(a.getInt(8, -1), PorterDuff.Mode.SRC_IN);
        fgjVar.k = fny.e(fgjVar.a.getContext(), a, 7);
        fgjVar.l = fny.e(fgjVar.a.getContext(), a, 25);
        fgjVar.m = fny.e(fgjVar.a.getContext(), a, 18);
        fgjVar.p = a.getBoolean(6, false);
        fgjVar.s = a.getDimensionPixelSize(10, 0);
        fgjVar.q = a.getBoolean(27, true);
        int paddingStart = fgjVar.a.getPaddingStart();
        int paddingTop = fgjVar.a.getPaddingTop();
        int paddingEnd = fgjVar.a.getPaddingEnd();
        int paddingBottom = fgjVar.a.getPaddingBottom();
        if (a.hasValue(0)) {
            fgjVar.b();
            objArr = true;
        } else {
            MaterialButton materialButton = fgjVar.a;
            objArr = true;
            fob fobVar = new fob(fgjVar.b);
            acu acuVar = fgjVar.c;
            if (acuVar != null) {
                fobVar.K(acuVar);
            }
            kee keeVar = fgjVar.t;
            if (keeVar != null) {
                fobVar.A = keeVar;
            }
            Context context3 = fgjVar.a.getContext();
            fobVar.J(context3);
            fobVar.setTintList(fgjVar.k);
            PorterDuff.Mode mode = fgjVar.j;
            if (mode != null) {
                fobVar.setTintMode(mode);
            }
            fobVar.S(fgjVar.i, fgjVar.l);
            fob fobVar2 = new fob(fgjVar.b);
            acu acuVar2 = fgjVar.c;
            if (acuVar2 != null) {
                fobVar2.K(acuVar2);
            }
            fobVar2.setTint(0);
            fobVar2.R(fgjVar.i, 0);
            fgjVar.n = new fob(fgjVar.b);
            acu acuVar3 = fgjVar.c;
            if (acuVar3 != null) {
                ((fob) fgjVar.n).K(acuVar3);
            }
            fgjVar.n.setTint(-1);
            fgjVar.r = new RippleDrawable(fmq.b(fgjVar.m), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fobVar2, fobVar}), fgjVar.d, fgjVar.f, fgjVar.e, fgjVar.g), fgjVar.n);
            FocusRingDrawable.a(context3, fgjVar.r, null);
            super.setBackgroundDrawable(fgjVar.r);
            fob a2 = fgjVar.a(false);
            if (a2 != null) {
                a2.L(fgjVar.s);
                a2.setState(fgjVar.a.getDrawableState());
            }
            Drawable background = fgjVar.a.getBackground();
            if (background instanceof FocusRingDrawable) {
                focusRingDrawable = (FocusRingDrawable) background;
            } else {
                if (background instanceof DrawableWrapper) {
                    Drawable drawable = ((DrawableWrapper) background).getDrawable();
                    if (drawable instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable;
                    }
                }
                if (background instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) background;
                    for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
                        Drawable drawable2 = layerDrawable.getDrawable(i2);
                        if (drawable2 instanceof FocusRingDrawable) {
                            focusRingDrawable = (FocusRingDrawable) drawable2;
                            break;
                        }
                    }
                }
                focusRingDrawable = null;
            }
            if (focusRingDrawable != null) {
                focusRingDrawable.b(a2);
            }
        }
        fgjVar.a.setPaddingRelative(paddingStart + fgjVar.d, paddingTop + fgjVar.f, paddingEnd + fgjVar.e, paddingBottom + fgjVar.g);
        Object[] objArr2 = objArr;
        r(a.getBoolean(objArr2 == true ? 1 : 0, false));
        if (f2 instanceof foy) {
            fgj fgjVar2 = this.b;
            fgjVar2.c = fny.q(getContext(), com.google.android.apps.authenticator2.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (fgjVar2.b instanceof foy) {
                fgjVar2.d();
            }
        }
        if (this.g != z) {
            this.g = z;
            fgj fgjVar3 = this.b;
            if (z) {
                fgjVar3.e(new kee(this, null));
            } else {
                fgjVar3.e(null);
            }
            post(new evp(this, 12));
        }
        a.recycle();
        setCompoundDrawablePadding(this.v);
        g(this.d != null ? objArr2 == true ? 1 : 0 : false);
        s(this.q != null ? objArr2 == true ? 1 : 0 : false);
    }

    private final boolean A() {
        int i = this.A;
        return i == 3 || i == 4;
    }

    private final boolean B() {
        int i = this.A;
        return i == 1 || i == 2;
    }

    private final boolean C() {
        int i = this.A;
        return i == 16 || i == 32;
    }

    private final boolean D() {
        fgj fgjVar = this.b;
        return (fgjVar == null || fgjVar.o) ? false : true;
    }

    private final int l(int i, int i2) {
        int i3;
        int i4;
        Drawable drawable = this.d;
        if (drawable != null) {
            i3 = this.s;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
        } else {
            i3 = 0;
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            i4 = this.s;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
        } else {
            i4 = 0;
        }
        int n = (((((i - n()) - getPaddingEnd()) - i3) - i4) - this.v) - getPaddingStart();
        if (q() == Layout.Alignment.ALIGN_CENTER) {
            n /= 2;
        }
        return z() != (i2 == 4) ? -n : n;
    }

    private final int m(int i, int i2) {
        int min;
        if (getLineCount() > 1) {
            min = getLayout().getHeight();
        } else {
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            Rect rect = new Rect();
            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
            min = Math.min(rect.height(), getLayout().getHeight());
        }
        return Math.max(0, (((((i - min) - getPaddingTop()) - i2) - this.v) - getPaddingBottom()) / 2);
    }

    private final int n() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private final Drawable o(int i) {
        if (i == 0) {
            Drawable drawable = this.q;
            if (drawable == null || !B()) {
                return null;
            }
            return drawable;
        }
        Drawable drawable2 = this.q;
        if (i != 1) {
            if (drawable2 == null || !A()) {
                return null;
            }
            return drawable2;
        }
        if (drawable2 == null || !C()) {
            return null;
        }
        return drawable2;
    }

    private final Drawable p(int i) {
        Drawable drawable = this.d;
        if (i != 0) {
            if (drawable == null || !w()) {
                return null;
            }
            return drawable;
        }
        if (drawable == null || !x()) {
            return null;
        }
        return drawable;
    }

    private final Layout.Alignment q() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            return (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
        }
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private final void r(boolean z) {
        if (!k() || this.y == z) {
            return;
        }
        this.y = z;
        refreshDrawableState();
        if (getParent() instanceof fgk) {
            throw null;
        }
        if (this.z) {
            return;
        }
        this.z = true;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((fgg) it.next()).a();
        }
        this.z = false;
    }

    private final void s(boolean z) {
        Drawable drawable = this.q;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.q = mutate;
            mutate.setTintList(this.p);
            PorterDuff.Mode mode = this.o;
            if (mode != null) {
                this.q.setTintMode(mode);
            }
            int i = this.s;
            if (i == 0) {
                i = this.q.getIntrinsicWidth();
            }
            int i2 = this.s;
            if (i2 == 0) {
                i2 = this.q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.q;
            int i3 = this.w;
            int i4 = this.x;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.q.setVisible(true, z);
        }
        Drawable drawable3 = this.q;
        if (drawable3 != null && this.d != null && u()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (drawable3 == null) {
            if (this.r) {
                return;
            }
            if (this.d != null && u()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (B() && compoundDrawablesRelative[0] != this.q) || (A() && compoundDrawablesRelative[2] != this.q) || (C() && compoundDrawablesRelative[1] != this.q);
        if (z || z2) {
            if (B()) {
                setCompoundDrawablesRelative(this.q, p(1), p(2), null);
            } else if (A()) {
                setCompoundDrawablesRelative(p(0), p(1), this.q, null);
            } else if (C()) {
                setCompoundDrawablesRelative(p(0), this.q, p(2), null);
            }
        }
    }

    private final void t(int i, int i2) {
        if (this.q == null || getLayout() == null) {
            return;
        }
        if (B() || A()) {
            this.x = 0;
            if (v(this.A)) {
                this.w = 0;
                s(false);
                return;
            }
            int l2 = l(i, this.A);
            if (this.w != l2) {
                this.w = l2;
                s(false);
                return;
            }
            return;
        }
        if (C()) {
            this.w = 0;
            if (this.A == 16) {
                this.x = 0;
                s(false);
                return;
            }
            int i3 = this.s;
            if (i3 == 0) {
                i3 = this.q.getIntrinsicHeight();
            }
            int m = m(i2, i3);
            if (this.x != m) {
                this.x = m;
                s(false);
            }
        }
    }

    private final boolean u() {
        if (x() && B()) {
            return true;
        }
        if (w() && A()) {
            return true;
        }
        return y() && C();
    }

    private final boolean v(int i) {
        Layout.Alignment q = q();
        if (i == 1 || i == 3) {
            return true;
        }
        return i == 2 ? q == Layout.Alignment.ALIGN_NORMAL : i == 4 && q == Layout.Alignment.ALIGN_OPPOSITE;
    }

    private final boolean w() {
        int i = this.e;
        return i == 3 || i == 4;
    }

    private final boolean x() {
        int i = this.e;
        return i == 1 || i == 2;
    }

    private final boolean y() {
        int i = this.e;
        return i == 16 || i == 32;
    }

    private final boolean z() {
        return getLayoutDirection() == 1;
    }

    @Override // defpackage.Cfor
    public final void bz(fog fogVar) {
        if (!D()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.b.c(fogVar);
    }

    final String c() {
        if (TextUtils.isEmpty(null)) {
            return (true != k() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    public final void e(ColorStateList colorStateList) {
        if (D()) {
            fgj fgjVar = this.b;
            if (fgjVar.k != colorStateList) {
                fgjVar.k = colorStateList;
                if (fgjVar.a(false) != null) {
                    fgjVar.a(false).setTintList(fgjVar.k);
                    return;
                }
                return;
            }
            return;
        }
        hs hsVar = this.a;
        if (hsVar != null) {
            if (hsVar.a == null) {
                hsVar.a = new md();
            }
            md mdVar = hsVar.a;
            mdVar.a = colorStateList;
            mdVar.d = true;
            hsVar.a();
        }
    }

    public final void f(PorterDuff.Mode mode) {
        if (D()) {
            fgj fgjVar = this.b;
            if (fgjVar.j != mode) {
                fgjVar.j = mode;
                if (fgjVar.a(false) == null || fgjVar.j == null) {
                    return;
                }
                fgjVar.a(false).setTintMode(fgjVar.j);
                return;
            }
            return;
        }
        hs hsVar = this.a;
        if (hsVar != null) {
            if (hsVar.a == null) {
                hsVar.a = new md();
            }
            md mdVar = hsVar.a;
            mdVar.b = mode;
            mdVar.c = true;
            hsVar.a();
        }
    }

    public final void g(boolean z) {
        Drawable drawable = this.d;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.d = mutate;
            mutate.setTintList(this.c);
            PorterDuff.Mode mode = this.n;
            if (mode != null) {
                this.d.setTintMode(mode);
            }
            int i = this.s;
            if (i == 0) {
                i = this.d.getIntrinsicWidth();
            }
            int i2 = this.s;
            if (i2 == 0) {
                i2 = this.d.getIntrinsicHeight();
            }
            Drawable drawable2 = this.d;
            int i3 = this.t;
            int i4 = this.u;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.d.setVisible(true, z);
        }
        j();
        if (this.d == null && this.q != null && u()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (x() && compoundDrawablesRelative[0] != this.d) || (w() && compoundDrawablesRelative[2] != this.d) || (y() && compoundDrawablesRelative[1] != this.d);
        if (z || z2) {
            if (x()) {
                setCompoundDrawablesRelative(this.d, o(1), o(2), null);
            } else if (w()) {
                setCompoundDrawablesRelative(o(0), o(1), this.d, null);
            } else if (y()) {
                setCompoundDrawablesRelative(o(0), this.d, o(2), null);
            }
        }
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        md mdVar;
        if (D()) {
            return this.b.k;
        }
        hs hsVar = this.a;
        if (hsVar == null || (mdVar = hsVar.a) == null) {
            return null;
        }
        return mdVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        md mdVar;
        if (D()) {
            return this.b.j;
        }
        hs hsVar = this.a;
        if (hsVar == null || (mdVar = hsVar.a) == null) {
            return null;
        }
        return mdVar.b;
    }

    public final void h(int i, int i2) {
        if (this.d == null || getLayout() == null) {
            return;
        }
        if (x() || w()) {
            this.u = 0;
            if (v(this.e)) {
                this.t = 0;
                g(false);
                return;
            }
            int l2 = l(i, this.e);
            if (this.t != l2) {
                this.t = l2;
                g(false);
                return;
            }
            return;
        }
        if (y()) {
            this.t = 0;
            if (this.e == 16) {
                this.u = 0;
                g(false);
                return;
            }
            int i3 = this.s;
            if (i3 == 0) {
                i3 = this.d.getIntrinsicHeight();
            }
            int m = m(i2, i3);
            if (this.u != m) {
                this.u = m;
                g(false);
            }
        }
    }

    public final void i() {
        boolean z = z();
        int i = this.h;
        if (z) {
            i = -i;
        }
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f + 0.0f);
        }
        setPaddingRelative(this.C + i, getPaddingTop(), this.D - i, getPaddingBottom());
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.y;
    }

    public final void j() {
        if (this.d != null && this.q != null && u()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
    }

    public final boolean k() {
        fgj fgjVar = this.b;
        return fgjVar != null && fgjVar.p;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (D()) {
            fhq.y(this, this.b.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (k()) {
            mergeDrawableStates(onCreateDrawableState, k);
        }
        if (this.y) {
            mergeDrawableStates(onCreateDrawableState, l);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.ht, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(c());
        accessibilityEvent.setChecked(this.y);
    }

    @Override // defpackage.ht, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(c());
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setChecked(this.y);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        h(getMeasuredWidth(), getMeasuredHeight());
        t(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.B != i6) {
            this.B = i6;
            this.f = -2.1474836E9f;
        }
        if (this.f == -2.1474836E9f) {
            this.f = getMeasuredWidth();
            if (getParent() instanceof fgi) {
                throw null;
            }
        }
        boolean z2 = false;
        if (this.j == Integer.MIN_VALUE) {
            Drawable drawable = this.d;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.v;
                int i8 = this.s;
                if (i8 == 0) {
                    i8 = drawable.getIntrinsicWidth();
                }
                i5 = i7 + i8;
            }
            this.j = (getMeasuredWidth() - n()) - i5;
        }
        if (this.C == Integer.MIN_VALUE) {
            this.C = getPaddingStart();
        }
        if (this.D == Integer.MIN_VALUE) {
            this.D = getPaddingEnd();
        }
        if ((getParent() instanceof fgi) && ((fgi) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fgh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fgh fghVar = (fgh) parcelable;
        super.onRestoreInstanceState(fghVar.d);
        r(fghVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        fgh fghVar = new fgh(super.onSaveInstanceState());
        fghVar.a = this.y;
        return fghVar;
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        h(getMeasuredWidth(), getMeasuredHeight());
        t(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.b.q) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean performClick = super.performClick();
        if (z && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.d != null) {
            if (this.d.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!D()) {
            super.setBackgroundColor(i);
            return;
        }
        fgj fgjVar = this.b;
        if (fgjVar.a(false) != null) {
            fgjVar.a(false).setTint(i);
        }
    }

    @Override // defpackage.ht, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!D()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.b.b();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.ht, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? e.f(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        e(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        f(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        r(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.f = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (D()) {
            this.b.a(false).L(f);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        h(getMeasuredWidth(), getMeasuredHeight());
        t(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.ht, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.f = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.f = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.f = -2.1474836E9f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        r(!this.y);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
