package A0;

import K.S;
import O0.k;
import O0.v;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.clutchquizarena.app.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f5a;

    /* renamed from: b, reason: collision with root package name */
    public k f6b;

    /* renamed from: c, reason: collision with root package name */
    public int f7c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f8e;

    /* renamed from: f, reason: collision with root package name */
    public int f9f;

    /* renamed from: g, reason: collision with root package name */
    public int f10g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f11j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f12k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f13l;

    /* renamed from: m, reason: collision with root package name */
    public O0.g f14m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f20s;

    /* renamed from: t, reason: collision with root package name */
    public int f21t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19r = true;

    public d(MaterialButton materialButton, k kVar) {
        this.f5a = materialButton;
        this.f6b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f20s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f20s.getNumberOfLayers() > 2 ? (v) this.f20s.getDrawable(2) : (v) this.f20s.getDrawable(1);
    }

    public final O0.g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f20s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (O0.g) ((LayerDrawable) ((InsetDrawable) this.f20s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f6b = kVar;
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
        WeakHashMap weakHashMap = S.f365a;
        MaterialButton materialButton = this.f5a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f8e;
        int i4 = this.f9f;
        this.f9f = i2;
        this.f8e = i;
        if (!this.f16o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        O0.g gVar = new O0.g(this.f6b);
        MaterialButton materialButton = this.f5a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f11j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f12k;
        gVar.f527a.f519j = f2;
        gVar.invalidateSelf();
        O0.f fVar = gVar.f527a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        O0.g gVar2 = new O0.g(this.f6b);
        gVar2.setTint(0);
        float f3 = this.h;
        int E2 = this.f15n ? A.c.E(materialButton, R.attr.colorSurface) : 0;
        gVar2.f527a.f519j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(E2);
        O0.f fVar2 = gVar2.f527a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        O0.g gVar3 = new O0.g(this.f6b);
        this.f14m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(M0.a.a(this.f13l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f7c, this.f8e, this.d, this.f9f), this.f14m);
        this.f20s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        O0.g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f21t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        O0.g b2 = b(false);
        O0.g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f12k;
            b2.f527a.f519j = f2;
            b2.invalidateSelf();
            O0.f fVar = b2.f527a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int E2 = this.f15n ? A.c.E(this.f5a, R.attr.colorSurface) : 0;
                b3.f527a.f519j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(E2);
                O0.f fVar2 = b3.f527a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
