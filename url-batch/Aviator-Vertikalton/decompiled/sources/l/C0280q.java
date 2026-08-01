package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280q {

    /* renamed from: a, reason: collision with root package name */
    public final View f3423a;

    /* renamed from: d, reason: collision with root package name */
    public i1.i f3426d;

    /* renamed from: e, reason: collision with root package name */
    public i1.i f3427e;

    /* renamed from: f, reason: collision with root package name */
    public i1.i f3428f;

    /* renamed from: c, reason: collision with root package name */
    public int f3425c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0292w f3424b = C0292w.a();

    public C0280q(View view) {
        this.f3423a = view;
    }

    public final void a() {
        View view = this.f3423a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3426d != null) {
                if (this.f3428f == null) {
                    this.f3428f = new i1.i();
                }
                i1.i iVar = this.f3428f;
                iVar.f2679c = null;
                iVar.f2678b = false;
                iVar.f2680d = null;
                iVar.f2677a = false;
                WeakHashMap weakHashMap = K.X.f418a;
                ColorStateList g2 = K.L.g(view);
                if (g2 != null) {
                    iVar.f2678b = true;
                    iVar.f2679c = g2;
                }
                PorterDuff.Mode h = K.L.h(view);
                if (h != null) {
                    iVar.f2677a = true;
                    iVar.f2680d = h;
                }
                if (iVar.f2678b || iVar.f2677a) {
                    C0292w.e(background, iVar, view.getDrawableState());
                    return;
                }
            }
            i1.i iVar2 = this.f3427e;
            if (iVar2 != null) {
                C0292w.e(background, iVar2, view.getDrawableState());
                return;
            }
            i1.i iVar3 = this.f3426d;
            if (iVar3 != null) {
                C0292w.e(background, iVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        i1.i iVar = this.f3427e;
        if (iVar != null) {
            return (ColorStateList) iVar.f2679c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        i1.i iVar = this.f3427e;
        if (iVar != null) {
            return (PorterDuff.Mode) iVar.f2680d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3423a;
        Context context = view.getContext();
        int[] iArr = f.a.f2409y;
        T.r r2 = T.r.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f811c;
        View view2 = this.f3423a;
        K.X.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f811c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3425c = typedArray.getResourceId(0, -1);
                C0292w c0292w = this.f3424b;
                Context context2 = view.getContext();
                int i2 = this.f3425c;
                synchronized (c0292w) {
                    f2 = c0292w.f3471a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.L.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.L.r(view, AbstractC0277o0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3425c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3425c = i;
        C0292w c0292w = this.f3424b;
        if (c0292w != null) {
            Context context = this.f3423a.getContext();
            synchronized (c0292w) {
                colorStateList = c0292w.f3471a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3426d == null) {
                this.f3426d = new i1.i();
            }
            i1.i iVar = this.f3426d;
            iVar.f2679c = colorStateList;
            iVar.f2678b = true;
        } else {
            this.f3426d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3427e == null) {
            this.f3427e = new i1.i();
        }
        i1.i iVar = this.f3427e;
        iVar.f2679c = colorStateList;
        iVar.f2678b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3427e == null) {
            this.f3427e = new i1.i();
        }
        i1.i iVar = this.f3427e;
        iVar.f2680d = mode;
        iVar.f2677a = true;
        a();
    }
}
