package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4155n;

    /* renamed from: a, reason: collision with root package name */
    public float f4156a;

    /* renamed from: b, reason: collision with root package name */
    public float f4157b;

    /* renamed from: c, reason: collision with root package name */
    public float f4158c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4159e;

    /* renamed from: f, reason: collision with root package name */
    public float f4160f;

    /* renamed from: g, reason: collision with root package name */
    public float f4161g;

    /* renamed from: h, reason: collision with root package name */
    public int f4162h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4163j;

    /* renamed from: k, reason: collision with root package name */
    public float f4164k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4165l;

    /* renamed from: m, reason: collision with root package name */
    public float f4166m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4155n = sparseIntArray;
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
            switch (f4155n.get(index)) {
                case 1:
                    this.f4156a = obtainStyledAttributes.getFloat(index, this.f4156a);
                    break;
                case 2:
                    this.f4157b = obtainStyledAttributes.getFloat(index, this.f4157b);
                    break;
                case 3:
                    this.f4158c = obtainStyledAttributes.getFloat(index, this.f4158c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f4159e = obtainStyledAttributes.getFloat(index, this.f4159e);
                    break;
                case 6:
                    this.f4160f = obtainStyledAttributes.getDimension(index, this.f4160f);
                    break;
                case 7:
                    this.f4161g = obtainStyledAttributes.getDimension(index, this.f4161g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4163j = obtainStyledAttributes.getDimension(index, this.f4163j);
                    break;
                case 10:
                    this.f4164k = obtainStyledAttributes.getDimension(index, this.f4164k);
                    break;
                case 11:
                    this.f4165l = true;
                    this.f4166m = obtainStyledAttributes.getDimension(index, this.f4166m);
                    break;
                case 12:
                    this.f4162h = o.f(obtainStyledAttributes, index, this.f4162h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
