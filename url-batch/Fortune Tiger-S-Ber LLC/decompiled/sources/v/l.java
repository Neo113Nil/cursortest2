package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f3549a;

    /* renamed from: b, reason: collision with root package name */
    public int f3550b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f3551d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 1) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            } else if (index == 0) {
                int i5 = obtainStyledAttributes.getInt(index, this.f3549a);
                this.f3549a = i5;
                this.f3549a = n.f3563d[i5];
            } else if (index == 4) {
                this.f3550b = obtainStyledAttributes.getInt(index, this.f3550b);
            } else if (index == 3) {
                this.f3551d = obtainStyledAttributes.getFloat(index, this.f3551d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
