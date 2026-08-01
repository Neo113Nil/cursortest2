package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4008a;

    /* renamed from: b, reason: collision with root package name */
    public int f4009b;

    /* renamed from: c, reason: collision with root package name */
    public float f4010c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4033g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4010c = obtainStyledAttributes.getFloat(index, this.f4010c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4008a);
                this.f4008a = i2;
                this.f4008a = n.d[i2];
            } else if (index == 4) {
                this.f4009b = obtainStyledAttributes.getInt(index, this.f4009b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
