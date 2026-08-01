package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f3542j;

    /* renamed from: a, reason: collision with root package name */
    public int f3543a;

    /* renamed from: b, reason: collision with root package name */
    public int f3544b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public float f3545d;

    /* renamed from: e, reason: collision with root package name */
    public float f3546e;

    /* renamed from: f, reason: collision with root package name */
    public float f3547f;
    public int g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f3548i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3542j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f3572f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            switch (f3542j.get(index)) {
                case 1:
                    this.f3546e = obtainStyledAttributes.getFloat(index, this.f3546e);
                    break;
                case 2:
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = r.a.f3138a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3543a = n.f(obtainStyledAttributes, index, this.f3543a);
                    break;
                case 6:
                    this.f3544b = obtainStyledAttributes.getInteger(index, this.f3544b);
                    break;
                case 7:
                    this.f3545d = obtainStyledAttributes.getFloat(index, this.f3545d);
                    break;
                case 8:
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 9:
                    this.f3547f = obtainStyledAttributes.getFloat(index, this.f3547f);
                    break;
                case 10:
                    int i5 = obtainStyledAttributes.peekValue(index).type;
                    if (i5 == 1) {
                        this.f3548i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i5 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf("/") > 0) {
                            this.f3548i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f3548i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
