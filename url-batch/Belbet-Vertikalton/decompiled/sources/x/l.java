package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4681a;

    /* renamed from: b, reason: collision with root package name */
    public int f4682b;

    /* renamed from: c, reason: collision with root package name */
    public float f4683c;

    /* renamed from: d, reason: collision with root package name */
    public float f4684d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4707g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4683c = obtainStyledAttributes.getFloat(index, this.f4683c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4681a);
                this.f4681a = i2;
                this.f4681a = n.f4696d[i2];
            } else if (index == 4) {
                this.f4682b = obtainStyledAttributes.getInt(index, this.f4682b);
            } else if (index == 3) {
                this.f4684d = obtainStyledAttributes.getFloat(index, this.f4684d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
