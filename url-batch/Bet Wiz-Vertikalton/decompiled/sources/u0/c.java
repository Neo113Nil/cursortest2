package u0;

import I0.f;
import I0.g;
import I0.k;
import I0.v;
import K.S;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.neonpulse.gridlogic.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3800a;

    /* renamed from: b, reason: collision with root package name */
    public k f3801b;

    /* renamed from: c, reason: collision with root package name */
    public int f3802c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3803e;

    /* renamed from: f, reason: collision with root package name */
    public int f3804f;

    /* renamed from: g, reason: collision with root package name */
    public int f3805g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3806j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3807k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3808l;

    /* renamed from: m, reason: collision with root package name */
    public g f3809m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3813q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f3815s;

    /* renamed from: t, reason: collision with root package name */
    public int f3816t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3810n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3811o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3812p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3814r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f3800a = materialButton;
        this.f3801b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f3815s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3815s.getNumberOfLayers() > 2 ? (v) this.f3815s.getDrawable(2) : (v) this.f3815s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f3815s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f3815s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f3801b = kVar;
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
        WeakHashMap weakHashMap = S.f422a;
        MaterialButton materialButton = this.f3800a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f3803e;
        int i4 = this.f3804f;
        this.f3804f = i2;
        this.f3803e = i;
        if (!this.f3811o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f3801b);
        MaterialButton materialButton = this.f3800a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f3806j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f3807k;
        gVar.f328a.f320j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f328a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f3801b);
        gVar2.setTint(0);
        float f3 = this.h;
        int j2 = this.f3810n ? k0.k.j(materialButton, R.attr.colorSurface) : 0;
        gVar2.f328a.f320j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(j2);
        f fVar2 = gVar2.f328a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f3801b);
        this.f3809m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(G0.a.a(this.f3808l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f3802c, this.f3803e, this.d, this.f3804f), this.f3809m);
        this.f3815s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f3816t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f3807k;
            b2.f328a.f320j = f2;
            b2.invalidateSelf();
            f fVar = b2.f328a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int j2 = this.f3810n ? k0.k.j(this.f3800a, R.attr.colorSurface) : 0;
                b3.f328a.f320j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(j2);
                f fVar2 = b3.f328a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
