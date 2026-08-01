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
import com.fortuneink.neonpad.R;
import com.google.android.material.button.MaterialButton;
import i1.r;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f4200a;

    /* renamed from: b, reason: collision with root package name */
    public k f4201b;

    /* renamed from: c, reason: collision with root package name */
    public int f4202c;

    /* renamed from: d, reason: collision with root package name */
    public int f4203d;

    /* renamed from: e, reason: collision with root package name */
    public int f4204e;

    /* renamed from: f, reason: collision with root package name */
    public int f4205f;

    /* renamed from: g, reason: collision with root package name */
    public int f4206g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f4207j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4208k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4209l;

    /* renamed from: m, reason: collision with root package name */
    public g f4210m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4214q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f4216s;

    /* renamed from: t, reason: collision with root package name */
    public int f4217t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4211n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4212o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4213p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4215r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f4200a = materialButton;
        this.f4201b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f4216s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4216s.getNumberOfLayers() > 2 ? (v) this.f4216s.getDrawable(2) : (v) this.f4216s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f4216s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f4216s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f4201b = kVar;
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
        WeakHashMap weakHashMap = X.f418a;
        MaterialButton materialButton = this.f4200a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f4204e;
        int i4 = this.f4205f;
        this.f4205f = i2;
        this.f4204e = i;
        if (!this.f4212o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f4201b);
        MaterialButton materialButton = this.f4200a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f4207j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f4208k;
        gVar.f273a.f265j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f273a;
        if (fVar.f261d != colorStateList) {
            fVar.f261d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f4201b);
        gVar2.setTint(0);
        float f3 = this.h;
        int h = this.f4211n ? r.h(materialButton, R.attr.colorSurface) : 0;
        gVar2.f273a.f265j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(h);
        f fVar2 = gVar2.f273a;
        if (fVar2.f261d != valueOf) {
            fVar2.f261d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f4201b);
        this.f4210m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(F0.a.a(this.f4209l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f4202c, this.f4204e, this.f4203d, this.f4205f), this.f4210m);
        this.f4216s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f4217t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f4208k;
            b2.f273a.f265j = f2;
            b2.invalidateSelf();
            f fVar = b2.f273a;
            if (fVar.f261d != colorStateList) {
                fVar.f261d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int h = this.f4211n ? r.h(this.f4200a, R.attr.colorSurface) : 0;
                b3.f273a.f265j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(h);
                f fVar2 = b3.f273a;
                if (fVar2.f261d != valueOf) {
                    fVar2.f261d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
