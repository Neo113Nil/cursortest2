package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3989n;

    /* renamed from: a, reason: collision with root package name */
    public float f3990a;

    /* renamed from: b, reason: collision with root package name */
    public float f3991b;

    /* renamed from: c, reason: collision with root package name */
    public float f3992c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3993e;

    /* renamed from: f, reason: collision with root package name */
    public float f3994f;

    /* renamed from: g, reason: collision with root package name */
    public float f3995g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3996j;

    /* renamed from: k, reason: collision with root package name */
    public float f3997k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3998l;

    /* renamed from: m, reason: collision with root package name */
    public float f3999m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3989n = sparseIntArray;
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
            switch (f3989n.get(index)) {
                case 1:
                    this.f3990a = obtainStyledAttributes.getFloat(index, this.f3990a);
                    break;
                case 2:
                    this.f3991b = obtainStyledAttributes.getFloat(index, this.f3991b);
                    break;
                case 3:
                    this.f3992c = obtainStyledAttributes.getFloat(index, this.f3992c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f3993e = obtainStyledAttributes.getFloat(index, this.f3993e);
                    break;
                case 6:
                    this.f3994f = obtainStyledAttributes.getDimension(index, this.f3994f);
                    break;
                case 7:
                    this.f3995g = obtainStyledAttributes.getDimension(index, this.f3995g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f3996j = obtainStyledAttributes.getDimension(index, this.f3996j);
                    break;
                case 10:
                    this.f3997k = obtainStyledAttributes.getDimension(index, this.f3997k);
                    break;
                case 11:
                    this.f3998l = true;
                    this.f3999m = obtainStyledAttributes.getDimension(index, this.f3999m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
