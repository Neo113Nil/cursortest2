package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f4152a;

    /* renamed from: b, reason: collision with root package name */
    public int f4153b;

    /* renamed from: c, reason: collision with root package name */
    public float f4154c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4178g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4154c = obtainStyledAttributes.getFloat(index, this.f4154c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4152a);
                this.f4152a = i2;
                this.f4152a = o.d[i2];
            } else if (index == 4) {
                this.f4153b = obtainStyledAttributes.getInt(index, this.f4153b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
