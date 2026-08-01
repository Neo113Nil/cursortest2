package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4081a;

    /* renamed from: b, reason: collision with root package name */
    public int f4082b;

    /* renamed from: c, reason: collision with root package name */
    public float f4083c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4106g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4083c = obtainStyledAttributes.getFloat(index, this.f4083c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4081a);
                this.f4081a = i2;
                this.f4081a = n.d[i2];
            } else if (index == 4) {
                this.f4082b = obtainStyledAttributes.getInt(index, this.f4082b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
