package x1;

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
import androidx.emoji2.text.q;
import b4.d;
import b4.l;
import com.gdmhkmf.belbet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;
import n0.s0;
import o2.e;
import o2.j;
import o2.m;
import o2.n;
import o2.o;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {
    public static final ColorDrawable A;

    /* renamed from: z, reason: collision with root package name */
    public static final double f3856z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f3857a;

    /* renamed from: c, reason: collision with root package name */
    public final j f3859c;
    public final j d;

    /* renamed from: e, reason: collision with root package name */
    public float f3860e;

    /* renamed from: f, reason: collision with root package name */
    public int f3861f;

    /* renamed from: g, reason: collision with root package name */
    public int f3862g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3863j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f3864k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3865l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f3866m;

    /* renamed from: n, reason: collision with root package name */
    public m f3867n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f3868o;

    /* renamed from: p, reason: collision with root package name */
    public RippleDrawable f3869p;

    /* renamed from: q, reason: collision with root package name */
    public LayerDrawable f3870q;

    /* renamed from: r, reason: collision with root package name */
    public j f3871r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3873t;

    /* renamed from: u, reason: collision with root package name */
    public ValueAnimator f3874u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f3875v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3876w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3877x;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3858b = new Rect();

    /* renamed from: s, reason: collision with root package name */
    public boolean f3872s = false;

    /* renamed from: y, reason: collision with root package name */
    public float f3878y = 0.0f;

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f3860e = -1.0f;
        this.f3857a = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, o.a.f2867a, R.attr.materialCardViewStyle, R.style.CardView);
        j jVar = new j(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f3859c = jVar;
        jVar.n(materialCardView.getContext());
        jVar.t();
        n k4 = jVar.i().k();
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            this.f3860e = dimension;
            k4.b(dimension);
        }
        this.d = new j();
        h(k4.a());
        this.f3875v = l.W(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, r1.a.f3205a);
        this.f3876w = l.V(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f3877x = l.V(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(d dVar, float f5) {
        if (dVar instanceof o2.l) {
            return (float) ((1.0d - f3856z) * f5);
        }
        if (dVar instanceof e) {
            return f5 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float f5 = 0.0f;
        for (o oVar : this.f3867n.c()) {
            if (oVar != null) {
                d dVar = oVar.f2984a;
                j jVar = this.f3859c;
                float b2 = b(dVar, jVar.k());
                d dVar2 = oVar.f2985b;
                float[] fArr = jVar.G;
                float max = Math.max(b2, b(dVar2, fArr != null ? fArr[0] : jVar.f2955g.f2940a.d().f2988f.a(jVar.g())));
                d dVar3 = oVar.f2986c;
                float[] fArr2 = jVar.G;
                float b5 = b(dVar3, fArr2 != null ? fArr2[1] : jVar.f2955g.f2940a.d().f2989g.a(jVar.g()));
                d dVar4 = oVar.d;
                float[] fArr3 = jVar.G;
                f5 = Math.max(f5, Math.max(max, Math.max(b5, b(dVar4, fArr3 != null ? fArr3[2] : jVar.f2955g.f2940a.d().h.a(jVar.g())))));
            }
        }
        return f5;
    }

    public final LayerDrawable c() {
        if (this.f3869p == null) {
            this.f3871r = new j(this.f3867n);
            this.f3869p = new RippleDrawable(this.f3865l, null, this.f3871r);
        }
        if (this.f3870q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f3869p, this.d, this.f3864k});
            FocusRingDrawable.e(this.f3857a.getContext(), layerDrawable, this.f3871r);
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
            this.f3870q = layerDrawable;
        }
        return this.f3870q;
    }

    public final b d(Drawable drawable) {
        int i;
        int i4;
        if (this.f3857a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i4 = ceil;
        } else {
            i = 0;
            i4 = 0;
        }
        return new b(drawable, i, i4, i, i4);
    }

    public final void e(int i, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.f3870q != null) {
            MaterialCardView materialCardView = this.f3857a;
            if (materialCardView.getUseCompatPadding()) {
                i5 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i6 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i5 = 0;
                i6 = 0;
            }
            int i9 = this.h;
            int i10 = (i9 & 8388613) == 8388613 ? ((i - this.f3861f) - this.f3862g) - i6 : this.f3861f;
            int i11 = (i9 & 80) == 80 ? this.f3861f : ((i4 - this.f3861f) - this.f3862g) - i5;
            int i12 = (i9 & 8388613) == 8388613 ? this.f3861f : ((i - this.f3861f) - this.f3862g) - i6;
            int i13 = (i9 & 80) == 80 ? ((i4 - this.f3861f) - this.f3862g) - i5 : this.f3861f;
            if (materialCardView.getLayoutDirection() == 1) {
                i8 = i12;
                i7 = i10;
            } else {
                i7 = i12;
                i8 = i10;
            }
            this.f3870q.setLayerInset(2, i8, i13, i7, i11);
        }
    }

    public final void f(boolean z4, boolean z5) {
        Drawable drawable = this.f3864k;
        if (drawable != null) {
            if (!z5) {
                drawable.setAlpha(z4 ? 255 : 0);
                this.f3878y = z4 ? 1.0f : 0.0f;
                return;
            }
            float f5 = z4 ? 1.0f : 0.0f;
            float f6 = z4 ? 1.0f - this.f3878y : this.f3878y;
            ValueAnimator valueAnimator = this.f3874u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f3874u = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f3878y, f5);
            this.f3874u = ofFloat;
            ofFloat.addUpdateListener(new s0(2, this));
            this.f3874u.setInterpolator(this.f3875v);
            this.f3874u.setDuration((long) ((z4 ? this.f3876w : this.f3877x) * f6));
            this.f3874u.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3864k = mutate;
            mutate.setTintList(this.f3866m);
            f(this.f3857a.f995o, false);
        } else {
            this.f3864k = A;
        }
        LayerDrawable layerDrawable = this.f3870q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f3864k);
        }
    }

    public final void h(m mVar) {
        this.f3867n = mVar;
        j jVar = this.f3859c;
        jVar.u(mVar);
        this.d.u(mVar);
        j jVar2 = this.f3871r;
        if (jVar2 != null) {
            jVar2.u(mVar);
        }
        jVar.B = !jVar.o();
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f3857a;
        return materialCardView.getPreventCornerOverlap() && this.f3859c.o() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f3857a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f3863j;
        Drawable c5 = j() ? c() : this.d;
        this.f3863j = c5;
        if (drawable != c5) {
            MaterialCardView materialCardView = this.f3857a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c5);
            } else {
                materialCardView.setForeground(d(c5));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f3857a;
        float f5 = 0.0f;
        float a5 = ((!materialCardView.getPreventCornerOverlap() || this.f3859c.o()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f5 = (float) ((1.0d - f3856z) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a5 - f5);
        Rect rect = this.f3858b;
        materialCardView.h.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        q qVar = materialCardView.f3044j;
        if (!((p.a) qVar.h).getUseCompatPadding()) {
            qVar.J(0, 0, 0, 0);
            return;
        }
        p.b bVar = (p.b) ((Drawable) qVar.f466g);
        float f6 = bVar.f3048e;
        float f7 = bVar.f3045a;
        int ceil = (int) Math.ceil(p.c.a(f6, f7, r1.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(p.c.b(f6, f7, r1.getPreventCornerOverlap()));
        qVar.J(ceil, ceil2, ceil, ceil2);
    }

    public final void m() {
        boolean z4 = this.f3872s;
        MaterialCardView materialCardView = this.f3857a;
        if (!z4) {
            materialCardView.setBackgroundInternal(d(this.f3859c));
        }
        materialCardView.setForeground(d(this.f3863j));
    }
}
