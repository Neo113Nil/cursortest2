package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f4005a;

    /* renamed from: b, reason: collision with root package name */
    public int f4006b;

    /* renamed from: c, reason: collision with root package name */
    public float f4007c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4030g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4007c = obtainStyledAttributes.getFloat(index, this.f4007c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4005a);
                this.f4005a = i2;
                this.f4005a = o.d[i2];
            } else if (index == 4) {
                this.f4006b = obtainStyledAttributes.getInt(index, this.f4006b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
