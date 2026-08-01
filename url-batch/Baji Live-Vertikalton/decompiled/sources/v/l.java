package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f3985a;

    /* renamed from: b, reason: collision with root package name */
    public int f3986b;

    /* renamed from: c, reason: collision with root package name */
    public float f3987c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4010g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f3987c = obtainStyledAttributes.getFloat(index, this.f3987c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f3985a);
                this.f3985a = i2;
                this.f3985a = n.d[i2];
            } else if (index == 4) {
                this.f3986b = obtainStyledAttributes.getInt(index, this.f3986b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
