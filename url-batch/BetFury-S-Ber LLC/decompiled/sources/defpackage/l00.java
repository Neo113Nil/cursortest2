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
import com.trembin.nirefon.betfury.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l00 {
    public final MaterialButton a;
    public ed0 b;
    public ue0 c;
    public cv d;
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
    public g10 o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public l00(MaterialButton materialButton, ed0 ed0Var) {
        this.a = materialButton;
        this.b = ed0Var;
    }

    public final g10 a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g10) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
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
        g10 g10Var = new g10(this.b);
        ue0 ue0Var = this.c;
        if (ue0Var != null) {
            g10Var.p(ue0Var);
        }
        cv cvVar = this.d;
        if (cvVar != null) {
            g10Var.J = cvVar;
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        g10Var.n(context);
        g10Var.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            g10Var.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        g10Var.g.j = f;
        g10Var.invalidateSelf();
        e10 e10Var = g10Var.g;
        if (e10Var.d != colorStateList) {
            e10Var.d = colorStateList;
            g10Var.onStateChange(g10Var.getState());
        }
        g10 g10Var2 = new g10(this.b);
        ue0 ue0Var2 = this.c;
        if (ue0Var2 != null) {
            g10Var2.p(ue0Var2);
        }
        int i = 0;
        g10Var2.setTint(0);
        float f2 = this.j;
        int W = this.p ? bi.W(materialButton.getContext(), n9.M(materialButton, R.attr.colorSurface)) : 0;
        g10Var2.g.j = f2;
        g10Var2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(W);
        e10 e10Var2 = g10Var2.g;
        if (e10Var2.d != valueOf) {
            e10Var2.d = valueOf;
            g10Var2.onStateChange(g10Var2.getState());
        }
        g10 g10Var3 = new g10(this.b);
        this.o = g10Var3;
        ue0 ue0Var3 = this.c;
        if (ue0Var3 != null) {
            g10Var3.p(ue0Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(ba0.a(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{g10Var2, g10Var}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        g10 a = a(false);
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
        rd0 rd0Var;
        g10 a = a(false);
        if (a != null) {
            a.u(this.b);
            ue0 ue0Var = this.c;
            if (ue0Var != null) {
                a.p(ue0Var);
            }
        }
        g10 a2 = a(true);
        if (a2 != null) {
            a2.u(this.b);
            ue0 ue0Var2 = this.c;
            if (ue0Var2 != null) {
                a2.p(ue0Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof rd0) {
                rd0Var = (rd0) findDrawableByLayerId;
                if (rd0Var == null) {
                    boolean z = rd0Var instanceof g10;
                    ed0 ed0Var = this.b;
                    if (!z) {
                        rd0Var.setShapeAppearanceModel(ed0Var.d());
                        return;
                    }
                    g10 g10Var = (g10) rd0Var;
                    g10Var.u(ed0Var);
                    ue0 ue0Var3 = this.c;
                    if (ue0Var3 != null) {
                        g10Var.p(ue0Var3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        rd0Var = null;
        if (rd0Var == null) {
        }
    }

    public final void e() {
        int i = 0;
        g10 a = a(false);
        g10 a2 = a(true);
        if (a != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            a.g.j = f;
            a.invalidateSelf();
            e10 e10Var = a.g;
            if (e10Var.d != colorStateList) {
                e10Var.d = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f2 = this.j;
                if (this.p) {
                    MaterialButton materialButton = this.a;
                    i = bi.W(materialButton.getContext(), n9.M(materialButton, R.attr.colorSurface));
                }
                a2.g.j = f2;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                e10 e10Var2 = a2.g;
                if (e10Var2.d != valueOf) {
                    e10Var2.d = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
