package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3552n;

    /* renamed from: a, reason: collision with root package name */
    public float f3553a;

    /* renamed from: b, reason: collision with root package name */
    public float f3554b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f3555d;

    /* renamed from: e, reason: collision with root package name */
    public float f3556e;

    /* renamed from: f, reason: collision with root package name */
    public float f3557f;
    public float g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public float f3558i;

    /* renamed from: j, reason: collision with root package name */
    public float f3559j;

    /* renamed from: k, reason: collision with root package name */
    public float f3560k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3561l;

    /* renamed from: m, reason: collision with root package name */
    public float f3562m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3552n = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f3573i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            switch (f3552n.get(index)) {
                case 1:
                    this.f3553a = obtainStyledAttributes.getFloat(index, this.f3553a);
                    break;
                case 2:
                    this.f3554b = obtainStyledAttributes.getFloat(index, this.f3554b);
                    break;
                case 3:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 4:
                    this.f3555d = obtainStyledAttributes.getFloat(index, this.f3555d);
                    break;
                case 5:
                    this.f3556e = obtainStyledAttributes.getFloat(index, this.f3556e);
                    break;
                case 6:
                    this.f3557f = obtainStyledAttributes.getDimension(index, this.f3557f);
                    break;
                case 7:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 8:
                    this.f3558i = obtainStyledAttributes.getDimension(index, this.f3558i);
                    break;
                case 9:
                    this.f3559j = obtainStyledAttributes.getDimension(index, this.f3559j);
                    break;
                case 10:
                    this.f3560k = obtainStyledAttributes.getDimension(index, this.f3560k);
                    break;
                case 11:
                    this.f3561l = true;
                    this.f3562m = obtainStyledAttributes.getDimension(index, this.f3562m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
