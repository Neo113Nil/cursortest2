package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4084n;

    /* renamed from: a, reason: collision with root package name */
    public float f4085a;

    /* renamed from: b, reason: collision with root package name */
    public float f4086b;

    /* renamed from: c, reason: collision with root package name */
    public float f4087c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4088e;

    /* renamed from: f, reason: collision with root package name */
    public float f4089f;

    /* renamed from: g, reason: collision with root package name */
    public float f4090g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4091j;

    /* renamed from: k, reason: collision with root package name */
    public float f4092k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4093l;

    /* renamed from: m, reason: collision with root package name */
    public float f4094m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4084n = sparseIntArray;
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
            switch (f4084n.get(index)) {
                case 1:
                    this.f4085a = obtainStyledAttributes.getFloat(index, this.f4085a);
                    break;
                case 2:
                    this.f4086b = obtainStyledAttributes.getFloat(index, this.f4086b);
                    break;
                case 3:
                    this.f4087c = obtainStyledAttributes.getFloat(index, this.f4087c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f4088e = obtainStyledAttributes.getFloat(index, this.f4088e);
                    break;
                case 6:
                    this.f4089f = obtainStyledAttributes.getDimension(index, this.f4089f);
                    break;
                case 7:
                    this.f4090g = obtainStyledAttributes.getDimension(index, this.f4090g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4091j = obtainStyledAttributes.getDimension(index, this.f4091j);
                    break;
                case 10:
                    this.f4092k = obtainStyledAttributes.getDimension(index, this.f4092k);
                    break;
                case 11:
                    this.f4093l = true;
                    this.f4094m = obtainStyledAttributes.getDimension(index, this.f4094m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
