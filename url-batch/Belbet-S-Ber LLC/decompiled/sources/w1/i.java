package w1;

import a.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import b4.l;
import com.gdmhkmf.belbet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import o2.j;
import o2.m;
import o2.z;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3795a;

    /* renamed from: b, reason: collision with root package name */
    public m f3796b;

    /* renamed from: c, reason: collision with root package name */
    public v0.f f3797c;
    public g0 d;

    /* renamed from: e, reason: collision with root package name */
    public int f3798e;

    /* renamed from: f, reason: collision with root package name */
    public int f3799f;

    /* renamed from: g, reason: collision with root package name */
    public int f3800g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3801j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f3802k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3803l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f3804m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f3805n;

    /* renamed from: o, reason: collision with root package name */
    public j f3806o;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3810s;

    /* renamed from: u, reason: collision with root package name */
    public RippleDrawable f3812u;

    /* renamed from: v, reason: collision with root package name */
    public int f3813v;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3807p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3808q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3809r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3811t = true;

    public i(MaterialButton materialButton, m mVar) {
        this.f3795a = materialButton;
        this.f3796b = mVar;
    }

    public final j a(boolean z4) {
        RippleDrawable rippleDrawable = this.f3812u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.f3812u.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0);
    }

    public final void b(int i, int i4, int i5, int i6) {
        MaterialButton materialButton = this.f3795a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i7 = this.f3798e;
        int i8 = this.f3800g;
        int i9 = this.f3799f;
        int i10 = this.h;
        this.f3798e = i;
        this.f3800g = i4;
        this.f3799f = i5;
        this.h = i6;
        if (!this.f3808q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i7, (paddingTop + i4) - i8, (paddingEnd + i5) - i9, (paddingBottom + i6) - i10);
    }

    public final void c() {
        j jVar = new j(this.f3796b);
        v0.f fVar = this.f3797c;
        if (fVar != null) {
            jVar.p(fVar);
        }
        g0 g0Var = this.d;
        if (g0Var != null) {
            jVar.I = g0Var;
        }
        MaterialButton materialButton = this.f3795a;
        Context context = materialButton.getContext();
        jVar.n(context);
        jVar.setTintList(this.f3803l);
        PorterDuff.Mode mode = this.f3802k;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f5 = this.f3801j;
        ColorStateList colorStateList = this.f3804m;
        jVar.f2955g.f2946j = f5;
        jVar.invalidateSelf();
        o2.h hVar = jVar.f2955g;
        if (hVar.d != colorStateList) {
            hVar.d = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.f3796b);
        v0.f fVar2 = this.f3797c;
        if (fVar2 != null) {
            jVar2.p(fVar2);
        }
        int i = 0;
        jVar2.setTint(0);
        float f6 = this.f3801j;
        int U = this.f3807p ? l.U(materialButton.getContext(), b4.d.R(materialButton, R.attr.colorSurface)) : 0;
        jVar2.f2955g.f2946j = f6;
        jVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(U);
        o2.h hVar2 = jVar2.f2955g;
        if (hVar2.d != valueOf) {
            hVar2.d = valueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.f3796b);
        this.f3806o = jVar3;
        v0.f fVar3 = this.f3797c;
        if (fVar3 != null) {
            jVar3.p(fVar3);
        }
        this.f3806o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(m2.a.a(this.f3805n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f3798e, this.f3800g, this.f3799f, this.h), this.f3806o);
        this.f3812u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.f3812u);
        j a5 = a(false);
        if (a5 != null) {
            a5.q(this.f3813v);
            a5.setState(materialButton.getDrawableState());
        }
        Drawable background = materialButton.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else {
            if (background instanceof DrawableWrapper) {
                Drawable drawable = ((DrawableWrapper) background).getDrawable();
                if (drawable instanceof FocusRingDrawable) {
                    focusRingDrawable = (FocusRingDrawable) drawable;
                }
            }
            if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                while (true) {
                    if (i >= layerDrawable.getNumberOfLayers()) {
                        break;
                    }
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable2;
                        break;
                    }
                    i++;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.f1161m = new WeakReference(a5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        z zVar;
        j a5 = a(false);
        if (a5 != null) {
            a5.u(this.f3796b);
            v0.f fVar = this.f3797c;
            if (fVar != null) {
                a5.p(fVar);
            }
        }
        j a6 = a(true);
        if (a6 != null) {
            a6.u(this.f3796b);
            v0.f fVar2 = this.f3797c;
            if (fVar2 != null) {
                a6.p(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f3812u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof z) {
                zVar = (z) findDrawableByLayerId;
                if (zVar == null) {
                    if (!(zVar instanceof j)) {
                        zVar.setShapeAppearanceModel(this.f3796b.d());
                        return;
                    }
                    j jVar = (j) zVar;
                    jVar.u(this.f3796b);
                    v0.f fVar3 = this.f3797c;
                    if (fVar3 != null) {
                        jVar.p(fVar3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        zVar = null;
        if (zVar == null) {
        }
    }

    public final void e() {
        int i = 0;
        j a5 = a(false);
        j a6 = a(true);
        if (a5 != null) {
            float f5 = this.f3801j;
            ColorStateList colorStateList = this.f3804m;
            a5.f2955g.f2946j = f5;
            a5.invalidateSelf();
            o2.h hVar = a5.f2955g;
            if (hVar.d != colorStateList) {
                hVar.d = colorStateList;
                a5.onStateChange(a5.getState());
            }
            if (a6 != null) {
                float f6 = this.f3801j;
                if (this.f3807p) {
                    MaterialButton materialButton = this.f3795a;
                    i = l.U(materialButton.getContext(), b4.d.R(materialButton, R.attr.colorSurface));
                }
                a6.f2955g.f2946j = f6;
                a6.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                o2.h hVar2 = a6.f2955g;
                if (hVar2.d != valueOf) {
                    hVar2.d = valueOf;
                    a6.onStateChange(a6.getState());
                }
            }
        }
    }
}
