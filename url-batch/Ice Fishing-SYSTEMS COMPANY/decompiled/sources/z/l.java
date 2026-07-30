package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f42070a;

    /* renamed from: b, reason: collision with root package name */
    public int f42071b;

    /* renamed from: c, reason: collision with root package name */
    public float f42072c;

    /* renamed from: d, reason: collision with root package name */
    public float f42073d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42100g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f42072c = obtainStyledAttributes.getFloat(index, this.f42072c);
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f42070a);
                this.f42070a = i4;
                this.f42070a = n.f42087d[i4];
            } else if (index == 4) {
                this.f42071b = obtainStyledAttributes.getInt(index, this.f42071b);
            } else if (index == 3) {
                this.f42073d = obtainStyledAttributes.getFloat(index, this.f42073d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
