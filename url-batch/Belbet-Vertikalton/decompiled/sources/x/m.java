package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4685n;

    /* renamed from: a, reason: collision with root package name */
    public float f4686a;

    /* renamed from: b, reason: collision with root package name */
    public float f4687b;

    /* renamed from: c, reason: collision with root package name */
    public float f4688c;

    /* renamed from: d, reason: collision with root package name */
    public float f4689d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f4690f;

    /* renamed from: g, reason: collision with root package name */
    public float f4691g;

    /* renamed from: h, reason: collision with root package name */
    public int f4692h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f4693k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4694l;

    /* renamed from: m, reason: collision with root package name */
    public float f4695m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4685n = sparseIntArray;
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
            switch (f4685n.get(index)) {
                case 1:
                    this.f4686a = obtainStyledAttributes.getFloat(index, this.f4686a);
                    break;
                case 2:
                    this.f4687b = obtainStyledAttributes.getFloat(index, this.f4687b);
                    break;
                case 3:
                    this.f4688c = obtainStyledAttributes.getFloat(index, this.f4688c);
                    break;
                case 4:
                    this.f4689d = obtainStyledAttributes.getFloat(index, this.f4689d);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.f4690f = obtainStyledAttributes.getDimension(index, this.f4690f);
                    break;
                case 7:
                    this.f4691g = obtainStyledAttributes.getDimension(index, this.f4691g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f4693k = obtainStyledAttributes.getDimension(index, this.f4693k);
                    break;
                case 11:
                    this.f4694l = true;
                    this.f4695m = obtainStyledAttributes.getDimension(index, this.f4695m);
                    break;
                case 12:
                    this.f4692h = n.f(obtainStyledAttributes, index, this.f4692h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
