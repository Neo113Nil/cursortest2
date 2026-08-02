package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import g.AbstractC0328a;

/* loaded from: classes.dex */
public class E extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f9710a;

    /* renamed from: b, reason: collision with root package name */
    public int f9711b;

    public E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9711b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0328a.f4997j);
        this.f9710a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f9711b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public E(int i3) {
        super(i3, -2);
        this.f9711b = -1;
        this.f9710a = 0.0f;
    }

    public E(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9711b = -1;
    }
}
