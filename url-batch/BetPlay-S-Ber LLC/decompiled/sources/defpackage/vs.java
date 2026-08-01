package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.awerser.monnit.betplay.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class vs {
    public final MaterialButton a;
    public l20 b;
    public v30 c;
    public u40 d;
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
    public rt o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public vs(MaterialButton materialButton, l20 l20Var) {
        this.a = materialButton;
        this.b = l20Var;
    }

    public final rt a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (rt) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
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
        rt rtVar = new rt(this.b);
        v30 v30Var = this.c;
        if (v30Var != null) {
            rtVar.p(v30Var);
        }
        u40 u40Var = this.d;
        if (u40Var != null) {
            rtVar.I = u40Var;
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        rtVar.n(context);
        rtVar.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            rtVar.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        rtVar.g.j = f;
        rtVar.invalidateSelf();
        pt ptVar = rtVar.g;
        if (ptVar.d != colorStateList) {
            ptVar.d = colorStateList;
            rtVar.onStateChange(rtVar.getState());
        }
        rt rtVar2 = new rt(this.b);
        v30 v30Var2 = this.c;
        if (v30Var2 != null) {
            rtVar2.p(v30Var2);
        }
        int i = 0;
        rtVar2.setTint(0);
        float f2 = this.j;
        int L = this.p ? j8.L(materialButton.getContext(), l70.S(materialButton, R.attr.colorSurface)) : 0;
        rtVar2.g.j = f2;
        rtVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(L);
        pt ptVar2 = rtVar2.g;
        if (ptVar2.d != valueOf) {
            ptVar2.d = valueOf;
            rtVar2.onStateChange(rtVar2.getState());
        }
        rt rtVar3 = new rt(this.b);
        this.o = rtVar3;
        v30 v30Var3 = this.c;
        if (v30Var3 != null) {
            rtVar3.p(v30Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(c10.a(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{rtVar2, rtVar}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        rt a = a(false);
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
        y20 y20Var;
        rt a = a(false);
        if (a != null) {
            a.u(this.b);
            v30 v30Var = this.c;
            if (v30Var != null) {
                a.p(v30Var);
            }
        }
        rt a2 = a(true);
        if (a2 != null) {
            a2.u(this.b);
            v30 v30Var2 = this.c;
            if (v30Var2 != null) {
                a2.p(v30Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof y20) {
                y20Var = (y20) findDrawableByLayerId;
                if (y20Var == null) {
                    boolean z = y20Var instanceof rt;
                    l20 l20Var = this.b;
                    if (!z) {
                        y20Var.setShapeAppearanceModel(l20Var.d());
                        return;
                    }
                    rt rtVar = (rt) y20Var;
                    rtVar.u(l20Var);
                    v30 v30Var3 = this.c;
                    if (v30Var3 != null) {
                        rtVar.p(v30Var3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        y20Var = null;
        if (y20Var == null) {
        }
    }

    public final void e() {
        int i = 0;
        rt a = a(false);
        rt a2 = a(true);
        if (a != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            a.g.j = f;
            a.invalidateSelf();
            pt ptVar = a.g;
            if (ptVar.d != colorStateList) {
                ptVar.d = colorStateList;
                a.onStateChange(a.getState());
            }
            if (a2 != null) {
                float f2 = this.j;
                if (this.p) {
                    MaterialButton materialButton = this.a;
                    i = j8.L(materialButton.getContext(), l70.S(materialButton, R.attr.colorSurface));
                }
                a2.g.j = f2;
                a2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                pt ptVar2 = a2.g;
                if (ptVar2.d != valueOf) {
                    ptVar2.d = valueOf;
                    a2.onStateChange(a2.getState());
                }
            }
        }
    }
}
