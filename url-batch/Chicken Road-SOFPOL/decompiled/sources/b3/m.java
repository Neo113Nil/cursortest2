package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f1204a;

    /* renamed from: b, reason: collision with root package name */
    public int f1205b;

    /* renamed from: c, reason: collision with root package name */
    public float f1206c;

    /* renamed from: d, reason: collision with root package name */
    public float f1207d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f1234g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f1206c = obtainStyledAttributes.getFloat(index, this.f1206c);
            } else if (index == 0) {
                int i8 = obtainStyledAttributes.getInt(index, this.f1204a);
                this.f1204a = i8;
                this.f1204a = o.f1221d[i8];
            } else if (index == 4) {
                this.f1205b = obtainStyledAttributes.getInt(index, this.f1205b);
            } else if (index == 3) {
                this.f1207d = obtainStyledAttributes.getFloat(index, this.f1207d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
