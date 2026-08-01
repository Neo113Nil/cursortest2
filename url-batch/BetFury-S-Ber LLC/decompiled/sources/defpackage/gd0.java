package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gd0 implements ed0 {
    public static final e90 m = new e90(0.5f);
    public n9 a = new xa0();
    public n9 b = new xa0();
    public n9 c = new xa0();
    public n9 d = new xa0();
    public ng e = new g(0.0f);
    public ng f = new g(0.0f);
    public ng g = new g(0.0f);
    public ng h = new g(0.0f);
    public sl i = new sl();
    public sl j = new sl();
    public sl k = new sl();
    public sl l = new sl();

    public static fd0 g(Context context, AttributeSet attributeSet, int i, int i2) {
        g gVar = new g(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.z, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(c70.G), gVar);
    }

    public static fd0 h(TypedArray typedArray, ng ngVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            ng i6 = i(typedArray, 5, ngVar);
            ng i7 = i(typedArray, 8, i6);
            ng i8 = i(typedArray, 9, i6);
            ng i9 = i(typedArray, 7, i6);
            ng i10 = i(typedArray, 6, i6);
            fd0 fd0Var = new fd0();
            fd0Var.a = d50.k(i2);
            fd0Var.e = i7;
            fd0Var.b = d50.k(i3);
            fd0Var.f = i8;
            fd0Var.c = d50.k(i4);
            fd0Var.g = i9;
            fd0Var.d = d50.k(i5);
            fd0Var.h = i10;
            return fd0Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static ng i(TypedArray typedArray, int i, ng ngVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new g(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new e90(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ngVar;
    }

    @Override // defpackage.ed0
    public final gd0 a(float f) {
        fd0 k = k();
        k.b(f);
        return k.a();
    }

    @Override // defpackage.ed0
    public final gd0[] c() {
        return new gd0[]{this};
    }

    @Override // defpackage.ed0
    public final gd0 e(e90 e90Var) {
        fd0 k = k();
        k.e = e90Var;
        k.f = e90Var;
        k.g = e90Var;
        k.h = e90Var;
        return k.a();
    }

    @Override // defpackage.ed0
    public final boolean f() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z = this.l.getClass().equals(sl.class) && this.j.getClass().equals(sl.class) && this.i.getClass().equals(sl.class) && this.k.getClass().equals(sl.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && (this.b instanceof xa0) && (this.a instanceof xa0) && (this.c instanceof xa0) && (this.d instanceof xa0);
    }

    public final fd0 k() {
        fd0 fd0Var = new fd0();
        fd0Var.a = this.a;
        fd0Var.b = this.b;
        fd0Var.c = this.c;
        fd0Var.d = this.d;
        fd0Var.e = this.e;
        fd0Var.f = this.f;
        fd0Var.g = this.g;
        fd0Var.h = this.h;
        fd0Var.i = this.i;
        fd0Var.j = this.j;
        fd0Var.k = this.k;
        fd0Var.l = this.l;
        return fd0Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // defpackage.ed0
    public final gd0 b(int[] iArr) {
        return this;
    }

    @Override // defpackage.ed0
    public final gd0 d() {
        return this;
    }
}
