package x0;

import L0.g;
import L0.i;
import L0.j;
import L0.k;
import M.Q;
import M.W;
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
import com.winfour.neondrop.R;
import java.util.WeakHashMap;
import p.AbstractC0255a;
import q0.AbstractC0257a;
import r0.AbstractC0260a;
import z1.d;
import z1.l;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f4149y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f4150z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f4151a;

    /* renamed from: c, reason: collision with root package name */
    public final g f4153c;
    public final g d;

    /* renamed from: e, reason: collision with root package name */
    public int f4154e;

    /* renamed from: f, reason: collision with root package name */
    public int f4155f;

    /* renamed from: g, reason: collision with root package name */
    public int f4156g;
    public int h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f4157j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4158k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4159l;

    /* renamed from: m, reason: collision with root package name */
    public k f4160m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f4161n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f4162o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f4163p;

    /* renamed from: q, reason: collision with root package name */
    public g f4164q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4166s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f4167t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f4168u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4169v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4170w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4152b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f4165r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f4171x = 0.0f;

    static {
        f4150z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C0312c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f4151a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f4153c = gVar;
        gVar.i(materialCardView.getContext());
        gVar.n();
        j e2 = gVar.f433a.f419a.e();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC0257a.f3381b, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            e2.f456e = new L0.a(dimension);
            e2.f457f = new L0.a(dimension);
            e2.f458g = new L0.a(dimension);
            e2.h = new L0.a(dimension);
        }
        this.d = new g();
        h(e2.a());
        this.f4168u = l.n0(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0260a.f3420a);
        this.f4169v = l.m0(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f4170w = l.m0(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(d dVar, float f2) {
        if (dVar instanceof i) {
            return (float) ((1.0d - f4149y) * f2);
        }
        if (dVar instanceof L0.d) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        d dVar = this.f4160m.f462a;
        g gVar = this.f4153c;
        return Math.max(Math.max(b(dVar, gVar.g()), b(this.f4160m.f463b, gVar.f433a.f419a.f466f.a(gVar.f()))), Math.max(b(this.f4160m.f464c, gVar.f433a.f419a.f467g.a(gVar.f())), b(this.f4160m.d, gVar.f433a.f419a.h.a(gVar.f()))));
    }

    public final LayerDrawable c() {
        if (this.f4162o == null) {
            int[] iArr = J0.a.f383a;
            this.f4164q = new g(this.f4160m);
            this.f4162o = new RippleDrawable(this.f4158k, null, this.f4164q);
        }
        if (this.f4163p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f4162o, this.d, this.f4157j});
            this.f4163p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f4163p;
    }

    public final C0311b d(Drawable drawable) {
        int i;
        int i2;
        if (this.f4151a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new C0311b(drawable, i, i2, i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f4163p != null) {
            MaterialCardView materialCardView = this.f4151a;
            if (materialCardView.getUseCompatPadding()) {
                i3 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = this.f4156g;
            int i8 = (i7 & 8388613) == 8388613 ? ((i - this.f4154e) - this.f4155f) - i4 : this.f4154e;
            int i9 = (i7 & 80) == 80 ? this.f4154e : ((i2 - this.f4154e) - this.f4155f) - i3;
            int i10 = (i7 & 8388613) == 8388613 ? this.f4154e : ((i - this.f4154e) - this.f4155f) - i4;
            int i11 = (i7 & 80) == 80 ? ((i2 - this.f4154e) - this.f4155f) - i3 : this.f4154e;
            WeakHashMap weakHashMap = Q.f513a;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i10;
                i5 = i8;
            } else {
                i5 = i10;
                i6 = i8;
            }
            this.f4163p.setLayerInset(2, i6, i11, i5, i9);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.f4157j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.f4171x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f2 = z2 ? 1.0f : 0.0f;
            float f3 = z2 ? 1.0f - this.f4171x : this.f4171x;
            ValueAnimator valueAnimator = this.f4167t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f4167t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f4171x, f2);
            this.f4167t = ofFloat;
            ofFloat.addUpdateListener(new W(2, this));
            this.f4167t.setInterpolator(this.f4168u);
            this.f4167t.setDuration((long) ((z2 ? this.f4169v : this.f4170w) * f3));
            this.f4167t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f4157j = mutate;
            F.a.h(mutate, this.f4159l);
            f(this.f4151a.f1820j, false);
        } else {
            this.f4157j = f4150z;
        }
        LayerDrawable layerDrawable = this.f4163p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f4157j);
        }
    }

    public final void h(k kVar) {
        this.f4160m = kVar;
        g gVar = this.f4153c;
        gVar.setShapeAppearanceModel(kVar);
        gVar.f451v = !gVar.j();
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f4164q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f4151a;
        return materialCardView.getPreventCornerOverlap() && this.f4153c.j() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f4151a;
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
        Drawable c2 = j() ? c() : this.d;
        this.i = c2;
        if (drawable != c2) {
            MaterialCardView materialCardView = this.f4151a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c2);
            } else {
                materialCardView.setForeground(d(c2));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f4151a;
        float f2 = 0.0f;
        float a2 = ((materialCardView.getPreventCornerOverlap() && !this.f4153c.j()) || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f2 = (float) ((1.0d - f4149y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a2 - f2);
        Rect rect = this.f4152b;
        materialCardView.f3324c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        D.j jVar = materialCardView.f3325e;
        if (!((AbstractC0255a) jVar.f134c).getUseCompatPadding()) {
            jVar.I(0, 0, 0, 0);
            return;
        }
        p.b bVar = (p.b) ((Drawable) jVar.f133b);
        float f3 = bVar.f3329e;
        float f4 = bVar.f3326a;
        AbstractC0255a abstractC0255a = (AbstractC0255a) jVar.f134c;
        int ceil = (int) Math.ceil(p.c.a(f3, f4, abstractC0255a.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(p.c.b(f3, f4, abstractC0255a.getPreventCornerOverlap()));
        jVar.I(ceil, ceil2, ceil, ceil2);
    }

    public final void m() {
        boolean z2 = this.f4165r;
        MaterialCardView materialCardView = this.f4151a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.f4153c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
