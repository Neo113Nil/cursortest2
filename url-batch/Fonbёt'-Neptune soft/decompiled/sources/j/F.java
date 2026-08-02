package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import c.AbstractC0165a;

/* loaded from: classes.dex */
public class F extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f2850a;

    /* renamed from: b, reason: collision with root package name */
    public int f2851b;

    public F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2851b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0165a.f1972j);
        this.f2850a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f2851b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public F(int i2) {
        super(i2, -2);
        this.f2851b = -1;
        this.f2850a = 0.0f;
    }

    public F(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2851b = -1;
    }
}
