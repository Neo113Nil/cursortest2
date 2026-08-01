package t0;

import H0.f;
import H0.g;
import H0.k;
import H0.v;
import K.X;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.luckyarcade.spinthrow.R;
import i1.r;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f4204a;

    /* renamed from: b, reason: collision with root package name */
    public k f4205b;

    /* renamed from: c, reason: collision with root package name */
    public int f4206c;

    /* renamed from: d, reason: collision with root package name */
    public int f4207d;

    /* renamed from: e, reason: collision with root package name */
    public int f4208e;

    /* renamed from: f, reason: collision with root package name */
    public int f4209f;

    /* renamed from: g, reason: collision with root package name */
    public int f4210g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f4211j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4212k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4213l;

    /* renamed from: m, reason: collision with root package name */
    public g f4214m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4218q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f4220s;

    /* renamed from: t, reason: collision with root package name */
    public int f4221t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4215n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4216o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4217p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4219r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f4204a = materialButton;
        this.f4205b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f4220s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4220s.getNumberOfLayers() > 2 ? (v) this.f4220s.getDrawable(2) : (v) this.f4220s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f4220s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f4220s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f4205b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = X.f419a;
        MaterialButton materialButton = this.f4204a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f4208e;
        int i4 = this.f4209f;
        this.f4209f = i2;
        this.f4208e = i;
        if (!this.f4216o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f4205b);
        MaterialButton materialButton = this.f4204a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f4211j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f4212k;
        gVar.f272a.f264j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f272a;
        if (fVar.f260d != colorStateList) {
            fVar.f260d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f4205b);
        gVar2.setTint(0);
        float f3 = this.h;
        int h = this.f4215n ? r.h(materialButton, R.attr.colorSurface) : 0;
        gVar2.f272a.f264j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(h);
        f fVar2 = gVar2.f272a;
        if (fVar2.f260d != valueOf) {
            fVar2.f260d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f4205b);
        this.f4214m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(F0.a.a(this.f4213l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f4206c, this.f4208e, this.f4207d, this.f4209f), this.f4214m);
        this.f4220s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f4221t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f4212k;
            b2.f272a.f264j = f2;
            b2.invalidateSelf();
            f fVar = b2.f272a;
            if (fVar.f260d != colorStateList) {
                fVar.f260d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int h = this.f4215n ? r.h(this.f4204a, R.attr.colorSurface) : 0;
                b3.f272a.f264j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(h);
                f fVar2 = b3.f272a;
                if (fVar2.f260d != valueOf) {
                    fVar2.f260d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
