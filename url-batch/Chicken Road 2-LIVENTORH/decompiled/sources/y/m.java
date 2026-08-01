package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3749n;

    /* renamed from: a, reason: collision with root package name */
    public float f3750a;

    /* renamed from: b, reason: collision with root package name */
    public float f3751b;

    /* renamed from: c, reason: collision with root package name */
    public float f3752c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3753e;

    /* renamed from: f, reason: collision with root package name */
    public float f3754f;

    /* renamed from: g, reason: collision with root package name */
    public float f3755g;

    /* renamed from: h, reason: collision with root package name */
    public int f3756h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3757j;

    /* renamed from: k, reason: collision with root package name */
    public float f3758k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3759l;

    /* renamed from: m, reason: collision with root package name */
    public float f3760m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3749n = sparseIntArray;
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
            switch (f3749n.get(index)) {
                case 1:
                    this.f3750a = obtainStyledAttributes.getFloat(index, this.f3750a);
                    break;
                case 2:
                    this.f3751b = obtainStyledAttributes.getFloat(index, this.f3751b);
                    break;
                case 3:
                    this.f3752c = obtainStyledAttributes.getFloat(index, this.f3752c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f3753e = obtainStyledAttributes.getFloat(index, this.f3753e);
                    break;
                case 6:
                    this.f3754f = obtainStyledAttributes.getDimension(index, this.f3754f);
                    break;
                case 7:
                    this.f3755g = obtainStyledAttributes.getDimension(index, this.f3755g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f3757j = obtainStyledAttributes.getDimension(index, this.f3757j);
                    break;
                case 10:
                    this.f3758k = obtainStyledAttributes.getDimension(index, this.f3758k);
                    break;
                case 11:
                    this.f3759l = true;
                    this.f3760m = obtainStyledAttributes.getDimension(index, this.f3760m);
                    break;
                case 12:
                    this.f3756h = n.f(obtainStyledAttributes, index, this.f3756h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
