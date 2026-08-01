package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.awerser.monnit.betplay.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ft {
    public static final ColorDrawable A;
    public static final double z = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final rt c;
    public final rt d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public l20 n;
    public ColorStateList o;
    public RippleDrawable p;
    public LayerDrawable q;
    public rt r;
    public boolean t;
    public ValueAnimator u;
    public final TimeInterpolator v;
    public final int w;
    public final int x;
    public final Rect b = new Rect();
    public boolean s = false;
    public float y = 0.0f;

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public ft(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.e = -1.0f;
        this.a = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, fy.a, R.attr.materialCardViewStyle, R.style.CardView);
        rt rtVar = new rt(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.c = rtVar;
        rtVar.n(materialCardView.getContext());
        rtVar.t();
        m20 k = rtVar.i().k();
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            this.e = dimension;
            k.b(dimension);
        }
        this.d = new rt();
        h(k.a());
        this.v = vw.e0(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, o3.a);
        this.w = vw.d0(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.x = vw.d0(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(op opVar, float f) {
        if (opVar instanceof g10) {
            return (float) ((1.0d - z) * f);
        }
        if (opVar instanceof be) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float f = 0.0f;
        for (n20 n20Var : this.n.c()) {
            if (n20Var != null) {
                op opVar = n20Var.a;
                rt rtVar = this.c;
                float b = b(opVar, rtVar.k());
                op opVar2 = n20Var.b;
                float[] fArr = rtVar.G;
                float max = Math.max(b, b(opVar2, fArr != null ? fArr[0] : rtVar.g.a.d().f.a(rtVar.g())));
                op opVar3 = n20Var.c;
                float[] fArr2 = rtVar.G;
                float b2 = b(opVar3, fArr2 != null ? fArr2[1] : rtVar.g.a.d().g.a(rtVar.g()));
                op opVar4 = n20Var.d;
                float[] fArr3 = rtVar.G;
                f = Math.max(f, Math.max(max, Math.max(b2, b(opVar4, fArr3 != null ? fArr3[2] : rtVar.g.a.d().h.a(rtVar.g())))));
            }
        }
        return f;
    }

    public final LayerDrawable c() {
        if (this.p == null) {
            this.r = new rt(this.n);
            this.p = new RippleDrawable(this.l, null, this.r);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.d, this.k});
            FocusRingDrawable.e(this.a.getContext(), layerDrawable, this.r);
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
            this.q = layerDrawable;
        }
        return this.q;
    }

    public final et d(Drawable drawable) {
        int i;
        int i2;
        if (this.a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new et(drawable, i, i2, i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.q != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                i3 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = this.h;
            boolean z2 = (i7 & 8388613) == 8388613;
            int i8 = this.f;
            int i9 = z2 ? ((i - i8) - this.g) - i4 : i8;
            int i10 = (i7 & 80) == 80 ? i8 : ((i2 - i8) - this.g) - i3;
            int i11 = (i7 & 8388613) == 8388613 ? i8 : ((i - i8) - this.g) - i4;
            if ((i7 & 80) == 80) {
                i8 = ((i2 - i8) - this.g) - i3;
            }
            int i12 = i8;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i11;
                i5 = i9;
            } else {
                i5 = i11;
                i6 = i9;
            }
            this.q.setLayerInset(2, i6, i12, i5, i10);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.y = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = this.y;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.u = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f);
            this.u = ofFloat;
            ofFloat.addUpdateListener(new fg(1, this));
            this.u.setInterpolator(this.v);
            this.u.setDuration((long) ((z2 ? this.w : this.x) * f2));
            this.u.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.k = mutate;
            mutate.setTintList(this.m);
            f(this.a.n, false);
        } else {
            this.k = A;
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.k);
        }
    }

    public final void h(l20 l20Var) {
        this.n = l20Var;
        rt rtVar = this.c;
        rtVar.u(l20Var);
        this.d.u(l20Var);
        rt rtVar2 = this.r;
        if (rtVar2 != null) {
            rtVar2.u(l20Var);
        }
        rtVar.B = !rtVar.o();
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.o() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.j;
        Drawable c = j() ? c() : this.d;
        this.j = c;
        if (drawable != c) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c);
            } else {
                materialCardView.setForeground(d(c));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        float f = 0.0f;
        float a = ((!materialCardView.getPreventCornerOverlap() || this.c.o()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f = (float) ((1.0d - z) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a - f);
        Rect rect = this.b;
        materialCardView.h.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        h5 h5Var = materialCardView.j;
        if (!((d9) h5Var.h).getUseCompatPadding()) {
            h5Var.M(0, 0, 0, 0);
            return;
        }
        d10 d10Var = (d10) h5Var.g;
        float f2 = d10Var.e;
        float f3 = d10Var.a;
        int ceil = (int) Math.ceil(e10.a(f2, f3, r0.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(e10.b(f2, f3, r0.getPreventCornerOverlap()));
        h5Var.M(ceil, ceil2, ceil, ceil2);
    }

    public final void m() {
        boolean z2 = this.s;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.j));
    }
}
