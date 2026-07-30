package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import h.AbstractC0454a;
import java.util.WeakHashMap;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726o {

    /* renamed from: a, reason: collision with root package name */
    public final View f6847a;

    /* renamed from: d, reason: collision with root package name */
    public D6.i f6850d;

    /* renamed from: e, reason: collision with root package name */
    public D6.i f6851e;

    /* renamed from: f, reason: collision with root package name */
    public D6.i f6852f;

    /* renamed from: c, reason: collision with root package name */
    public int f6849c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0733s f6848b = C0733s.a();

    public C0726o(View view) {
        this.f6847a = view;
    }

    public final void a() {
        View view = this.f6847a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f6850d != null) {
                if (this.f6852f == null) {
                    this.f6852f = new D6.i();
                }
                D6.i iVar = this.f6852f;
                iVar.f515c = null;
                iVar.f514b = false;
                iVar.f516d = null;
                iVar.f513a = false;
                WeakHashMap weakHashMap = I.T.f1153a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    iVar.f514b = true;
                    iVar.f515c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    iVar.f513a = true;
                    iVar.f516d = backgroundTintMode;
                }
                if (iVar.f514b || iVar.f513a) {
                    C0733s.d(background, iVar, view.getDrawableState());
                    return;
                }
            }
            D6.i iVar2 = this.f6851e;
            if (iVar2 != null) {
                C0733s.d(background, iVar2, view.getDrawableState());
                return;
            }
            D6.i iVar3 = this.f6850d;
            if (iVar3 != null) {
                C0733s.d(background, iVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        D6.i iVar = this.f6851e;
        if (iVar != null) {
            return (ColorStateList) iVar.f515c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        D6.i iVar = this.f6851e;
        if (iVar != null) {
            return (PorterDuff.Mode) iVar.f516d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i2) {
        ColorStateList f7;
        View view = this.f6847a;
        Context context = view.getContext();
        int[] iArr = AbstractC0454a.f5035A;
        D0.j R4 = D0.j.R(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) R4.f331i;
        View view2 = this.f6847a;
        I.T.h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) R4.f331i, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f6849c = typedArray.getResourceId(0, -1);
                C0733s c0733s = this.f6848b;
                Context context2 = view.getContext();
                int i5 = this.f6849c;
                synchronized (c0733s) {
                    f7 = c0733s.f6881a.f(context2, i5);
                }
                if (f7 != null) {
                    g(f7);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(R4.I(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC0731q0.c(typedArray.getInt(2, -1), null));
            }
            R4.W();
        } catch (Throwable th) {
            R4.W();
            throw th;
        }
    }

    public final void e() {
        this.f6849c = -1;
        g(null);
        a();
    }

    public final void f(int i2) {
        ColorStateList colorStateList;
        this.f6849c = i2;
        C0733s c0733s = this.f6848b;
        if (c0733s != null) {
            Context context = this.f6847a.getContext();
            synchronized (c0733s) {
                colorStateList = c0733s.f6881a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f6850d == null) {
                this.f6850d = new D6.i();
            }
            D6.i iVar = this.f6850d;
            iVar.f515c = colorStateList;
            iVar.f514b = true;
        } else {
            this.f6850d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f6851e == null) {
            this.f6851e = new D6.i();
        }
        D6.i iVar = this.f6851e;
        iVar.f515c = colorStateList;
        iVar.f514b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f6851e == null) {
            this.f6851e = new D6.i();
        }
        D6.i iVar = this.f6851e;
        iVar.f516d = mode;
        iVar.f513a = true;
        a();
    }
}
