package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4125n;

    /* renamed from: a, reason: collision with root package name */
    public float f4126a;

    /* renamed from: b, reason: collision with root package name */
    public float f4127b;

    /* renamed from: c, reason: collision with root package name */
    public float f4128c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4129e;

    /* renamed from: f, reason: collision with root package name */
    public float f4130f;

    /* renamed from: g, reason: collision with root package name */
    public float f4131g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4132j;

    /* renamed from: k, reason: collision with root package name */
    public float f4133k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4134l;

    /* renamed from: m, reason: collision with root package name */
    public float f4135m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4125n = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4125n.get(index)) {
                case 1:
                    this.f4126a = obtainStyledAttributes.getFloat(index, this.f4126a);
                    break;
                case 2:
                    this.f4127b = obtainStyledAttributes.getFloat(index, this.f4127b);
                    break;
                case 3:
                    this.f4128c = obtainStyledAttributes.getFloat(index, this.f4128c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f4129e = obtainStyledAttributes.getFloat(index, this.f4129e);
                    break;
                case 6:
                    this.f4130f = obtainStyledAttributes.getDimension(index, this.f4130f);
                    break;
                case 7:
                    this.f4131g = obtainStyledAttributes.getDimension(index, this.f4131g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4132j = obtainStyledAttributes.getDimension(index, this.f4132j);
                    break;
                case 10:
                    this.f4133k = obtainStyledAttributes.getDimension(index, this.f4133k);
                    break;
                case 11:
                    this.f4134l = true;
                    this.f4135m = obtainStyledAttributes.getDimension(index, this.f4135m);
                    break;
                case 12:
                    this.h = o.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
