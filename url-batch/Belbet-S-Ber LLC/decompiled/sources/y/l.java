package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4067a;

    /* renamed from: b, reason: collision with root package name */
    public int f4068b;

    /* renamed from: c, reason: collision with root package name */
    public float f4069c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f4091g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4069c = obtainStyledAttributes.getFloat(index, this.f4069c);
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f4067a);
                this.f4067a = i4;
                this.f4067a = n.d[i4];
            } else if (index == 4) {
                this.f4068b = obtainStyledAttributes.getInt(index, this.f4068b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
