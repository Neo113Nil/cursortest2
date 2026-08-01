package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class hs {
    public final MaterialButton a;
    public b20 b;
    public m30 c;
    public l40 d;
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
    public ct o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public hs(MaterialButton materialButton, b20 b20Var) {
        this.a = materialButton;
        this.b = b20Var;
    }

    public final ct a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (ct) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
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
        ct ctVar = new ct(this.b);
        m30 m30Var = this.c;
        if (m30Var != null) {
            ctVar.p(m30Var);
        }
        l40 l40Var = this.d;
        if (l40Var != null) {
            ctVar.J = l40Var;
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        ctVar.n(context);
        ctVar.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            ctVar.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        ctVar.g.j = f;
        ctVar.invalidateSelf();
        at atVar = ctVar.g;
        if (atVar.d != colorStateList) {
            atVar.d = colorStateList;
            ctVar.onStateChange(ctVar.getState());
        }
        ct ctVar2 = new ct(this.b);
        m30 m30Var2 = this.c;
        if (m30Var2 != null) {
            ctVar2.p(m30Var2);
        }
        int i = 0;
        ctVar2.setTint(0);
        float f2 = this.j;
        int X = this.p ? jw.X(materialButton.getContext(), zo.L(materialButton, R.attr.colorSurface)) : 0;
        ctVar2.g.j = f2;
        ctVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(X);
        at atVar2 = ctVar2.g;
        if (atVar2.d != valueOf) {
            atVar2.d = valueOf;
            ctVar2.onStateChange(ctVar2.getState());
        }
        ct ctVar3 = new ct(this.b);
        this.o = ctVar3;
        m30 m30Var3 = this.c;
        if (m30Var3 != null) {
            ctVar3.p(m30Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(m00.a(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{ctVar2, ctVar}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        ct a = a(false);
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
        o20 o20Var;
        ct a = a(false);
        if (a != null) {
            a.u(this.b);
            m30 m30Var = this.c;
            if (m30Var != null) {
                a.p(m30Var);
            }
        }
        ct a2 = a(true);
        if (a2 != null) {
            a2.u(this.b);
            m30 m30Var2 = this.c;
            if (m30Var2 != null) {
                a2.p(m30Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof o20) {
                o20Var = (o20) findDrawableByLayerId;
                if (o20Var == null) {
                    boolean z = o20Var instanceof ct;
                    b20 b20Var = this.b;
                    if (!z) {
                        o20Var.setShapeAppearanceModel(b20Var.d());
                        return;
                    }
                    ct ctVar = (ct) o20Var;
                    ctVar.u(b20Var);
                    m30 m30Var3 = this.c;
                    if (m30Var3 != null) {
                        ctVar.p(m30Var3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        o20Var = null;
        if (o20Var == null) {
        }
    }

    public final void e() {
        int i = 0;
        ct a = a(false);
        ct a2 = a(true);
        if (a != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            a.g.j = f;
            a.invalidateSelf();
            at atVar = a.g;
            if (atVar.d != colorStateList) {
                atVar.d = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f2 = this.j;
                if (this.p) {
                    MaterialButton materialButton = this.a;
                    i = jw.X(materialButton.getContext(), zo.L(materialButton, R.attr.colorSurface));
                }
                a2.g.j = f2;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                at atVar2 = a2.g;
                if (atVar2.d != valueOf) {
                    atVar2.d = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
