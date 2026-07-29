package t0;

import H0.f;
import H0.g;
import H0.k;
import H0.v;
import K.T;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.luckyreads.bookshelf.R;
import i1.r;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3781a;

    /* renamed from: b, reason: collision with root package name */
    public k f3782b;

    /* renamed from: c, reason: collision with root package name */
    public int f3783c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3784e;

    /* renamed from: f, reason: collision with root package name */
    public int f3785f;

    /* renamed from: g, reason: collision with root package name */
    public int f3786g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3787j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3788k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3789l;

    /* renamed from: m, reason: collision with root package name */
    public g f3790m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3794q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f3796s;

    /* renamed from: t, reason: collision with root package name */
    public int f3797t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3791n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3792o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3793p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3795r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f3781a = materialButton;
        this.f3782b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f3796s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3796s.getNumberOfLayers() > 2 ? (v) this.f3796s.getDrawable(2) : (v) this.f3796s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f3796s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f3796s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f3782b = kVar;
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
        WeakHashMap weakHashMap = T.f381a;
        MaterialButton materialButton = this.f3781a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f3784e;
        int i4 = this.f3785f;
        this.f3785f = i2;
        this.f3784e = i;
        if (!this.f3792o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f3782b);
        MaterialButton materialButton = this.f3781a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f3787j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f3788k;
        gVar.f256a.f248j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f256a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f3782b);
        gVar2.setTint(0);
        float f3 = this.h;
        int i = this.f3791n ? r.i(materialButton, R.attr.colorSurface) : 0;
        gVar2.f256a.f248j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        f fVar2 = gVar2.f256a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f3782b);
        this.f3790m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(F0.a.a(this.f3789l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f3783c, this.f3784e, this.d, this.f3785f), this.f3790m);
        this.f3796s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f3797t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f3788k;
            b2.f256a.f248j = f2;
            b2.invalidateSelf();
            f fVar = b2.f256a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int i = this.f3791n ? r.i(this.f3781a, R.attr.colorSurface) : 0;
                b3.f256a.f248j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                f fVar2 = b3.f256a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
