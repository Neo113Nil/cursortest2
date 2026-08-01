package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3969n;

    /* renamed from: a, reason: collision with root package name */
    public float f3970a;

    /* renamed from: b, reason: collision with root package name */
    public float f3971b;

    /* renamed from: c, reason: collision with root package name */
    public float f3972c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3973e;

    /* renamed from: f, reason: collision with root package name */
    public float f3974f;

    /* renamed from: g, reason: collision with root package name */
    public float f3975g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3976j;

    /* renamed from: k, reason: collision with root package name */
    public float f3977k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3978l;

    /* renamed from: m, reason: collision with root package name */
    public float f3979m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3969n = sparseIntArray;
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
            switch (f3969n.get(index)) {
                case 1:
                    this.f3970a = obtainStyledAttributes.getFloat(index, this.f3970a);
                    break;
                case 2:
                    this.f3971b = obtainStyledAttributes.getFloat(index, this.f3971b);
                    break;
                case 3:
                    this.f3972c = obtainStyledAttributes.getFloat(index, this.f3972c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f3973e = obtainStyledAttributes.getFloat(index, this.f3973e);
                    break;
                case 6:
                    this.f3974f = obtainStyledAttributes.getDimension(index, this.f3974f);
                    break;
                case 7:
                    this.f3975g = obtainStyledAttributes.getDimension(index, this.f3975g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f3976j = obtainStyledAttributes.getDimension(index, this.f3976j);
                    break;
                case 10:
                    this.f3977k = obtainStyledAttributes.getDimension(index, this.f3977k);
                    break;
                case 11:
                    this.f3978l = true;
                    this.f3979m = obtainStyledAttributes.getDimension(index, this.f3979m);
                    break;
                case 12:
                    this.h = o.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
