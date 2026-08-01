package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4415n;

    /* renamed from: a, reason: collision with root package name */
    public float f4416a;

    /* renamed from: b, reason: collision with root package name */
    public float f4417b;

    /* renamed from: c, reason: collision with root package name */
    public float f4418c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4419e;

    /* renamed from: f, reason: collision with root package name */
    public float f4420f;

    /* renamed from: g, reason: collision with root package name */
    public float f4421g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4422j;

    /* renamed from: k, reason: collision with root package name */
    public float f4423k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4424l;

    /* renamed from: m, reason: collision with root package name */
    public float f4425m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4415n = sparseIntArray;
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
            switch (f4415n.get(index)) {
                case 1:
                    this.f4416a = obtainStyledAttributes.getFloat(index, this.f4416a);
                    break;
                case 2:
                    this.f4417b = obtainStyledAttributes.getFloat(index, this.f4417b);
                    break;
                case 3:
                    this.f4418c = obtainStyledAttributes.getFloat(index, this.f4418c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f4419e = obtainStyledAttributes.getFloat(index, this.f4419e);
                    break;
                case 6:
                    this.f4420f = obtainStyledAttributes.getDimension(index, this.f4420f);
                    break;
                case 7:
                    this.f4421g = obtainStyledAttributes.getDimension(index, this.f4421g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4422j = obtainStyledAttributes.getDimension(index, this.f4422j);
                    break;
                case 10:
                    this.f4423k = obtainStyledAttributes.getDimension(index, this.f4423k);
                    break;
                case 11:
                    this.f4424l = true;
                    this.f4425m = obtainStyledAttributes.getDimension(index, this.f4425m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
