package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4010n;

    /* renamed from: a, reason: collision with root package name */
    public float f4011a;

    /* renamed from: b, reason: collision with root package name */
    public float f4012b;

    /* renamed from: c, reason: collision with root package name */
    public float f4013c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4014e;

    /* renamed from: f, reason: collision with root package name */
    public float f4015f;

    /* renamed from: g, reason: collision with root package name */
    public float f4016g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4017j;

    /* renamed from: k, reason: collision with root package name */
    public float f4018k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4019l;

    /* renamed from: m, reason: collision with root package name */
    public float f4020m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4010n = sparseIntArray;
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
            switch (f4010n.get(index)) {
                case 1:
                    this.f4011a = obtainStyledAttributes.getFloat(index, this.f4011a);
                    break;
                case 2:
                    this.f4012b = obtainStyledAttributes.getFloat(index, this.f4012b);
                    break;
                case 3:
                    this.f4013c = obtainStyledAttributes.getFloat(index, this.f4013c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f4014e = obtainStyledAttributes.getFloat(index, this.f4014e);
                    break;
                case 6:
                    this.f4015f = obtainStyledAttributes.getDimension(index, this.f4015f);
                    break;
                case 7:
                    this.f4016g = obtainStyledAttributes.getDimension(index, this.f4016g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4017j = obtainStyledAttributes.getDimension(index, this.f4017j);
                    break;
                case 10:
                    this.f4018k = obtainStyledAttributes.getDimension(index, this.f4018k);
                    break;
                case 11:
                    this.f4019l = true;
                    this.f4020m = obtainStyledAttributes.getDimension(index, this.f4020m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
