package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f1208n;

    /* renamed from: a, reason: collision with root package name */
    public float f1209a;

    /* renamed from: b, reason: collision with root package name */
    public float f1210b;

    /* renamed from: c, reason: collision with root package name */
    public float f1211c;

    /* renamed from: d, reason: collision with root package name */
    public float f1212d;

    /* renamed from: e, reason: collision with root package name */
    public float f1213e;

    /* renamed from: f, reason: collision with root package name */
    public float f1214f;

    /* renamed from: g, reason: collision with root package name */
    public float f1215g;

    /* renamed from: h, reason: collision with root package name */
    public int f1216h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f1217j;

    /* renamed from: k, reason: collision with root package name */
    public float f1218k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1219l;

    /* renamed from: m, reason: collision with root package name */
    public float f1220m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1208n = sparseIntArray;
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
            switch (f1208n.get(index)) {
                case 1:
                    this.f1209a = obtainStyledAttributes.getFloat(index, this.f1209a);
                    break;
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    this.f1210b = obtainStyledAttributes.getFloat(index, this.f1210b);
                    break;
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    this.f1211c = obtainStyledAttributes.getFloat(index, this.f1211c);
                    break;
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    this.f1212d = obtainStyledAttributes.getFloat(index, this.f1212d);
                    break;
                case 5:
                    this.f1213e = obtainStyledAttributes.getFloat(index, this.f1213e);
                    break;
                case 6:
                    this.f1214f = obtainStyledAttributes.getDimension(index, this.f1214f);
                    break;
                case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f1215g = obtainStyledAttributes.getDimension(index, this.f1215g);
                    break;
                case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case v0.f8304b /* 9 */:
                    this.f1217j = obtainStyledAttributes.getDimension(index, this.f1217j);
                    break;
                case v0.f8306d /* 10 */:
                    this.f1218k = obtainStyledAttributes.getDimension(index, this.f1218k);
                    break;
                case 11:
                    this.f1219l = true;
                    this.f1220m = obtainStyledAttributes.getDimension(index, this.f1220m);
                    break;
                case 12:
                    this.f1216h = o.f(obtainStyledAttributes, index, this.f1216h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
