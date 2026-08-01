package r1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import g2.j;
import g2.m;
import j2.z;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3189a;

    /* renamed from: b, reason: collision with root package name */
    public m f3190b;
    public r0.h c;

    /* renamed from: d, reason: collision with root package name */
    public z f3191d;

    /* renamed from: e, reason: collision with root package name */
    public int f3192e;

    /* renamed from: f, reason: collision with root package name */
    public int f3193f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3194i;

    /* renamed from: j, reason: collision with root package name */
    public int f3195j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f3196k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3197l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f3198m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f3199n;

    /* renamed from: o, reason: collision with root package name */
    public j f3200o;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3204s;

    /* renamed from: u, reason: collision with root package name */
    public RippleDrawable f3206u;

    /* renamed from: v, reason: collision with root package name */
    public int f3207v;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3201p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3202q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3203r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3205t = true;

    public i(MaterialButton materialButton, m mVar) {
        this.f3189a = materialButton;
        this.f3190b = mVar;
    }

    public final j a(boolean z3) {
        RippleDrawable rippleDrawable = this.f3206u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.f3206u.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
    }

    public final void b(int i4, int i5, int i6, int i7) {
        MaterialButton materialButton = this.f3189a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i8 = this.f3192e;
        int i9 = this.g;
        int i10 = this.f3193f;
        int i11 = this.h;
        this.f3192e = i4;
        this.g = i5;
        this.f3193f = i6;
        this.h = i7;
        if (!this.f3202q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i4) - i8, (paddingTop + i5) - i9, (paddingEnd + i6) - i10, (paddingBottom + i7) - i11);
    }

    public final void c() {
        j jVar = new j(this.f3190b);
        r0.h hVar = this.c;
        if (hVar != null) {
            jVar.o(hVar);
        }
        z zVar = this.f3191d;
        if (zVar != null) {
            jVar.I = zVar;
        }
        MaterialButton materialButton = this.f3189a;
        Context context = materialButton.getContext();
        jVar.m(context);
        jVar.setTintList(this.f3197l);
        PorterDuff.Mode mode = this.f3196k;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f4 = this.f3195j;
        ColorStateList colorStateList = this.f3198m;
        jVar.g.f1849j = f4;
        jVar.invalidateSelf();
        g2.h hVar2 = jVar.g;
        if (hVar2.f1845d != colorStateList) {
            hVar2.f1845d = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.f3190b);
        r0.h hVar3 = this.c;
        if (hVar3 != null) {
            jVar2.o(hVar3);
        }
        int i4 = 0;
        jVar2.setTint(0);
        float f5 = this.f3195j;
        int t3 = this.f3201p ? l0.g.t(materialButton.getContext(), k3.d.a0(materialButton, R.attr.colorSurface)) : 0;
        jVar2.g.f1849j = f5;
        jVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(t3);
        g2.h hVar4 = jVar2.g;
        if (hVar4.f1845d != valueOf) {
            hVar4.f1845d = valueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.f3190b);
        this.f3200o = jVar3;
        r0.h hVar5 = this.c;
        if (hVar5 != null) {
            jVar3.o(hVar5);
        }
        this.f3200o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(e2.a.a(this.f3199n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f3192e, this.g, this.f3193f, this.h), this.f3200o);
        this.f3206u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.f3206u);
        j a4 = a(false);
        if (a4 != null) {
            a4.p(this.f3207v);
            a4.setState(materialButton.getDrawableState());
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
                    if (i4 >= layerDrawable.getNumberOfLayers()) {
                        break;
                    }
                    Drawable drawable2 = layerDrawable.getDrawable(i4);
                    if (drawable2 instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable2;
                        break;
                    }
                    i4++;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.f1354m = new WeakReference(a4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        g2.z zVar;
        j a4 = a(false);
        if (a4 != null) {
            a4.r(this.f3190b);
            r0.h hVar = this.c;
            if (hVar != null) {
                a4.o(hVar);
            }
        }
        j a5 = a(true);
        if (a5 != null) {
            a5.r(this.f3190b);
            r0.h hVar2 = this.c;
            if (hVar2 != null) {
                a5.o(hVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f3206u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof g2.z) {
                zVar = (g2.z) findDrawableByLayerId;
                if (zVar == null) {
                    if (!(zVar instanceof j)) {
                        zVar.setShapeAppearanceModel(this.f3190b.d());
                        return;
                    }
                    j jVar = (j) zVar;
                    jVar.r(this.f3190b);
                    r0.h hVar3 = this.c;
                    if (hVar3 != null) {
                        jVar.o(hVar3);
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
        int i4 = 0;
        j a4 = a(false);
        j a5 = a(true);
        if (a4 != null) {
            float f4 = this.f3195j;
            ColorStateList colorStateList = this.f3198m;
            a4.g.f1849j = f4;
            a4.invalidateSelf();
            g2.h hVar = a4.g;
            if (hVar.f1845d != colorStateList) {
                hVar.f1845d = colorStateList;
                a4.onStateChange(a4.getState());
            }
            if (a5 != null) {
                float f5 = this.f3195j;
                if (this.f3201p) {
                    MaterialButton materialButton = this.f3189a;
                    i4 = l0.g.t(materialButton.getContext(), k3.d.a0(materialButton, R.attr.colorSurface));
                }
                a5.g.f1849j = f5;
                a5.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i4);
                g2.h hVar2 = a5.g;
                if (hVar2.f1845d != valueOf) {
                    hVar2.f1845d = valueOf;
                    a5.onStateChange(a5.getState());
                }
            }
        }
    }
}
