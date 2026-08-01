package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3957n;

    /* renamed from: a, reason: collision with root package name */
    public float f3958a;

    /* renamed from: b, reason: collision with root package name */
    public float f3959b;

    /* renamed from: c, reason: collision with root package name */
    public float f3960c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3961e;

    /* renamed from: f, reason: collision with root package name */
    public float f3962f;

    /* renamed from: g, reason: collision with root package name */
    public float f3963g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3964j;

    /* renamed from: k, reason: collision with root package name */
    public float f3965k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3966l;

    /* renamed from: m, reason: collision with root package name */
    public float f3967m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3957n = sparseIntArray;
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
            switch (f3957n.get(index)) {
                case 1:
                    this.f3958a = obtainStyledAttributes.getFloat(index, this.f3958a);
                    break;
                case 2:
                    this.f3959b = obtainStyledAttributes.getFloat(index, this.f3959b);
                    break;
                case 3:
                    this.f3960c = obtainStyledAttributes.getFloat(index, this.f3960c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f3961e = obtainStyledAttributes.getFloat(index, this.f3961e);
                    break;
                case 6:
                    this.f3962f = obtainStyledAttributes.getDimension(index, this.f3962f);
                    break;
                case 7:
                    this.f3963g = obtainStyledAttributes.getDimension(index, this.f3963g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f3964j = obtainStyledAttributes.getDimension(index, this.f3964j);
                    break;
                case 10:
                    this.f3965k = obtainStyledAttributes.getDimension(index, this.f3965k);
                    break;
                case 11:
                    this.f3966l = true;
                    this.f3967m = obtainStyledAttributes.getDimension(index, this.f3967m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
