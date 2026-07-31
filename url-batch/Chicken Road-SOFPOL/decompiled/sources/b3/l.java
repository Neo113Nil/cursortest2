package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f1195j;

    /* renamed from: a, reason: collision with root package name */
    public int f1196a;

    /* renamed from: b, reason: collision with root package name */
    public int f1197b;

    /* renamed from: c, reason: collision with root package name */
    public int f1198c;

    /* renamed from: d, reason: collision with root package name */
    public float f1199d;

    /* renamed from: e, reason: collision with root package name */
    public float f1200e;

    /* renamed from: f, reason: collision with root package name */
    public float f1201f;

    /* renamed from: g, reason: collision with root package name */
    public int f1202g;

    /* renamed from: h, reason: collision with root package name */
    public String f1203h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1195j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f1233f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f1195j.get(index)) {
                case 1:
                    this.f1200e = obtainStyledAttributes.getFloat(index, this.f1200e);
                    break;
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    this.f1198c = obtainStyledAttributes.getInt(index, this.f1198c);
                    break;
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = x2.a.f8614a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f1196a = o.f(obtainStyledAttributes, index, this.f1196a);
                    break;
                case 6:
                    this.f1197b = obtainStyledAttributes.getInteger(index, this.f1197b);
                    break;
                case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f1199d = obtainStyledAttributes.getFloat(index, this.f1199d);
                    break;
                case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                    this.f1202g = obtainStyledAttributes.getInteger(index, this.f1202g);
                    break;
                case v0.f8304b /* 9 */:
                    this.f1201f = obtainStyledAttributes.getFloat(index, this.f1201f);
                    break;
                case v0.f8306d /* 10 */:
                    int i8 = obtainStyledAttributes.peekValue(index).type;
                    if (i8 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i8 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f1203h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
