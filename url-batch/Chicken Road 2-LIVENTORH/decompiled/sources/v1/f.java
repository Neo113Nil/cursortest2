package v1;

import a.e0;
import a.y;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.oriondriftchasers.arordrft.R;
import l2.b0;
import l2.h;
import l2.j;
import l2.n;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3485a;

    /* renamed from: b, reason: collision with root package name */
    public n f3486b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f3487c;
    public u0.f d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f3488e;

    /* renamed from: f, reason: collision with root package name */
    public int f3489f;

    /* renamed from: g, reason: collision with root package name */
    public int f3490g;

    /* renamed from: h, reason: collision with root package name */
    public int f3491h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3492j;

    /* renamed from: k, reason: collision with root package name */
    public int f3493k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f3494l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f3495m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f3496n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f3497o;

    /* renamed from: p, reason: collision with root package name */
    public j f3498p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3502t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f3504v;

    /* renamed from: w, reason: collision with root package name */
    public int f3505w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3499q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3500r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3501s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3503u = true;

    public f(MaterialButton materialButton, n nVar) {
        this.f3485a = materialButton;
        this.f3486b = nVar;
    }

    public final j a(boolean z3) {
        RippleDrawable rippleDrawable = this.f3504v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.f3504v.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
    }

    public final void b(int i, int i4) {
        MaterialButton materialButton = this.f3485a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.f3491h;
        int i6 = this.i;
        this.i = i4;
        this.f3491h = i;
        if (!this.f3500r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i5, paddingEnd, (paddingBottom + i4) - i6);
    }

    public final void c() {
        j jVar = new j(this.f3486b);
        b0 b0Var = this.f3487c;
        if (b0Var != null) {
            jVar.t(b0Var);
        }
        u0.f fVar = this.d;
        if (fVar != null) {
            jVar.o(fVar);
        }
        e0 e0Var = this.f3488e;
        if (e0Var != null) {
            jVar.I = e0Var;
        }
        MaterialButton materialButton = this.f3485a;
        jVar.m(materialButton.getContext());
        jVar.setTintList(this.f3495m);
        PorterDuff.Mode mode = this.f3494l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f2 = this.f3493k;
        ColorStateList colorStateList = this.f3496n;
        jVar.f2598g.f2589k = f2;
        jVar.invalidateSelf();
        h hVar = jVar.f2598g;
        if (hVar.f2584e != colorStateList) {
            hVar.f2584e = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.f3486b);
        b0 b0Var2 = this.f3487c;
        if (b0Var2 != null) {
            jVar2.t(b0Var2);
        }
        u0.f fVar2 = this.d;
        if (fVar2 != null) {
            jVar2.o(fVar2);
        }
        jVar2.setTint(0);
        float f4 = this.f3493k;
        int A = this.f3499q ? y.A(materialButton, R.attr.colorSurface) : 0;
        jVar2.f2598g.f2589k = f4;
        jVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(A);
        h hVar2 = jVar2.f2598g;
        if (hVar2.f2584e != valueOf) {
            hVar2.f2584e = valueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.f3486b);
        this.f3498p = jVar3;
        b0 b0Var3 = this.f3487c;
        if (b0Var3 != null) {
            jVar3.t(b0Var3);
        }
        u0.f fVar3 = this.d;
        if (fVar3 != null) {
            this.f3498p.o(fVar3);
        }
        this.f3498p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(j2.a.b(this.f3497o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f3489f, this.f3491h, this.f3490g, this.i), this.f3498p);
        this.f3504v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        j a2 = a(false);
        if (a2 != null) {
            a2.p(this.f3505w);
            a2.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        j a2 = a(false);
        if (a2 != null) {
            b0 b0Var = this.f3487c;
            if (b0Var != null) {
                a2.t(b0Var);
            } else {
                a2.setShapeAppearanceModel(this.f3486b);
            }
            u0.f fVar = this.d;
            if (fVar != null) {
                a2.o(fVar);
            }
        }
        j a4 = a(true);
        if (a4 != null) {
            b0 b0Var2 = this.f3487c;
            if (b0Var2 != null) {
                a4.t(b0Var2);
            } else {
                a4.setShapeAppearanceModel(this.f3486b);
            }
            u0.f fVar2 = this.d;
            if (fVar2 != null) {
                a4.o(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f3504v;
        l2.y yVar = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f3504v.getNumberOfLayers() > 2 ? (l2.y) this.f3504v.getDrawable(2) : (l2.y) this.f3504v.getDrawable(1);
        if (yVar != null) {
            yVar.setShapeAppearanceModel(this.f3486b);
            if (yVar instanceof j) {
                j jVar = (j) yVar;
                b0 b0Var3 = this.f3487c;
                if (b0Var3 != null) {
                    jVar.t(b0Var3);
                }
                u0.f fVar3 = this.d;
                if (fVar3 != null) {
                    jVar.o(fVar3);
                }
            }
        }
    }

    public final void e() {
        j a2 = a(false);
        j a4 = a(true);
        if (a2 != null) {
            float f2 = this.f3493k;
            ColorStateList colorStateList = this.f3496n;
            a2.f2598g.f2589k = f2;
            a2.invalidateSelf();
            h hVar = a2.f2598g;
            if (hVar.f2584e != colorStateList) {
                hVar.f2584e = colorStateList;
                a2.onStateChange(a2.getState());
            }
            if (a4 != null) {
                float f4 = this.f3493k;
                int A = this.f3499q ? y.A(this.f3485a, R.attr.colorSurface) : 0;
                a4.f2598g.f2589k = f4;
                a4.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(A);
                h hVar2 = a4.f2598g;
                if (hVar2.f2584e != valueOf) {
                    hVar2.f2584e = valueOf;
                    a4.onStateChange(a4.getState());
                }
            }
        }
    }
}
