package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import com.moontiko.really.admiralcasino.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class iv {
    public final MaterialButton a;
    public d50 b;
    public o60 c;
    public c2 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public dw o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public iv(MaterialButton materialButton, d50 d50Var) {
        this.a = materialButton;
        this.b = d50Var;
    }

    public final dw a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (dw) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void c() {
        dw dwVar = new dw(this.b);
        o60 o60Var = this.c;
        if (o60Var != null) {
            dwVar.p(o60Var);
        }
        c2 c2Var = this.d;
        if (c2Var != null) {
            dwVar.J = c2Var;
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        dwVar.n(context);
        dwVar.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            dwVar.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        dwVar.g.j = f;
        dwVar.invalidateSelf();
        bw bwVar = dwVar.g;
        if (bwVar.d != colorStateList) {
            bwVar.d = colorStateList;
            dwVar.onStateChange(dwVar.getState());
        }
        dw dwVar2 = new dw(this.b);
        o60 o60Var2 = this.c;
        if (o60Var2 != null) {
            dwVar2.p(o60Var2);
        }
        int i = 0;
        dwVar2.setTint(0);
        float f2 = this.j;
        int G = this.p ? xf.G(materialButton.getContext(), b9.N(materialButton, R.attr.colorSurface)) : 0;
        dwVar2.g.j = f2;
        dwVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(G);
        bw bwVar2 = dwVar2.g;
        if (bwVar2.d != valueOf) {
            bwVar2.d = valueOf;
            dwVar2.onStateChange(dwVar2.getState());
        }
        dw dwVar3 = new dw(this.b);
        this.o = dwVar3;
        o60 o60Var3 = this.c;
        if (o60Var3 != null) {
            dwVar3.p(o60Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(r30.a(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{dwVar2, dwVar}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        dw a = a(false);
        if (a != null) {
            a.q(this.v);
            a.setState(materialButton.getDrawableState());
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
            focusRingDrawable.m = new WeakReference(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        q50 q50Var;
        dw a = a(false);
        if (a != null) {
            a.u(this.b);
            o60 o60Var = this.c;
            if (o60Var != null) {
                a.p(o60Var);
            }
        }
        dw a2 = a(true);
        if (a2 != null) {
            a2.u(this.b);
            o60 o60Var2 = this.c;
            if (o60Var2 != null) {
                a2.p(o60Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof q50) {
                q50Var = (q50) findDrawableByLayerId;
                if (q50Var == null) {
                    boolean z = q50Var instanceof dw;
                    d50 d50Var = this.b;
                    if (!z) {
                        q50Var.setShapeAppearanceModel(d50Var.d());
                        return;
                    }
                    dw dwVar = (dw) q50Var;
                    dwVar.u(d50Var);
                    o60 o60Var3 = this.c;
                    if (o60Var3 != null) {
                        dwVar.p(o60Var3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        q50Var = null;
        if (q50Var == null) {
        }
    }

    public final void e() {
        int i = 0;
        dw a = a(false);
        dw a2 = a(true);
        if (a != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            a.g.j = f;
            a.invalidateSelf();
            bw bwVar = a.g;
            if (bwVar.d != colorStateList) {
                bwVar.d = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f2 = this.j;
                if (this.p) {
                    MaterialButton materialButton = this.a;
                    i = xf.G(materialButton.getContext(), b9.N(materialButton, R.attr.colorSurface));
                }
                a2.g.j = f2;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                bw bwVar2 = a2.g;
                if (bwVar2.d != valueOf) {
                    bwVar2.d = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
