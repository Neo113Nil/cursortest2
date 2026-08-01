package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f4122a;

    /* renamed from: b, reason: collision with root package name */
    public int f4123b;

    /* renamed from: c, reason: collision with root package name */
    public float f4124c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4147g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4124c = obtainStyledAttributes.getFloat(index, this.f4124c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4122a);
                this.f4122a = i2;
                this.f4122a = o.d[i2];
            } else if (index == 4) {
                this.f4123b = obtainStyledAttributes.getInt(index, this.f4123b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
