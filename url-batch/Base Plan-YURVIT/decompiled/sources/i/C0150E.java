package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import d.AbstractC0119a;

/* renamed from: i.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0150E extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f2110a;

    /* renamed from: b, reason: collision with root package name */
    public int f2111b;

    public C0150E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2111b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0119a.f1796j);
        this.f2110a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f2111b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C0150E(int i2) {
        super(i2, -2);
        this.f2111b = -1;
        this.f2110a = 0.0f;
    }

    public C0150E(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2111b = -1;
    }
}
