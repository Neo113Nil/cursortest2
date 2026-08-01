package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4418n;

    /* renamed from: a, reason: collision with root package name */
    public float f4419a;

    /* renamed from: b, reason: collision with root package name */
    public float f4420b;

    /* renamed from: c, reason: collision with root package name */
    public float f4421c;

    /* renamed from: d, reason: collision with root package name */
    public float f4422d;

    /* renamed from: e, reason: collision with root package name */
    public float f4423e;

    /* renamed from: f, reason: collision with root package name */
    public float f4424f;

    /* renamed from: g, reason: collision with root package name */
    public float f4425g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4426j;

    /* renamed from: k, reason: collision with root package name */
    public float f4427k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4428l;

    /* renamed from: m, reason: collision with root package name */
    public float f4429m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4418n = sparseIntArray;
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
            switch (f4418n.get(index)) {
                case 1:
                    this.f4419a = obtainStyledAttributes.getFloat(index, this.f4419a);
                    break;
                case 2:
                    this.f4420b = obtainStyledAttributes.getFloat(index, this.f4420b);
                    break;
                case 3:
                    this.f4421c = obtainStyledAttributes.getFloat(index, this.f4421c);
                    break;
                case 4:
                    this.f4422d = obtainStyledAttributes.getFloat(index, this.f4422d);
                    break;
                case 5:
                    this.f4423e = obtainStyledAttributes.getFloat(index, this.f4423e);
                    break;
                case 6:
                    this.f4424f = obtainStyledAttributes.getDimension(index, this.f4424f);
                    break;
                case 7:
                    this.f4425g = obtainStyledAttributes.getDimension(index, this.f4425g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4426j = obtainStyledAttributes.getDimension(index, this.f4426j);
                    break;
                case 10:
                    this.f4427k = obtainStyledAttributes.getDimension(index, this.f4427k);
                    break;
                case 11:
                    this.f4428l = true;
                    this.f4429m = obtainStyledAttributes.getDimension(index, this.f4429m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
