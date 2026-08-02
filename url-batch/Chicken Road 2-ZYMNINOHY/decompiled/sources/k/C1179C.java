package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import f.AbstractC0410a;

/* renamed from: k.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1179C extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f13900a;

    /* renamed from: b, reason: collision with root package name */
    public int f13901b;

    public C1179C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13901b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0410a.f8479j);
        this.f13900a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f13901b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C1179C(int i4) {
        super(i4, -2);
        this.f13901b = -1;
        this.f13900a = 0.0f;
    }

    public C1179C(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f13901b = -1;
    }
}
