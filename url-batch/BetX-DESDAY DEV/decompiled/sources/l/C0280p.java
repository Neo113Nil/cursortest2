package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280p {

    /* renamed from: a, reason: collision with root package name */
    public final View f3422a;

    /* renamed from: d, reason: collision with root package name */
    public i1.i f3425d;

    /* renamed from: e, reason: collision with root package name */
    public i1.i f3426e;

    /* renamed from: f, reason: collision with root package name */
    public i1.i f3427f;

    /* renamed from: c, reason: collision with root package name */
    public int f3424c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0292v f3423b = C0292v.a();

    public C0280p(View view) {
        this.f3422a = view;
    }

    public final void a() {
        View view = this.f3422a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3425d != null) {
                if (this.f3427f == null) {
                    this.f3427f = new i1.i();
                }
                i1.i iVar = this.f3427f;
                iVar.f2683c = null;
                iVar.f2682b = false;
                iVar.f2684d = null;
                iVar.f2681a = false;
                WeakHashMap weakHashMap = K.X.f419a;
                ColorStateList g2 = K.L.g(view);
                if (g2 != null) {
                    iVar.f2682b = true;
                    iVar.f2683c = g2;
                }
                PorterDuff.Mode h = K.L.h(view);
                if (h != null) {
                    iVar.f2681a = true;
                    iVar.f2684d = h;
                }
                if (iVar.f2682b || iVar.f2681a) {
                    C0292v.e(background, iVar, view.getDrawableState());
                    return;
                }
            }
            i1.i iVar2 = this.f3426e;
            if (iVar2 != null) {
                C0292v.e(background, iVar2, view.getDrawableState());
                return;
            }
            i1.i iVar3 = this.f3425d;
            if (iVar3 != null) {
                C0292v.e(background, iVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        i1.i iVar = this.f3426e;
        if (iVar != null) {
            return (ColorStateList) iVar.f2683c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        i1.i iVar = this.f3426e;
        if (iVar != null) {
            return (PorterDuff.Mode) iVar.f2684d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3422a;
        Context context = view.getContext();
        int[] iArr = f.a.f2413y;
        T.r r2 = T.r.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f812c;
        View view2 = this.f3422a;
        K.X.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f812c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3424c = typedArray.getResourceId(0, -1);
                C0292v c0292v = this.f3423b;
                Context context2 = view.getContext();
                int i2 = this.f3424c;
                synchronized (c0292v) {
                    f2 = c0292v.f3470a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.L.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.L.r(view, AbstractC0277n0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3424c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3424c = i;
        C0292v c0292v = this.f3423b;
        if (c0292v != null) {
            Context context = this.f3422a.getContext();
            synchronized (c0292v) {
                colorStateList = c0292v.f3470a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3425d == null) {
                this.f3425d = new i1.i();
            }
            i1.i iVar = this.f3425d;
            iVar.f2683c = colorStateList;
            iVar.f2682b = true;
        } else {
            this.f3425d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3426e == null) {
            this.f3426e = new i1.i();
        }
        i1.i iVar = this.f3426e;
        iVar.f2683c = colorStateList;
        iVar.f2682b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3426e == null) {
            this.f3426e = new i1.i();
        }
        i1.i iVar = this.f3426e;
        iVar.f2684d = mode;
        iVar.f2681a = true;
        a();
    }
}
