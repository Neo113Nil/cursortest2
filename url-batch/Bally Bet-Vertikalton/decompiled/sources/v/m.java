package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3994n;

    /* renamed from: a, reason: collision with root package name */
    public float f3995a;

    /* renamed from: b, reason: collision with root package name */
    public float f3996b;

    /* renamed from: c, reason: collision with root package name */
    public float f3997c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3998e;

    /* renamed from: f, reason: collision with root package name */
    public float f3999f;

    /* renamed from: g, reason: collision with root package name */
    public float f4000g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4001j;

    /* renamed from: k, reason: collision with root package name */
    public float f4002k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4003l;

    /* renamed from: m, reason: collision with root package name */
    public float f4004m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3994n = sparseIntArray;
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
            switch (f3994n.get(index)) {
                case 1:
                    this.f3995a = obtainStyledAttributes.getFloat(index, this.f3995a);
                    break;
                case 2:
                    this.f3996b = obtainStyledAttributes.getFloat(index, this.f3996b);
                    break;
                case 3:
                    this.f3997c = obtainStyledAttributes.getFloat(index, this.f3997c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f3998e = obtainStyledAttributes.getFloat(index, this.f3998e);
                    break;
                case 6:
                    this.f3999f = obtainStyledAttributes.getDimension(index, this.f3999f);
                    break;
                case 7:
                    this.f4000g = obtainStyledAttributes.getDimension(index, this.f4000g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4001j = obtainStyledAttributes.getDimension(index, this.f4001j);
                    break;
                case 10:
                    this.f4002k = obtainStyledAttributes.getDimension(index, this.f4002k);
                    break;
                case 11:
                    this.f4003l = true;
                    this.f4004m = obtainStyledAttributes.getDimension(index, this.f4004m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
