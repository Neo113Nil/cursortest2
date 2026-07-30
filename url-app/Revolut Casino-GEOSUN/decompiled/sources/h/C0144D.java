package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import c.AbstractC0098a;

/* renamed from: h.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0144D extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f2080a;

    /* renamed from: b, reason: collision with root package name */
    public int f2081b;

    public C0144D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2081b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0098a.f1649j);
        this.f2080a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f2081b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C0144D(int i2) {
        super(i2, -2);
        this.f2081b = -1;
        this.f2080a = 0.0f;
    }

    public C0144D(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2081b = -1;
    }
}
