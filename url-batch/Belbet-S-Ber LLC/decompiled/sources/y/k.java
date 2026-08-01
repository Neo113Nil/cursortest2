package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f4060j;

    /* renamed from: a, reason: collision with root package name */
    public int f4061a;

    /* renamed from: b, reason: collision with root package name */
    public int f4062b;

    /* renamed from: c, reason: collision with root package name */
    public int f4063c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4064e;

    /* renamed from: f, reason: collision with root package name */
    public float f4065f;

    /* renamed from: g, reason: collision with root package name */
    public int f4066g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4060j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f4090f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4060j.get(index)) {
                case 1:
                    this.f4064e = obtainStyledAttributes.getFloat(index, this.f4064e);
                    break;
                case 2:
                    this.f4063c = obtainStyledAttributes.getInt(index, this.f4063c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = u.a.f3541a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4061a = n.f(obtainStyledAttributes, index, this.f4061a);
                    break;
                case 6:
                    this.f4062b = obtainStyledAttributes.getInteger(index, this.f4062b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.f4066g = obtainStyledAttributes.getInteger(index, this.f4066g);
                    break;
                case 9:
                    this.f4065f = obtainStyledAttributes.getFloat(index, this.f4065f);
                    break;
                case 10:
                    int i4 = obtainStyledAttributes.peekValue(index).type;
                    if (i4 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i4 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.h = string;
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
