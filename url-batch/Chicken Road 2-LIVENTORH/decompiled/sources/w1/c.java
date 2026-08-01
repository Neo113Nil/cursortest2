package w1;

import a.y;
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
import com.google.android.material.card.MaterialCardView;
import com.oriondriftchasers.arordrft.R;
import l2.e;
import l2.j;
import l2.l;
import l2.m;
import l2.n;
import n0.o0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f3577y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f3578z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f3579a;

    /* renamed from: c, reason: collision with root package name */
    public final j f3581c;
    public final j d;

    /* renamed from: e, reason: collision with root package name */
    public int f3582e;

    /* renamed from: f, reason: collision with root package name */
    public int f3583f;

    /* renamed from: g, reason: collision with root package name */
    public int f3584g;

    /* renamed from: h, reason: collision with root package name */
    public int f3585h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3586j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3587k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3588l;

    /* renamed from: m, reason: collision with root package name */
    public n f3589m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f3590n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f3591o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f3592p;

    /* renamed from: q, reason: collision with root package name */
    public j f3593q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3595s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f3596t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f3597u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3598v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3599w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3580b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f3594r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f3600x = 0.0f;

    static {
        f3578z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f3579a = materialCardView;
        j jVar = new j(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f3581c = jVar;
        jVar.m(materialCardView.getContext());
        jVar.s();
        m g4 = jVar.f2598g.f2581a.g();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, o.a.f2846a, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            g4.f2621e = new l2.a(dimension);
            g4.f2622f = new l2.a(dimension);
            g4.f2623g = new l2.a(dimension);
            g4.f2624h = new l2.a(dimension);
        }
        this.d = new j();
        h(g4.a());
        this.f3597u = y.S(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, o1.a.f2864a);
        this.f3598v = y.R(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f3599w = y.R(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(h.a aVar, float f2) {
        if (aVar instanceof l) {
            return (float) ((1.0d - f3577y) * f2);
        }
        if (aVar instanceof e) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        h.a aVar = this.f3589m.f2628a;
        j jVar = this.f3581c;
        float b4 = b(aVar, jVar.k());
        h.a aVar2 = this.f3589m.f2629b;
        float[] fArr = jVar.G;
        float max = Math.max(b4, b(aVar2, fArr != null ? fArr[0] : jVar.f2598g.f2581a.f2632f.a(jVar.h())));
        h.a aVar3 = this.f3589m.f2630c;
        float[] fArr2 = jVar.G;
        float b5 = b(aVar3, fArr2 != null ? fArr2[1] : jVar.f2598g.f2581a.f2633g.a(jVar.h()));
        h.a aVar4 = this.f3589m.d;
        float[] fArr3 = jVar.G;
        return Math.max(max, Math.max(b5, b(aVar4, fArr3 != null ? fArr3[2] : jVar.f2598g.f2581a.f2634h.a(jVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f3591o == null) {
            this.f3593q = new j(this.f3589m);
            this.f3591o = new RippleDrawable(this.f3587k, null, this.f3593q);
        }
        if (this.f3592p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f3591o, this.d, this.f3586j});
            this.f3592p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f3592p;
    }

    public final b d(Drawable drawable) {
        int i;
        int i4;
        if (this.f3579a.getUseCompatPadding()) {
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
        if (this.f3592p != null) {
            MaterialCardView materialCardView = this.f3579a;
            if (materialCardView.getUseCompatPadding()) {
                i5 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i6 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i5 = 0;
                i6 = 0;
            }
            int i9 = this.f3584g;
            int i10 = (i9 & 8388613) == 8388613 ? ((i - this.f3582e) - this.f3583f) - i6 : this.f3582e;
            int i11 = (i9 & 80) == 80 ? this.f3582e : ((i4 - this.f3582e) - this.f3583f) - i5;
            int i12 = (i9 & 8388613) == 8388613 ? this.f3582e : ((i - this.f3582e) - this.f3583f) - i6;
            int i13 = (i9 & 80) == 80 ? ((i4 - this.f3582e) - this.f3583f) - i5 : this.f3582e;
            if (materialCardView.getLayoutDirection() == 1) {
                i8 = i12;
                i7 = i10;
            } else {
                i7 = i12;
                i8 = i10;
            }
            this.f3592p.setLayerInset(2, i8, i13, i7, i11);
        }
    }

    public final void f(boolean z3, boolean z4) {
        Drawable drawable = this.f3586j;
        if (drawable != null) {
            if (!z4) {
                drawable.setAlpha(z3 ? 255 : 0);
                this.f3600x = z3 ? 1.0f : 0.0f;
                return;
            }
            float f2 = z3 ? 1.0f : 0.0f;
            float f4 = z3 ? 1.0f - this.f3600x : this.f3600x;
            ValueAnimator valueAnimator = this.f3596t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f3596t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f3600x, f2);
            this.f3596t = ofFloat;
            ofFloat.addUpdateListener(new o0(2, this));
            this.f3596t.setInterpolator(this.f3597u);
            this.f3596t.setDuration((long) ((z3 ? this.f3598v : this.f3599w) * f4));
            this.f3596t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3586j = mutate;
            mutate.setTintList(this.f3588l);
            f(this.f3579a.f877o, false);
        } else {
            this.f3586j = f3578z;
        }
        LayerDrawable layerDrawable = this.f3592p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f3586j);
        }
    }

    public final void h(n nVar) {
        this.f3589m = nVar;
        j jVar = this.f3581c;
        jVar.setShapeAppearanceModel(nVar);
        jVar.B = !jVar.n();
        j jVar2 = this.d;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(nVar);
        }
        j jVar3 = this.f3593q;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(nVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f3579a;
        return materialCardView.getPreventCornerOverlap() && this.f3581c.n() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f3579a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable c4 = j() ? c() : this.d;
        this.i = c4;
        if (drawable != c4) {
            MaterialCardView materialCardView = this.f3579a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c4);
            } else {
                materialCardView.setForeground(d(c4));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f3579a;
        float f2 = 0.0f;
        float a2 = ((!materialCardView.getPreventCornerOverlap() || this.f3581c.n()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f2 = (float) ((1.0d - f3577y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a2 - f2);
        Rect rect = this.f3580b;
        materialCardView.f2994h.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        q qVar = materialCardView.f2995j;
        if (!((p.a) qVar.f347h).getUseCompatPadding()) {
            qVar.H(0, 0, 0, 0);
            return;
        }
        p.b bVar = (p.b) ((Drawable) qVar.f346g);
        float f4 = bVar.f2999e;
        float f5 = bVar.f2996a;
        int ceil = (int) Math.ceil(p.c.a(f4, f5, r1.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(p.c.b(f4, f5, r1.getPreventCornerOverlap()));
        qVar.H(ceil, ceil2, ceil, ceil2);
    }

    public final void m() {
        boolean z3 = this.f3594r;
        MaterialCardView materialCardView = this.f3579a;
        if (!z3) {
            materialCardView.setBackgroundInternal(d(this.f3581c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
