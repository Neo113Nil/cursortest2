package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4140n;

    /* renamed from: a, reason: collision with root package name */
    public float f4141a;

    /* renamed from: b, reason: collision with root package name */
    public float f4142b;

    /* renamed from: c, reason: collision with root package name */
    public float f4143c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4144e;

    /* renamed from: f, reason: collision with root package name */
    public float f4145f;

    /* renamed from: g, reason: collision with root package name */
    public float f4146g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4147j;

    /* renamed from: k, reason: collision with root package name */
    public float f4148k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4149l;

    /* renamed from: m, reason: collision with root package name */
    public float f4150m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4140n = sparseIntArray;
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
            switch (f4140n.get(index)) {
                case 1:
                    this.f4141a = obtainStyledAttributes.getFloat(index, this.f4141a);
                    break;
                case 2:
                    this.f4142b = obtainStyledAttributes.getFloat(index, this.f4142b);
                    break;
                case 3:
                    this.f4143c = obtainStyledAttributes.getFloat(index, this.f4143c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f4144e = obtainStyledAttributes.getFloat(index, this.f4144e);
                    break;
                case 6:
                    this.f4145f = obtainStyledAttributes.getDimension(index, this.f4145f);
                    break;
                case 7:
                    this.f4146g = obtainStyledAttributes.getDimension(index, this.f4146g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4147j = obtainStyledAttributes.getDimension(index, this.f4147j);
                    break;
                case 10:
                    this.f4148k = obtainStyledAttributes.getDimension(index, this.f4148k);
                    break;
                case 11:
                    this.f4149l = true;
                    this.f4150m = obtainStyledAttributes.getDimension(index, this.f4150m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
