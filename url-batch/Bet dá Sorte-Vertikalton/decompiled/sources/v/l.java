package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4137a;

    /* renamed from: b, reason: collision with root package name */
    public int f4138b;

    /* renamed from: c, reason: collision with root package name */
    public float f4139c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4162g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4139c = obtainStyledAttributes.getFloat(index, this.f4139c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4137a);
                this.f4137a = i2;
                this.f4137a = n.d[i2];
            } else if (index == 4) {
                this.f4138b = obtainStyledAttributes.getInt(index, this.f4138b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
