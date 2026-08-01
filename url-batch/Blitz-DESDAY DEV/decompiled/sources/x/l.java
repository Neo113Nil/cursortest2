package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import t.AbstractC0270a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f4115j;

    /* renamed from: a, reason: collision with root package name */
    public int f4116a;

    /* renamed from: b, reason: collision with root package name */
    public int f4117b;

    /* renamed from: c, reason: collision with root package name */
    public int f4118c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4119e;

    /* renamed from: f, reason: collision with root package name */
    public float f4120f;

    /* renamed from: g, reason: collision with root package name */
    public int f4121g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4115j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4146f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4115j.get(index)) {
                case 1:
                    this.f4119e = obtainStyledAttributes.getFloat(index, this.f4119e);
                    break;
                case 2:
                    this.f4118c = obtainStyledAttributes.getInt(index, this.f4118c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0270a.f3613a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4116a = o.f(obtainStyledAttributes, index, this.f4116a);
                    break;
                case 6:
                    this.f4117b = obtainStyledAttributes.getInteger(index, this.f4117b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.f4121g = obtainStyledAttributes.getInteger(index, this.f4121g);
                    break;
                case 9:
                    this.f4120f = obtainStyledAttributes.getFloat(index, this.f4120f);
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
