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
import com.playbag.tripgear.R;
import java.util.WeakHashMap;
import m.C0260a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f4030a;

    /* renamed from: b, reason: collision with root package name */
    public k f4031b;

    /* renamed from: c, reason: collision with root package name */
    public int f4032c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4033e;

    /* renamed from: f, reason: collision with root package name */
    public int f4034f;

    /* renamed from: g, reason: collision with root package name */
    public int f4035g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f4036j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4037k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4038l;

    /* renamed from: m, reason: collision with root package name */
    public g f4039m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4043q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f4045s;

    /* renamed from: t, reason: collision with root package name */
    public int f4046t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4040n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4041o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4042p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4044r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f4030a = materialButton;
        this.f4031b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f4045s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4045s.getNumberOfLayers() > 2 ? (v) this.f4045s.getDrawable(2) : (v) this.f4045s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f4045s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f4045s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f4031b = kVar;
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
        WeakHashMap weakHashMap = T.f423a;
        MaterialButton materialButton = this.f4030a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f4033e;
        int i4 = this.f4034f;
        this.f4034f = i2;
        this.f4033e = i;
        if (!this.f4041o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f4031b);
        MaterialButton materialButton = this.f4030a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f4036j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f4037k;
        gVar.f335a.f327j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f335a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f4031b);
        gVar2.setTint(0);
        float f3 = this.h;
        int j2 = this.f4040n ? C0260a.j(materialButton, R.attr.colorSurface) : 0;
        gVar2.f335a.f327j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(j2);
        f fVar2 = gVar2.f335a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f4031b);
        this.f4039m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(H0.a.a(this.f4038l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f4032c, this.f4033e, this.d, this.f4034f), this.f4039m);
        this.f4045s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f4046t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f4037k;
            b2.f335a.f327j = f2;
            b2.invalidateSelf();
            f fVar = b2.f335a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int j2 = this.f4040n ? C0260a.j(this.f4030a, R.attr.colorSurface) : 0;
                b3.f335a.f327j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(j2);
                f fVar2 = b3.f335a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
