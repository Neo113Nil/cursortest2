package v0;

import J0.f;
import J0.g;
import J0.k;
import J0.v;
import K.T;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.winworm.neongrid.R;
import java.util.WeakHashMap;
import k0.AbstractC0180a;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3994a;

    /* renamed from: b, reason: collision with root package name */
    public k f3995b;

    /* renamed from: c, reason: collision with root package name */
    public int f3996c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3997e;

    /* renamed from: f, reason: collision with root package name */
    public int f3998f;

    /* renamed from: g, reason: collision with root package name */
    public int f3999g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f4000j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4001k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4002l;

    /* renamed from: m, reason: collision with root package name */
    public g f4003m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4007q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f4009s;

    /* renamed from: t, reason: collision with root package name */
    public int f4010t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4004n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4005o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4006p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4008r = true;

    public C0310c(MaterialButton materialButton, k kVar) {
        this.f3994a = materialButton;
        this.f3995b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f4009s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4009s.getNumberOfLayers() > 2 ? (v) this.f4009s.getDrawable(2) : (v) this.f4009s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f4009s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f4009s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f3995b = kVar;
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
        WeakHashMap weakHashMap = T.f440a;
        MaterialButton materialButton = this.f3994a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f3997e;
        int i4 = this.f3998f;
        this.f3998f = i2;
        this.f3997e = i;
        if (!this.f4005o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f3995b);
        MaterialButton materialButton = this.f3994a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f4000j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f4001k;
        gVar.f352a.f344j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f352a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f3995b);
        gVar2.setTint(0);
        float f3 = this.h;
        int i = this.f4004n ? AbstractC0180a.i(materialButton, R.attr.colorSurface) : 0;
        gVar2.f352a.f344j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        f fVar2 = gVar2.f352a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f3995b);
        this.f4003m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(H0.a.a(this.f4002l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f3996c, this.f3997e, this.d, this.f3998f), this.f4003m);
        this.f4009s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f4010t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f4001k;
            b2.f352a.f344j = f2;
            b2.invalidateSelf();
            f fVar = b2.f352a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int i = this.f4004n ? AbstractC0180a.i(this.f3994a, R.attr.colorSurface) : 0;
                b3.f352a.f344j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                f fVar2 = b3.f352a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
