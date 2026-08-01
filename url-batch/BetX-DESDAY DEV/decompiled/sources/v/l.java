package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4418a;

    /* renamed from: b, reason: collision with root package name */
    public int f4419b;

    /* renamed from: c, reason: collision with root package name */
    public float f4420c;

    /* renamed from: d, reason: collision with root package name */
    public float f4421d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4447g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4420c = obtainStyledAttributes.getFloat(index, this.f4420c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4418a);
                this.f4418a = i2;
                this.f4418a = n.f4434d[i2];
            } else if (index == 4) {
                this.f4419b = obtainStyledAttributes.getInt(index, this.f4419b);
            } else if (index == 3) {
                this.f4421d = obtainStyledAttributes.getFloat(index, this.f4421d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
