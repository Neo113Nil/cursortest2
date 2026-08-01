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
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class sv {
    public static final ColorDrawable A;
    public static final double z = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final dw c;
    public final dw d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public d50 n;
    public ColorStateList o;
    public RippleDrawable p;
    public LayerDrawable q;
    public dw r;
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

    public sv(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.e = -1.0f;
        this.a = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, s00.a, R.attr.materialCardViewStyle, R.style.CardView);
        dw dwVar = new dw(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.c = dwVar;
        dwVar.n(materialCardView.getContext());
        dwVar.t();
        e50 k = dwVar.i().k();
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            this.e = dimension;
            k.b(dimension);
        }
        this.d = new dw();
        h(k.a());
        this.v = kr.X(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, g3.a);
        this.w = kr.W(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.x = kr.W(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(la0 la0Var, float f) {
        if (la0Var instanceof v30) {
            return (float) ((1.0d - z) * f);
        }
        if (la0Var instanceof pf) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float f = 0.0f;
        for (f50 f50Var : this.n.c()) {
            if (f50Var != null) {
                la0 la0Var = f50Var.a;
                dw dwVar = this.c;
                float b = b(la0Var, dwVar.k());
                la0 la0Var2 = f50Var.b;
                float[] fArr = dwVar.H;
                float max = Math.max(b, b(la0Var2, fArr != null ? fArr[0] : dwVar.g.a.d().f.a(dwVar.g())));
                la0 la0Var3 = f50Var.c;
                float[] fArr2 = dwVar.H;
                float b2 = b(la0Var3, fArr2 != null ? fArr2[1] : dwVar.g.a.d().g.a(dwVar.g()));
                la0 la0Var4 = f50Var.d;
                float[] fArr3 = dwVar.H;
                f = Math.max(f, Math.max(max, Math.max(b2, b(la0Var4, fArr3 != null ? fArr3[2] : dwVar.g.a.d().h.a(dwVar.g())))));
            }
        }
        return f;
    }

    public final LayerDrawable c() {
        if (this.p == null) {
            this.r = new dw(this.n);
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

    public final rv d(Drawable drawable) {
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
        return new rv(drawable, i, i2, i, i2);
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
            ofFloat.addUpdateListener(new oi(1, this));
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

    public final void h(d50 d50Var) {
        this.n = d50Var;
        dw dwVar = this.c;
        dwVar.u(d50Var);
        this.d.u(d50Var);
        dw dwVar2 = this.r;
        if (dwVar2 != null) {
            dwVar2.u(d50Var);
        }
        dwVar.C = !dwVar.o();
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
        a5 a5Var = materialCardView.j;
        if (!((v9) a5Var.h).getUseCompatPadding()) {
            a5Var.S(0, 0, 0, 0);
            return;
        }
        s30 s30Var = (s30) a5Var.g;
        float f2 = s30Var.e;
        float f3 = s30Var.a;
        int ceil = (int) Math.ceil(t30.a(f2, f3, r0.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(t30.b(f2, f3, r0.getPreventCornerOverlap()));
        a5Var.S(ceil, ceil2, ceil, ceil2);
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
