package w0;

import L0.f;
import L0.g;
import L0.k;
import L0.v;
import M.Q;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.winfour.neondrop.R;
import java.util.WeakHashMap;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3917a;

    /* renamed from: b, reason: collision with root package name */
    public k f3918b;

    /* renamed from: c, reason: collision with root package name */
    public int f3919c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3920e;

    /* renamed from: f, reason: collision with root package name */
    public int f3921f;

    /* renamed from: g, reason: collision with root package name */
    public int f3922g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3923j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3924k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3925l;

    /* renamed from: m, reason: collision with root package name */
    public g f3926m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3930q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f3932s;

    /* renamed from: t, reason: collision with root package name */
    public int f3933t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3927n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3928o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3929p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3931r = true;

    public C0297c(MaterialButton materialButton, k kVar) {
        this.f3917a = materialButton;
        this.f3918b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f3932s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3932s.getNumberOfLayers() > 2 ? (v) this.f3932s.getDrawable(2) : (v) this.f3932s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f3932s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f3932s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f3918b = kVar;
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
        WeakHashMap weakHashMap = Q.f513a;
        MaterialButton materialButton = this.f3917a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f3920e;
        int i4 = this.f3921f;
        this.f3921f = i2;
        this.f3920e = i;
        if (!this.f3928o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f3918b);
        MaterialButton materialButton = this.f3917a;
        gVar.i(materialButton.getContext());
        F.a.h(gVar, this.f3923j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            F.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f3924k;
        gVar.f433a.f425j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f433a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f3918b);
        gVar2.setTint(0);
        float f3 = this.h;
        int t2 = this.f3927n ? z1.d.t(materialButton, R.attr.colorSurface) : 0;
        gVar2.f433a.f425j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(t2);
        f fVar2 = gVar2.f433a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f3918b);
        this.f3926m = gVar3;
        F.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(J0.a.a(this.f3925l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f3919c, this.f3920e, this.d, this.f3921f), this.f3926m);
        this.f3932s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.k(this.f3933t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f3924k;
            b2.f433a.f425j = f2;
            b2.invalidateSelf();
            f fVar = b2.f433a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int t2 = this.f3927n ? z1.d.t(this.f3917a, R.attr.colorSurface) : 0;
                b3.f433a.f425j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(t2);
                f fVar2 = b3.f433a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
