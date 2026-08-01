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
import com.visualfortune.eyerest.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3889a;

    /* renamed from: b, reason: collision with root package name */
    public k f3890b;

    /* renamed from: c, reason: collision with root package name */
    public int f3891c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3892e;

    /* renamed from: f, reason: collision with root package name */
    public int f3893f;

    /* renamed from: g, reason: collision with root package name */
    public int f3894g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3895j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3896k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3897l;

    /* renamed from: m, reason: collision with root package name */
    public g f3898m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3902q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f3904s;

    /* renamed from: t, reason: collision with root package name */
    public int f3905t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3899n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3900o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3901p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3903r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f3889a = materialButton;
        this.f3890b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f3904s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3904s.getNumberOfLayers() > 2 ? (v) this.f3904s.getDrawable(2) : (v) this.f3904s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f3904s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f3904s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f3890b = kVar;
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
        WeakHashMap weakHashMap = S.f362a;
        MaterialButton materialButton = this.f3889a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f3892e;
        int i4 = this.f3893f;
        this.f3893f = i2;
        this.f3892e = i;
        if (!this.f3900o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f3890b);
        MaterialButton materialButton = this.f3889a;
        gVar.h(materialButton.getContext());
        D.a.h(gVar, this.f3895j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            D.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f3896k;
        gVar.f268a.f260j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f268a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f3890b);
        gVar2.setTint(0);
        float f3 = this.h;
        int n2 = this.f3899n ? k1.c.n(materialButton, R.attr.colorSurface) : 0;
        gVar2.f268a.f260j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(n2);
        f fVar2 = gVar2.f268a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f3890b);
        this.f3898m = gVar3;
        D.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(G0.a.a(this.f3897l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f3891c, this.f3892e, this.d, this.f3893f), this.f3898m);
        this.f3904s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f3905t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f3896k;
            b2.f268a.f260j = f2;
            b2.invalidateSelf();
            f fVar = b2.f268a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int n2 = this.f3899n ? k1.c.n(this.f3889a, R.attr.colorSurface) : 0;
                b3.f268a.f260j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(n2);
                f fVar2 = b3.f268a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
