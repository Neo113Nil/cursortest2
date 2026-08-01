package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import r.AbstractC0292a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f3995j;

    /* renamed from: a, reason: collision with root package name */
    public int f3996a;

    /* renamed from: b, reason: collision with root package name */
    public int f3997b;

    /* renamed from: c, reason: collision with root package name */
    public int f3998c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3999e;

    /* renamed from: f, reason: collision with root package name */
    public float f4000f;

    /* renamed from: g, reason: collision with root package name */
    public int f4001g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3995j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4026f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f3995j.get(index)) {
                case 1:
                    this.f3999e = obtainStyledAttributes.getFloat(index, this.f3999e);
                    break;
                case 2:
                    this.f3998c = obtainStyledAttributes.getInt(index, this.f3998c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0292a.f3507a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3996a = o.f(obtainStyledAttributes, index, this.f3996a);
                    break;
                case 6:
                    this.f3997b = obtainStyledAttributes.getInteger(index, this.f3997b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.f4001g = obtainStyledAttributes.getInteger(index, this.f4001g);
                    break;
                case 9:
                    this.f4000f = obtainStyledAttributes.getFloat(index, this.f4000f);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
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
