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
import com.google.android.apps.authenticator2.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgn {
    public static final Drawable a;
    private static final double w = Math.cos(Math.toRadians(45.0d));
    private final int A;
    public final MaterialCardView b;
    public final fob d;
    public final fob e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Drawable k;
    public Drawable l;
    public ColorStateList m;
    public ColorStateList n;
    public fof o;
    public ColorStateList p;
    public Drawable q;
    public LayerDrawable r;
    public fob s;
    public boolean u;
    private ValueAnimator x;
    private final TimeInterpolator y;
    private final int z;
    public final Rect c = new Rect();
    public boolean t = false;
    public float v = 0.0f;

    static {
        a = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public fgn(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.f = -1.0f;
        this.b = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, py.a, i, R.style.CardView);
        fob fobVar = new fob(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.d = fobVar;
        fobVar.J(materialCardView.getContext());
        fobVar.P(-12303292);
        gbw gbwVar = new gbw(fobVar.F());
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            this.f = dimension;
            gbwVar.k(dimension);
        }
        this.e = new fob();
        g(new fog(gbwVar));
        this.y = fny.p(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, fes.a);
        this.z = fny.i(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.A = fny.i(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    private final float o() {
        float f = 0.0f;
        for (fog fogVar : this.o.e()) {
            if (fogVar != null) {
                fob fobVar = this.d;
                float max = Math.max(q(fogVar.j, fobVar.w()), q(fogVar.k, fobVar.x()));
                float[] fArr = fobVar.z;
                float a2 = fArr != null ? fArr[1] : fobVar.p.a.a().d.a(fobVar.D());
                fny fnyVar = fogVar.l;
                fny fnyVar2 = fogVar.m;
                float q = q(fnyVar, a2);
                float[] fArr2 = fobVar.z;
                f = Math.max(f, Math.max(max, Math.max(q, q(fnyVar2, fArr2 != null ? fArr2[2] : fobVar.p.a.a().e.a(fobVar.D())))));
            }
        }
        return f;
    }

    private final boolean p() {
        return this.d.V();
    }

    private static final float q(fny fnyVar, float f) {
        if (fnyVar instanceof foe) {
            return (float) ((1.0d - w) * f);
        }
        if (fnyVar instanceof fnx) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        return this.b.a() + (m() ? o() : 0.0f);
    }

    public final float b() {
        return (this.b.a() * 1.5f) + (m() ? o() : 0.0f);
    }

    public final Drawable c() {
        if (this.q == null) {
            this.s = new fob(this.o);
            this.q = new RippleDrawable(this.m, null, this.s);
        }
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.q, this.e, this.l});
        FocusRingDrawable.a(this.b.getContext(), layerDrawable2, this.s);
        layerDrawable2.setId(2, R.id.mtrl_card_checked_layer_id);
        this.r = layerDrawable2;
        return layerDrawable2;
    }

    public final Drawable d(Drawable drawable) {
        int i;
        int i2;
        if (this.b.a) {
            int ceil = (int) Math.ceil(b());
            i = (int) Math.ceil(a());
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new fgm(drawable, i, i2, i, i2);
    }

    public final void e(ColorStateList colorStateList) {
        this.d.M(colorStateList);
    }

    public final void f(boolean z, boolean z2) {
        Drawable drawable = this.l;
        if (drawable != null) {
            float f = true != z ? 0.0f : 1.0f;
            if (!z2) {
                drawable.setAlpha(true == z ? 255 : 0);
                this.v = f;
                return;
            }
            float f2 = this.v;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new mu(this, 8, null));
            this.x.setInterpolator(this.y);
            this.x.setDuration((long) ((z ? this.z : this.A) * f2));
            this.x.start();
        }
    }

    public final void g(fof fofVar) {
        this.o = fofVar;
        fob fobVar = this.d;
        fobVar.Q(fofVar);
        this.e.Q(fofVar);
        fob fobVar2 = this.s;
        if (fobVar2 != null) {
            fobVar2.Q(fofVar);
        }
        fobVar.x = !fobVar.V();
    }

    public final void h() {
        Drawable drawable = this.k;
        Drawable c = n() ? c() : this.e;
        this.k = c;
        if (drawable != c) {
            MaterialCardView materialCardView = this.b;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c);
            } else {
                materialCardView.setForeground(d(c));
            }
        }
    }

    public final void i() {
        float f = 0.0f;
        float o = (l() || m()) ? o() : 0.0f;
        MaterialCardView materialCardView = this.b;
        if (materialCardView.b && materialCardView.a) {
            f = (float) ((1.0d - w) * pi.o(materialCardView.e));
        }
        Rect rect = this.c;
        int i = (int) (o - f);
        materialCardView.c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        pi.p(materialCardView.e);
    }

    public final boolean j() {
        return (this.i & 80) == 80;
    }

    public final boolean k() {
        return (this.i & 8388613) == 8388613;
    }

    public final boolean l() {
        return this.b.b && !p();
    }

    public final boolean m() {
        MaterialCardView materialCardView = this.b;
        return materialCardView.b && p() && materialCardView.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    public final boolean n() {
        MaterialCardView materialCardView = this.b;
        boolean isClickable = materialCardView.isClickable();
        MaterialCardView materialCardView2 = materialCardView;
        if (isClickable) {
            return true;
        }
        while (materialCardView2.isDuplicateParentStateEnabled() && (materialCardView2.getParent() instanceof View)) {
            materialCardView2 = (View) materialCardView2.getParent();
        }
        return materialCardView2.isClickable();
    }
}
