package l5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import b.q;
import c4.g;
import com.google.android.material.button.MaterialButton;
import com.snovikpovik.vuevnxsj.R;
import w5.b0;
import w5.h;
import w5.j;
import w5.n;
import w5.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f4844a;

    /* renamed from: b, reason: collision with root package name */
    public n f4845b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f4846c;

    /* renamed from: d, reason: collision with root package name */
    public g f4847d;

    /* renamed from: e, reason: collision with root package name */
    public q f4848e;

    /* renamed from: f, reason: collision with root package name */
    public int f4849f;

    /* renamed from: g, reason: collision with root package name */
    public int f4850g;

    /* renamed from: h, reason: collision with root package name */
    public int f4851h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4852j;

    /* renamed from: k, reason: collision with root package name */
    public int f4853k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f4854l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f4855m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f4856n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4857o;

    /* renamed from: p, reason: collision with root package name */
    public j f4858p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4862t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f4864v;

    /* renamed from: w, reason: collision with root package name */
    public int f4865w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4859q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4860r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4861s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4863u = true;

    public e(MaterialButton materialButton, n nVar) {
        this.f4844a = materialButton;
        this.f4845b = nVar;
    }

    public final j a(boolean z3) {
        RippleDrawable rippleDrawable = this.f4864v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.f4864v.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
    }

    public final void b(int i, int i8) {
        MaterialButton materialButton = this.f4844a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i9 = this.f4851h;
        int i10 = this.i;
        this.i = i8;
        this.f4851h = i;
        if (!this.f4860r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i9, paddingEnd, (paddingBottom + i8) - i10);
    }

    public final void c() {
        j jVar = new j(this.f4845b);
        b0 b0Var = this.f4846c;
        if (b0Var != null) {
            jVar.o(b0Var);
        }
        g gVar = this.f4847d;
        if (gVar != null) {
            jVar.l(gVar);
        }
        q qVar = this.f4848e;
        if (qVar != null) {
            jVar.G = qVar;
        }
        MaterialButton materialButton = this.f4844a;
        jVar.k(materialButton.getContext());
        jVar.setTintList(this.f4855m);
        PorterDuff.Mode mode = this.f4854l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f6 = this.f4853k;
        ColorStateList colorStateList = this.f4856n;
        jVar.f8105e.f8096k = f6;
        jVar.invalidateSelf();
        h hVar = jVar.f8105e;
        if (hVar.f8091e != colorStateList) {
            hVar.f8091e = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.f4845b);
        b0 b0Var2 = this.f4846c;
        if (b0Var2 != null) {
            jVar2.o(b0Var2);
        }
        g gVar2 = this.f4847d;
        if (gVar2 != null) {
            jVar2.l(gVar2);
        }
        jVar2.setTint(0);
        float f8 = this.f4853k;
        int B = this.f4859q ? h0.a.B(materialButton, R.attr.colorSurface) : 0;
        jVar2.f8105e.f8096k = f8;
        jVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(B);
        h hVar2 = jVar2.f8105e;
        if (hVar2.f8091e != valueOf) {
            hVar2.f8091e = valueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.f4845b);
        this.f4858p = jVar3;
        b0 b0Var3 = this.f4846c;
        if (b0Var3 != null) {
            jVar3.o(b0Var3);
        }
        g gVar3 = this.f4847d;
        if (gVar3 != null) {
            this.f4858p.l(gVar3);
        }
        this.f4858p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(u5.a.a(this.f4857o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f4849f, this.f4851h, this.f4850g, this.i), this.f4858p);
        this.f4864v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        j a8 = a(false);
        if (a8 != null) {
            a8.m(this.f4865w);
            a8.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        j a8 = a(false);
        if (a8 != null) {
            b0 b0Var = this.f4846c;
            if (b0Var != null) {
                a8.o(b0Var);
            } else {
                a8.setShapeAppearanceModel(this.f4845b);
            }
            g gVar = this.f4847d;
            if (gVar != null) {
                a8.l(gVar);
            }
        }
        j a9 = a(true);
        if (a9 != null) {
            b0 b0Var2 = this.f4846c;
            if (b0Var2 != null) {
                a9.o(b0Var2);
            } else {
                a9.setShapeAppearanceModel(this.f4845b);
            }
            g gVar2 = this.f4847d;
            if (gVar2 != null) {
                a9.l(gVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f4864v;
        y yVar = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f4864v.getNumberOfLayers() > 2 ? (y) this.f4864v.getDrawable(2) : (y) this.f4864v.getDrawable(1);
        if (yVar != null) {
            yVar.setShapeAppearanceModel(this.f4845b);
            if (yVar instanceof j) {
                j jVar = (j) yVar;
                b0 b0Var3 = this.f4846c;
                if (b0Var3 != null) {
                    jVar.o(b0Var3);
                }
                g gVar3 = this.f4847d;
                if (gVar3 != null) {
                    jVar.l(gVar3);
                }
            }
        }
    }

    public final void e() {
        j a8 = a(false);
        j a9 = a(true);
        if (a8 != null) {
            float f6 = this.f4853k;
            ColorStateList colorStateList = this.f4856n;
            a8.f8105e.f8096k = f6;
            a8.invalidateSelf();
            h hVar = a8.f8105e;
            if (hVar.f8091e != colorStateList) {
                hVar.f8091e = colorStateList;
                a8.onStateChange(a8.getState());
            }
            if (a9 != null) {
                float f8 = this.f4853k;
                int B = this.f4859q ? h0.a.B(this.f4844a, R.attr.colorSurface) : 0;
                a9.f8105e.f8096k = f8;
                a9.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(B);
                h hVar2 = a9.f8105e;
                if (hVar2.f8091e != valueOf) {
                    hVar2.f8091e = valueOf;
                    a9.onStateChange(a9.getState());
                }
            }
        }
    }
}
