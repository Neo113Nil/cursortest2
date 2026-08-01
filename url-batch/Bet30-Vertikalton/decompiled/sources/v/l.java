package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4007a;

    /* renamed from: b, reason: collision with root package name */
    public int f4008b;

    /* renamed from: c, reason: collision with root package name */
    public float f4009c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4032g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4009c = obtainStyledAttributes.getFloat(index, this.f4009c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4007a);
                this.f4007a = i2;
                this.f4007a = n.d[i2];
            } else if (index == 4) {
                this.f4008b = obtainStyledAttributes.getInt(index, this.f4008b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
