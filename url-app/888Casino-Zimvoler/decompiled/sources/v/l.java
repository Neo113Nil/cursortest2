package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f3986a;

    /* renamed from: b, reason: collision with root package name */
    public int f3987b;

    /* renamed from: c, reason: collision with root package name */
    public float f3988c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4011g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f3988c = obtainStyledAttributes.getFloat(index, this.f3988c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f3986a);
                this.f3986a = i2;
                this.f3986a = n.d[i2];
            } else if (index == 4) {
                this.f3987b = obtainStyledAttributes.getInt(index, this.f3987b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
