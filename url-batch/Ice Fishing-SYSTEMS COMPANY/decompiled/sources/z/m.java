package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f42074n;

    /* renamed from: a, reason: collision with root package name */
    public float f42075a;

    /* renamed from: b, reason: collision with root package name */
    public float f42076b;

    /* renamed from: c, reason: collision with root package name */
    public float f42077c;

    /* renamed from: d, reason: collision with root package name */
    public float f42078d;

    /* renamed from: e, reason: collision with root package name */
    public float f42079e;

    /* renamed from: f, reason: collision with root package name */
    public float f42080f;

    /* renamed from: g, reason: collision with root package name */
    public float f42081g;

    /* renamed from: h, reason: collision with root package name */
    public int f42082h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f42083j;

    /* renamed from: k, reason: collision with root package name */
    public float f42084k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42085l;

    /* renamed from: m, reason: collision with root package name */
    public float f42086m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42074n = sparseIntArray;
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
            switch (f42074n.get(index)) {
                case 1:
                    this.f42075a = obtainStyledAttributes.getFloat(index, this.f42075a);
                    break;
                case 2:
                    this.f42076b = obtainStyledAttributes.getFloat(index, this.f42076b);
                    break;
                case 3:
                    this.f42077c = obtainStyledAttributes.getFloat(index, this.f42077c);
                    break;
                case 4:
                    this.f42078d = obtainStyledAttributes.getFloat(index, this.f42078d);
                    break;
                case 5:
                    this.f42079e = obtainStyledAttributes.getFloat(index, this.f42079e);
                    break;
                case 6:
                    this.f42080f = obtainStyledAttributes.getDimension(index, this.f42080f);
                    break;
                case 7:
                    this.f42081g = obtainStyledAttributes.getDimension(index, this.f42081g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f42083j = obtainStyledAttributes.getDimension(index, this.f42083j);
                    break;
                case 10:
                    this.f42084k = obtainStyledAttributes.getDimension(index, this.f42084k);
                    break;
                case 11:
                    this.f42085l = true;
                    this.f42086m = obtainStyledAttributes.getDimension(index, this.f42086m);
                    break;
                case 12:
                    this.f42082h = n.f(obtainStyledAttributes, index, this.f42082h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
