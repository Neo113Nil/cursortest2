package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.f;
import f.AbstractC2415a;

/* loaded from: classes.dex */
public class Z {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10858a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f10859b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f10860c;

    private Z(Context context, TypedArray typedArray) {
        this.f10858a = context;
        this.f10859b = typedArray;
    }

    public static Z t(Context context, int i4, int[] iArr) {
        return new Z(context, context.obtainStyledAttributes(i4, iArr));
    }

    public static Z u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new Z(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static Z v(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5) {
        return new Z(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public boolean a(int i4, boolean z4) {
        return this.f10859b.getBoolean(i4, z4);
    }

    public int b(int i4, int i5) {
        return this.f10859b.getColor(i4, i5);
    }

    public ColorStateList c(int i4) {
        int resourceId;
        ColorStateList a4;
        return (!this.f10859b.hasValue(i4) || (resourceId = this.f10859b.getResourceId(i4, 0)) == 0 || (a4 = AbstractC2415a.a(this.f10858a, resourceId)) == null) ? this.f10859b.getColorStateList(i4) : a4;
    }

    public float d(int i4, float f4) {
        return this.f10859b.getDimension(i4, f4);
    }

    public int e(int i4, int i5) {
        return this.f10859b.getDimensionPixelOffset(i4, i5);
    }

    public int f(int i4, int i5) {
        return this.f10859b.getDimensionPixelSize(i4, i5);
    }

    public Drawable g(int i4) {
        int resourceId;
        return (!this.f10859b.hasValue(i4) || (resourceId = this.f10859b.getResourceId(i4, 0)) == 0) ? this.f10859b.getDrawable(i4) : AbstractC2415a.b(this.f10858a, resourceId);
    }

    public Drawable h(int i4) {
        int resourceId;
        if (!this.f10859b.hasValue(i4) || (resourceId = this.f10859b.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return C1259h.b().d(this.f10858a, resourceId, true);
    }

    public float i(int i4, float f4) {
        return this.f10859b.getFloat(i4, f4);
    }

    public Typeface j(int i4, int i5, f.e eVar) {
        int resourceId = this.f10859b.getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f10860c == null) {
            this.f10860c = new TypedValue();
        }
        return androidx.core.content.res.f.h(this.f10858a, resourceId, this.f10860c, i5, eVar);
    }

    public int k(int i4, int i5) {
        return this.f10859b.getInt(i4, i5);
    }

    public int l(int i4, int i5) {
        return this.f10859b.getInteger(i4, i5);
    }

    public int m(int i4, int i5) {
        return this.f10859b.getLayoutDimension(i4, i5);
    }

    public int n(int i4, int i5) {
        return this.f10859b.getResourceId(i4, i5);
    }

    public String o(int i4) {
        return this.f10859b.getString(i4);
    }

    public CharSequence p(int i4) {
        return this.f10859b.getText(i4);
    }

    public CharSequence[] q(int i4) {
        return this.f10859b.getTextArray(i4);
    }

    public TypedArray r() {
        return this.f10859b;
    }

    public boolean s(int i4) {
        return this.f10859b.hasValue(i4);
    }

    public TypedValue w(int i4) {
        return this.f10859b.peekValue(i4);
    }

    public void x() {
        this.f10859b.recycle();
    }
}
