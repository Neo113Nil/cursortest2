package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f3746a;

    /* renamed from: b, reason: collision with root package name */
    public int f3747b;

    /* renamed from: c, reason: collision with root package name */
    public float f3748c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3772g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f3748c = obtainStyledAttributes.getFloat(index, this.f3748c);
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f3746a);
                this.f3746a = i4;
                this.f3746a = n.d[i4];
            } else if (index == 4) {
                this.f3747b = obtainStyledAttributes.getInt(index, this.f3747b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
