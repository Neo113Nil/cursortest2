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
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v00 {
    public static final ColorDrawable A;
    public static final double z = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final g10 c;
    public final g10 d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public ed0 n;
    public ColorStateList o;
    public RippleDrawable p;
    public LayerDrawable q;
    public g10 r;
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

    public v00(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.e = -1.0f;
        this.a = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, w60.a, R.attr.materialCardViewStyle, R.style.CardView);
        g10 g10Var = new g10(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.c = g10Var;
        g10Var.n(materialCardView.getContext());
        g10Var.t();
        fd0 k = g10Var.i().k();
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            this.e = dimension;
            k.b(dimension);
        }
        this.d = new g10();
        h(k.a());
        this.v = d50.S(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, o3.a);
        this.w = d50.R(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.x = d50.R(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(n9 n9Var, float f) {
        if (n9Var instanceof xa0) {
            return (float) ((1.0d - z) * f);
        }
        if (n9Var instanceof nh) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float f = 0.0f;
        for (gd0 gd0Var : this.n.c()) {
            if (gd0Var != null) {
                n9 n9Var = gd0Var.a;
                g10 g10Var = this.c;
                float b = b(n9Var, g10Var.k());
                n9 n9Var2 = gd0Var.b;
                float[] fArr = g10Var.H;
                float max = Math.max(b, b(n9Var2, fArr != null ? fArr[0] : g10Var.g.a.d().f.a(g10Var.g())));
                n9 n9Var3 = gd0Var.c;
                float[] fArr2 = g10Var.H;
                float b2 = b(n9Var3, fArr2 != null ? fArr2[1] : g10Var.g.a.d().g.a(g10Var.g()));
                n9 n9Var4 = gd0Var.d;
                float[] fArr3 = g10Var.H;
                f = Math.max(f, Math.max(max, Math.max(b2, b(n9Var4, fArr3 != null ? fArr3[2] : g10Var.g.a.d().h.a(g10Var.g())))));
            }
        }
        return f;
    }

    public final LayerDrawable c() {
        if (this.p == null) {
            this.r = new g10(this.n);
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

    public final u00 d(Drawable drawable) {
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
        return new u00(drawable, i, i2, i, i2);
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
            ofFloat.addUpdateListener(new zk(1, this));
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

    public final void h(ed0 ed0Var) {
        this.n = ed0Var;
        g10 g10Var = this.c;
        g10Var.u(ed0Var);
        this.d.u(ed0Var);
        g10 g10Var2 = this.r;
        if (g10Var2 != null) {
            g10Var2.u(ed0Var);
        }
        g10Var.C = !g10Var.o();
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
        i5 i5Var = materialCardView.j;
        if (!((oa) i5Var.h).getUseCompatPadding()) {
            i5Var.Q(0, 0, 0, 0);
            return;
        }
        ua0 ua0Var = (ua0) i5Var.g;
        float f2 = ua0Var.e;
        float f3 = ua0Var.a;
        int ceil = (int) Math.ceil(va0.a(f2, f3, r0.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(va0.b(f2, f3, r0.getPreventCornerOverlap()));
        i5Var.Q(ceil, ceil2, ceil, ceil2);
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
