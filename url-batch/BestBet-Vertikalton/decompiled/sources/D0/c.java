package D0;

import H1.l;
import K.Q;
import R0.g;
import R0.k;
import R0.v;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.fortunequest.neontrack.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f125a;

    /* renamed from: b, reason: collision with root package name */
    public k f126b;

    /* renamed from: c, reason: collision with root package name */
    public int f127c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f128e;

    /* renamed from: f, reason: collision with root package name */
    public int f129f;

    /* renamed from: g, reason: collision with root package name */
    public int f130g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f131j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f132k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f133l;

    /* renamed from: m, reason: collision with root package name */
    public g f134m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f138q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f140s;

    /* renamed from: t, reason: collision with root package name */
    public int f141t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f135n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f136o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f137p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f139r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f125a = materialButton;
        this.f126b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f140s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f140s.getNumberOfLayers() > 2 ? (v) this.f140s.getDrawable(2) : (v) this.f140s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f140s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f140s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f126b = kVar;
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
        WeakHashMap weakHashMap = Q.f578a;
        MaterialButton materialButton = this.f125a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f128e;
        int i4 = this.f129f;
        this.f129f = i2;
        this.f128e = i;
        if (!this.f136o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f126b);
        MaterialButton materialButton = this.f125a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f131j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f132k;
        gVar.f917a.f909j = f2;
        gVar.invalidateSelf();
        R0.f fVar = gVar.f917a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f126b);
        gVar2.setTint(0);
        float f3 = this.h;
        int A2 = this.f135n ? l.A(materialButton, R.attr.colorSurface) : 0;
        gVar2.f917a.f909j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(A2);
        R0.f fVar2 = gVar2.f917a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f126b);
        this.f134m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(P0.a.a(this.f133l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f127c, this.f128e, this.d, this.f129f), this.f134m);
        this.f140s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f141t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f132k;
            b2.f917a.f909j = f2;
            b2.invalidateSelf();
            R0.f fVar = b2.f917a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int A2 = this.f135n ? l.A(this.f125a, R.attr.colorSurface) : 0;
                b3.f917a.f909j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(A2);
                R0.f fVar2 = b3.f917a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
