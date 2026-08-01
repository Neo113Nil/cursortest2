package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class f50 implements d50 {
    public static final w20 m = new w20(0.5f);
    public la0 a = new v30();
    public la0 b = new v30();
    public la0 c = new v30();
    public la0 d = new v30();
    public ve e = new g(0.0f);
    public ve f = new g(0.0f);
    public ve g = new g(0.0f);
    public ve h = new g(0.0f);
    public ej i;
    public ej j;
    public ej k;
    public ej l;

    public f50() {
        int i = 0;
        this.i = new ej(i);
        this.j = new ej(i);
        this.k = new ej(i);
        this.l = new ej(i);
    }

    public static e50 g(Context context, AttributeSet attributeSet, int i, int i2) {
        g gVar = new g(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.A, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(y00.H), gVar);
    }

    public static e50 h(TypedArray typedArray, ve veVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            ve i6 = i(typedArray, 5, veVar);
            ve i7 = i(typedArray, 8, i6);
            ve i8 = i(typedArray, 9, i6);
            ve i9 = i(typedArray, 7, i6);
            ve i10 = i(typedArray, 6, i6);
            e50 e50Var = new e50();
            e50Var.a = mz.j(i2);
            e50Var.e = i7;
            e50Var.b = mz.j(i3);
            e50Var.f = i8;
            e50Var.c = mz.j(i4);
            e50Var.g = i9;
            e50Var.d = mz.j(i5);
            e50Var.h = i10;
            return e50Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static ve i(TypedArray typedArray, int i, ve veVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new g(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new w20(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return veVar;
    }

    @Override // defpackage.d50
    public final f50 a(float f) {
        e50 k = k();
        k.b(f);
        return k.a();
    }

    @Override // defpackage.d50
    public final f50[] c() {
        return new f50[]{this};
    }

    @Override // defpackage.d50
    public final f50 e(w20 w20Var) {
        e50 k = k();
        k.e = w20Var;
        k.f = w20Var;
        k.g = w20Var;
        k.h = w20Var;
        return k.a();
    }

    @Override // defpackage.d50
    public final boolean f() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z = this.l.getClass().equals(ej.class) && this.j.getClass().equals(ej.class) && this.i.getClass().equals(ej.class) && this.k.getClass().equals(ej.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && (this.b instanceof v30) && (this.a instanceof v30) && (this.c instanceof v30) && (this.d instanceof v30);
    }

    public final e50 k() {
        e50 e50Var = new e50();
        e50Var.a = this.a;
        e50Var.b = this.b;
        e50Var.c = this.c;
        e50Var.d = this.d;
        e50Var.e = this.e;
        e50Var.f = this.f;
        e50Var.g = this.g;
        e50Var.h = this.h;
        e50Var.i = this.i;
        e50Var.j = this.j;
        e50Var.k = this.k;
        e50Var.l = this.l;
        return e50Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // defpackage.d50
    public final f50 b(int[] iArr) {
        return this;
    }

    @Override // defpackage.d50
    public final f50 d() {
        return this;
    }
}
