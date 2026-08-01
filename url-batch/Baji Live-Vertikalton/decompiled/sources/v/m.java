package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3988n;

    /* renamed from: a, reason: collision with root package name */
    public float f3989a;

    /* renamed from: b, reason: collision with root package name */
    public float f3990b;

    /* renamed from: c, reason: collision with root package name */
    public float f3991c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3992e;

    /* renamed from: f, reason: collision with root package name */
    public float f3993f;

    /* renamed from: g, reason: collision with root package name */
    public float f3994g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3995j;

    /* renamed from: k, reason: collision with root package name */
    public float f3996k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3997l;

    /* renamed from: m, reason: collision with root package name */
    public float f3998m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3988n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f3988n.get(index)) {
                case 1:
                    this.f3989a = obtainStyledAttributes.getFloat(index, this.f3989a);
                    break;
                case 2:
                    this.f3990b = obtainStyledAttributes.getFloat(index, this.f3990b);
                    break;
                case 3:
                    this.f3991c = obtainStyledAttributes.getFloat(index, this.f3991c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f3992e = obtainStyledAttributes.getFloat(index, this.f3992e);
                    break;
                case 6:
                    this.f3993f = obtainStyledAttributes.getDimension(index, this.f3993f);
                    break;
                case 7:
                    this.f3994g = obtainStyledAttributes.getDimension(index, this.f3994g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f3995j = obtainStyledAttributes.getDimension(index, this.f3995j);
                    break;
                case 10:
                    this.f3996k = obtainStyledAttributes.getDimension(index, this.f3996k);
                    break;
                case 11:
                    this.f3997l = true;
                    this.f3998m = obtainStyledAttributes.getDimension(index, this.f3998m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
