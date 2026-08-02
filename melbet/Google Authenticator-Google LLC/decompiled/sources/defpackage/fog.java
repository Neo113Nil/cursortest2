package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fog implements fof {
    public static final fnw a = new fod(0.5f);
    public final fnw b;
    public final fnw c;
    public final fnw d;
    public final fnw e;
    public final fny f;
    public final fny g;
    public final fny h;
    public final fny i;
    public final fny j;
    public final fny k;
    public final fny l;
    public final fny m;

    public fog() {
        this.j = new foe();
        this.k = new foe();
        this.l = new foe();
        this.m = new foe();
        this.b = new fnt(0.0f);
        this.c = new fnt(0.0f);
        this.d = new fnt(0.0f);
        this.e = new fnt(0.0f);
        this.f = new fny();
        this.g = new fny();
        this.h = new fny();
        this.i = new fny();
    }

    public static fnw f(TypedArray typedArray, int i, fnw fnwVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            if (peekValue.type == 5) {
                return new fnt(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (peekValue.type == 6) {
                return new fod(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return fnwVar;
    }

    public static gbw h(Resources.Theme theme, int i) {
        return l(theme.obtainStyledAttributes(i, foc.b), new fnt(0.0f));
    }

    public static gbw i(Context context, AttributeSet attributeSet, int i, int i2, fnw fnwVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, foc.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m(context, resourceId, resourceId2, fnwVar);
    }

    public static gbw j(Context context, int i, int i2) {
        return m(context, i, i2, new fnt(0.0f));
    }

    public static gbw k(Context context, AttributeSet attributeSet, int i, int i2) {
        return i(context, attributeSet, i, i2, new fnt(0.0f));
    }

    private static gbw l(TypedArray typedArray, fnw fnwVar) {
        try {
            int[] iArr = foc.a;
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            fnw f = f(typedArray, 5, fnwVar);
            fnw f2 = f(typedArray, 8, f);
            fnw f3 = f(typedArray, 9, f);
            fnw f4 = f(typedArray, 7, f);
            fnw f5 = f(typedArray, 6, f);
            gbw gbwVar = new gbw((byte[]) null);
            gbwVar.n(fhq.z(i2));
            gbwVar.d = f2;
            gbwVar.o(fhq.z(i3));
            gbwVar.k = f3;
            gbwVar.m(fhq.z(i4));
            gbwVar.f = f4;
            gbwVar.l(fhq.z(i5));
            gbwVar.b = f5;
            return gbwVar;
        } finally {
            typedArray.recycle();
        }
    }

    private static gbw m(Context context, int i, int i2, fnw fnwVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return l(contextThemeWrapper.obtainStyledAttributes(foc.b), fnwVar);
    }

    @Override // defpackage.fof
    public final fog c(float f) {
        gbw gbwVar = new gbw(this);
        gbwVar.k(f);
        return new fog(gbwVar);
    }

    @Override // defpackage.fof
    public final boolean d() {
        return false;
    }

    @Override // defpackage.fof
    public final fog[] e() {
        return new fog[]{this};
    }

    public final boolean g(RectF rectF) {
        boolean z = this.i.getClass().equals(fny.class) && this.g.getClass().equals(fny.class) && this.f.getClass().equals(fny.class) && this.h.getClass().equals(fny.class);
        float a2 = this.b.a(rectF);
        return z && ((this.c.a(rectF) > a2 ? 1 : (this.c.a(rectF) == a2 ? 0 : -1)) == 0 && (this.e.a(rectF) > a2 ? 1 : (this.e.a(rectF) == a2 ? 0 : -1)) == 0 && (this.d.a(rectF) > a2 ? 1 : (this.d.a(rectF) == a2 ? 0 : -1)) == 0) && (this.k instanceof foe) && (this.j instanceof foe) && (this.l instanceof foe) && (this.m instanceof foe);
    }

    public final String toString() {
        fnw fnwVar = this.e;
        fnw fnwVar2 = this.d;
        fnw fnwVar3 = this.c;
        return "[" + String.valueOf(this.b) + ", " + String.valueOf(fnwVar3) + ", " + String.valueOf(fnwVar2) + ", " + String.valueOf(fnwVar) + "]";
    }

    @Override // defpackage.fof
    public final fog a() {
        return this;
    }

    @Override // defpackage.fof
    public final fog b(int[] iArr) {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [fnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [fnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [fnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [fnw, java.lang.Object] */
    public fog(gbw gbwVar) {
        this.j = (fny) gbwVar.i;
        this.k = (fny) gbwVar.a;
        this.l = (fny) gbwVar.e;
        this.m = (fny) gbwVar.c;
        this.b = gbwVar.d;
        this.c = gbwVar.k;
        this.d = gbwVar.f;
        this.e = gbwVar.b;
        this.f = (fny) gbwVar.h;
        this.g = (fny) gbwVar.l;
        this.h = (fny) gbwVar.j;
        this.i = (fny) gbwVar.g;
    }
}
