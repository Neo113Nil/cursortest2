package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d20 implements b20 {
    public static final tz m = new tz(0.5f);
    public jw a = new q00();
    public jw b = new q00();
    public jw c = new q00();
    public jw d = new q00();
    public td e = new g(0.0f);
    public td f = new g(0.0f);
    public td g = new g(0.0f);
    public td h = new g(0.0f);
    public dh i;
    public dh j;
    public dh k;
    public dh l;

    public d20() {
        int i = 0;
        this.i = new dh(i);
        this.j = new dh(i);
        this.k = new dh(i);
        this.l = new dh(i);
    }

    public static c20 g(Context context, AttributeSet attributeSet, int i, int i2) {
        g gVar = new g(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vx.x, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(vx.E), gVar);
    }

    public static c20 h(TypedArray typedArray, td tdVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            td i6 = i(typedArray, 5, tdVar);
            td i7 = i(typedArray, 8, i6);
            td i8 = i(typedArray, 9, i6);
            td i9 = i(typedArray, 7, i6);
            td i10 = i(typedArray, 6, i6);
            c20 c20Var = new c20();
            c20Var.a = o8.r(i2);
            c20Var.e = i7;
            c20Var.b = o8.r(i3);
            c20Var.f = i8;
            c20Var.c = o8.r(i4);
            c20Var.g = i9;
            c20Var.d = o8.r(i5);
            c20Var.h = i10;
            return c20Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static td i(TypedArray typedArray, int i, td tdVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new g(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new tz(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return tdVar;
    }

    @Override // defpackage.b20
    public final d20 a(float f) {
        c20 k = k();
        k.b(f);
        return k.a();
    }

    @Override // defpackage.b20
    public final d20[] c() {
        return new d20[]{this};
    }

    @Override // defpackage.b20
    public final d20 e(tz tzVar) {
        c20 k = k();
        k.e = tzVar;
        k.f = tzVar;
        k.g = tzVar;
        k.h = tzVar;
        return k.a();
    }

    @Override // defpackage.b20
    public final boolean f() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z = this.l.getClass().equals(dh.class) && this.j.getClass().equals(dh.class) && this.i.getClass().equals(dh.class) && this.k.getClass().equals(dh.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && (this.b instanceof q00) && (this.a instanceof q00) && (this.c instanceof q00) && (this.d instanceof q00);
    }

    public final c20 k() {
        c20 c20Var = new c20();
        c20Var.a = this.a;
        c20Var.b = this.b;
        c20Var.c = this.c;
        c20Var.d = this.d;
        c20Var.e = this.e;
        c20Var.f = this.f;
        c20Var.g = this.g;
        c20Var.h = this.h;
        c20Var.i = this.i;
        c20Var.j = this.j;
        c20Var.k = this.k;
        c20Var.l = this.l;
        return c20Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // defpackage.b20
    public final d20 b(int[] iArr) {
        return this;
    }

    @Override // defpackage.b20
    public final d20 d() {
        return this;
    }
}
