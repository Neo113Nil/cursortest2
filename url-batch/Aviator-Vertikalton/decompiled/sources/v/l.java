package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4414a;

    /* renamed from: b, reason: collision with root package name */
    public int f4415b;

    /* renamed from: c, reason: collision with root package name */
    public float f4416c;

    /* renamed from: d, reason: collision with root package name */
    public float f4417d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4443g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4416c = obtainStyledAttributes.getFloat(index, this.f4416c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4414a);
                this.f4414a = i2;
                this.f4414a = n.f4430d[i2];
            } else if (index == 4) {
                this.f4415b = obtainStyledAttributes.getInt(index, this.f4415b);
            } else if (index == 3) {
                this.f4417d = obtainStyledAttributes.getFloat(index, this.f4417d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
