package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n20 implements l20 {
    public static final i00 m = new i00(0.5f);
    public op a = new g10();
    public op b = new g10();
    public op c = new g10();
    public op d = new g10();
    public xd e = new g(0.0f);
    public xd f = new g(0.0f);
    public xd g = new g(0.0f);
    public xd h = new g(0.0f);
    public vg i;
    public vg j;
    public vg k;
    public vg l;

    public n20() {
        int i = 0;
        this.i = new vg(i);
        this.j = new vg(i);
        this.k = new vg(i);
        this.l = new vg(i);
    }

    public static m20 g(Context context, AttributeSet attributeSet, int i, int i2) {
        g gVar = new g(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.y, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(ly.F), gVar);
    }

    public static m20 h(TypedArray typedArray, xd xdVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            xd i6 = i(typedArray, 5, xdVar);
            xd i7 = i(typedArray, 8, i6);
            xd i8 = i(typedArray, 9, i6);
            xd i9 = i(typedArray, 7, i6);
            xd i10 = i(typedArray, 6, i6);
            m20 m20Var = new m20();
            m20Var.a = vw.v(i2);
            m20Var.e = i7;
            m20Var.b = vw.v(i3);
            m20Var.f = i8;
            m20Var.c = vw.v(i4);
            m20Var.g = i9;
            m20Var.d = vw.v(i5);
            m20Var.h = i10;
            return m20Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static xd i(TypedArray typedArray, int i, xd xdVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new g(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new i00(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return xdVar;
    }

    @Override // defpackage.l20
    public final n20 a(float f) {
        m20 k = k();
        k.b(f);
        return k.a();
    }

    @Override // defpackage.l20
    public final n20[] c() {
        return new n20[]{this};
    }

    @Override // defpackage.l20
    public final n20 e(i00 i00Var) {
        m20 k = k();
        k.e = i00Var;
        k.f = i00Var;
        k.g = i00Var;
        k.h = i00Var;
        return k.a();
    }

    @Override // defpackage.l20
    public final boolean f() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z = this.l.getClass().equals(vg.class) && this.j.getClass().equals(vg.class) && this.i.getClass().equals(vg.class) && this.k.getClass().equals(vg.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && (this.b instanceof g10) && (this.a instanceof g10) && (this.c instanceof g10) && (this.d instanceof g10);
    }

    public final m20 k() {
        m20 m20Var = new m20();
        m20Var.a = this.a;
        m20Var.b = this.b;
        m20Var.c = this.c;
        m20Var.d = this.d;
        m20Var.e = this.e;
        m20Var.f = this.f;
        m20Var.g = this.g;
        m20Var.h = this.h;
        m20Var.i = this.i;
        m20Var.j = this.j;
        m20Var.k = this.k;
        m20Var.l = this.l;
        return m20Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // defpackage.l20
    public final n20 b(int[] iArr) {
        return this;
    }

    @Override // defpackage.l20
    public final n20 d() {
        return this;
    }
}
