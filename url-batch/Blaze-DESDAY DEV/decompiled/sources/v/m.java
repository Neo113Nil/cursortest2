package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f3966a;

    /* renamed from: b, reason: collision with root package name */
    public int f3967b;

    /* renamed from: c, reason: collision with root package name */
    public float f3968c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f3991g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f3968c = obtainStyledAttributes.getFloat(index, this.f3968c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f3966a);
                this.f3966a = i2;
                this.f3966a = o.d[i2];
            } else if (index == 4) {
                this.f3967b = obtainStyledAttributes.getInt(index, this.f3967b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
