package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4070n;

    /* renamed from: a, reason: collision with root package name */
    public float f4071a;

    /* renamed from: b, reason: collision with root package name */
    public float f4072b;

    /* renamed from: c, reason: collision with root package name */
    public float f4073c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4074e;

    /* renamed from: f, reason: collision with root package name */
    public float f4075f;

    /* renamed from: g, reason: collision with root package name */
    public float f4076g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4077j;

    /* renamed from: k, reason: collision with root package name */
    public float f4078k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4079l;

    /* renamed from: m, reason: collision with root package name */
    public float f4080m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4070n = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4070n.get(index)) {
                case 1:
                    this.f4071a = obtainStyledAttributes.getFloat(index, this.f4071a);
                    break;
                case 2:
                    this.f4072b = obtainStyledAttributes.getFloat(index, this.f4072b);
                    break;
                case 3:
                    this.f4073c = obtainStyledAttributes.getFloat(index, this.f4073c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f4074e = obtainStyledAttributes.getFloat(index, this.f4074e);
                    break;
                case 6:
                    this.f4075f = obtainStyledAttributes.getDimension(index, this.f4075f);
                    break;
                case 7:
                    this.f4076g = obtainStyledAttributes.getDimension(index, this.f4076g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4077j = obtainStyledAttributes.getDimension(index, this.f4077j);
                    break;
                case 10:
                    this.f4078k = obtainStyledAttributes.getDimension(index, this.f4078k);
                    break;
                case 11:
                    this.f4079l = true;
                    this.f4080m = obtainStyledAttributes.getDimension(index, this.f4080m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
