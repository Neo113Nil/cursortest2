package w0;

import K0.f;
import K0.g;
import K0.k;
import K0.v;
import L.T;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.winfour.winrandom.R;
import java.util.WeakHashMap;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f4183a;

    /* renamed from: b, reason: collision with root package name */
    public k f4184b;

    /* renamed from: c, reason: collision with root package name */
    public int f4185c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4186e;

    /* renamed from: f, reason: collision with root package name */
    public int f4187f;

    /* renamed from: g, reason: collision with root package name */
    public int f4188g;

    /* renamed from: h, reason: collision with root package name */
    public int f4189h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f4190j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f4191k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4192l;

    /* renamed from: m, reason: collision with root package name */
    public g f4193m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4197q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f4199s;

    /* renamed from: t, reason: collision with root package name */
    public int f4200t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4194n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4195o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4196p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4198r = true;

    public C0312c(MaterialButton materialButton, k kVar) {
        this.f4183a = materialButton;
        this.f4184b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f4199s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f4199s.getNumberOfLayers() > 2 ? (v) this.f4199s.getDrawable(2) : (v) this.f4199s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f4199s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f4199s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f4184b = kVar;
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
        WeakHashMap weakHashMap = T.f490a;
        MaterialButton materialButton = this.f4183a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f4186e;
        int i4 = this.f4187f;
        this.f4187f = i2;
        this.f4186e = i;
        if (!this.f4195o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f4184b);
        MaterialButton materialButton = this.f4183a;
        gVar.h(materialButton.getContext());
        E.a.h(gVar, this.f4190j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            E.a.i(gVar, mode);
        }
        float f2 = this.f4189h;
        ColorStateList colorStateList = this.f4191k;
        gVar.f397a.f389j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f397a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f4184b);
        gVar2.setTint(0);
        float f3 = this.f4189h;
        int B2 = this.f4194n ? A1.d.B(materialButton, R.attr.colorSurface) : 0;
        gVar2.f397a.f389j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(B2);
        f fVar2 = gVar2.f397a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f4184b);
        this.f4193m = gVar3;
        E.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(I0.a.a(this.f4192l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f4185c, this.f4186e, this.d, this.f4187f), this.f4193m);
        this.f4199s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f4200t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.f4189h;
            ColorStateList colorStateList = this.f4191k;
            b2.f397a.f389j = f2;
            b2.invalidateSelf();
            f fVar = b2.f397a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.f4189h;
                int B2 = this.f4194n ? A1.d.B(this.f4183a, R.attr.colorSurface) : 0;
                b3.f397a.f389j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(B2);
                f fVar2 = b3.f397a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
