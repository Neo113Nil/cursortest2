package z0;

import H1.l;
import M.P;
import N0.f;
import N0.g;
import N0.k;
import N0.v;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.winpower.neonfit.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f4785a;

    /* renamed from: b, reason: collision with root package name */
    public k f4786b;

    /* renamed from: c, reason: collision with root package name */
    public int f4787c;

    /* renamed from: d, reason: collision with root package name */
    public int f4788d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f4789f;

    /* renamed from: g, reason: collision with root package name */
    public int f4790g;

    /* renamed from: h, reason: collision with root package name */
    public int f4791h;
    public PorterDuff.Mode i;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4792k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4793l;

    /* renamed from: m, reason: collision with root package name */
    public g f4794m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4798q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f4800s;

    /* renamed from: t, reason: collision with root package name */
    public int f4801t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4795n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4796o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4797p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4799r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f4785a = materialButton;
        this.f4786b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f4800s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4800s.getNumberOfLayers() > 2 ? (v) this.f4800s.getDrawable(2) : (v) this.f4800s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f4800s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f4800s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f4786b = kVar;
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
        WeakHashMap weakHashMap = P.f711a;
        MaterialButton materialButton = this.f4785a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f4789f;
        this.f4789f = i2;
        this.e = i;
        if (!this.f4796o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f4786b);
        MaterialButton materialButton = this.f4785a;
        gVar.h(materialButton.getContext());
        F.a.h(gVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            F.a.i(gVar, mode);
        }
        float f2 = this.f4791h;
        ColorStateList colorStateList = this.f4792k;
        gVar.f900a.j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f900a;
        if (fVar.f889d != colorStateList) {
            fVar.f889d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f4786b);
        gVar2.setTint(0);
        float f3 = this.f4791h;
        int u2 = this.f4795n ? l.u(materialButton, R.attr.colorSurface) : 0;
        gVar2.f900a.j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(u2);
        f fVar2 = gVar2.f900a;
        if (fVar2.f889d != valueOf) {
            fVar2.f889d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f4786b);
        this.f4794m = gVar3;
        F.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(L0.a.a(this.f4793l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f4787c, this.e, this.f4788d, this.f4789f), this.f4794m);
        this.f4800s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f4801t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.f4791h;
            ColorStateList colorStateList = this.f4792k;
            b2.f900a.j = f2;
            b2.invalidateSelf();
            f fVar = b2.f900a;
            if (fVar.f889d != colorStateList) {
                fVar.f889d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.f4791h;
                int u2 = this.f4795n ? l.u(this.f4785a, R.attr.colorSurface) : 0;
                b3.f900a.j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(u2);
                f fVar2 = b3.f900a;
                if (fVar2.f889d != valueOf) {
                    fVar2.f889d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
